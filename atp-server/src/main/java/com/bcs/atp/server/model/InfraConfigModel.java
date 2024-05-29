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
 * 基础配置表
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
@TableName("infra_config")
@ApiModel(value = "基础配置表对象", description = "基础配置表")
public class InfraConfigModel extends BaseUuidModel {

  private static final long serialVersionUID = 1L;

  @ApiModelProperty(value = "名称")
  @TableField("name")
  private String name;

  @ApiModelProperty(value = "值")
  @TableField("value")
  private String value;

  @ApiModelProperty(value = "是否启用：0-否；1-是")
  @TableField("active")
  private EYesOrNo active;


}
