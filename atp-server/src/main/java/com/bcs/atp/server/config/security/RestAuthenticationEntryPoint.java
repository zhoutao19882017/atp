package com.bcs.atp.server.config.security;

import cn.hutool.json.JSONUtil;
import com.soulcraft.network.resp.R;
import com.soulcraft.network.resp.error.HttpStatusEnum;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 自定义返回结果：未登录或登录过期
 *
 * @author scott
 * @since 2024/03/28
 */
@Component
public class RestAuthenticationEntryPoint implements AuthenticationEntryPoint {
  @Override
  public void commence(HttpServletRequest request, HttpServletResponse response, AuthenticationException authException) throws IOException, ServletException {
    response.setHeader("Access-Control-Allow-Origin", "*");
    response.setHeader("Access-Control-Allow-Credentials", "true");
    response.setHeader("Cache-Control", "no-cache");
    response.setCharacterEncoding("UTF-8");
    response.setContentType("application/json");
    response.getWriter().println(JSONUtil.parse(R.failed(HttpStatusEnum.UNAUTHORIZED)));
    response.getWriter().flush();
  }
}
