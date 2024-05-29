package com.bcs.atp.server.service;

import com.bcs.atp.server.gql.types.UserHistory;
import com.bcs.atp.server.model.UserHistoryModel;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.bcs.atp.server.model.qo.UserHistoryPageQo;

import java.util.List;

/**
 * <p>
 * 用户历史表 服务类
 * </p>
 *
 * @author Scott Lau
 * @since 2024-03-21
 */
public interface UserHistoryService extends IService<UserHistoryModel> {
  /**
   * <p>
   * 保存对象
   * </p>
   *
   * @param userHistory 对象实例
   * @return 是否保存成功
   */
  boolean create(UserHistoryModel userHistory);

  /**
   * <p>
   * 更新对象
   * </p>
   *
   * @param userHistory 对象实例
   * @return 是否更新成功
   */
  boolean update(UserHistoryModel userHistory);

  /**
   * <p>
   * 删除对象
   * </p>
   *
   * @param id 对象ID
   * @return 是否删除成功
   */
  boolean delete(String id);

  /**
   * <p>
   * 分页查询对象
   * </p>
   *
   * @param pageQo 分页查询条件
   * @return 分页查询结果
   */
  IPage<UserHistoryModel> list(UserHistoryPageQo pageQo);

  /**
   * <p>
   * 查询所有对象
   * </p>
   *
   * @return 所有对象
   */
  List<UserHistoryModel> listAll();

  /**
   * 将数据库对象转换为graphql对象
   *
   * @param dbModel 数据库对象
   * @return graphql对象
   */
  UserHistory convertDbModelToGraphqlModel(UserHistoryModel dbModel);
}
