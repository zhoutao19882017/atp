package com.bcs.atp.server.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.bcs.atp.server.gql.types.UserSettings;
import com.bcs.atp.server.mapper.UserSettingsMapper;
import com.bcs.atp.server.model.UserSettingsModel;
import com.bcs.atp.server.model.qo.UserSettingsPageQo;
import com.bcs.atp.server.service.UserSettingsService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.List;

/**
 * <p>
 * 用户设置表 服务实现类
 * </p>
 *
 * @author Scott Lau
 * @since 2024-03-21
 */
@Service
public class UserSettingsServiceImpl extends ServiceImpl<UserSettingsMapper, UserSettingsModel> implements UserSettingsService {
  @Override
  public boolean create(UserSettingsModel userSettings) {
    return save(userSettings);
  }

  @Override
  public boolean update(UserSettingsModel userSettings) {
    return updateById(userSettings);
  }

  @Override
  public boolean delete(String id) {
    return removeById(id);
  }

  @Override
  public IPage<UserSettingsModel> list(UserSettingsPageQo pageQo) {
    IPage<UserSettingsModel> page = new Page<>(pageQo.getPageNum(), pageQo.getPageSize());
    QueryWrapper<UserSettingsModel> wrapper = new QueryWrapper<>();
    return page(page, wrapper);
  }

  @Override
  public List<UserSettingsModel> listAll() {
    QueryWrapper<UserSettingsModel> wrapper = new QueryWrapper<>();
    LambdaQueryWrapper<UserSettingsModel> lambda = wrapper.lambda();
    return list(wrapper);
  }

  @Override
  public UserSettings convertDbModelToGraphqlModel(UserSettingsModel dbModel) {
    UserSettings model = new UserSettings();
    BeanUtil.copyProperties(dbModel, model);
    model.setUserUid(dbModel.getUserId());
    // CTT=Asia/Shanghai
    ZoneId zoneId = ZoneId.of(ZoneId.SHORT_IDS.get("CTT"));
    model.setUpdatedOn(OffsetDateTime.ofInstant(dbModel.getUpdateTime().toInstant(), zoneId));
    return model;
  }
}
