package com.bcs.atp.server.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * 用户集合表 DTO
 * </p>
 *
 * @author Scott Lau
 * @since 2024-03-21
 */
@Getter
@Setter
@ToString
@ApiModel("用户集合表DTO")
public class UserCollectionDTO implements Serializable {

  private static final long serialVersionUID = 1L;

  @ApiModelProperty(value = "父集合ID")
  private String parentId;

  @ApiModelProperty(value = "用户ID")
  private String userId;

  @ApiModelProperty(value = "标题")
  private String title;

  @ApiModelProperty(value = "排序")
  private Integer orderIndex;

  @ApiModelProperty(value = "请求类型")
  private String type;

  @ApiModelProperty(value = "数据")
  private String data;


}
