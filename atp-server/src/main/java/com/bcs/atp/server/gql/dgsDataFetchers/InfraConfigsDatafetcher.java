package com.bcs.atp.server.gql.dgsDataFetchers;

import com.bcs.atp.server.gql.DgsConstants;
import com.bcs.atp.server.gql.types.InfraConfig;
import com.bcs.atp.server.gql.types.InfraConfigEnum;
import com.bcs.atp.server.service.InfraConfigService;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsDataFetchingEnvironment;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Slf4j
@DgsComponent
public class InfraConfigsDatafetcher {
  @Autowired
  private InfraConfigService infraConfigService;

  @DgsQuery(field = DgsConstants.QUERY.InfraConfigs)
  public List<InfraConfig> getInfraConfigs(DgsDataFetchingEnvironment dfe, @InputArgument("configNames") InfraConfigEnum[] configNames) {
    return infraConfigService.findInfraConfigByNames(configNames);
  }
}
