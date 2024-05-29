package com.bcs.atp.server.config.swagger;

import com.bcs.atp.server.config.swagger.base.BaseSwaggerConfig;
import com.bcs.atp.server.config.swagger.base.domain.SwaggerProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger API文档相关配置
 *
 * @author scott
 * @since 2024/03/21
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig extends BaseSwaggerConfig {

  @Override
  public SwaggerProperties swaggerProperties() {
    return SwaggerProperties.builder()
      .apiBasePackage("com.soulcraft")
      .title("Swagger 接口文档")
      .description("Swagger 接口文档")
      .contactName("Scott Lau")
      .version("1.0.0-SNAPSHOT")
      .enableSecurity(true)
      .build();
  }
}
