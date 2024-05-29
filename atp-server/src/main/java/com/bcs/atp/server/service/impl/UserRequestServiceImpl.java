package com.bcs.atp.server.service.impl;

import com.bcs.atp.server.mapper.UserRequestMapper;
import com.bcs.atp.server.model.UserRequestModel;
import com.bcs.atp.server.service.UserRequestService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bcs.atp.server.model.qo.UserRequestPageQo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 用户请求表 服务实现类
 * </p>
 *
 * @author Scott Lau
 * @since 2024-03-21
 */
@Service
public class UserRequestServiceImpl extends ServiceImpl<UserRequestMapper, UserRequestModel> implements UserRequestService {
  @Override
  public boolean create(UserRequestModel userRequest) {
    return save(userRequest);
  }

  @Override
  public boolean update(UserRequestModel userRequest) {
    return updateById(userRequest);
  }

  @Override
  public boolean delete(String id) {
    return removeById(id);
  }

  @Override
  public IPage<UserRequestModel> list(UserRequestPageQo pageQo) {
    IPage<UserRequestModel> page = new Page<>(pageQo.getPageNum(), pageQo.getPageSize());
    QueryWrapper<UserRequestModel> wrapper = new QueryWrapper<>();
    return page(page, wrapper);
  }

  @Override
  public List<UserRequestModel> listAll() {
    QueryWrapper<UserRequestModel> wrapper = new QueryWrapper<>();
    LambdaQueryWrapper<UserRequestModel> lambda = wrapper.lambda();
    return list(wrapper);
  }
}
