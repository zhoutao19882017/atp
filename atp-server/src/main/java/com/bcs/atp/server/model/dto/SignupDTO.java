package com.bcs.atp.server.model.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.NotEmpty;


/**
 * 用户注册参数
 *
 * @author zhoutao
 * @since 2024/06/25
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
public class SignupDTO {
    @NotEmpty
    @ApiModelProperty(value = "用户电子邮箱", required = true)
    private String email;

    @NotEmpty
    @ApiModelProperty(value = "用户密码", required = true)
    private String password;

    @NotEmpty
    @ApiModelProperty(value = "确认密码", required = true)
    private String confirmPassword;
}
