package com.bcs.atp.server.service.impl;

import com.bcs.atp.server.mapper.TeamMapper;
import com.bcs.atp.server.model.TeamModel;
import com.bcs.atp.server.service.TeamService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bcs.atp.server.model.qo.TeamPageQo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 团队表 服务实现类
 * </p>
 *
 * @author Scott Lau
 * @since 2024-03-21
 */
@Service
public class TeamServiceImpl extends ServiceImpl<TeamMapper, TeamModel> implements TeamService {
  @Override
  public boolean create(TeamModel team) {
    return save(team);
  }

  @Override
  public boolean update(TeamModel team) {
    return updateById(team);
  }

  @Override
  public boolean delete(String id) {
    return removeById(id);
  }

  @Override
  public IPage<TeamModel> list(TeamPageQo pageQo) {
    IPage<TeamModel> page = new Page<>(pageQo.getPageNum(), pageQo.getPageSize());
    QueryWrapper<TeamModel> wrapper = new QueryWrapper<>();
    return page(page, wrapper);
  }

  @Override
  public List<TeamModel> listAll() {
    QueryWrapper<TeamModel> wrapper = new QueryWrapper<>();
    LambdaQueryWrapper<TeamModel> lambda = wrapper.lambda();
    return list(wrapper);
  }
}
