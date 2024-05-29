package com.bcs.atp.server.gql.dgsDataFetchers;

import com.bcs.atp.server.gql.DgsConstants;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import graphql.schema.DataFetchingEnvironment;

import java.util.List;

@DgsComponent
public class AllowedAuthProvidersDatafetcher {
  @DgsQuery(field = DgsConstants.QUERY.AllowedAuthProviders)
  public List<String> getAllowedAuthProviders(DataFetchingEnvironment dataFetchingEnvironment) {
    return null;
  }
}
