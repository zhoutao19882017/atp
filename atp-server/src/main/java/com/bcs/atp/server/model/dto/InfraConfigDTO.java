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
 * 基础配置表 DTO
 * </p>
 *
 * @author Scott Lau
 * @since 2024-03-21
 */
@Getter
@Setter
@ToString
@ApiModel("基础配置表DTO")
public class InfraConfigDTO implements Serializable {

  private static final long serialVersionUID = 1L;

  @ApiModelProperty(value = "名称")
  private String name;

  @ApiModelProperty(value = "值")
  private String value;

  @ApiModelProperty(value = "是否启用：0-否；1-是")
  private EYesOrNo active;


}
