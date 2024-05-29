package com.bcs.atp.server.config.security;

import cn.hutool.json.JSONUtil;
import com.bcs.atp.server.error.ResponseEnum;
import com.soulcraft.network.resp.R;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 自定义返回结果：没有权限访问时
 *
 * @author scott
 * @since 2024/03/28
 */
@Component
public class RestfulAccessDeniedHandler implements AccessDeniedHandler {
  @Override
  public void handle(HttpServletRequest request,
                     HttpServletResponse response,
                     AccessDeniedException e) throws IOException, ServletException {
    response.setHeader("Access-Control-Allow-Origin", "*");
    response.setHeader("Access-Control-Allow-Credentials", "true");
    response.setHeader("Cache-Control", "no-cache");
    response.setCharacterEncoding("UTF-8");
    response.setContentType("application/json");
    R<Object> failed = R.failed(ResponseEnum.ACCESS_DENIED, e.getMessage());
    response.getWriter().println(JSONUtil.parse(failed));
    response.getWriter().flush();
  }
}
