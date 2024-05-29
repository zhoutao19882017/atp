package com.bcs.atp.server.service.impl;

import com.bcs.atp.server.mapper.UserCollectionMapper;
import com.bcs.atp.server.model.UserCollectionModel;
import com.bcs.atp.server.service.UserCollectionService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bcs.atp.server.model.qo.UserCollectionPageQo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 用户集合表 服务实现类
 * </p>
 *
 * @author Scott Lau
 * @since 2024-03-21
 */
@Service
public class UserCollectionServiceImpl extends ServiceImpl<UserCollectionMapper, UserCollectionModel> implements UserCollectionService {
  @Override
  public boolean create(UserCollectionModel userCollection) {
    return save(userCollection);
  }

  @Override
  public boolean update(UserCollectionModel userCollection) {
    return updateById(userCollection);
  }

  @Override
  public boolean delete(String id) {
    return removeById(id);
  }

  @Override
  public IPage<UserCollectionModel> list(UserCollectionPageQo pageQo) {
    IPage<UserCollectionModel> page = new Page<>(pageQo.getPageNum(), pageQo.getPageSize());
    QueryWrapper<UserCollectionModel> wrapper = new QueryWrapper<>();
    return page(page, wrapper);
  }

  @Override
  public List<UserCollectionModel> listAll() {
    QueryWrapper<UserCollectionModel> wrapper = new QueryWrapper<>();
    LambdaQueryWrapper<UserCollectionModel> lambda = wrapper.lambda();
    return list(wrapper);
  }
}
