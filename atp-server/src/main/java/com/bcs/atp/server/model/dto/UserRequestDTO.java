package com.bcs.atp.server.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * 用户请求表 DTO
 * </p>
 *
 * @author Scott Lau
 * @since 2024-03-21
 */
@Getter
@Setter
@ToString
@ApiModel("用户请求表DTO")
public class UserRequestDTO implements Serializable {

  private static final long serialVersionUID = 1L;

  @ApiModelProperty(value = "集合ID")
  private String collectionId;

  @ApiModelProperty(value = "用户ID")
  private String userId;

  @ApiModelProperty(value = "标题")
  private String title;

  @ApiModelProperty(value = "请求")
  private String request;

  @ApiModelProperty(value = "请求类型")
  private String type;

  @ApiModelProperty(value = "排序")
  private Integer orderIndex;


}
