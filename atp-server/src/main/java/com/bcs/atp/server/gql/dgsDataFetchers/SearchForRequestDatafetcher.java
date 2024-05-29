package com.bcs.atp.server.gql.dgsDataFetchers;

import com.bcs.atp.server.gql.DgsConstants;
import com.bcs.atp.server.gql.types.TeamRequest;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import graphql.schema.DataFetchingEnvironment;

import java.util.List;

@DgsComponent
public class SearchForRequestDatafetcher {
  @DgsQuery(field = DgsConstants.QUERY.SearchForRequest)
  public List<TeamRequest> getSearchForRequest(DataFetchingEnvironment dataFetchingEnvironment) {
    return null;
  }
}
