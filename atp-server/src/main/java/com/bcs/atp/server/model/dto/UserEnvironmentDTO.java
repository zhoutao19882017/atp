package com.bcs.atp.server.model.dto;

import com.soulcraft.mybatis.common.enums.EYesOrNo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * 用户环境表 DTO
 * </p>
 *
 * @author Scott Lau
 * @since 2024-03-21
 */
@Getter
@Setter
@ToString
@ApiModel("用户环境表DTO")
public class UserEnvironmentDTO implements Serializable {

  private static final long serialVersionUID = 1L;

  @ApiModelProperty(value = "用户ID")
  private String userId;

  @ApiModelProperty(value = "名称")
  private String name;

  @ApiModelProperty(value = "变量集")
  private String variables;

  @ApiModelProperty(value = "是否全局：0-否；1-是")
  private EYesOrNo isGlobal;


}
