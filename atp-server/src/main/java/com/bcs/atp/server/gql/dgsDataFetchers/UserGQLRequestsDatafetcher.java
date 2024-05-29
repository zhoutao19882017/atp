package com.bcs.atp.server.gql.dgsDataFetchers;

import com.bcs.atp.server.gql.DgsConstants;
import com.bcs.atp.server.gql.types.UserRequest;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import graphql.schema.DataFetchingEnvironment;

import java.util.List;

@DgsComponent
public class UserGQLRequestsDatafetcher {
  @DgsQuery(field = DgsConstants.QUERY.UserGQLRequests)
  public List<UserRequest> getUserGQLRequests(DataFetchingEnvironment dataFetchingEnvironment) {
    return null;
  }
}
