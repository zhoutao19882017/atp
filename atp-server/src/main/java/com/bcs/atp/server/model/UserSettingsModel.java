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
 * 用户设置表
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
@TableName("user_settings")
@ApiModel(value = "用户设置表对象", description = "用户设置表")
public class UserSettingsModel extends BaseUuidModel {

  private static final long serialVersionUID = 1L;

  @ApiModelProperty(value = "用户ID")
  @TableField("user_id")
  private String userId;

  @ApiModelProperty(value = "属性集")
  @TableField("properties")
  private String properties;


}
