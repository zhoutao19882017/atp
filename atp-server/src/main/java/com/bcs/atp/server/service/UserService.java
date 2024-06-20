package com.bcs.atp.server.service;

import com.bcs.atp.server.gql.types.User;
import com.bcs.atp.server.model.UserModel;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.bcs.atp.server.model.qo.UserPageQo;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.List;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author Scott Lau
 * @since 2024-03-21
 */
public interface UserService extends IService<UserModel> {
  /**
   * <p>
   * 保存对象
   * </p>
   *
   * @param user 对象实例
   * @return 是否保存成功
   */
  boolean create(UserModel user);

  /**
   * <p>
   * 更新对象
   * </p>
   *
   * @param user 对象实例
   * @return 是否更新成功
   */
  boolean update(UserModel user);

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
  IPage<UserModel> list(UserPageQo pageQo);

  /**
   * <p>
   * 查询所有对象
   * </p>
   *
   * @return 所有对象
   */
  List<UserModel> listAll();

  /**
   * 依据用户名加载用户对象
   *
   * @param username 用户名
   * @return 用户对象
   */
  UserDetails loadUserByUsername(String username);

  /**
   * 从邮箱地址创建用户
   *
   * @param email 邮箱地址
   * @param origin 来源
   * @return 创建的用户
   */
  UserModel createUserViaMagicLink(String email, String origin);

  /**
   * 将数据库对象转换为graphql对象
   *
   * @param dbModel 数据库对象
   * @return graphql对象
   */
  User convertDbModelToGraphqlModel(UserModel dbModel);
}
