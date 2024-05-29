package com.bcs.atp.server.model.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * Jwt令牌信息
 *
 * @author Scott
 * @since 2024/03/27
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
public class JwtTokenDto {
  @ApiModelProperty(value = "访问令牌")
  private String accessToken;

  @ApiModelProperty(value = "刷新令牌")
  private String refreshToken;
}
