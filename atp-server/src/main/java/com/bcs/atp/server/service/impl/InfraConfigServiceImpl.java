package com.bcs.atp.server.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bcs.atp.server.gql.types.InfraConfig;
import com.bcs.atp.server.gql.types.InfraConfigEnum;
import com.bcs.atp.server.gql.types.ServiceStatus;
import com.bcs.atp.server.mapper.InfraConfigMapper;
import com.bcs.atp.server.model.InfraConfigModel;
import com.bcs.atp.server.model.qo.InfraConfigPageQo;
import com.bcs.atp.server.service.InfraConfigService;
import com.bcs.atp.server.util.CommonUtils;
import com.soulcraft.mybatis.common.enums.EYesOrNo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * <p>
 * 基础配置表 服务实现类
 * </p>
 *
 * @author Scott Lau
 * @since 2024-03-21
 */
@Service
@Slf4j
public class InfraConfigServiceImpl extends ServiceImpl<InfraConfigMapper, InfraConfigModel> implements InfraConfigService {
  // 发送邮件的服务器的IP和端口
  @Value("${email.smtp.host}")
  private String smtpHost;
  @Value("${email.sender.email}")
  private String senderEmail;
  @Value("${email.sender.password}")
  private String senderPassword;
  @Value("${infra.auth.allowedAuthProviders}")
  private String allowedAuthProviders;
  @Override
  public boolean create(InfraConfigModel infraConfig) {
    return save(infraConfig);
  }

  @Override
  public boolean update(InfraConfigModel infraConfig) {
    return updateById(infraConfig);
  }

  @Override
  public boolean delete(String id) {
    return removeById(id);
  }

  @Override
  public IPage<InfraConfigModel> list(InfraConfigPageQo pageQo) {
    IPage<InfraConfigModel> page = new Page<>(pageQo.getPageNum(), pageQo.getPageSize());
    QueryWrapper<InfraConfigModel> wrapper = new QueryWrapper<>();
    return page(page, wrapper);
  }

  @Override
  public List<InfraConfigModel> listAll() {
    QueryWrapper<InfraConfigModel> wrapper = new QueryWrapper<>();
    LambdaQueryWrapper<InfraConfigModel> lambda = wrapper.lambda();
    return list(wrapper);
  }

  @Override
  public InfraConfigModel queryByName(String name) {
    QueryWrapper<InfraConfigModel> wrapper = new QueryWrapper<>();
    wrapper.lambda().eq(InfraConfigModel::getName, name);
    return super.getOne(wrapper);
  }

  @Override
  public boolean toggleAnalyticsCollection(ServiceStatus status) {
    LambdaUpdateWrapper<InfraConfigModel> updateWrapper = new LambdaUpdateWrapper<>();
    updateWrapper.eq(InfraConfigModel::getName, InfraConfigEnum.ALLOW_ANALYTICS_COLLECTION.name());
    updateWrapper.set(InfraConfigModel::getValue, status == ServiceStatus.ENABLE ? "true" : "false");
    return update(updateWrapper);
  }

  @Override
  public boolean setSetupAsComplete() {
    LambdaUpdateWrapper<InfraConfigModel> updateWrapper = new LambdaUpdateWrapper<>();
    updateWrapper.eq(InfraConfigModel::getName, InfraConfigEnum.IS_FIRST_TIME_INFRA_SETUP.name());
    updateWrapper.set(InfraConfigModel::getValue, "false");
    return update(updateWrapper);
  }

  @Override
  public InfraConfig convertDbModelToGraphqlModel(InfraConfigModel infraConfigModel) {
    InfraConfig infraConfig = new InfraConfig();
    BeanUtil.copyProperties(infraConfigModel, infraConfig);
    return infraConfig;
  }

  @Override
  public List<InfraConfig> findInfraConfigByNames(InfraConfigEnum[] configNames) {
    LambdaQueryWrapper<InfraConfigModel> lambdaQueryWrapper = new LambdaQueryWrapper<>();
    List<InfraConfigEnum> excludedConfigs = Arrays.asList(InfraConfigEnum.EXCLUDE_FROM_FETCH_CONFIGS);
    List<InfraConfigEnum> invalidConfigs = Arrays.stream(configNames).filter(excludedConfigs::contains).collect(Collectors.toList());
    if (!invalidConfigs.isEmpty()) {
      throw new IllegalArgumentException("infra_config/operation_not_allowed");
    }
    Arrays.stream(configNames).map(infraConfigEnum -> lambdaQueryWrapper.eq(InfraConfigModel::getName, infraConfigEnum));
    return list(lambdaQueryWrapper).stream().map(InfraConfigModel -> convertDbModelToGraphqlModel(InfraConfigModel)).collect(Collectors.toList());
  }

  /**
   * 数据库infra_config表初始化，在服务启动后执行
   */
  @PostConstruct
  public void dbInit() {
    // 在这里可以安全地使用 dataSource，因为它已经被初始化
    log.info("Executing database operations,Initialization infra_config");
    // 这里可以执行数据库操作
    List<InfraConfigModel> infraConfigList = listAll();
    Set<String> existingConfigs = infraConfigList.stream().map(InfraConfigModel::getName).collect(Collectors.toSet());
    // 检查并初始化配置
    initializeConfig(existingConfigs, InfraConfigEnum.MAILER_SMTP_URL, "smtp://" + senderEmail.split("@")[0] + ":" + senderPassword + "@" + smtpHost);
    initializeConfig(existingConfigs, InfraConfigEnum.MAILER_ADDRESS_FROM, senderEmail);
    initializeConfig(existingConfigs, InfraConfigEnum.VITE_ALLOWED_AUTH_PROVIDERS, allowedAuthProviders);
    initializeConfig(existingConfigs, InfraConfigEnum.ALLOW_ANALYTICS_COLLECTION, "false");
    initializeConfig(existingConfigs, InfraConfigEnum.ANALYTICS_USER_ID, CommonUtils.generateAnalyticsUserId());
    initializeConfig(existingConfigs, InfraConfigEnum.IS_FIRST_TIME_INFRA_SETUP, infraConfigList.size() == 0 ? "true" : "false");
  }

  private void initializeConfig(Set<String> existingConfigs, InfraConfigEnum configEnum, String value) {
    if (!existingConfigs.contains(configEnum.name())) {
      InfraConfigModel newConfig = new InfraConfigModel(configEnum.name(), value, EYesOrNo.YES);
      create(newConfig);
    }
  }
}
