package com.bcs.atp.server.service.impl;

import com.bcs.atp.server.mapper.AccountMapper;
import com.bcs.atp.server.model.AccountModel;
import com.bcs.atp.server.model.qo.AccountPageQo;
import com.bcs.atp.server.service.AccountService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 账户表 服务实现类
 * </p>
 *
 * @author Scott Lau
 * @since 2024-03-21
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, AccountModel> implements AccountService {
  @Override
  public boolean create(AccountModel account) {
    return save(account);
  }

  @Override
  public boolean update(AccountModel account) {
    return updateById(account);
  }

  @Override
  public boolean delete(String id) {
    return removeById(id);
  }

  @Override
  public IPage<AccountModel> list(AccountPageQo pageQo) {
    IPage<AccountModel> page = new Page<>(pageQo.getPageNum(), pageQo.getPageSize());
    QueryWrapper<AccountModel> wrapper = new QueryWrapper<>();
    return page(page, wrapper);
  }

  @Override
  public List<AccountModel> listAll() {
    QueryWrapper<AccountModel> wrapper = new QueryWrapper<>();
    LambdaQueryWrapper<AccountModel> lambda = wrapper.lambda();
    return list(wrapper);
  }
}
