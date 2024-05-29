package com.bcs.atp.server.service.security.impl;

import com.bcs.atp.server.service.security.DynamicSecurityService;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.Map;

/**
 * 动态权限相关业务类
 *
 * @author Scott
 * @since 2021年10月26日
 */
@Component(value = "dynamicSecurityService")
public class DynamicSecurityServiceImpl implements DynamicSecurityService {

  @Override
  public Map<String, ConfigAttribute> loadDataSource() {
    return Collections.emptyMap();
  }
}
