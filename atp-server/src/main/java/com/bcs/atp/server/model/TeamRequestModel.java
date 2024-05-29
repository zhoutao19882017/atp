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
 * 团队请求表
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
@TableName("team_request")
@ApiModel(value = "团队请求表对象", description = "团队请求表")
public class TeamRequestModel extends BaseUuidModel {

  private static final long serialVersionUID = 1L;

  @ApiModelProperty(value = "集合ID")
  @TableField("collection_id")
  private String collectionId;

  @ApiModelProperty(value = "团队ID")
  @TableField("team_id")
  private String teamId;

  @ApiModelProperty(value = "标题")
  @TableField("title")
  private String title;

  @ApiModelProperty(value = "请求")
  @TableField("request")
  private String request;

  @ApiModelProperty(value = "排序")
  @TableField("order_index")
  private Integer orderIndex;


}
