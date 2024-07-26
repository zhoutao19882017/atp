package com.bcs.atp.server.gql.dgsDataFetchers;

import com.bcs.atp.server.gql.DgsConstants;
import com.bcs.atp.server.gql.types.Infra;
import com.bcs.atp.server.service.*;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsDataFetchingEnvironment;
import com.netflix.graphql.dgs.DgsQuery;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.stream.Collectors;

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
  @Autowired
  private InvitedUsersService invitedUsersService;

  @DgsQuery(field = DgsConstants.QUERY.Infra)
  public Infra getInfra(DgsDataFetchingEnvironment dfe) {
//    UserModel userModel = authUserUtil.getAuthUser(dfe);
    Infra infra = new Infra();
    infra.setUsersCount(userService.count());
    infra.setTeamsCount(teamService.count());
    infra.setTeamCollectionsCount(teamCollectionService.count());
    infra.setTeamRequestsCount(teamRequestService.count());
    infra.setAllUsersV2(userService.listAll().stream().map(userModel -> userService.convertDbModelToGraphqlModel(userModel)).collect(Collectors.toList()));
    infra.setInvitedUsers(invitedUsersService.listAll().stream().map(invitedUsersModel -> invitedUsersService.convertDbModelToGraphqlModel(invitedUsersModel)).collect(Collectors.toList()));
    infra.setAllTeams(teamService.listAll().stream().map(teamModel -> teamService.convertDbModelToGraphqlModel(teamModel)).collect(Collectors.toList()));
    return infra;
  }
}
