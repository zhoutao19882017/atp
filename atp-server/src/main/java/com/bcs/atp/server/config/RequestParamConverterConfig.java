package com.bcs.atp.server.config;

import com.soulcraft.mybatis.common.converter.factory.RequestParamToEnumConverterFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 请求参数转换为枚举类型的配置
 *
 * @author Scott
 * @since 2024/03/21
 */
@Configuration
public class RequestParamConverterConfig implements WebMvcConfigurer {

  @Override
  public void addFormatters(FormatterRegistry registry) {
    registry.addConverterFactory(requestParamToEnumConverterFactory());
  }

  @Bean
  public RequestParamToEnumConverterFactory requestParamToEnumConverterFactory() {
    return new RequestParamToEnumConverterFactory();
  }
}
