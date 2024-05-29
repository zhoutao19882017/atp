package com.bcs.atp.server.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 账户表 DTO
 * </p>
 *
 * @author Scott Lau
 * @since 2024-03-21
 */
@Getter
@Setter
@ToString
@ApiModel("账户表DTO")
public class AccountDTO implements Serializable {

  private static final long serialVersionUID = 1L;

  @ApiModelProperty(value = "用户ID")
  private String userId;

  @ApiModelProperty(value = "提供方")
  private String provider;

  @ApiModelProperty(value = "提供方账户ID")
  private String providerAccountId;

  @ApiModelProperty(value = "提供方刷新令牌")
  private String providerRefreshToken;

  @ApiModelProperty(value = "提供方访问令牌")
  private String providerAccessToken;

  @ApiModelProperty(value = "提供方范围")
  private String providerScope;

  @ApiModelProperty(value = "登录时间")
  private Date loggedIn;


}
