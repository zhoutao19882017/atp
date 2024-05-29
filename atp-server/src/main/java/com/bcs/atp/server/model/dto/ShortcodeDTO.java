package com.bcs.atp.server.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * <p>
 * 简码表 DTO
 * </p>
 *
 * @author Scott Lau
 * @since 2024-03-21
 */
@Getter
@Setter
@ToString
@ApiModel("简码表DTO")
public class ShortcodeDTO implements Serializable {

  private static final long serialVersionUID = 1L;

  @ApiModelProperty(value = "请求")
  private String request;

  @ApiModelProperty(value = "创建人用户ID")
  private String creatorUid;

  @ApiModelProperty(value = "嵌入的属性集")
  private String embedProperties;


}
