package com.bcs.atp.server.gql.dgsDataFetchers;

import com.bcs.atp.server.gql.DgsConstants;
import com.bcs.atp.server.gql.types.UserCollection;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import graphql.schema.DataFetchingEnvironment;

import java.util.List;

@DgsComponent
public class RootRESTUserCollectionsDatafetcher {
  @DgsQuery(field = DgsConstants.QUERY.RootRESTUserCollections)
  public List<UserCollection> getRootRESTUserCollections(
    DataFetchingEnvironment dataFetchingEnvironment) {
    return null;
  }
}
