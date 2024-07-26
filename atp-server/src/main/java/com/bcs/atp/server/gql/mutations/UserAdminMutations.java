package com.bcs.atp.server.gql.mutations;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.bcs.atp.server.gql.types.User;
import com.bcs.atp.server.gql.types.UserSettings;
import com.bcs.atp.server.model.UserModel;
import com.bcs.atp.server.model.UserSettingsModel;
import com.bcs.atp.server.model.user.UserDetails;
import com.bcs.atp.server.service.UserService;
import com.bcs.atp.server.service.UserSettingsService;
import com.bcs.atp.server.util.AuthUserUtil;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsDataFetchingEnvironment;
import com.netflix.graphql.dgs.DgsMutation;
import com.netflix.graphql.dgs.InputArgument;
import com.soulcraft.network.resp.error.DbResponseEnum;
import io.micrometer.core.instrument.util.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import java.io.IOException;
import java.util.Map;

@Slf4j
@DgsComponent
public class UserAdminMutations {
  /**
   * """Delete an user account from infra"""
   * removeUserByAdmin(
   * """users UID"""
   * userUID: ID!
   * ): Boolean! @deprecated(reason: "Use removeUsersByAdmin instead")
   * <p>
   * """Delete user accounts from infra"""
   * removeUsersByAdmin(
   * """users UID"""
   * userUIDs: [ID!]!
   * ): [UserDeletionResult!]!
   * <p>
   * """Make user an admin"""
   * makeUserAdmin(
   * """users UID"""
   * userUID: ID!
   * ): Boolean! @deprecated(reason: "Use makeUsersAdmin instead")
   * <p>
   * """Make users an admin"""
   * makeUsersAdmin(
   * """users UID"""
   * userUIDs: [ID!]!
   * ): Boolean!
   * <p>
   * """Update user display name"""
   * updateUserDisplayNameByAdmin(
   * """users UID"""
   * userUID: ID!
   * <p>
   * """users display name"""
   * displayName: String!
   * ): Boolean!
   * <p>
   * """Remove user as admin"""
   * removeUserAsAdmin(
   * """users UID"""
   * userUID: ID!
   * ): Boolean! @deprecated(reason: "Use demoteUsersByAdmin instead")
   * <p>
   * """Remove users as admin"""
   * demoteUsersByAdmin(
   * """users UID"""
   * userUIDs: [ID!]!
   * ): Boolean!
   * <p>
   * """Update a users display name"""
   * updateDisplayName(
   * """New name of user"""
   * updatedDisplayName: String!
   * ): User!
   * <p>
   * """Delete an user account"""
   * deleteUser: Boolean!
   * <p>
   * <p>
   * """Creates a new user setting"""
   * createUserSettings(
   * """Stringified JSON settings object"""
   * properties: String!
   * ): UserSettings!
   * <p>
   * """Update user setting for a given user"""
   * updateUserSettings(
   * """Stringified JSON settings object"""
   * properties: String!
   * ): UserSettings!
   * <p>
   * <p>
   * <p>
   * """Invite a user to the infra using email"""
   * inviteNewUser(
   * """invitee email"""
   * inviteeEmail: String!
   * ): InvitedUser!
   * <p>
   * """Revoke a user invites by invitee emails"""
   * revokeUserInvitationsByAdmin(
   * """Invitee Emails"""
   * inviteeEmails: [String!]!
   * ): Boolean!
   */

  /**
   * <pre>
   * Mutation definition
   * """Update a users display name"""
   * updateDisplayName(
   *    """New name of user"""
   *    updatedDisplayName: String!
   * ): User!
   * </pre>
   *
   * Update a users display name
   *
   * @param updatedDisplayName New name of user
   * @return User
   */

  @Autowired
  private UserService userService;
  @Autowired
  private AuthUserUtil authUserUtil;
  @Autowired
  private UserSettingsService userSettingsService;

  @DgsMutation
  public User updateDisplayName(@InputArgument String updatedDisplayName) {
    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
    if (authentication == null) {
      return null;
    }
    Object principal = authentication.getPrincipal();
    if (!(principal instanceof UserDetails)) {
      return null;
    }
    UserDetails userDetails = (UserDetails) principal;
    UserModel user = userDetails.getUser();
    user.setDisplayName(updatedDisplayName);
    boolean updated = userService.update(user);
    DbResponseEnum.RECORD_UPDATE_FAILED.assertTrue(updated);

    return userService.convertDbModelToGraphqlModel(user);
  }

  @DgsMutation
  public UserSettings updateUserSettings(DgsDataFetchingEnvironment dfe, @InputArgument("properties") String properties){
    if (StringUtils.isBlank(properties)){
      throw new IllegalArgumentException("user_settings/null_settings");
    }
    ObjectMapper mapper = new ObjectMapper();
    try {
      // 将JSON字符串转换为Map
      Map<String, Object> map = mapper.readValue(properties, Map.class);
    } catch (IOException e) {
      throw new IllegalArgumentException("properties is invalid", e);
    }
    //更新数据库
    UserModel userModel = authUserUtil.getAuthUser(dfe);
    String userId = userModel.getId();
    LambdaUpdateWrapper<UserSettingsModel> updateWrapper = new LambdaUpdateWrapper<>();
    updateWrapper.eq(UserSettingsModel::getUserId, userId)
            .set(UserSettingsModel::getProperties, properties);
    boolean result = userSettingsService.lambdaUpdate()
            .eq(UserSettingsModel::getUserId, userId)
            .set(UserSettingsModel::getProperties, properties)
            .update();
    if (!result){
      throw new IllegalArgumentException("updateUserSettings error");
    }
    LambdaQueryWrapper<UserSettingsModel> lambdaQueryWrapper = new LambdaQueryWrapper<>();
    lambdaQueryWrapper.eq(UserSettingsModel::getUserId, userId);
    UserSettingsModel userSettingsModel = userSettingsService.getOne(lambdaQueryWrapper);
    // Publish subscription for user settings update
    //    await this.pubsub.publish(`user_settings/${user.uid}/updated`, settings);
    return userSettingsService.convertDbModelToGraphqlModel(userSettingsModel);
  }
}
