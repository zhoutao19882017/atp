package com.bcs.atp.server.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 全局跨域配置
 *
 * @author Scott
 * @since 2024/03/21
 */
@Configuration
@EnableWebMvc
public class CorsConfig implements WebMvcConfigurer {

  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping("/**")
      .allowedOriginPatterns("*")
      .allowedMethods("GET", "HEAD", "POST", "PUT", "DELETE", "OPTIONS")
      .allowCredentials(true)
      .maxAge(3600);
  }
}
