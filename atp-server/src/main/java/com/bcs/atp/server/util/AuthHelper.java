package com.bcs.atp.server.util;

import com.bcs.atp.server.gql.types.AuthProvider;
import io.micrometer.core.instrument.util.StringUtils;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * 用户登录授权工具类
 *
 * @author Scott
 * @since 2024/03/15
 */
public class AuthHelper {

  /**
   * 校验登录方式
   *
   * @param authProvider         提供的登录方式
   * @param allowedAuthProviders 系统支持的登录方式
   * @return 当前登录方式是否是系统支持的登录方式
   */
  public static boolean authProviderCheck(AuthProvider authProvider, AuthProvider[] allowedAuthProviders) {
    return Arrays.stream(allowedAuthProviders).collect(Collectors.toSet()).contains(authProvider);
  }

  public static boolean passwordValidated(String password, String confirmPassword){
    if (StringUtils.isBlank(password) || StringUtils.isBlank(confirmPassword)){
      return false;
    }
    return password.equals(confirmPassword);
  }
}
