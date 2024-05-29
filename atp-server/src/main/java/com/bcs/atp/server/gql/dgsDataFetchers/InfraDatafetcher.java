package com.bcs.atp.server.gql.dgsDataFetchers;

import com.bcs.atp.server.gql.DgsConstants;
import com.bcs.atp.server.gql.types.Infra;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import graphql.schema.DataFetchingEnvironment;

@DgsComponent
public class InfraDatafetcher {
  @DgsQuery(field = DgsConstants.QUERY.Infra)
  public Infra getInfra(DataFetchingEnvironment dataFetchingEnvironment) {
    return null;
  }
}
