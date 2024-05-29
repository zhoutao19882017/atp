package com.bcs.atp.server.gql.dgsDataFetchers;

import com.bcs.atp.server.gql.DgsConstants;
import com.bcs.atp.server.gql.types.UserRequest;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import graphql.schema.DataFetchingEnvironment;

@DgsComponent
public class UserRequestDatafetcher {
  @DgsQuery(field = DgsConstants.QUERY.UserRequest)
  public UserRequest getUserRequest(DataFetchingEnvironment dataFetchingEnvironment) {
    return null;
  }
}
