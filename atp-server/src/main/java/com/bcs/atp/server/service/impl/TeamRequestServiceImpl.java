package com.bcs.atp.server.service.impl;

import com.bcs.atp.server.mapper.TeamRequestMapper;
import com.bcs.atp.server.model.TeamRequestModel;
import com.bcs.atp.server.model.qo.TeamRequestPageQo;
import com.bcs.atp.server.service.TeamRequestService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 团队请求表 服务实现类
 * </p>
 *
 * @author Scott Lau
 * @since 2024-03-21
 */
@Service
public class TeamRequestServiceImpl extends ServiceImpl<TeamRequestMapper, TeamRequestModel> implements TeamRequestService {
  @Override
  public boolean create(TeamRequestModel teamRequest) {
    return save(teamRequest);
  }

  @Override
  public boolean update(TeamRequestModel teamRequest) {
    return updateById(teamRequest);
  }

  @Override
  public boolean delete(String id) {
    return removeById(id);
  }

  @Override
  public IPage<TeamRequestModel> list(TeamRequestPageQo pageQo) {
    IPage<TeamRequestModel> page = new Page<>(pageQo.getPageNum(), pageQo.getPageSize());
    QueryWrapper<TeamRequestModel> wrapper = new QueryWrapper<>();
    return page(page, wrapper);
  }

  @Override
  public List<TeamRequestModel> listAll() {
    QueryWrapper<TeamRequestModel> wrapper = new QueryWrapper<>();
    LambdaQueryWrapper<TeamRequestModel> lambda = wrapper.lambda();
    return list(wrapper);
  }
}
