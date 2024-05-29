package com.bcs.atp.server.gql.dgsDataFetchers;

import com.bcs.atp.server.gql.DgsConstants;
import com.bcs.atp.server.gql.types.Team;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import graphql.schema.DataFetchingEnvironment;

@DgsComponent
public class TeamDatafetcher {
  @DgsQuery(field = DgsConstants.QUERY.Team)
  public Team getTeam(DataFetchingEnvironment dataFetchingEnvironment) {
    return Team.newBuilder().id("test").name("test").build();
  }
}
