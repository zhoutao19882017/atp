package com.bcs.atp.server.service.impl;

import com.bcs.atp.server.mapper.TeamEnvironmentMapper;
import com.bcs.atp.server.model.TeamEnvironmentModel;
import com.bcs.atp.server.service.TeamEnvironmentService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bcs.atp.server.model.qo.TeamEnvironmentPageQo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 团队环境表 服务实现类
 * </p>
 *
 * @author Scott Lau
 * @since 2024-03-21
 */
@Service
public class TeamEnvironmentServiceImpl extends ServiceImpl<TeamEnvironmentMapper, TeamEnvironmentModel> implements TeamEnvironmentService {
  @Override
  public boolean create(TeamEnvironmentModel teamEnvironment) {
    return save(teamEnvironment);
  }

  @Override
  public boolean update(TeamEnvironmentModel teamEnvironment) {
    return updateById(teamEnvironment);
  }

  @Override
  public boolean delete(String id) {
    return removeById(id);
  }

  @Override
  public IPage<TeamEnvironmentModel> list(TeamEnvironmentPageQo pageQo) {
    IPage<TeamEnvironmentModel> page = new Page<>(pageQo.getPageNum(), pageQo.getPageSize());
    QueryWrapper<TeamEnvironmentModel> wrapper = new QueryWrapper<>();
    return page(page, wrapper);
  }

  @Override
  public List<TeamEnvironmentModel> listAll() {
    QueryWrapper<TeamEnvironmentModel> wrapper = new QueryWrapper<>();
    LambdaQueryWrapper<TeamEnvironmentModel> lambda = wrapper.lambda();
    return list(wrapper);
  }
}
