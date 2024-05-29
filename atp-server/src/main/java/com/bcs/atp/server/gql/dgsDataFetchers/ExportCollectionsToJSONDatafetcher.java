package com.bcs.atp.server.gql.dgsDataFetchers;

import com.bcs.atp.server.gql.DgsConstants;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import graphql.schema.DataFetchingEnvironment;

@DgsComponent
public class ExportCollectionsToJSONDatafetcher {
  @DgsQuery(field = DgsConstants.QUERY.ExportCollectionsToJSON)
  public String getExportCollectionsToJSON(DataFetchingEnvironment dataFetchingEnvironment) {
    return "";
  }
}
