package com.bcs.atp.server.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.soulcraft.mybatis.common.model.BaseUuidModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * <p>
 * 账户表
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
@TableName("account")
@ApiModel(value = "账户表对象", description = "账户表")
public class AccountModel extends BaseUuidModel {

  private static final long serialVersionUID = 1L;

  @ApiModelProperty(value = "用户ID")
  @TableField("user_id")
  private String userId;

  @ApiModelProperty(value = "提供方")
  @TableField("provider")
  private String provider;

  @ApiModelProperty(value = "提供方账户ID")
  @TableField("provider_account_id")
  private String providerAccountId;

  @ApiModelProperty(value = "提供方刷新令牌")
  @TableField("provider_refresh_token")
  private String providerRefreshToken;

  @ApiModelProperty(value = "提供方访问令牌")
  @TableField("provider_access_token")
  private String providerAccessToken;

  @ApiModelProperty(value = "提供方范围")
  @TableField("provider_scope")
  private String providerScope;

  @ApiModelProperty(value = "登录时间")
  @TableField("logged_in")
  private Date loggedIn;


}
