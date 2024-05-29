package com.bcs.atp.server.gql.dgsDataFetchers;

import com.bcs.atp.server.gql.DgsConstants;
import com.bcs.atp.server.gql.types.ReqType;
import com.bcs.atp.server.gql.types.UserCollectionExportJSONData;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import graphql.schema.DataFetchingEnvironment;

@DgsComponent
public class ExportUserCollectionsToJSONDatafetcher {
  @DgsQuery(field = DgsConstants.QUERY.ExportUserCollectionsToJSON)
  public UserCollectionExportJSONData getExportUserCollectionsToJSON(
    DataFetchingEnvironment dataFetchingEnvironment) {
    return UserCollectionExportJSONData.newBuilder()
      .exportedCollection("")
      .collectionType(ReqType.GQL)
      .build();
  }
}
