package com.bcs.atp.server.config.security;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * 用于配置白名单资源路径
 *
 * @author scott
 * @since 2024/03/28
 */
@Getter
@Setter
@ConfigurationProperties(prefix = "secure.ignored")
@Component
public class IgnoreUrlsConfig {

  private List<String> urls = new ArrayList<>();

}
