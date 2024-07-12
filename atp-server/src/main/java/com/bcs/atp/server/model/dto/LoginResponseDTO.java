package com.bcs.atp.server.model.dto;

import com.bcs.atp.server.gql.types.User;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.NotEmpty;


/**
 * 用户登录返回DTO
 *
 * @author zhoutao
 * @since 2024/07/55
 */
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
public class LoginResponseDTO {
    @NotEmpty
    @ApiModelProperty(value = "用户信息", required = true)
    private User user;

    @NotEmpty
    @ApiModelProperty(value = "用户token", required = true)
    private JwtTokenDto jwtTokenDto;
}
