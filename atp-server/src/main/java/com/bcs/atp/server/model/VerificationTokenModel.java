package com.bcs.atp.server.model;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import com.soulcraft.mybatis.common.model.BaseUuidModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * <p>
 * 验证码表
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
@TableName("verification_token")
@ApiModel(value = "验证码表对象", description = "验证码表")
public class VerificationTokenModel extends BaseUuidModel {

  private static final long serialVersionUID = 1L;

  @ApiModelProperty(value = "设备标识")
  @TableField("device_identifier")
  private String deviceIdentifier;

  @ApiModelProperty(value = "令牌")
  @TableField("token")
  private String token;

  @ApiModelProperty(value = "用户ID")
  @TableField("user_id")
  private String userId;

  @ApiModelProperty(value = "过期时间")
  @TableField("expires_on")
  private Date expiresOn;


}
