package com.bcs.atp.server.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.bcs.atp.server.gql.types.ReqType;
import com.bcs.atp.server.gql.types.UserHistory;
import com.bcs.atp.server.mapper.UserHistoryMapper;
import com.bcs.atp.server.model.UserHistoryModel;
import com.bcs.atp.server.service.UserHistoryService;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bcs.atp.server.model.qo.UserHistoryPageQo;
import com.soulcraft.mybatis.common.enums.EYesOrNo;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.util.List;

/**
 * <p>
 * 用户历史表 服务实现类
 * </p>
 *
 * @author Scott Lau
 * @since 2024-03-21
 */
@Service
public class UserHistoryServiceImpl extends ServiceImpl<UserHistoryMapper, UserHistoryModel> implements UserHistoryService {
  @Override
  public boolean create(UserHistoryModel userHistory) {
    return save(userHistory);
  }

  @Override
  public boolean update(UserHistoryModel userHistory) {
    return updateById(userHistory);
  }

  @Override
  public boolean delete(String id) {
    return removeById(id);
  }

  @Override
  public IPage<UserHistoryModel> list(UserHistoryPageQo pageQo) {
    IPage<UserHistoryModel> page = new Page<>(pageQo.getPageNum(), pageQo.getPageSize());
    QueryWrapper<UserHistoryModel> wrapper = new QueryWrapper<>();
    return page(page, wrapper);
  }

  @Override
  public List<UserHistoryModel> listAll() {
    QueryWrapper<UserHistoryModel> wrapper = new QueryWrapper<>();
    LambdaQueryWrapper<UserHistoryModel> lambda = wrapper.lambda();
    return list(wrapper);
  }

  @Override
  public UserHistory convertDbModelToGraphqlModel(UserHistoryModel dbModel) {
    UserHistory model = new UserHistory();
    BeanUtil.copyProperties(dbModel, model);
    model.setUserUid(dbModel.getUserId());
    model.setIsStarred(dbModel.getIsStarred().equals(EYesOrNo.YES));
    model.setReqType(ReqType.valueOf(dbModel.getReqType()));
    // CTT=Asia/Shanghai
    ZoneId zoneId = ZoneId.of(ZoneId.SHORT_IDS.get("CTT"));
    model.setExecutedOn(OffsetDateTime.ofInstant(dbModel.getExecutedOn().toInstant(), zoneId));
    return model;
  }
}
