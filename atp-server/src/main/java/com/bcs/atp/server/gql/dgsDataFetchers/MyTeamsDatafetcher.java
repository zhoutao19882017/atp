package com.bcs.atp.server.gql.dgsDataFetchers;

import com.bcs.atp.server.gql.DgsConstants;
import com.bcs.atp.server.gql.types.Team;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import graphql.schema.DataFetchingEnvironment;

import java.util.Collections;
import java.util.List;

@DgsComponent
public class MyTeamsDatafetcher {
  @DgsQuery(field = DgsConstants.QUERY.MyTeams)
  public List<Team> getMyTeams(DataFetchingEnvironment dataFetchingEnvironment) {
    return Collections.emptyList();
  }
}
