package com.bcs.atp.server.service.security;

import org.springframework.security.access.ConfigAttribute;

import java.util.Map;

/**
 * 动态权限相关业务类
 *
 * @author scott
 * @since 2024/03/29
 */
public interface DynamicSecurityService {
  /**
   * 加载资源ANT通配符和资源对应MAP
   */
  Map<String, ConfigAttribute> loadDataSource();
}
