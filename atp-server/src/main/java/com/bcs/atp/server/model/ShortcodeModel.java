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
 * 简码表
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
@TableName("shortcode")
@ApiModel(value = "简码表对象", description = "简码表")
public class ShortcodeModel extends BaseUuidModel {

  private static final long serialVersionUID = 1L;

  @ApiModelProperty(value = "请求")
  @TableField("request")
  private String request;

  @ApiModelProperty(value = "创建人用户ID")
  @TableField("creator_uid")
  private String creatorUid;

  @ApiModelProperty(value = "嵌入的属性集")
  @TableField("embed_properties")
  private String embedProperties;


}
