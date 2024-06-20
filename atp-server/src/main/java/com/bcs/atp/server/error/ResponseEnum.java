package com.bcs.atp.server.error;

import com.soulcraft.network.exception.BusinessExceptionAssert;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ResponseEnum implements BusinessExceptionAssert {
  ACCESS_DENIED(900, "Access denied: {0}."),
  INVALID_LOGIN_LINK(901, "Invalid magic link."),
  USER_NOT_FOUND(902, "User {0} not found."),
  LOGIN_LINK_EXPIRED(903, "Magic link expired."),
  AUTH_PROVIDER_NOT_SUPPORTED(904, "Auth provider not supported."),
  EMAIL_NOT_VALID(905, "Email {0} not valid."),
  EMAIL_SEND_FAILED(906, "Failed to send email to {0}."),
  ORIGIN_NOT_VALID(907, "Origin {0} not valid."),
  INFRA_CONFIG_NOT_FOUND(404, "infra_config/not_found")
  ;

  /**
   * 返回码
   */
  private final int code;
  /**
   * 返回消息
   */
  private final String message;

  @Override
  public String getAppName() {
    return "HPS";
  }

  @Override
  public String getModuleName() {
    return "COM";
  }
}
