package com.bcs.atp.server.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.soulcraft.mybatis.common.enums.EYesOrNo;
import com.soulcraft.mybatis.common.model.BaseUuidModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * <p>
 * 用户历史表
 * </p>
 *
 * @author Scott Lau
 * @since 2024-03-21
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("user_history")
@ApiModel(value = "用户历史表对象", description = "用户历史表")
public class UserHistoryModel extends BaseUuidModel {

  private static final long serialVersionUID = 1L;

  @ApiModelProperty(value = "用户ID")
  @TableField("user_id")
  private String userId;

  @ApiModelProperty(value = "请求类型")
  @TableField("req_type")
  private String reqType;

  @ApiModelProperty(value = "请求")
  @TableField("request")
  private String request;

  @ApiModelProperty(value = "响应元数据")
  @TableField("response_metadata")
  private String responseMetadata;

  @ApiModelProperty(value = "是否星标：0-否；1-是")
  @TableField("is_starred")
  private EYesOrNo isStarred;

  @ApiModelProperty(value = "执行时间")
  @TableField("executed_on")
  private Date executedOn;


}
