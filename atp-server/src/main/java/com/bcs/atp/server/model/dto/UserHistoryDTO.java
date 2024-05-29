package com.bcs.atp.server.model.dto;

import com.soulcraft.mybatis.common.enums.EYesOrNo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 用户历史表 DTO
 * </p>
 *
 * @author Scott Lau
 * @since 2024-03-21
 */
@Getter
@Setter
@ToString
@ApiModel("用户历史表DTO")
public class UserHistoryDTO implements Serializable {

  private static final long serialVersionUID = 1L;

  @ApiModelProperty(value = "用户ID")
  private String userId;

  @ApiModelProperty(value = "请求类型")
  private String reqType;

  @ApiModelProperty(value = "请求")
  private String request;

  @ApiModelProperty(value = "响应元数据")
  private String responseMetadata;

  @ApiModelProperty(value = "是否星标：0-否；1-是")
  private EYesOrNo isStarred;

  @ApiModelProperty(value = "执行时间")
  private Date executedOn;


}
