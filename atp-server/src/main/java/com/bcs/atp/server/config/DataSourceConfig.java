package com.bcs.atp.server.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DataSourceConfig {

	@Primary
	@Bean
	@ConfigurationProperties("spring.datasource.main")
	public DruidDataSource mainDataSource() {
		return DruidDataSourceBuilder.create().build();
	}

}
