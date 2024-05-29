package com.bcs.atp.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

/**
 * 程序主类
 *
 * @author zhoutao
 * @since 2024/05/29
 */
@SpringBootApplication(scanBasePackages = {
  "com.soulcraft.network",
  "com.bcs.atp.server",
})
@ConfigurationPropertiesScan(basePackages = {
  "com.bcs.atp.server",
})
public class AtpServerApplication {

  private static final String TIME_ZONE = "Asia/Shanghai";

  public static void main(String[] args) {
    TimeZone.setDefault(TimeZone.getTimeZone(TIME_ZONE));
    SpringApplication.run(AtpServerApplication.class, args);
  }

  @Bean
  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }

  @PostConstruct
  void setDefaultTimezone() {
    TimeZone.setDefault(TimeZone.getTimeZone(TIME_ZONE));
  }
}
