package com.bcs.atp.server.gql.dgsDataFetchers;

import com.bcs.atp.server.gql.DgsConstants;
import com.bcs.atp.server.gql.types.InfraConfig;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import graphql.schema.DataFetchingEnvironment;

import java.util.List;

@DgsComponent
public class InfraConfigsDatafetcher {
  @DgsQuery(field = DgsConstants.QUERY.InfraConfigs)
  public List<InfraConfig> getInfraConfigs(DataFetchingEnvironment dataFetchingEnvironment) {
    return null;
  }
}
