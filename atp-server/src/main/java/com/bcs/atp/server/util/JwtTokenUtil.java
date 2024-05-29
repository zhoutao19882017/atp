package com.bcs.atp.server.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * <pre>
 * JwtToken生成的工具类
 * JWT token的格式：header.payload.signature
 * header的格式（算法、token的类型）：
 * {"alg": "HS512","typ": "JWT"}
 * payload的格式（用户名、创建时间、生成时间）：
 * {"sub":"wang","created":1489079981393,"exp":1489684781}
 * signature的生成算法：
 * HMACSHA512(base64UrlEncode(header) + "." +base64UrlEncode(payload),secret)
 * </pre>
 *
 * @author scott
 * @since 2024/03/19
 */
@Slf4j
@Component
public class JwtTokenUtil {
  @Value("${jwt.secret}")
  private String secret;
  @Value("${jwt.access_token_expiration}")
  private Long accessTokenExpiration;
  @Value("${jwt.refresh_token_expiration}")
  private Long refreshTokenExpiration;

  /**
   * 从token中获取JWT中的负载
   */
  private Claims getClaimsFromToken(String token) {
    Claims claims = null;
    try {
      claims = Jwts.parser()
        .setSigningKey(secret)
        .parseClaimsJws(token)
        .getBody();
    } catch (Exception e) {
      log.info("JWT格式验证失败:{}", token);
    }
    return claims;
  }

  /**
   * 从token中获取登录用户名
   */
  public String getUserNameFromToken(String token) {
    String username;
    try {
      Claims claims = getClaimsFromToken(token);
      username = claims.getSubject();
    } catch (Exception e) {
      username = null;
    }
    return username;
  }

  /**
   * 验证token是否还有效
   *
   * @param token    客户端传入的token
   * @param username 从数据库中查询出来的用户信息
   */
  public boolean validateToken(String token, String username) {
    String userNameFromToken = getUserNameFromToken(token);
    return userNameFromToken.equals(username) && !isTokenExpired(token);
  }

  /**
   * 判断token是否已经失效
   */
  private boolean isTokenExpired(String token) {
    Date expiredDate = getExpiredDateFromToken(token);
    return expiredDate.before(new Date());
  }

  /**
   * 从token中获取过期时间
   */
  private Date getExpiredDateFromToken(String token) {
    Claims claims = getClaimsFromToken(token);
    return claims.getExpiration();
  }

  /**
   * 根据用户信息生成访问token
   */
  public String generateAccessToken(String username) {
    Instant now = Instant.now();
    Instant expiry = now.plus(accessTokenExpiration, ChronoUnit.SECONDS);
    return Jwts.builder()
      .setSubject(username)
      .setIssuedAt(Date.from(now))
      .setExpiration(Date.from(expiry))
      .signWith(SignatureAlgorithm.HS512, secret)
      .compact();
  }

  /**
   * 根据用户信息生成刷新token
   */
  public String generateRefreshToken(String username) {
    Instant now = Instant.now();
    Instant expiry = now.plus(refreshTokenExpiration, ChronoUnit.SECONDS);
    return Jwts.builder()
      .setSubject(username)
      .setIssuedAt(Date.from(now))
      .setExpiration(Date.from(expiry))
      .signWith(SignatureAlgorithm.HS512, secret)
      .compact();
  }
}
