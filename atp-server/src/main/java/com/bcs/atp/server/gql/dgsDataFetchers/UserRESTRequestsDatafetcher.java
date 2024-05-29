package com.bcs.atp.server.gql.dgsDataFetchers;

import com.bcs.atp.server.gql.DgsConstants;
import com.bcs.atp.server.gql.types.UserRequest;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import graphql.schema.DataFetchingEnvironment;

import java.util.List;

@DgsComponent
public class UserRESTRequestsDatafetcher {
  @DgsQuery(field = DgsConstants.QUERY.UserRESTRequests)
  public List<UserRequest> getUserRESTRequests(DataFetchingEnvironment dataFetchingEnvironment) {
    return null;
  }
}
