package com.bcs.atp.server.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.bcs.atp.server.gql.types.InfraConfig;
import com.bcs.atp.server.gql.types.InfraConfigEnum;
import com.bcs.atp.server.gql.types.ServiceStatus;
import com.bcs.atp.server.model.InfraConfigModel;
import com.bcs.atp.server.model.qo.InfraConfigPageQo;

import java.util.List;

/**
 * <p>
 * 基础配置表 服务类
 * </p>
 *
 * @author Scott Lau
 * @since 2024-03-21
 */
public interface InfraConfigService extends IService<InfraConfigModel> {
  /**
   * <p>
   * 保存对象
   * </p>
   *
   * @param infraConfig 对象实例
   * @return 是否保存成功
   */
  boolean create(InfraConfigModel infraConfig);

  /**
   * <p>
   * 更新对象
   * </p>
   *
   * @param infraConfig 对象实例
   * @return 是否更新成功
   */
  boolean update(InfraConfigModel infraConfig);

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
  IPage<InfraConfigModel> list(InfraConfigPageQo pageQo);

  /**
   * <p>
   * 查询所有对象
   * </p>
   *
   * @return 所有对象
   */
  List<InfraConfigModel> listAll();

  /**
   * 按配置名查询
   * @param name
   * @return
   */
  InfraConfigModel queryByName(String name);

  /**
   * 数据收集分析配置修改
   * @param status
   * @return
   */
  boolean toggleAnalyticsCollection(ServiceStatus status);

  /**
   * 设置配置为已完成，数据库值为false
   * @return
   */
  boolean setSetupAsComplete();

  /**
   * 将数据库对象转换为graphql对象
   * @param infraConfigModel
   * @return
   */
  InfraConfig convertDbModelToGraphqlModel(InfraConfigModel infraConfigModel);

  /**
   * 通过配置名查配置项
   * @param configNames
   * @return
   */
  List<InfraConfig> findInfraConfigByNames(InfraConfigEnum[] configNames);
}
