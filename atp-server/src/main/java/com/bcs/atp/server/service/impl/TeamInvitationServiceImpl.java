package com.bcs.atp.server.service.impl;

import com.bcs.atp.server.mapper.TeamInvitationMapper;
import com.bcs.atp.server.model.TeamInvitationModel;
import com.bcs.atp.server.service.TeamInvitationService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bcs.atp.server.model.qo.TeamInvitationPageQo;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 团队邀请表 服务实现类
 * </p>
 *
 * @author Scott Lau
 * @since 2024-03-21
 */
@Service
public class TeamInvitationServiceImpl extends ServiceImpl<TeamInvitationMapper, TeamInvitationModel> implements TeamInvitationService {
  @Override
  public boolean create(TeamInvitationModel teamInvitation) {
    return save(teamInvitation);
  }

  @Override
  public boolean update(TeamInvitationModel teamInvitation) {
    return updateById(teamInvitation);
  }

  @Override
  public boolean delete(String id) {
    return removeById(id);
  }

  @Override
  public IPage<TeamInvitationModel> list(TeamInvitationPageQo pageQo) {
    IPage<TeamInvitationModel> page = new Page<>(pageQo.getPageNum(), pageQo.getPageSize());
    QueryWrapper<TeamInvitationModel> wrapper = new QueryWrapper<>();
    return page(page, wrapper);
  }

  @Override
  public List<TeamInvitationModel> listAll() {
    QueryWrapper<TeamInvitationModel> wrapper = new QueryWrapper<>();
    LambdaQueryWrapper<TeamInvitationModel> lambda = wrapper.lambda();
    return list(wrapper);
  }
}
