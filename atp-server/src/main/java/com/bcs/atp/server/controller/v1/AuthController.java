package com.bcs.atp.server.controller.v1;

import com.bcs.atp.server.error.ResponseEnum;
import com.bcs.atp.server.gql.types.AuthProvider;
import com.bcs.atp.server.model.dto.*;
import com.bcs.atp.server.service.UserService;
import com.bcs.atp.server.service.auth.IAuthService;
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
  @Value("${infra.auth.allowedAuthProviders}")
  private AuthProvider[] allowedAuthProviders;

  @Value("${infra.auth.validAdminOrigin}")
  private String validAdminOrigin;

  @Autowired
  private IAuthService authService;

  @Autowired
  private UserService userService;

  @ApiOperation("支持的登录方式列表")
  @GetMapping("/providers")
  public R<List<String>> providers() {
    return R.success(Arrays.stream(allowedAuthProviders).map(Enum::name).collect(Collectors.toList()));
  }

  @ApiOperation("用户登录-邮箱链接")
  @PostMapping("/signin")
  public R<DeviceIdentifierToken> signInAdminWithMagicLink(@Validated @RequestBody SignInMagicDto dto, @RequestParam(required = false) String origin) {
    // check to see if origin is valid
    if (origin != null){
      boolean originValidated = validAdminOrigin.equals(origin);
      ResponseEnum.ORIGIN_NOT_VALID.assertTrue(originValidated, origin);
    }
    // authService.signInMagicLink
    return R.success(authService.signInMagicLink(dto.getEmail(), origin));
  }

  @ApiOperation("用户登录")
  @PostMapping("/login")
  public R<?> login(@Validated @RequestBody LoginDTO dto) {
    return R.success(userService.userLogin(dto));
  }

  @ApiOperation("用户注册")
  @PostMapping("/signup")
  public R<?> signup(@Validated @RequestBody SignupDTO dto, @RequestParam(required = false) String origin) {
    return R.success(authService.signupMagicLink(dto, origin));
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
