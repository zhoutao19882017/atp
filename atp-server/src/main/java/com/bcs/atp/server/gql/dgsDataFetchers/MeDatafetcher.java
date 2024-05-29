package com.bcs.atp.server.gql.dgsDataFetchers;

import com.bcs.atp.server.gql.DgsConstants;
import com.bcs.atp.server.gql.types.User;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.bcs.atp.server.model.user.UserDetails;
import com.bcs.atp.server.service.UserService;
import graphql.schema.DataFetchingEnvironment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

@Slf4j
@DgsComponent
public class MeDatafetcher {
  @Autowired
  private UserService userService;

  @DgsQuery(field = DgsConstants.QUERY.Me)
  public User getMe(DataFetchingEnvironment env) {
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    if (authentication == null) {
      return null;
    }
    Object principal = authentication.getPrincipal();
    if (!(principal instanceof UserDetails)) {
      return null;
    }
    UserDetails userDetails = (UserDetails) principal;
    return userService.convertDbModelToGraphqlModel(userDetails.getUser());
  }
}
