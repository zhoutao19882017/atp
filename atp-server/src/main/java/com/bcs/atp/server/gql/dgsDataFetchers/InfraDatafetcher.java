package com.bcs.atp.server.gql.dgsDataFetchers;

import com.bcs.atp.server.gql.DgsConstants;
import com.bcs.atp.server.gql.types.Infra;
import com.bcs.atp.server.service.TeamCollectionService;
import com.bcs.atp.server.service.TeamRequestService;
import com.bcs.atp.server.service.TeamService;
import com.bcs.atp.server.service.UserService;
import com.bcs.atp.server.util.AuthUserUtil;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsDataFetchingEnvironment;
import com.netflix.graphql.dgs.DgsQuery;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
@DgsComponent
public class InfraDatafetcher {
//  @Autowired
//  private AuthUserUtil authUserUtil;
  @Autowired
  private UserService userService;
  @Autowired
  private TeamService teamService;
  @Autowired
  private TeamCollectionService teamCollectionService;
  @Autowired
  private TeamRequestService teamRequestService;

  @DgsQuery(field = DgsConstants.QUERY.Infra)
  public Infra getInfra(DgsDataFetchingEnvironment dfe) {
//    UserModel userModel = authUserUtil.getAuthUser(dfe);
    Infra infra = new Infra();
    infra.setUsersCount(userService.count());
    infra.setTeamsCount(teamService.count());
    infra.setTeamCollectionsCount(teamCollectionService.count());
    infra.setTeamRequestsCount(teamRequestService.count());
    return infra;
  }
}
