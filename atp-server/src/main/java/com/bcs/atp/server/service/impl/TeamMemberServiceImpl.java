package com.bcs.atp.server.service.impl;

import com.bcs.atp.server.mapper.TeamMemberMapper;
import com.bcs.atp.server.model.TeamMemberModel;
import com.bcs.atp.server.model.qo.TeamMemberPageQo;
import com.bcs.atp.server.service.TeamMemberService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 团队成员表 服务实现类
 * </p>
 *
 * @author Scott Lau
 * @since 2024-03-21
 */
@Service
public class TeamMemberServiceImpl extends ServiceImpl<TeamMemberMapper, TeamMemberModel> implements TeamMemberService {
  @Override
  public boolean create(TeamMemberModel teamMember) {
    return save(teamMember);
  }

  @Override
  public boolean update(TeamMemberModel teamMember) {
    return updateById(teamMember);
  }

  @Override
  public boolean delete(String id) {
    return removeById(id);
  }

  @Override
  public IPage<TeamMemberModel> list(TeamMemberPageQo pageQo) {
    IPage<TeamMemberModel> page = new Page<>(pageQo.getPageNum(), pageQo.getPageSize());
    QueryWrapper<TeamMemberModel> wrapper = new QueryWrapper<>();
    return page(page, wrapper);
  }

  @Override
  public List<TeamMemberModel> listAll() {
    QueryWrapper<TeamMemberModel> wrapper = new QueryWrapper<>();
    LambdaQueryWrapper<TeamMemberModel> lambda = wrapper.lambda();
    return list(wrapper);
  }
}
