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
 * 团队环境表
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
@TableName("team_environment")
@ApiModel(value = "团队环境表对象", description = "团队环境表")
public class TeamEnvironmentModel extends BaseUuidModel {

  private static final long serialVersionUID = 1L;

  @ApiModelProperty(value = "团队ID")
  @TableField("team_id")
  private String teamId;

  @ApiModelProperty(value = "名称")
  @TableField("name")
  private String name;

  @ApiModelProperty(value = "变量集")
  @TableField("variables")
  private String variables;


}
