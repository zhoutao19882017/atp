package com.bcs.atp.server.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.bcs.atp.server.gql.types.UserEnvironment;
import com.bcs.atp.server.mapper.UserEnvironmentMapper;
import com.bcs.atp.server.model.UserEnvironmentModel;
import com.bcs.atp.server.model.qo.UserEnvironmentPageQo;
import com.bcs.atp.server.service.UserEnvironmentService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.soulcraft.mybatis.common.enums.EYesOrNo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 用户环境表 服务实现类
 * </p>
 *
 * @author Scott Lau
 * @since 2024-03-21
 */
@Service
public class UserEnvironmentServiceImpl extends ServiceImpl<UserEnvironmentMapper, UserEnvironmentModel> implements UserEnvironmentService {
  @Override
  public boolean create(UserEnvironmentModel userEnvironment) {
    return save(userEnvironment);
  }

  @Override
  public boolean update(UserEnvironmentModel userEnvironment) {
    return updateById(userEnvironment);
  }

  @Override
  public boolean delete(String id) {
    return removeById(id);
  }

  @Override
  public IPage<UserEnvironmentModel> list(UserEnvironmentPageQo pageQo) {
    IPage<UserEnvironmentModel> page = new Page<>(pageQo.getPageNum(), pageQo.getPageSize());
    QueryWrapper<UserEnvironmentModel> wrapper = new QueryWrapper<>();
    return page(page, wrapper);
  }

  @Override
  public List<UserEnvironmentModel> listAll() {
    QueryWrapper<UserEnvironmentModel> wrapper = new QueryWrapper<>();
    LambdaQueryWrapper<UserEnvironmentModel> lambda = wrapper.lambda();
    return list(wrapper);
  }

  @Override
  public UserEnvironment convertDbModelToGraphqlModel(UserEnvironmentModel dbModel) {
    UserEnvironment model = new UserEnvironment();
    BeanUtil.copyProperties(dbModel, model);
    model.setUserUid(dbModel.getUserId());
    model.setIsGlobal(dbModel.getIsGlobal().equals(EYesOrNo.YES));
    return model;
  }
}
