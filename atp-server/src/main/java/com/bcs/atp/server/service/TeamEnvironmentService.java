package com.bcs.atp.server.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.bcs.atp.server.model.TeamEnvironmentModel;
import com.bcs.atp.server.model.qo.TeamEnvironmentPageQo;

import java.util.List;

/**
 * <p>
 * 团队环境表 服务类
 * </p>
 *
 * @author Scott Lau
 * @since 2024-03-21
 */
public interface TeamEnvironmentService extends IService<TeamEnvironmentModel> {
  /**
   * <p>
   * 保存对象
   * </p>
   *
   * @param teamEnvironment 对象实例
   * @return 是否保存成功
   */
  boolean create(TeamEnvironmentModel teamEnvironment);

  /**
   * <p>
   * 更新对象
   * </p>
   *
   * @param teamEnvironment 对象实例
   * @return 是否更新成功
   */
  boolean update(TeamEnvironmentModel teamEnvironment);

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
  IPage<TeamEnvironmentModel> list(TeamEnvironmentPageQo pageQo);

  /**
   * <p>
   * 查询所有对象
   * </p>
   *
   * @return 所有对象
   */
  List<TeamEnvironmentModel> listAll();
}
