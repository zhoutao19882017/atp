package com.bcs.atp.server.gql.dgsDataFetchers;

import com.bcs.atp.server.gql.DgsConstants;
import com.bcs.atp.server.gql.types.TeamRequest;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import graphql.schema.DataFetchingEnvironment;

@DgsComponent
public class RequestDatafetcher {
  @DgsQuery(field = DgsConstants.QUERY.Request)
  public TeamRequest getRequest(DataFetchingEnvironment dataFetchingEnvironment) {
    return null;
  }
}
