package com.bcs.atp.server.gql.dgsDataFetchers;

import com.bcs.atp.server.gql.DgsConstants;
import com.bcs.atp.server.gql.types.UserCollection;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import graphql.schema.DataFetchingEnvironment;

import java.util.List;

@DgsComponent
public class RootGQLUserCollectionsDatafetcher {
  @DgsQuery(field = DgsConstants.QUERY.RootGQLUserCollections)
  public List<UserCollection> getRootGQLUserCollections(
    DataFetchingEnvironment dataFetchingEnvironment) {
    return null;
  }
}
