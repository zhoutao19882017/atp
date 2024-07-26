package com.bcs.atp.server.gql.dgsDataFetchers;

import com.bcs.atp.server.gql.DgsConstants;
import com.bcs.atp.server.gql.types.AuthProvider;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsDataFetchingEnvironment;
import com.netflix.graphql.dgs.DgsQuery;
import org.springframework.beans.factory.annotation.Value;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@DgsComponent
public class AllowedAuthProvidersDatafetcher {

  @Value("${infra.auth.allowedAuthProviders}")
  private AuthProvider[] allowedAuthProviders;

  @DgsQuery(field = DgsConstants.QUERY.AllowedAuthProviders)
  public List<String> getAllowedAuthProviders(DgsDataFetchingEnvironment dfe) {
    return Arrays.stream(allowedAuthProviders).map(Enum::name).collect(Collectors.toList());
  }
}
