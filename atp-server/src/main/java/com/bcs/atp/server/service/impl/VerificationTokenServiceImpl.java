package com.bcs.atp.server.service.impl;

import com.bcs.atp.server.mapper.VerificationTokenMapper;
import com.bcs.atp.server.model.VerificationTokenModel;
import com.bcs.atp.server.service.VerificationTokenService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bcs.atp.server.model.qo.VerificationTokenPageQo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 验证码表 服务实现类
 * </p>
 *
 * @author Scott Lau
 * @since 2024-03-21
 */
@Service
public class VerificationTokenServiceImpl extends ServiceImpl<VerificationTokenMapper, VerificationTokenModel> implements VerificationTokenService {
  @Override
  public boolean create(VerificationTokenModel verificationToken) {
    return save(verificationToken);
  }

  @Override
  public boolean update(VerificationTokenModel verificationToken) {
    return updateById(verificationToken);
  }

  @Override
  public boolean delete(String id) {
    return removeById(id);
  }

  @Override
  public IPage<VerificationTokenModel> list(VerificationTokenPageQo pageQo) {
    IPage<VerificationTokenModel> page = new Page<>(pageQo.getPageNum(), pageQo.getPageSize());
    QueryWrapper<VerificationTokenModel> wrapper = new QueryWrapper<>();
    return page(page, wrapper);
  }

  @Override
  public List<VerificationTokenModel> listAll() {
    QueryWrapper<VerificationTokenModel> wrapper = new QueryWrapper<>();
    LambdaQueryWrapper<VerificationTokenModel> lambda = wrapper.lambda();
    return list(wrapper);
  }
}
