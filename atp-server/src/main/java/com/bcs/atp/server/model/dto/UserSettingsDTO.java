package com.bcs.atp.server.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * 用户设置表 DTO
 * </p>
 *
 * @author Scott Lau
 * @since 2024-03-21
 */
@Getter
@Setter
@ToString
@ApiModel("用户设置表DTO")
public class UserSettingsDTO implements Serializable {

  private static final long serialVersionUID = 1L;

  @ApiModelProperty(value = "用户ID")
  private String userId;

  @ApiModelProperty(value = "属性集")
  private String properties;


}
