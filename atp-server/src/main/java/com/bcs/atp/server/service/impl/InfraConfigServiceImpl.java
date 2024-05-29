package com.bcs.atp.server.service.impl;

import com.bcs.atp.server.mapper.InfraConfigMapper;
import com.bcs.atp.server.model.InfraConfigModel;
import com.bcs.atp.server.model.qo.InfraConfigPageQo;
import com.bcs.atp.server.service.InfraConfigService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 基础配置表 服务实现类
 * </p>
 *
 * @author Scott Lau
 * @since 2024-03-21
 */
@Service
public class InfraConfigServiceImpl extends ServiceImpl<InfraConfigMapper, InfraConfigModel> implements InfraConfigService {
  @Override
  public boolean create(InfraConfigModel infraConfig) {
    return save(infraConfig);
  }

  @Override
  public boolean update(InfraConfigModel infraConfig) {
    return updateById(infraConfig);
  }

  @Override
  public boolean delete(String id) {
    return removeById(id);
  }

  @Override
  public IPage<InfraConfigModel> list(InfraConfigPageQo pageQo) {
    IPage<InfraConfigModel> page = new Page<>(pageQo.getPageNum(), pageQo.getPageSize());
    QueryWrapper<InfraConfigModel> wrapper = new QueryWrapper<>();
    return page(page, wrapper);
  }

  @Override
  public List<InfraConfigModel> listAll() {
    QueryWrapper<InfraConfigModel> wrapper = new QueryWrapper<>();
    LambdaQueryWrapper<InfraConfigModel> lambda = wrapper.lambda();
    return list(wrapper);
  }
}
