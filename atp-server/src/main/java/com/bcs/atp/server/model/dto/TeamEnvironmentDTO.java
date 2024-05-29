package com.bcs.atp.server.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * 团队环境表 DTO
 * </p>
 *
 * @author Scott Lau
 * @since 2024-03-21
 */
@Getter
@Setter
@ToString
@ApiModel("团队环境表DTO")
public class TeamEnvironmentDTO implements Serializable {

  private static final long serialVersionUID = 1L;

  @ApiModelProperty(value = "团队ID")
  private String teamId;

  @ApiModelProperty(value = "名称")
  private String name;

  @ApiModelProperty(value = "变量集")
  private String variables;


}
