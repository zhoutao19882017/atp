package com.bcs.atp.server.model.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.NotEmpty;

/**
 * 用户登录参数
 *
 * @author Scott
 * @since 2024/03/15
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
public class SignInMagicDto {
  @NotEmpty
  @ApiModelProperty(value = "用户电子邮箱", required = true)
  private String email;
}
