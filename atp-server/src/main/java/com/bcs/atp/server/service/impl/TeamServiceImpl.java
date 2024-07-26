package com.bcs.atp.server.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bcs.atp.server.gql.types.Team;
import com.bcs.atp.server.gql.types.TeamMember;
import com.bcs.atp.server.mapper.TeamMapper;
import com.bcs.atp.server.model.TeamModel;
import com.bcs.atp.server.model.qo.TeamPageQo;
import com.bcs.atp.server.service.TeamMemberService;
import com.bcs.atp.server.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

  @Autowired
  private TeamMemberService teamMemberService;

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

  @Override
  public Team convertDbModelToGraphqlModel(TeamModel teamModel) {
    Team team = new Team();
    BeanUtil.copyProperties(teamModel, team);
    List<TeamMember> teamMemberList = teamMemberService.findByTeamId(teamModel.getId()).stream().map(teamMemberModel -> teamMemberService.convertDbModelToGraphqlModel(teamMemberModel)).collect(Collectors.toList());
    team.setMembers(teamMemberList);
    team.setTeamMembers(teamMemberList);
    return team;
  }
}
