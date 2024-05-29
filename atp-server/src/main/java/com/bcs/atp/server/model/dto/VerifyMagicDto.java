package com.bcs.atp.server.model.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.NotEmpty;

/**
 * 用户登录认证参数
 *
 * @author Scott
 * @since 2024/03/19
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
public class VerifyMagicDto {
  @NotEmpty
  @ApiModelProperty(value = "登录令牌", required = true)
  private String token;
  @NotEmpty
  @ApiModelProperty(value = "设备标识", required = true)
  private String deviceIdentifier;
}
