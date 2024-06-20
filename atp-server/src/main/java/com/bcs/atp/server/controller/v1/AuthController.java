package com.bcs.atp.server.controller.v1;

import com.bcs.atp.server.error.ResponseEnum;
import com.bcs.atp.server.gql.types.AuthProvider;
import com.bcs.atp.server.model.dto.DeviceIdentifierToken;
import com.bcs.atp.server.model.dto.JwtTokenDto;
import com.bcs.atp.server.model.dto.SignInMagicDto;
import com.bcs.atp.server.model.dto.VerifyMagicDto;
import com.bcs.atp.server.service.auth.IAuthService;
import com.bcs.atp.server.util.AuthHelper;
import com.soulcraft.network.resp.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 授权管理
 *
 * @author scott
 * @since 2024/03/28
 */
@RestController
@Api(tags = {"授权管理"})
@RequestMapping("/v1/auth")
public class AuthController {

  /**
   * 默认的登录方式：Email
   */
  private static final AuthProvider DEFAULT_AUTH_PROVIDER = AuthProvider.EMAIL;

  @Value("${infra.auth.allowedAuthProviders}")
  private AuthProvider[] allowedAuthProviders;

  @Value("${infra.auth.validAdminOrigin}")
  private String validAdminOrigin;

  @Autowired
  private IAuthService authService;

  @ApiOperation("支持的登录方式列表")
  @GetMapping("/providers")
  public R<List<String>> providers() {
    return R.success(Arrays.stream(allowedAuthProviders).map(Enum::name).collect(Collectors.toList()));
  }

  @ApiOperation("用户登录")
  @PostMapping("/signin")
  public R<DeviceIdentifierToken> signInAdminWithMagicLink(@Validated @RequestBody SignInMagicDto dto, @RequestParam(required = false) String origin) {
    // 检查是不是系统支持的登录方式
    boolean authProviderCheck = AuthHelper.authProviderCheck(DEFAULT_AUTH_PROVIDER, allowedAuthProviders);
    ResponseEnum.AUTH_PROVIDER_NOT_SUPPORTED.assertTrue(authProviderCheck, DEFAULT_AUTH_PROVIDER);
    // check to see if origin is valid
    if (origin != null){
      boolean originValidated = validAdminOrigin.equals(origin);
      ResponseEnum.ORIGIN_NOT_VALID.assertTrue(originValidated, origin);
    }
    // authService.signInMagicLink
    return R.success(authService.signInMagicLink(dto.getEmail(), origin));
  }

  @ApiOperation("用户登录令牌验证")
  @PostMapping("/verify")
  public R<JwtTokenDto> verify(@Validated @RequestBody VerifyMagicDto dto,
                               HttpServletResponse response) {
    return R.success(authService.verifyToken(dto));
  }

  @ApiOperation("用户登出")
  @RequestMapping("/logout")
  public R<?> logout(HttpServletResponse response) {
    return R.success();
  }

}
