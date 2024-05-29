package com.bcs.atp.server.gql.dgsDataFetchers;

import com.bcs.atp.server.gql.DgsConstants;
import com.bcs.atp.server.gql.types.Admin;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import graphql.schema.DataFetchingEnvironment;

@DgsComponent
public class AdminDatafetcher {
  @DgsQuery(field = DgsConstants.QUERY.Admin)
  public Admin getAdmin(DataFetchingEnvironment dataFetchingEnvironment) {
    return null;
  }
}
