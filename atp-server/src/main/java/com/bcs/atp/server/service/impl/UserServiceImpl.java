package com.bcs.atp.server.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bcs.atp.server.gql.types.AuthProvider;
import com.bcs.atp.server.gql.types.ReqType;
import com.bcs.atp.server.gql.types.User;
import com.bcs.atp.server.mapper.UserMapper;
import com.bcs.atp.server.model.*;
import com.bcs.atp.server.model.qo.UserPageQo;
import com.bcs.atp.server.model.user.UserDetails;
import com.bcs.atp.server.service.*;
import com.soulcraft.mybatis.common.enums.EYesOrNo;
import com.soulcraft.network.resp.error.DbResponseEnum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author Scott Lau
 * @since 2024-03-21
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserModel> implements UserService {
  @Autowired
  private UserEnvironmentService userEnvironmentService;
  @Autowired
  private UserHistoryService userHistoryService;
  @Autowired
  private UserSettingsService userSettingsService;
  @Value("${infra.auth.defaultPassword}")
  private String defaultPassword;
  @Value("${infra.auth.validAdminOrigin}")
  private String validAdminOrigin;
  @Autowired
  private PasswordEncoder passwordEncoder;
  @Autowired
  private AccountService accountService;

  @Override
  public boolean create(UserModel user) {
    return save(user);
  }

  @Override
  public boolean update(UserModel user) {
    return updateById(user);
  }

  @Override
  public boolean delete(String id) {
    return removeById(id);
  }

  @Override
  public IPage<UserModel> list(UserPageQo pageQo) {
    IPage<UserModel> page = new Page<>(pageQo.getPageNum(), pageQo.getPageSize());
    QueryWrapper<UserModel> wrapper = new QueryWrapper<>();
    return page(page, wrapper);
  }

  @Override
  public List<UserModel> listAll() {
    QueryWrapper<UserModel> wrapper = new QueryWrapper<>();
    LambdaQueryWrapper<UserModel> lambda = wrapper.lambda();
    return list(wrapper);
  }

  @Override
  public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(String username) {
    QueryWrapper<UserModel> queryWrapper = new QueryWrapper<>();
    queryWrapper.lambda().eq(UserModel::getEmail, username);
    return new UserDetails(getOne(queryWrapper));
  }

  @Override
  public UserModel createUserViaMagicLink(String email, String origin) {
    QueryWrapper<UserModel> queryWrapper = new QueryWrapper<>();
    queryWrapper.lambda().eq(UserModel::getEmail, email);
    UserModel user = getOne(queryWrapper);
    if (user != null) {
      return user;
    }
    // 创建用户信息
    user = UserModel.builder()
      .email(email)
      .password(passwordEncoder.encode(defaultPassword))
      .displayName(email)
      .photoUrl("")
      .isAdmin(validAdminOrigin.equals(origin) ? EYesOrNo.YES : EYesOrNo.NO)
      .currentGqlSession(JSONUtil.toJsonStr(JSONUtil.createArray()))
      .currentRestSession(JSONUtil.toJsonStr(JSONUtil.createArray()))
      .build();
    boolean userCreated = create(user);
    DbResponseEnum.RECORD_CREATE_FAILED.assertTrue(userCreated);

    // AccountModel
    String provider = AuthProvider.EMAIL.name();
    AccountModel account = AccountModel.builder()
      .userId(user.getId())
      .provider(provider)
      .providerAccountId(email)
      .build();
    boolean accountCreated = accountService.create(account);
    DbResponseEnum.RECORD_CREATE_FAILED.assertTrue(accountCreated);

    // UserModel settings
    UserSettingsModel userSettings = UserSettingsModel.builder()
      .userId(user.getId())
      .properties(JSONUtil.toJsonStr(JSONUtil.createObj()))
      .build();
    boolean settingsCreated = userSettingsService.create(userSettings);
    DbResponseEnum.RECORD_CREATE_FAILED.assertTrue(settingsCreated);

    // UserModel Environment
    UserEnvironmentModel userEnvironment = UserEnvironmentModel.builder()
      .userId(user.getId())
      .isGlobal(EYesOrNo.YES)
      .variables(JSONUtil.toJsonStr(JSONUtil.createArray()))
      .build();
    boolean envCreated = userEnvironmentService.create(userEnvironment);
    DbResponseEnum.RECORD_CREATE_FAILED.assertTrue(envCreated);
    return user;
  }

  @Override
  public User convertDbModelToGraphqlModel(UserModel user) {
    User userType = new User();
    BeanUtil.copyProperties(user, userType);
    String userId = user.getId();
    userType.setUid(userId);
    userType.setIsAdmin(user.getIsAdmin().equals(EYesOrNo.YES));
    // CTT=Asia/Shanghai
    ZoneId zoneId = ZoneId.of(ZoneId.SHORT_IDS.get("CTT"));
    userType.setCreatedOn(OffsetDateTime.ofInstant(user.getCreateTime().toInstant(), zoneId));

    // Global Environment
    QueryWrapper<UserEnvironmentModel> userEnvironmentQueryWrapper = new QueryWrapper<>();
    userEnvironmentQueryWrapper.lambda()
      .eq(UserEnvironmentModel::getIsGlobal, EYesOrNo.YES)
      .eq(UserEnvironmentModel::getUserId, userId);
    UserEnvironmentModel globalUserEnv = userEnvironmentService.getOne(userEnvironmentQueryWrapper);
    Optional.ofNullable(globalUserEnv).ifPresent(env ->
      userType.setGlobalEnvironments(userEnvironmentService.convertDbModelToGraphqlModel(env)));

    // UserModel Environments
    userEnvironmentQueryWrapper = new QueryWrapper<>();
    userEnvironmentQueryWrapper.lambda()
      .eq(UserEnvironmentModel::getIsGlobal, EYesOrNo.NO)
      .eq(UserEnvironmentModel::getUserId, userId);
    List<UserEnvironmentModel> userEnvironments = Optional.ofNullable(userEnvironmentService.list(userEnvironmentQueryWrapper))
      .orElse(Collections.emptyList());
    userType.setEnvironments(userEnvironments
      .stream()
      .map(userEnvironment -> userEnvironmentService.convertDbModelToGraphqlModel(userEnvironment))
      .collect(Collectors.toList()));

    // UserModel settings
    QueryWrapper<UserSettingsModel> userSettingsQueryWrapper = new QueryWrapper<>();
    userSettingsQueryWrapper.lambda()
      .eq(UserSettingsModel::getUserId, userId);
    UserSettingsModel userSettings = userSettingsService.getOne(userSettingsQueryWrapper);
    Optional.ofNullable(userSettings).ifPresent(settings ->
      userType.setSettings(userSettingsService.convertDbModelToGraphqlModel(settings)));
    // UserModel History
    // GQL history
    QueryWrapper<UserHistoryModel> userHistoryQueryWrapper = new QueryWrapper<>();
    userHistoryQueryWrapper.lambda()
      .eq(UserHistoryModel::getUserId, userId)
      .eq(UserHistoryModel::getReqType, ReqType.GQL);
    List<UserHistoryModel> userGQLHistories = Optional.ofNullable(userHistoryService.list(userHistoryQueryWrapper))
      .orElse(Collections.emptyList());
    userType.setGQLHistory(userGQLHistories
      .stream()
      .map(userHistory -> userHistoryService.convertDbModelToGraphqlModel(userHistory))
      .collect(Collectors.toList()));

    // REST history
    userHistoryQueryWrapper = new QueryWrapper<>();
    userHistoryQueryWrapper.lambda()
      .eq(UserHistoryModel::getUserId, userId)
      .eq(UserHistoryModel::getReqType, ReqType.REST);
    List<UserHistoryModel> userRESTHistories = Optional.ofNullable(userHistoryService.list(userHistoryQueryWrapper))
      .orElse(Collections.emptyList());
    userType.setRESTHistory(userRESTHistories
      .stream()
      .map(userHistory -> userHistoryService.convertDbModelToGraphqlModel(userHistory))
      .collect(Collectors.toList()));
    return userType;
  }
}
