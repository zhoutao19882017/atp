package com.bcs.atp.server.service.impl;

import com.bcs.atp.server.mapper.InvitedUsersMapper;
import com.bcs.atp.server.model.InvitedUsersModel;
import com.bcs.atp.server.model.qo.InvitedUsersPageQo;
import com.bcs.atp.server.service.InvitedUsersService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 受邀用户表 服务实现类
 * </p>
 *
 * @author Scott Lau
 * @since 2024-03-21
 */
@Service
public class InvitedUsersServiceImpl extends ServiceImpl<InvitedUsersMapper, InvitedUsersModel> implements InvitedUsersService {
  @Override
  public boolean create(InvitedUsersModel invitedUsers) {
    return save(invitedUsers);
  }

  @Override
  public boolean update(InvitedUsersModel invitedUsers) {
    return updateById(invitedUsers);
  }

  @Override
  public boolean delete(String id) {
    return removeById(id);
  }

  @Override
  public IPage<InvitedUsersModel> list(InvitedUsersPageQo pageQo) {
    IPage<InvitedUsersModel> page = new Page<>(pageQo.getPageNum(), pageQo.getPageSize());
    QueryWrapper<InvitedUsersModel> wrapper = new QueryWrapper<>();
    return page(page, wrapper);
  }

  @Override
  public List<InvitedUsersModel> listAll() {
    QueryWrapper<InvitedUsersModel> wrapper = new QueryWrapper<>();
    LambdaQueryWrapper<InvitedUsersModel> lambda = wrapper.lambda();
    return list(wrapper);
  }
}
