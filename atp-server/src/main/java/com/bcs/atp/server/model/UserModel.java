package com.bcs.atp.server.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.soulcraft.mybatis.common.enums.EYesOrNo;
import com.soulcraft.mybatis.common.model.BaseUuidModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户表
 * </p>
 *
 * @author Scott Lau
 * @since 2024-03-21
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("user")
@ApiModel(value = "用户表对象", description = "用户表")
public class UserModel extends BaseUuidModel {

  private static final long serialVersionUID = 1L;

  @ApiModelProperty(value = "邮箱")
  @TableField("email")
  private String email;

  @ApiModelProperty(value = "密码")
  @TableField("password")
  private String password;

  @ApiModelProperty(value = "显示名称")
  @TableField("display_name")
  private String displayName;

  @ApiModelProperty(value = "头像链接")
  @TableField("photo_url")
  private String photoUrl;

  @ApiModelProperty(value = "是否管理员：0-否；1-是")
  @TableField("is_admin")
  private EYesOrNo isAdmin;

  @ApiModelProperty(value = "刷新令牌")
  @TableField("refresh_token")
  private String refreshToken;

  @ApiModelProperty(value = "当前REST会话")
  @TableField("current_rest_session")
  private String currentRestSession;

  @ApiModelProperty(value = "当前GQL会话")
  @TableField("current_gql_session")
  private String currentGqlSession;


}
