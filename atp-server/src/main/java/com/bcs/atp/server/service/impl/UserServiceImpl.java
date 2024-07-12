package com.bcs.atp.server.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.json.JSONUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bcs.atp.server.error.ResponseEnum;
import com.bcs.atp.server.gql.types.AuthProvider;
import com.bcs.atp.server.gql.types.ReqType;
import com.bcs.atp.server.gql.types.User;
import com.bcs.atp.server.mapper.UserMapper;
import com.bcs.atp.server.mapper.VerificationTokenMapper;
import com.bcs.atp.server.model.*;
import com.bcs.atp.server.model.dto.JwtTokenDto;
import com.bcs.atp.server.model.dto.LoginDTO;
import com.bcs.atp.server.model.dto.LoginResponseDTO;
import com.bcs.atp.server.model.qo.UserPageQo;
import com.bcs.atp.server.model.user.UserDetails;
import com.bcs.atp.server.service.*;
import com.bcs.atp.server.util.JwtTokenUtil;
import com.soulcraft.mybatis.common.enums.EYesOrNo;
import com.soulcraft.network.resp.error.DbResponseEnum;
import io.micrometer.core.instrument.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
  @Value("${infra.auth.validAdminOrigin}")
  private String validAdminOrigin;
  @Autowired
  private AccountService accountService;
  @Autowired
  private VerificationTokenMapper verificationTokenMapper;;
  @Autowired
  private JwtTokenUtil jwtTokenUtil;

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
  @Transactional
  public UserModel createUserViaMagicLink(String email, String password, String origin) {
    QueryWrapper<UserModel> queryWrapper = new QueryWrapper<>();
    queryWrapper.lambda().eq(UserModel::getEmail, email);
    UserModel user = getOne(queryWrapper);
    if (user != null) {
      return user;
    }
    return createNewUser(email, password, origin);
  }

  @Override
  @Transactional
  public UserModel createUser(String email, String password, String origin) {
    QueryWrapper<UserModel> queryWrapper = new QueryWrapper<>();
    queryWrapper.lambda().eq(UserModel::getEmail, email);
    UserModel user = getOne(queryWrapper);
    if (user != null) {
      // 如果用户已经注册，并启用，抛出异常-用户已存在
      if (EYesOrNo.YES.equals(user.getStatus())){
        ResponseEnum.USER_ALREADY_EXIST.assertNull(user);
      }
      // 如果用户已经注册，但是未启用，1、需要删除之前注册生成的token，重新生成；2、更新最新的密码
      LambdaQueryWrapper<VerificationTokenModel> tokenQueryWrapper = new LambdaQueryWrapper<>();
      tokenQueryWrapper.eq(VerificationTokenModel::getUserId, user.getId());
      verificationTokenMapper.delete(tokenQueryWrapper);
      // 更新密码
      user.setPassword(password);
      update(user);
      return user;
    }
    return createNewUser(email, password, origin);
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

  @Override
  public LoginResponseDTO userLogin(LoginDTO dto) {
    User user = checkUser(dto);
    LoginResponseDTO loginResponseDTO = new LoginResponseDTO();
    loginResponseDTO.setUser(user);
    // 生成令牌
    String email = user.getEmail();
    String accessToken = jwtTokenUtil.generateAccessToken(email);
    String refreshToken = jwtTokenUtil.generateRefreshToken(email);
    JwtTokenDto jwtTokenDto = JwtTokenDto.builder()
            .accessToken(accessToken)
            .refreshToken(refreshToken)
            .build();
    loginResponseDTO.setJwtTokenDto(jwtTokenDto);
    return loginResponseDTO;
  }

  public User checkUser(LoginDTO dto) {
    QueryWrapper<UserModel> queryWrapper = new QueryWrapper<>();
    queryWrapper.lambda().eq(UserModel::getEmail, dto.getEmail()).eq(UserModel::getStatus, EYesOrNo.YES);
    UserModel userModel = getOne(queryWrapper);
    ResponseEnum.USER_NOT_FOUND.assertNotNull(userModel, dto.getEmail());
    String password = dto.getPassword();
    ResponseEnum.PASSWORD_NOT_MATCH.assertTrue(!StringUtils.isBlank(password) && password.equals(userModel.getPassword()));
    // 管理员用户检查
    if (validAdminOrigin.equals(dto.getOrigin())) {
      ResponseEnum.USER_NOT_FOUND.assertTrue(EYesOrNo.YES.equals(userModel.getIsAdmin()));
    }
    User user = new User();
    BeanUtil.copyProperties(userModel, user);
    user.setUid(userModel.getId());
    return user;
  }

  @Transactional
  public UserModel createNewUser(String email, String password, String origin) {
    // 创建用户信息
    UserModel user = UserModel.builder()
            .email(email)
            .password(password)
            .displayName(email)
            .photoUrl("")
            .isAdmin(validAdminOrigin.equals(origin) ? EYesOrNo.YES : EYesOrNo.NO)
            .currentGqlSession(JSONUtil.toJsonStr(JSONUtil.createArray()))
            .currentRestSession(JSONUtil.toJsonStr(JSONUtil.createArray()))
            .status(EYesOrNo.NO) //默认 0-未启用
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
}
