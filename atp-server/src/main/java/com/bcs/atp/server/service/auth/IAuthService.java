package com.bcs.atp.server.service.auth;

import com.bcs.atp.server.model.dto.DeviceIdentifierToken;
import com.bcs.atp.server.model.dto.JwtTokenDto;
import com.bcs.atp.server.model.dto.VerifyMagicDto;

/**
 * 授权管理服务
 *
 * @author scott
 * @since 2024/03/28
 */
public interface IAuthService {
  /**
   * 发送登录链接
   *
   * @param email  邮箱地址
   * @param origin 来源
   * @return 用户标识和令牌
   */
  DeviceIdentifierToken signInMagicLink(String email, String origin);

  /**
   * 校验令牌
   *
   * @param dto 待校验的令牌对象
   * @return 登录令牌
   */
  JwtTokenDto verifyToken(VerifyMagicDto dto);
}
