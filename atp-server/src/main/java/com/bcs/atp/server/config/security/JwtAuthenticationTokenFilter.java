package com.bcs.atp.server.config.security;

import com.bcs.atp.server.service.UserService;
import com.bcs.atp.server.util.JwtTokenUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * JWT登录授权过滤器
 *
 * @author scott
 * @since 2024/03/28
 */
@Slf4j
@Component
public class JwtAuthenticationTokenFilter extends OncePerRequestFilter {
  @Autowired
  private JwtTokenUtil jwtTokenUtil;
  @Value("${jwt.tokenHeader}")
  private String tokenHeader;
  @Value("${jwt.tokenHead}")
  private String tokenHead;
  @Autowired
  private UserService userService;

  @Bean
  public UserDetailsService userDetailsService() {
    // 获取登录用户信息
    return username -> userService.loadUserByUsername(username);
  }

  @Override
  protected void doFilterInternal(HttpServletRequest request,
                                  HttpServletResponse response,
                                  FilterChain chain) throws ServletException, IOException {
    String authHeader = request.getHeader(this.tokenHeader);
    if (authHeader != null && authHeader.startsWith(this.tokenHead)) {
      String authToken = authHeader.substring(this.tokenHead.length());// The part after "Bearer "
      String username = jwtTokenUtil.getUserNameFromToken(authToken);
      log.debug("checking username:{}", username);
      if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
        try {
          if (jwtTokenUtil.validateToken(authToken, username)) {
            UserDetails userDetails = this.userService.loadUserByUsername(username);
            UsernamePasswordAuthenticationToken authentication =
              new UsernamePasswordAuthenticationToken(userDetails, null, userDetails.getAuthorities());
            authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
            log.debug("authenticated user:{}", username);
            SecurityContextHolder.getContext().setAuthentication(authentication);
          }
        } catch (Exception e) {
          log.error("failed to find user {}, cause: {}", username, e.getMessage());
        }
      }
    }
    chain.doFilter(request, response);
  }
}
