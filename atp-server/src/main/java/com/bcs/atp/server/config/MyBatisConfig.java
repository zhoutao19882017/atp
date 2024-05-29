package com.bcs.atp.server.config;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.InnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import com.soulcraft.mybatis.common.handler.MybatisMetaObjectHandler;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.util.List;

/**
 * MyBatis配置类
 *
 * @author scott
 * @since 2024/03/21
 */
@Configuration
@EnableTransactionManagement
@MapperScan({
  "com.bcs.atp.server.mapper"
})
public class MyBatisConfig {

  /**
   * 插件管理
   *
   * @param innerInterceptors 插件集合
   * @return 插件管理主体
   */
  @Bean
  public MybatisPlusInterceptor mybatisPlusInterceptor(List<InnerInterceptor> innerInterceptors) {
    MybatisPlusInterceptor mybatisPlusInterceptor = new MybatisPlusInterceptor();
    mybatisPlusInterceptor.setInterceptors(innerInterceptors);
    return mybatisPlusInterceptor;
  }

  /**
   * 分页插件
   *
   * @return 分页插件
   */
  @Bean
  @ConditionalOnMissingBean(PaginationInnerInterceptor.class)
  public PaginationInnerInterceptor paginationInnerInterceptor() {
    return new PaginationInnerInterceptor();
  }

  @Bean
  public MetaObjectHandler metaObjectHandler() {
    // Mybatis Plus创建和更新时间的自动插入、更新
    return new MybatisMetaObjectHandler();
  }

}
