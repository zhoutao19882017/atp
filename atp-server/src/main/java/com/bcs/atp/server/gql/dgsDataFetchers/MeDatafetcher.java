package com.bcs.atp.server.gql.dgsDataFetchers;

import com.bcs.atp.server.gql.DgsConstants;
import com.bcs.atp.server.gql.types.User;
import com.bcs.atp.server.service.UserService;
import com.bcs.atp.server.util.AuthUserUtil;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsDataFetchingEnvironment;
import com.netflix.graphql.dgs.DgsQuery;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
@DgsComponent
public class MeDatafetcher {
  @Autowired
  private UserService userService;
  @Autowired
  private AuthUserUtil authUserUtil;

  @DgsQuery(field = DgsConstants.QUERY.Me)
  public User getMe(DgsDataFetchingEnvironment dfe)  {
    // 通过DgsDataFetchingEnvironment入参获取用户信息
    return userService.convertDbModelToGraphqlModel(authUserUtil.getAuthUser(dfe));
  }
}
