package com.bcs.atp.server.service.impl;

import com.bcs.atp.server.mapper.TeamCollectionMapper;
import com.bcs.atp.server.model.TeamCollectionModel;
import com.bcs.atp.server.service.TeamCollectionService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bcs.atp.server.model.qo.TeamCollectionPageQo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 团队集合表 服务实现类
 * </p>
 *
 * @author Scott Lau
 * @since 2024-03-21
 */
@Service
public class TeamCollectionServiceImpl extends ServiceImpl<TeamCollectionMapper, TeamCollectionModel> implements TeamCollectionService {
  @Override
  public boolean create(TeamCollectionModel teamCollection) {
    return save(teamCollection);
  }

  @Override
  public boolean update(TeamCollectionModel teamCollection) {
    return updateById(teamCollection);
  }

  @Override
  public boolean delete(String id) {
    return removeById(id);
  }

  @Override
  public IPage<TeamCollectionModel> list(TeamCollectionPageQo pageQo) {
    IPage<TeamCollectionModel> page = new Page<>(pageQo.getPageNum(), pageQo.getPageSize());
    QueryWrapper<TeamCollectionModel> wrapper = new QueryWrapper<>();
    return page(page, wrapper);
  }

  @Override
  public List<TeamCollectionModel> listAll() {
    QueryWrapper<TeamCollectionModel> wrapper = new QueryWrapper<>();
    LambdaQueryWrapper<TeamCollectionModel> lambda = wrapper.lambda();
    return list(wrapper);
  }
}
