package com.bcs.atp.server.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * 团队请求表 DTO
 * </p>
 *
 * @author Scott Lau
 * @since 2024-03-21
 */
@Getter
@Setter
@ToString
@ApiModel("团队请求表DTO")
public class TeamRequestDTO implements Serializable {

  private static final long serialVersionUID = 1L;

  @ApiModelProperty(value = "集合ID")
  private String collectionId;

  @ApiModelProperty(value = "团队ID")
  private String teamId;

  @ApiModelProperty(value = "标题")
  private String title;

  @ApiModelProperty(value = "请求")
  private String request;

  @ApiModelProperty(value = "排序")
  private Integer orderIndex;


}
