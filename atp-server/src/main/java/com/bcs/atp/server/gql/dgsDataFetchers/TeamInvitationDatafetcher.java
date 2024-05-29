package com.bcs.atp.server.gql.dgsDataFetchers;

import com.bcs.atp.server.gql.DgsConstants;
import com.bcs.atp.server.gql.types.TeamInvitation;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import graphql.schema.DataFetchingEnvironment;

@DgsComponent
public class TeamInvitationDatafetcher {
  @DgsQuery(field = DgsConstants.QUERY.TeamInvitation)
  public TeamInvitation getTeamInvitation(DataFetchingEnvironment dataFetchingEnvironment) {
    return null;
  }
}
