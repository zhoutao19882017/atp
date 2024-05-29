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
 * 验证码表 DTO
 * </p>
 *
 * @author Scott Lau
 * @since 2024-03-21
 */
@Getter
@Setter
@ToString
@ApiModel("验证码表DTO")
public class VerificationTokenDTO implements Serializable {

  private static final long serialVersionUID = 1L;

  @ApiModelProperty(value = "设备标识")
  private String deviceIdentifier;

  @ApiModelProperty(value = "令牌")
  private String token;

  @ApiModelProperty(value = "用户ID")
  private String userId;

  @ApiModelProperty(value = "过期时间")
  private Date expiresOn;


}
