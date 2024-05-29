package com.bcs.atp.server.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.soulcraft.mybatis.common.model.BaseUuidModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户请求表
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
@TableName("user_request")
@ApiModel(value = "用户请求表对象", description = "用户请求表")
public class UserRequestModel extends BaseUuidModel {

  private static final long serialVersionUID = 1L;

  @ApiModelProperty(value = "集合ID")
  @TableField("collection_id")
  private String collectionId;

  @ApiModelProperty(value = "用户ID")
  @TableField("user_id")
  private String userId;

  @ApiModelProperty(value = "标题")
  @TableField("title")
  private String title;

  @ApiModelProperty(value = "请求")
  @TableField("request")
  private String request;

  @ApiModelProperty(value = "请求类型")
  @TableField("type")
  private String type;

  @ApiModelProperty(value = "排序")
  @TableField("order_index")
  private Integer orderIndex;


}
