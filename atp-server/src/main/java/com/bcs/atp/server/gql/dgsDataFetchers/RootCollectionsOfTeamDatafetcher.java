package com.bcs.atp.server.gql.dgsDataFetchers;

import com.bcs.atp.server.gql.DgsConstants;
import com.bcs.atp.server.gql.types.TeamCollection;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import graphql.schema.DataFetchingEnvironment;

import java.util.List;

@DgsComponent
public class RootCollectionsOfTeamDatafetcher {
  @DgsQuery(field = DgsConstants.QUERY.RootCollectionsOfTeam)
  public List<TeamCollection> getRootCollectionsOfTeam(
    DataFetchingEnvironment dataFetchingEnvironment) {
    return null;
  }
}
