package com.bcs.atp.server.gql.mutations;

import cn.hutool.core.bean.BeanUtil;
import com.bcs.atp.server.gql.types.ReqType;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsMutation;
import com.netflix.graphql.dgs.InputArgument;
import com.bcs.atp.server.constant.UserConstant;
import com.bcs.atp.server.gql.types.UserHistory;
import com.bcs.atp.server.model.UserHistoryModel;
import com.bcs.atp.server.service.UserHistoryService;
import com.soulcraft.mybatis.common.enums.EYesOrNo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
@DgsComponent
public class RequestAdminMutations {
/**
 *   """Create a team request in the given collection."""
 *   createRequestInCollection(
 *     """ID of the collection"""
 *     collectionID: ID!
 *
 *     """The request data (stringified JSON of Hoppscotch request object)"""
 *     data: CreateTeamRequestInput!
 *   ): TeamRequest!
 *
 *   """Update a request with the given ID"""
 *   updateRequest(
 *     """ID of the request"""
 *     requestID: ID!
 *
 *     """
 *     The updated request data (stringified JSON of Hoppscotch request object)
 *     """
 *     data: UpdateTeamRequestInput!
 *   ): TeamRequest!
 *
 *   """Delete a request with the given ID"""
 *   deleteRequest(
 *     """ID of the request"""
 *     requestID: ID!
 *   ): Boolean!
 *
 *   """Update the order of requests in the lookup table"""
 *   updateLookUpRequestOrder(
 *     """ID of the collection"""
 *     collectionID: ID!
 *
 *     """
 *     ID of the request that comes after the updated request in its new position
 *     """
 *     nextRequestID: ID
 *
 *     """ID of the request to move"""
 *     requestID: ID!
 *   ): Boolean!
 *
 *   """Move a request to the given collection"""
 *   moveRequest(
 *     """ID of the collection, the request belong to"""
 *     srcCollID: ID
 *
 *     """ID of the request to move"""
 *     requestID: ID!
 *
 *     """ID of the collection, where the request is moving to"""
 *     destCollID: ID!
 *
 *     """
 *     ID of the request that comes after the updated request in its new position
 *     """
 *     nextRequestID: ID
 *   ): TeamRequest!
 *
 *   """Update user sessions"""
 *   updateUserSessions(
 *     """JSON string of the saved REST/GQL session"""
 *     currentSession: String!
 *
 *     """Type of the session"""
 *     sessionType: SessionType!
 *   ): User!
 *
 *     """Adds a new REST/GQL request to user history"""
 *   createUserHistory(
 *     """JSON string of the request data"""
 *     reqData: String!
 *
 *     """JSON string of the response metadata"""
 *     resMetadata: String!
 *
 *     """Request type, REST or GQL"""
 *     reqType: ReqType!
 *   ): UserHistory!
 *
 *   """Stars/Unstars a REST/GQL request in user history"""
 *   toggleHistoryStarStatus(
 *     """ID of User History"""
 *     id: ID!
 *   ): UserHistory!
 *
 *   """Removes a REST/GQL request from user history"""
 *   removeRequestFromHistory(
 *     """ID of User History"""
 *     id: ID!
 *   ): UserHistory!
 *
 *   """Deletes all REST/GQL history for a user based on Request type"""
 *   deleteAllUserHistory(
 *     """Request type, REST or GQL"""
 *     reqType: ReqType!
 *   ): UserHistoryDeletedManyData!
 *
 *   """Create a new user REST request"""
 *   createRESTUserRequest(
 *     """Collection ID of the user request"""
 *     collectionID: ID!
 *
 *     """Title of the user request"""
 *     title: String!
 *
 *     """content/body of the user request"""
 *     request: String!
 *   ): UserRequest!
 *
 *   """Create a new user GraphQL request"""
 *   createGQLUserRequest(
 *     """Collection ID of the user request"""
 *     collectionID: ID!
 *
 *     """Title of the user request"""
 *     title: String!
 *
 *     """content/body of the user request"""
 *     request: String!
 *   ): UserRequest!
 *
 *   """Update a user REST request"""
 *   updateRESTUserRequest(
 *     """ID of the user REST request"""
 *     id: ID!
 *
 *     """Title of the user request"""
 *     title: String
 *
 *     """content/body of the user request"""
 *     request: String
 *   ): UserRequest!
 *
 *   """Update a user GraphQL request"""
 *   updateGQLUserRequest(
 *     """ID of the user GraphQL request"""
 *     id: ID!
 *
 *     """Title of the user request"""
 *     title: String
 *
 *     """content/body of the user request"""
 *     request: String
 *   ): UserRequest!
 *
 *   """Delete a user request"""
 *   deleteUserRequest(
 *     """ID of the user request"""
 *     id: ID!
 *   ): Boolean!
 *
 *   """Move and re-order of a user request within same or across collection"""
 *   moveUserRequest(
 *     """ID of the collection, where the request is belongs to"""
 *     sourceCollectionID: ID!
 *
 *     """ID of the request being moved"""
 *     requestID: ID!
 *
 *     """ID of the collection, where the request is moving to"""
 *     destinationCollectionID: ID!
 *
 *     """
 *     ID of the request that comes after the updated request in its new position
 *     """
 *     nextRequestID: ID
 *   ): UserRequest!
 *
 *
 */
    @Autowired
    private UserHistoryService userHistoryService;

    @DgsMutation
    public UserHistory createUserHistory(@InputArgument String reqData, @InputArgument String resMetadata, ReqType reqType){
        UserHistoryModel userHistoryModel = UserHistoryModel.builder()
                .userId(UserConstant.ANONYMOUS_USER_ID)
                .reqType(reqType.toString())
                .request(reqData)
                .responseMetadata(resMetadata)
                .isStarred(EYesOrNo.NO)
                .build();
        userHistoryService.create(userHistoryModel);
        UserHistory userHistory = new UserHistory();
        BeanUtil.copyProperties(userHistoryModel, userHistory);
        userHistory.setUserUid(userHistoryModel.getUserId());
        return userHistory;
    }
}
