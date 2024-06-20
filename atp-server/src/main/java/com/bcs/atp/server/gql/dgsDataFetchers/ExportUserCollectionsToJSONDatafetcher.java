package com.bcs.atp.server.gql.dgsDataFetchers;

import com.bcs.atp.server.gql.DgsConstants;
import com.bcs.atp.server.gql.types.ReqType;
import com.bcs.atp.server.gql.types.UserCollection;
import com.bcs.atp.server.gql.types.UserCollectionExportJSONData;
import com.bcs.atp.server.model.UserCollectionModel;
import com.bcs.atp.server.model.user.UserDetails;
import com.bcs.atp.server.service.UserCollectionService;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import graphql.schema.DataFetchingEnvironment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

@DgsComponent
@Slf4j
public class ExportUserCollectionsToJSONDatafetcher {
  @Autowired
  private UserCollectionService userCollectionService;

  @DgsQuery(field = DgsConstants.QUERY.ExportUserCollectionsToJSON)
  public UserCollectionExportJSONData getExportUserCollectionsToJSON(DataFetchingEnvironment dataFetchingEnvironment) {
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    if (authentication == null){
      return new UserCollectionExportJSONData();
    }
    Object principal = authentication.getPrincipal();
    if (!(principal instanceof UserDetails) || ((UserDetails) principal).getUsername().equals("anonymousUser")) {
      return new UserCollectionExportJSONData();
    }
    UserDetails userDetails = (UserDetails) principal;
    String userId = userDetails.getUserId();

    String collections = getUserCollections(userId);
    if (collections == null) {
      return new UserCollectionExportJSONData();
    }
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
