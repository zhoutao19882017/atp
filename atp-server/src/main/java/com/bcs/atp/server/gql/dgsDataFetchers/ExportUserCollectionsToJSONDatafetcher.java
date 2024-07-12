package com.bcs.atp.server.gql.dgsDataFetchers;

import com.bcs.atp.server.gql.DgsConstants;
import com.bcs.atp.server.gql.types.ReqType;
import com.bcs.atp.server.gql.types.UserCollection;
import com.bcs.atp.server.gql.types.UserCollectionExportJSONData;
import com.bcs.atp.server.model.UserCollectionModel;
import com.bcs.atp.server.model.UserModel;
import com.bcs.atp.server.service.UserCollectionService;
import com.bcs.atp.server.util.AuthUserUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsDataFetchingEnvironment;
import com.netflix.graphql.dgs.DgsQuery;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

@DgsComponent
@Slf4j
public class ExportUserCollectionsToJSONDatafetcher {
  @Autowired
  private UserCollectionService userCollectionService;
  @Autowired
  private AuthUserUtil authUserUtil;

  @DgsQuery(field = DgsConstants.QUERY.ExportUserCollectionsToJSON)
  public UserCollectionExportJSONData getExportUserCollectionsToJSON(DgsDataFetchingEnvironment dfe) {
    log.info("Dgs查询,ExportUserCollectionsToJSONDatafetcher.UserCollectionExportJSONData");
    UserModel userModel = authUserUtil.getAuthUser(dfe);
    String userId = userModel.getId();
    String collections = getUserCollections(userId);
    return UserCollectionExportJSONData.newBuilder()
      .exportedCollection(collections)
      .collectionType(ReqType.GQL)
      .build();
  }

  public String getUserCollections(String userId){
    UserCollectionModel userCollectionModel = userCollectionService.lambdaQuery().eq(UserCollectionModel::getUserId, userId).one();
    if (userCollectionModel == null){
      return null;
    }
    UserCollection userCollection = userCollectionService.convertDbModelToGraphqlModel(userCollectionModel);
    ObjectMapper mapper = new ObjectMapper();
    try {
      return mapper.writeValueAsString(new UserCollection[] { userCollection });
    } catch (Exception e) {
      log.error("Failed to convert user collection to JSON", e);
      return null;
    }
  }
}
