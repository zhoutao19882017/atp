package com.bcs.atp.server.gql.dgsDataFetchers;

import com.bcs.atp.server.gql.DgsConstants;
import com.bcs.atp.server.gql.types.Shortcode;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import graphql.schema.DataFetchingEnvironment;

import java.util.Collections;
import java.util.List;

@DgsComponent
public class MyShortcodesDatafetcher {
  @DgsQuery(field = DgsConstants.QUERY.MyShortcodes)
  public List<Shortcode> getMyShortcodes(DataFetchingEnvironment dataFetchingEnvironment) {
    return Collections.emptyList();
  }
}
