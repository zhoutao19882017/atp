package com.bcs.atp.server.gql.dgsDataFetchers;

import com.bcs.atp.server.gql.DgsConstants;
import com.bcs.atp.server.gql.types.TeamCollection;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import graphql.schema.DataFetchingEnvironment;

@DgsComponent
public class CollectionDatafetcher {
  @DgsQuery(field = DgsConstants.QUERY.Collection)
  public TeamCollection getCollection(DataFetchingEnvironment dataFetchingEnvironment) {
    return null;
  }
}
