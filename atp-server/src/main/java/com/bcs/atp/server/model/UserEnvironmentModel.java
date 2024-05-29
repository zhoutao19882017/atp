package com.bcs.atp.server.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.soulcraft.mybatis.common.enums.EYesOrNo;
import com.soulcraft.mybatis.common.model.BaseUuidModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;

/**
 * <p>
 * 用户环境表
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
@TableName("user_environment")
@ApiModel(value = "用户环境表对象", description = "用户环境表")
public class UserEnvironmentModel extends BaseUuidModel {

  private static final long serialVersionUID = 1L;

  @ApiModelProperty(value = "用户ID")
  @TableField("user_id")
  private String userId;

  @ApiModelProperty(value = "名称")
  @TableField("name")
  private String name;

  @ApiModelProperty(value = "变量集")
  @TableField("variables")
  private String variables;

  @ApiModelProperty(value = "是否全局：0-否；1-是")
  @TableField("is_global")
  private EYesOrNo isGlobal;


}
