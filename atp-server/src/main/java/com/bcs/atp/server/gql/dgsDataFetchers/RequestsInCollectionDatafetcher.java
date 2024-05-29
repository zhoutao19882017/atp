package com.bcs.atp.server.gql.dgsDataFetchers;

import com.bcs.atp.server.gql.DgsConstants;
import com.bcs.atp.server.gql.types.TeamRequest;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import graphql.schema.DataFetchingEnvironment;

import java.util.List;

@DgsComponent
public class RequestsInCollectionDatafetcher {
  @DgsQuery(field = DgsConstants.QUERY.RequestsInCollection)
  public List<TeamRequest> getRequestsInCollection(
    DataFetchingEnvironment dataFetchingEnvironment) {
    return null;
  }
}
