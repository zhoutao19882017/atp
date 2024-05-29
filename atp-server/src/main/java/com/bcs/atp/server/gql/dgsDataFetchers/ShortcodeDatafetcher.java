package com.bcs.atp.server.gql.dgsDataFetchers;

import com.bcs.atp.server.gql.DgsConstants;
import com.bcs.atp.server.gql.types.Shortcode;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import graphql.schema.DataFetchingEnvironment;

@DgsComponent
public class ShortcodeDatafetcher {
  @DgsQuery(field = DgsConstants.QUERY.Shortcode)
  public Shortcode getShortcode(DataFetchingEnvironment dataFetchingEnvironment) {
    return null;
  }
}
