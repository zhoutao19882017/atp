package com.bcs.atp.server.service.auth.impl;

import cn.hutool.core.date.DateField;
import cn.hutool.core.date.DateTime;
import cn.hutool.core.util.RandomUtil;
import cn.hutool.crypto.digest.BCrypt;
import com.bcs.atp.server.error.ResponseEnum;
import com.bcs.atp.server.model.UserModel;
import com.bcs.atp.server.model.VerificationTokenModel;
import com.bcs.atp.server.service.AccountService;
import com.bcs.atp.server.service.UserService;
import com.bcs.atp.server.service.VerificationTokenService;
import com.bcs.atp.server.service.auth.IAuthService;
import com.bcs.atp.server.util.EmailUtils;
import com.bcs.atp.server.util.JwtTokenUtil;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.bcs.atp.server.model.dto.DeviceIdentifierToken;
import com.bcs.atp.server.model.dto.JwtTokenDto;
import com.bcs.atp.server.model.dto.VerifyMagicDto;
import com.soulcraft.network.resp.error.DbResponseEnum;
import com.soulcraft.utils.email.exception.MailSendException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

/**
 * 授权管理服务
 *
 * @author scott
 * @since 2024/03/28
 */
@Slf4j
@Service
public class AuthService implements IAuthService {
  @Autowired
  private JwtTokenUtil jwtTokenUtil;
  @Autowired
  private UserService userService;
  @Autowired
  private AccountService accountService;
  @Autowired
  private EmailUtils emailUtils;
  @Value("${infra.auth.defaultPassword}")
  private String defaultPassword;
  @Autowired
  private PasswordEncoder passwordEncoder;
  @Autowired
  private VerificationTokenService verificationTokenService;
  @Value("${infra.auth.tokenSaltComplexity}")
  private int tokenSaltComplexity;
  @Value("${infra.auth.tokenLength}")
  private int tokenLength;
  @Value("${infra.auth.loginLinkTokenValidity}")
  private int loginLinkTokenValidity;

  @Override
  @Transactional
  public DeviceIdentifierToken signInMagicLink(String email, String origin) {
    // validateEmail
    boolean emailValidated = emailUtils.validateEmail(email);
    ResponseEnum.EMAIL_NOT_VALID.assertTrue(emailValidated, email);

    // create user
    UserModel user = userService.createUserViaMagicLink(email, origin);

    // generateMagicLinkTokens(user)
    String deviceIdentifier = BCrypt.gensalt(tokenSaltComplexity);
    String token = RandomUtil.randomString(tokenLength);
    Date expiresOn = DateTime.now().offset(DateField.HOUR, loginLinkTokenValidity);
    VerificationTokenModel verificationToken = VerificationTokenModel.builder()
      .deviceIdentifier(deviceIdentifier)
      .token(token)
      .userId(user.getId())
      .expiresOn(expiresOn)
      .build();
    boolean tokenCreated = verificationTokenService.create(verificationToken);
    DbResponseEnum.RECORD_CREATE_FAILED.assertTrue(tokenCreated);

    // 发送登录/注册邮件
    try {
      emailUtils.sendUserInvitationEmail(email, token, origin);
    } catch (MailSendException e) {
      ResponseEnum.EMAIL_SEND_FAILED.throwNewException(email);
    }

    return DeviceIdentifierToken.builder().deviceIdentifier(deviceIdentifier).build();
  }

  @Override
  @Transactional
  public JwtTokenDto verifyToken(VerifyMagicDto dto) {
    String deviceIdentifier = dto.getDeviceIdentifier();
    String token = dto.getToken();
    // 校验token是否存在
    QueryWrapper<VerificationTokenModel> queryWrapper = new QueryWrapper<>();
    queryWrapper.lambda()
      .eq(VerificationTokenModel::getDeviceIdentifier, deviceIdentifier)
      .eq(VerificationTokenModel::getToken, token);
    VerificationTokenModel verificationToken = verificationTokenService.getOne(queryWrapper);
    ResponseEnum.INVALID_LOGIN_LINK.assertNotNull(verificationToken);

    // 校验用户是否存在
    String userId = verificationToken.getUserId();
    UserModel user = userService.getById(userId);
    ResponseEnum.USER_NOT_FOUND.assertNotNull(user, userId);

    // 校验token是否过期
    Date expiresOn = verificationToken.getExpiresOn();
    boolean expired = DateTime.now().isAfter(expiresOn);
    ResponseEnum.LOGIN_LINK_EXPIRED.assertFalse(expired);

    // 生成令牌
    String email = user.getEmail();
    String accessToken = jwtTokenUtil.generateAccessToken(email);
    String refreshToken = jwtTokenUtil.generateRefreshToken(email);
    JwtTokenDto jwtTokenDto = JwtTokenDto.builder()
      .accessToken(accessToken)
      .refreshToken(refreshToken)
      .build();
    // 删除原来的token记录
    boolean deleted = verificationTokenService.delete(verificationToken.getId());
    DbResponseEnum.RECORD_DELETE_FAILED.assertTrue(deleted);

    return jwtTokenDto;
  }
}
