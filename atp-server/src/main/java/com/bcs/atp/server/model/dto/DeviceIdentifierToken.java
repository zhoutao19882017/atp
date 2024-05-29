package com.bcs.atp.server.model.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * 用户登录返回参数
 *
 * @author Scott
 * @since 2024/03/15
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
public class DeviceIdentifierToken {
  @ApiModelProperty(value = "用户登录设备标识")
  private String deviceIdentifier;
}
