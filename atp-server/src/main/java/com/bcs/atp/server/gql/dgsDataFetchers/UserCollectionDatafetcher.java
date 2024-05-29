package com.bcs.atp.server.gql.dgsDataFetchers;

import com.bcs.atp.server.gql.DgsConstants;
import com.bcs.atp.server.gql.types.UserCollection;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import graphql.schema.DataFetchingEnvironment;

@DgsComponent
public class UserCollectionDatafetcher {
  @DgsQuery(field = DgsConstants.QUERY.UserCollection)
  public UserCollection getUserCollection(DataFetchingEnvironment dataFetchingEnvironment) {
    return null;
  }
}
