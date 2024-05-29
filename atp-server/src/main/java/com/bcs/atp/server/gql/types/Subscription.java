package com.bcs.atp.server.gql.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class Subscription {
  /**
   * Listen for User Invitation
   */
  private InvitedUser userInvited;

  /**
   * Listen for shortcode creation
   */
  private Shortcode myShortcodesCreated;

  /**
   * Listen for Shortcode updates
   */
  private Shortcode myShortcodesUpdated;

  /**
   * Listen for shortcode deletion
   */
  private Shortcode myShortcodesRevoked;

  /**
   * Listen to when a new team member being added to the team. The emitted value is the new team member added.
   */
  private TeamMember teamMemberAdded;

  /**
   * Listen to when a team member status has been updated. The emitted value is the new team member status
   */
  private TeamMember teamMemberUpdated;

  /**
   * Listen to when a team member has been removed. The emitted value is the uid of the user removed
   */
  private String teamMemberRemoved;

  /**
   * Listen to when a collection has been added to a team. The emitted value is the team added
   */
  private TeamCollection teamCollectionAdded;

  /**
   * Listen to when a collection has been updated.
   */
  private TeamCollection teamCollectionUpdated;

  /**
   * Listen to when a collection has been removed
   */
  private String teamCollectionRemoved;

  /**
   * Listen to when a collection has been moved
   */
  private TeamCollection teamCollectionMoved;

  /**
   * Listen to when a collections position has changed
   */
  private CollectionReorderData collectionOrderUpdated;

  /**
   * Listen for Team Environment Updates
   */
  private TeamEnvironment teamEnvironmentUpdated;

  /**
   * Listen for Team Environment Creation Messages
   */
  private TeamEnvironment teamEnvironmentCreated;

  /**
   * Listen for Team Environment Deletion Messages
   */
  private TeamEnvironment teamEnvironmentDeleted;

  /**
   * Listens to when a Team Invitation is added
   */
  private TeamInvitation teamInvitationAdded;

  /**
   * Listens to when a Team Invitation is removed
   */
  private String teamInvitationRemoved;

  /**
   * Emits when a new request is added to a team
   */
  private TeamRequest teamRequestAdded;

  /**
   * Emitted when a request has been updated
   */
  private TeamRequest teamRequestUpdated;

  /**
   * Emitted when a request has been deleted. Only the id of the request is emitted.
   */
  private String teamRequestDeleted;

  /**
   * Emitted when a requests position has been changed in its collection
   */
  private RequestReorderData requestOrderUpdated;

  /**
   * Emitted when a request has been moved from one collection into another
   */
  private TeamRequest requestMoved;

  /**
   * Listen for user updates
   */
  private User userUpdated;

  /**
   * Listen for user deletion
   */
  private User userDeleted;

  /**
   * Listen for User Collection Creation
   */
  private UserCollection userCollectionCreated;

  /**
   * Listen to when a User Collection has been updated.
   */
  private UserCollection userCollectionUpdated;

  /**
   * Listen to when a User Collection has been deleted
   */
  private UserCollectionRemovedData userCollectionRemoved;

  /**
   * Listen to when a User Collection has been moved
   */
  private UserCollection userCollectionMoved;

  /**
   * Listen to when a User Collections position has changed
   */
  private UserCollectionReorderData userCollectionOrderUpdated;

  /**
   * Listen for User Environment Creation
   */
  private UserEnvironment userEnvironmentCreated;

  /**
   * Listen for User Environment updates
   */
  private UserEnvironment userEnvironmentUpdated;

  /**
   * Listen for User Environment deletion
   */
  private UserEnvironment userEnvironmentDeleted;

  /**
   * Listen for User Environment DeleteMany
   */
  private Integer userEnvironmentDeleteMany;

  /**
   * Listen for User History Creation
   */
  private UserHistory userHistoryCreated;

  /**
   * Listen for User History update
   */
  private UserHistory userHistoryUpdated;

  /**
   * Listen for User History deletion
   */
  private UserHistory userHistoryDeleted;

  /**
   * Listen for User History deleted many
   */
  private UserHistoryDeletedManyData userHistoryDeletedMany;

  /**
   * Listen for User Request Creation
   */
  private UserRequest userRequestCreated;

  /**
   * Listen for User Request Update
   */
  private UserRequest userRequestUpdated;

  /**
   * Listen for User Request Deletion
   */
  private UserRequest userRequestDeleted;

  /**
   * Listen for User Request Moved
   */
  private UserRequestReorderData userRequestMoved;

  /**
   * Listen for user setting creation
   */
  private UserSettings userSettingsCreated;

  /**
   * Listen for user setting updates
   */
  private UserSettings userSettingsUpdated;

  public Subscription() {
  }

  public Subscription(InvitedUser userInvited, Shortcode myShortcodesCreated,
      Shortcode myShortcodesUpdated, Shortcode myShortcodesRevoked, TeamMember teamMemberAdded,
      TeamMember teamMemberUpdated, String teamMemberRemoved, TeamCollection teamCollectionAdded,
      TeamCollection teamCollectionUpdated, String teamCollectionRemoved,
      TeamCollection teamCollectionMoved, CollectionReorderData collectionOrderUpdated,
      TeamEnvironment teamEnvironmentUpdated, TeamEnvironment teamEnvironmentCreated,
      TeamEnvironment teamEnvironmentDeleted, TeamInvitation teamInvitationAdded,
      String teamInvitationRemoved, TeamRequest teamRequestAdded, TeamRequest teamRequestUpdated,
      String teamRequestDeleted, RequestReorderData requestOrderUpdated, TeamRequest requestMoved,
      User userUpdated, User userDeleted, UserCollection userCollectionCreated,
      UserCollection userCollectionUpdated, UserCollectionRemovedData userCollectionRemoved,
      UserCollection userCollectionMoved, UserCollectionReorderData userCollectionOrderUpdated,
      UserEnvironment userEnvironmentCreated, UserEnvironment userEnvironmentUpdated,
      UserEnvironment userEnvironmentDeleted, Integer userEnvironmentDeleteMany,
      UserHistory userHistoryCreated, UserHistory userHistoryUpdated,
      UserHistory userHistoryDeleted, UserHistoryDeletedManyData userHistoryDeletedMany,
      UserRequest userRequestCreated, UserRequest userRequestUpdated,
      UserRequest userRequestDeleted, UserRequestReorderData userRequestMoved,
      UserSettings userSettingsCreated, UserSettings userSettingsUpdated) {
    this.userInvited = userInvited;
    this.myShortcodesCreated = myShortcodesCreated;
    this.myShortcodesUpdated = myShortcodesUpdated;
    this.myShortcodesRevoked = myShortcodesRevoked;
    this.teamMemberAdded = teamMemberAdded;
    this.teamMemberUpdated = teamMemberUpdated;
    this.teamMemberRemoved = teamMemberRemoved;
    this.teamCollectionAdded = teamCollectionAdded;
    this.teamCollectionUpdated = teamCollectionUpdated;
    this.teamCollectionRemoved = teamCollectionRemoved;
    this.teamCollectionMoved = teamCollectionMoved;
    this.collectionOrderUpdated = collectionOrderUpdated;
    this.teamEnvironmentUpdated = teamEnvironmentUpdated;
    this.teamEnvironmentCreated = teamEnvironmentCreated;
    this.teamEnvironmentDeleted = teamEnvironmentDeleted;
    this.teamInvitationAdded = teamInvitationAdded;
    this.teamInvitationRemoved = teamInvitationRemoved;
    this.teamRequestAdded = teamRequestAdded;
    this.teamRequestUpdated = teamRequestUpdated;
    this.teamRequestDeleted = teamRequestDeleted;
    this.requestOrderUpdated = requestOrderUpdated;
    this.requestMoved = requestMoved;
    this.userUpdated = userUpdated;
    this.userDeleted = userDeleted;
    this.userCollectionCreated = userCollectionCreated;
    this.userCollectionUpdated = userCollectionUpdated;
    this.userCollectionRemoved = userCollectionRemoved;
    this.userCollectionMoved = userCollectionMoved;
    this.userCollectionOrderUpdated = userCollectionOrderUpdated;
    this.userEnvironmentCreated = userEnvironmentCreated;
    this.userEnvironmentUpdated = userEnvironmentUpdated;
    this.userEnvironmentDeleted = userEnvironmentDeleted;
    this.userEnvironmentDeleteMany = userEnvironmentDeleteMany;
    this.userHistoryCreated = userHistoryCreated;
    this.userHistoryUpdated = userHistoryUpdated;
    this.userHistoryDeleted = userHistoryDeleted;
    this.userHistoryDeletedMany = userHistoryDeletedMany;
    this.userRequestCreated = userRequestCreated;
    this.userRequestUpdated = userRequestUpdated;
    this.userRequestDeleted = userRequestDeleted;
    this.userRequestMoved = userRequestMoved;
    this.userSettingsCreated = userSettingsCreated;
    this.userSettingsUpdated = userSettingsUpdated;
  }

  /**
   * Listen for User Invitation
   */
  public InvitedUser getUserInvited() {
    return userInvited;
  }

  public void setUserInvited(InvitedUser userInvited) {
    this.userInvited = userInvited;
  }

  /**
   * Listen for shortcode creation
   */
  public Shortcode getMyShortcodesCreated() {
    return myShortcodesCreated;
  }

  public void setMyShortcodesCreated(Shortcode myShortcodesCreated) {
    this.myShortcodesCreated = myShortcodesCreated;
  }

  /**
   * Listen for Shortcode updates
   */
  public Shortcode getMyShortcodesUpdated() {
    return myShortcodesUpdated;
  }

  public void setMyShortcodesUpdated(Shortcode myShortcodesUpdated) {
    this.myShortcodesUpdated = myShortcodesUpdated;
  }

  /**
   * Listen for shortcode deletion
   */
  public Shortcode getMyShortcodesRevoked() {
    return myShortcodesRevoked;
  }

  public void setMyShortcodesRevoked(Shortcode myShortcodesRevoked) {
    this.myShortcodesRevoked = myShortcodesRevoked;
  }

  /**
   * Listen to when a new team member being added to the team. The emitted value is the new team member added.
   */
  public TeamMember getTeamMemberAdded() {
    return teamMemberAdded;
  }

  public void setTeamMemberAdded(TeamMember teamMemberAdded) {
    this.teamMemberAdded = teamMemberAdded;
  }

  /**
   * Listen to when a team member status has been updated. The emitted value is the new team member status
   */
  public TeamMember getTeamMemberUpdated() {
    return teamMemberUpdated;
  }

  public void setTeamMemberUpdated(TeamMember teamMemberUpdated) {
    this.teamMemberUpdated = teamMemberUpdated;
  }

  /**
   * Listen to when a team member has been removed. The emitted value is the uid of the user removed
   */
  public String getTeamMemberRemoved() {
    return teamMemberRemoved;
  }

  public void setTeamMemberRemoved(String teamMemberRemoved) {
    this.teamMemberRemoved = teamMemberRemoved;
  }

  /**
   * Listen to when a collection has been added to a team. The emitted value is the team added
   */
  public TeamCollection getTeamCollectionAdded() {
    return teamCollectionAdded;
  }

  public void setTeamCollectionAdded(TeamCollection teamCollectionAdded) {
    this.teamCollectionAdded = teamCollectionAdded;
  }

  /**
   * Listen to when a collection has been updated.
   */
  public TeamCollection getTeamCollectionUpdated() {
    return teamCollectionUpdated;
  }

  public void setTeamCollectionUpdated(TeamCollection teamCollectionUpdated) {
    this.teamCollectionUpdated = teamCollectionUpdated;
  }

  /**
   * Listen to when a collection has been removed
   */
  public String getTeamCollectionRemoved() {
    return teamCollectionRemoved;
  }

  public void setTeamCollectionRemoved(String teamCollectionRemoved) {
    this.teamCollectionRemoved = teamCollectionRemoved;
  }

  /**
   * Listen to when a collection has been moved
   */
  public TeamCollection getTeamCollectionMoved() {
    return teamCollectionMoved;
  }

  public void setTeamCollectionMoved(TeamCollection teamCollectionMoved) {
    this.teamCollectionMoved = teamCollectionMoved;
  }

  /**
   * Listen to when a collections position has changed
   */
  public CollectionReorderData getCollectionOrderUpdated() {
    return collectionOrderUpdated;
  }

  public void setCollectionOrderUpdated(CollectionReorderData collectionOrderUpdated) {
    this.collectionOrderUpdated = collectionOrderUpdated;
  }

  /**
   * Listen for Team Environment Updates
   */
  public TeamEnvironment getTeamEnvironmentUpdated() {
    return teamEnvironmentUpdated;
  }

  public void setTeamEnvironmentUpdated(TeamEnvironment teamEnvironmentUpdated) {
    this.teamEnvironmentUpdated = teamEnvironmentUpdated;
  }

  /**
   * Listen for Team Environment Creation Messages
   */
  public TeamEnvironment getTeamEnvironmentCreated() {
    return teamEnvironmentCreated;
  }

  public void setTeamEnvironmentCreated(TeamEnvironment teamEnvironmentCreated) {
    this.teamEnvironmentCreated = teamEnvironmentCreated;
  }

  /**
   * Listen for Team Environment Deletion Messages
   */
  public TeamEnvironment getTeamEnvironmentDeleted() {
    return teamEnvironmentDeleted;
  }

  public void setTeamEnvironmentDeleted(TeamEnvironment teamEnvironmentDeleted) {
    this.teamEnvironmentDeleted = teamEnvironmentDeleted;
  }

  /**
   * Listens to when a Team Invitation is added
   */
  public TeamInvitation getTeamInvitationAdded() {
    return teamInvitationAdded;
  }

  public void setTeamInvitationAdded(TeamInvitation teamInvitationAdded) {
    this.teamInvitationAdded = teamInvitationAdded;
  }

  /**
   * Listens to when a Team Invitation is removed
   */
  public String getTeamInvitationRemoved() {
    return teamInvitationRemoved;
  }

  public void setTeamInvitationRemoved(String teamInvitationRemoved) {
    this.teamInvitationRemoved = teamInvitationRemoved;
  }

  /**
   * Emits when a new request is added to a team
   */
  public TeamRequest getTeamRequestAdded() {
    return teamRequestAdded;
  }

  public void setTeamRequestAdded(TeamRequest teamRequestAdded) {
    this.teamRequestAdded = teamRequestAdded;
  }

  /**
   * Emitted when a request has been updated
   */
  public TeamRequest getTeamRequestUpdated() {
    return teamRequestUpdated;
  }

  public void setTeamRequestUpdated(TeamRequest teamRequestUpdated) {
    this.teamRequestUpdated = teamRequestUpdated;
  }

  /**
   * Emitted when a request has been deleted. Only the id of the request is emitted.
   */
  public String getTeamRequestDeleted() {
    return teamRequestDeleted;
  }

  public void setTeamRequestDeleted(String teamRequestDeleted) {
    this.teamRequestDeleted = teamRequestDeleted;
  }

  /**
   * Emitted when a requests position has been changed in its collection
   */
  public RequestReorderData getRequestOrderUpdated() {
    return requestOrderUpdated;
  }

  public void setRequestOrderUpdated(RequestReorderData requestOrderUpdated) {
    this.requestOrderUpdated = requestOrderUpdated;
  }

  /**
   * Emitted when a request has been moved from one collection into another
   */
  public TeamRequest getRequestMoved() {
    return requestMoved;
  }

  public void setRequestMoved(TeamRequest requestMoved) {
    this.requestMoved = requestMoved;
  }

  /**
   * Listen for user updates
   */
  public User getUserUpdated() {
    return userUpdated;
  }

  public void setUserUpdated(User userUpdated) {
    this.userUpdated = userUpdated;
  }

  /**
   * Listen for user deletion
   */
  public User getUserDeleted() {
    return userDeleted;
  }

  public void setUserDeleted(User userDeleted) {
    this.userDeleted = userDeleted;
  }

  /**
   * Listen for User Collection Creation
   */
  public UserCollection getUserCollectionCreated() {
    return userCollectionCreated;
  }

  public void setUserCollectionCreated(UserCollection userCollectionCreated) {
    this.userCollectionCreated = userCollectionCreated;
  }

  /**
   * Listen to when a User Collection has been updated.
   */
  public UserCollection getUserCollectionUpdated() {
    return userCollectionUpdated;
  }

  public void setUserCollectionUpdated(UserCollection userCollectionUpdated) {
    this.userCollectionUpdated = userCollectionUpdated;
  }

  /**
   * Listen to when a User Collection has been deleted
   */
  public UserCollectionRemovedData getUserCollectionRemoved() {
    return userCollectionRemoved;
  }

  public void setUserCollectionRemoved(UserCollectionRemovedData userCollectionRemoved) {
    this.userCollectionRemoved = userCollectionRemoved;
  }

  /**
   * Listen to when a User Collection has been moved
   */
  public UserCollection getUserCollectionMoved() {
    return userCollectionMoved;
  }

  public void setUserCollectionMoved(UserCollection userCollectionMoved) {
    this.userCollectionMoved = userCollectionMoved;
  }

  /**
   * Listen to when a User Collections position has changed
   */
  public UserCollectionReorderData getUserCollectionOrderUpdated() {
    return userCollectionOrderUpdated;
  }

  public void setUserCollectionOrderUpdated(UserCollectionReorderData userCollectionOrderUpdated) {
    this.userCollectionOrderUpdated = userCollectionOrderUpdated;
  }

  /**
   * Listen for User Environment Creation
   */
  public UserEnvironment getUserEnvironmentCreated() {
    return userEnvironmentCreated;
  }

  public void setUserEnvironmentCreated(UserEnvironment userEnvironmentCreated) {
    this.userEnvironmentCreated = userEnvironmentCreated;
  }

  /**
   * Listen for User Environment updates
   */
  public UserEnvironment getUserEnvironmentUpdated() {
    return userEnvironmentUpdated;
  }

  public void setUserEnvironmentUpdated(UserEnvironment userEnvironmentUpdated) {
    this.userEnvironmentUpdated = userEnvironmentUpdated;
  }

  /**
   * Listen for User Environment deletion
   */
  public UserEnvironment getUserEnvironmentDeleted() {
    return userEnvironmentDeleted;
  }

  public void setUserEnvironmentDeleted(UserEnvironment userEnvironmentDeleted) {
    this.userEnvironmentDeleted = userEnvironmentDeleted;
  }

  /**
   * Listen for User Environment DeleteMany
   */
  public Integer getUserEnvironmentDeleteMany() {
    return userEnvironmentDeleteMany;
  }

  public void setUserEnvironmentDeleteMany(Integer userEnvironmentDeleteMany) {
    this.userEnvironmentDeleteMany = userEnvironmentDeleteMany;
  }

  /**
   * Listen for User History Creation
   */
  public UserHistory getUserHistoryCreated() {
    return userHistoryCreated;
  }

  public void setUserHistoryCreated(UserHistory userHistoryCreated) {
    this.userHistoryCreated = userHistoryCreated;
  }

  /**
   * Listen for User History update
   */
  public UserHistory getUserHistoryUpdated() {
    return userHistoryUpdated;
  }

  public void setUserHistoryUpdated(UserHistory userHistoryUpdated) {
    this.userHistoryUpdated = userHistoryUpdated;
  }

  /**
   * Listen for User History deletion
   */
  public UserHistory getUserHistoryDeleted() {
    return userHistoryDeleted;
  }

  public void setUserHistoryDeleted(UserHistory userHistoryDeleted) {
    this.userHistoryDeleted = userHistoryDeleted;
  }

  /**
   * Listen for User History deleted many
   */
  public UserHistoryDeletedManyData getUserHistoryDeletedMany() {
    return userHistoryDeletedMany;
  }

  public void setUserHistoryDeletedMany(UserHistoryDeletedManyData userHistoryDeletedMany) {
    this.userHistoryDeletedMany = userHistoryDeletedMany;
  }

  /**
   * Listen for User Request Creation
   */
  public UserRequest getUserRequestCreated() {
    return userRequestCreated;
  }

  public void setUserRequestCreated(UserRequest userRequestCreated) {
    this.userRequestCreated = userRequestCreated;
  }

  /**
   * Listen for User Request Update
   */
  public UserRequest getUserRequestUpdated() {
    return userRequestUpdated;
  }

  public void setUserRequestUpdated(UserRequest userRequestUpdated) {
    this.userRequestUpdated = userRequestUpdated;
  }

  /**
   * Listen for User Request Deletion
   */
  public UserRequest getUserRequestDeleted() {
    return userRequestDeleted;
  }

  public void setUserRequestDeleted(UserRequest userRequestDeleted) {
    this.userRequestDeleted = userRequestDeleted;
  }

  /**
   * Listen for User Request Moved
   */
  public UserRequestReorderData getUserRequestMoved() {
    return userRequestMoved;
  }

  public void setUserRequestMoved(UserRequestReorderData userRequestMoved) {
    this.userRequestMoved = userRequestMoved;
  }

  /**
   * Listen for user setting creation
   */
  public UserSettings getUserSettingsCreated() {
    return userSettingsCreated;
  }

  public void setUserSettingsCreated(UserSettings userSettingsCreated) {
    this.userSettingsCreated = userSettingsCreated;
  }

  /**
   * Listen for user setting updates
   */
  public UserSettings getUserSettingsUpdated() {
    return userSettingsUpdated;
  }

  public void setUserSettingsUpdated(UserSettings userSettingsUpdated) {
    this.userSettingsUpdated = userSettingsUpdated;
  }

  @Override
  public String toString() {
    return "Subscription{" + "userInvited='" + userInvited + "'," +"myShortcodesCreated='" + myShortcodesCreated + "'," +"myShortcodesUpdated='" + myShortcodesUpdated + "'," +"myShortcodesRevoked='" + myShortcodesRevoked + "'," +"teamMemberAdded='" + teamMemberAdded + "'," +"teamMemberUpdated='" + teamMemberUpdated + "'," +"teamMemberRemoved='" + teamMemberRemoved + "'," +"teamCollectionAdded='" + teamCollectionAdded + "'," +"teamCollectionUpdated='" + teamCollectionUpdated + "'," +"teamCollectionRemoved='" + teamCollectionRemoved + "'," +"teamCollectionMoved='" + teamCollectionMoved + "'," +"collectionOrderUpdated='" + collectionOrderUpdated + "'," +"teamEnvironmentUpdated='" + teamEnvironmentUpdated + "'," +"teamEnvironmentCreated='" + teamEnvironmentCreated + "'," +"teamEnvironmentDeleted='" + teamEnvironmentDeleted + "'," +"teamInvitationAdded='" + teamInvitationAdded + "'," +"teamInvitationRemoved='" + teamInvitationRemoved + "'," +"teamRequestAdded='" + teamRequestAdded + "'," +"teamRequestUpdated='" + teamRequestUpdated + "'," +"teamRequestDeleted='" + teamRequestDeleted + "'," +"requestOrderUpdated='" + requestOrderUpdated + "'," +"requestMoved='" + requestMoved + "'," +"userUpdated='" + userUpdated + "'," +"userDeleted='" + userDeleted + "'," +"userCollectionCreated='" + userCollectionCreated + "'," +"userCollectionUpdated='" + userCollectionUpdated + "'," +"userCollectionRemoved='" + userCollectionRemoved + "'," +"userCollectionMoved='" + userCollectionMoved + "'," +"userCollectionOrderUpdated='" + userCollectionOrderUpdated + "'," +"userEnvironmentCreated='" + userEnvironmentCreated + "'," +"userEnvironmentUpdated='" + userEnvironmentUpdated + "'," +"userEnvironmentDeleted='" + userEnvironmentDeleted + "'," +"userEnvironmentDeleteMany='" + userEnvironmentDeleteMany + "'," +"userHistoryCreated='" + userHistoryCreated + "'," +"userHistoryUpdated='" + userHistoryUpdated + "'," +"userHistoryDeleted='" + userHistoryDeleted + "'," +"userHistoryDeletedMany='" + userHistoryDeletedMany + "'," +"userRequestCreated='" + userRequestCreated + "'," +"userRequestUpdated='" + userRequestUpdated + "'," +"userRequestDeleted='" + userRequestDeleted + "'," +"userRequestMoved='" + userRequestMoved + "'," +"userSettingsCreated='" + userSettingsCreated + "'," +"userSettingsUpdated='" + userSettingsUpdated + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subscription that = (Subscription) o;
        return java.util.Objects.equals(userInvited, that.userInvited) &&
                            java.util.Objects.equals(myShortcodesCreated, that.myShortcodesCreated) &&
                            java.util.Objects.equals(myShortcodesUpdated, that.myShortcodesUpdated) &&
                            java.util.Objects.equals(myShortcodesRevoked, that.myShortcodesRevoked) &&
                            java.util.Objects.equals(teamMemberAdded, that.teamMemberAdded) &&
                            java.util.Objects.equals(teamMemberUpdated, that.teamMemberUpdated) &&
                            java.util.Objects.equals(teamMemberRemoved, that.teamMemberRemoved) &&
                            java.util.Objects.equals(teamCollectionAdded, that.teamCollectionAdded) &&
                            java.util.Objects.equals(teamCollectionUpdated, that.teamCollectionUpdated) &&
                            java.util.Objects.equals(teamCollectionRemoved, that.teamCollectionRemoved) &&
                            java.util.Objects.equals(teamCollectionMoved, that.teamCollectionMoved) &&
                            java.util.Objects.equals(collectionOrderUpdated, that.collectionOrderUpdated) &&
                            java.util.Objects.equals(teamEnvironmentUpdated, that.teamEnvironmentUpdated) &&
                            java.util.Objects.equals(teamEnvironmentCreated, that.teamEnvironmentCreated) &&
                            java.util.Objects.equals(teamEnvironmentDeleted, that.teamEnvironmentDeleted) &&
                            java.util.Objects.equals(teamInvitationAdded, that.teamInvitationAdded) &&
                            java.util.Objects.equals(teamInvitationRemoved, that.teamInvitationRemoved) &&
                            java.util.Objects.equals(teamRequestAdded, that.teamRequestAdded) &&
                            java.util.Objects.equals(teamRequestUpdated, that.teamRequestUpdated) &&
                            java.util.Objects.equals(teamRequestDeleted, that.teamRequestDeleted) &&
                            java.util.Objects.equals(requestOrderUpdated, that.requestOrderUpdated) &&
                            java.util.Objects.equals(requestMoved, that.requestMoved) &&
                            java.util.Objects.equals(userUpdated, that.userUpdated) &&
                            java.util.Objects.equals(userDeleted, that.userDeleted) &&
                            java.util.Objects.equals(userCollectionCreated, that.userCollectionCreated) &&
                            java.util.Objects.equals(userCollectionUpdated, that.userCollectionUpdated) &&
                            java.util.Objects.equals(userCollectionRemoved, that.userCollectionRemoved) &&
                            java.util.Objects.equals(userCollectionMoved, that.userCollectionMoved) &&
                            java.util.Objects.equals(userCollectionOrderUpdated, that.userCollectionOrderUpdated) &&
                            java.util.Objects.equals(userEnvironmentCreated, that.userEnvironmentCreated) &&
                            java.util.Objects.equals(userEnvironmentUpdated, that.userEnvironmentUpdated) &&
                            java.util.Objects.equals(userEnvironmentDeleted, that.userEnvironmentDeleted) &&
                            java.util.Objects.equals(userEnvironmentDeleteMany, that.userEnvironmentDeleteMany) &&
                            java.util.Objects.equals(userHistoryCreated, that.userHistoryCreated) &&
                            java.util.Objects.equals(userHistoryUpdated, that.userHistoryUpdated) &&
                            java.util.Objects.equals(userHistoryDeleted, that.userHistoryDeleted) &&
                            java.util.Objects.equals(userHistoryDeletedMany, that.userHistoryDeletedMany) &&
                            java.util.Objects.equals(userRequestCreated, that.userRequestCreated) &&
                            java.util.Objects.equals(userRequestUpdated, that.userRequestUpdated) &&
                            java.util.Objects.equals(userRequestDeleted, that.userRequestDeleted) &&
                            java.util.Objects.equals(userRequestMoved, that.userRequestMoved) &&
                            java.util.Objects.equals(userSettingsCreated, that.userSettingsCreated) &&
                            java.util.Objects.equals(userSettingsUpdated, that.userSettingsUpdated);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(userInvited, myShortcodesCreated, myShortcodesUpdated, myShortcodesRevoked, teamMemberAdded, teamMemberUpdated, teamMemberRemoved, teamCollectionAdded, teamCollectionUpdated, teamCollectionRemoved, teamCollectionMoved, collectionOrderUpdated, teamEnvironmentUpdated, teamEnvironmentCreated, teamEnvironmentDeleted, teamInvitationAdded, teamInvitationRemoved, teamRequestAdded, teamRequestUpdated, teamRequestDeleted, requestOrderUpdated, requestMoved, userUpdated, userDeleted, userCollectionCreated, userCollectionUpdated, userCollectionRemoved, userCollectionMoved, userCollectionOrderUpdated, userEnvironmentCreated, userEnvironmentUpdated, userEnvironmentDeleted, userEnvironmentDeleteMany, userHistoryCreated, userHistoryUpdated, userHistoryDeleted, userHistoryDeletedMany, userRequestCreated, userRequestUpdated, userRequestDeleted, userRequestMoved, userSettingsCreated, userSettingsUpdated);
  }

  public static Subscription.Builder newBuilder(
      ) {
    return new Builder();
  }

  public static class Builder {
    /**
     * Listen for User Invitation
     */
    private InvitedUser userInvited;

    /**
     * Listen for shortcode creation
     */
    private Shortcode myShortcodesCreated;

    /**
     * Listen for Shortcode updates
     */
    private Shortcode myShortcodesUpdated;

    /**
     * Listen for shortcode deletion
     */
    private Shortcode myShortcodesRevoked;

    /**
     * Listen to when a new team member being added to the team. The emitted value is the new team member added.
     */
    private TeamMember teamMemberAdded;

    /**
     * Listen to when a team member status has been updated. The emitted value is the new team member status
     */
    private TeamMember teamMemberUpdated;

    /**
     * Listen to when a team member has been removed. The emitted value is the uid of the user removed
     */
    private String teamMemberRemoved;

    /**
     * Listen to when a collection has been added to a team. The emitted value is the team added
     */
    private TeamCollection teamCollectionAdded;

    /**
     * Listen to when a collection has been updated.
     */
    private TeamCollection teamCollectionUpdated;

    /**
     * Listen to when a collection has been removed
     */
    private String teamCollectionRemoved;

    /**
     * Listen to when a collection has been moved
     */
    private TeamCollection teamCollectionMoved;

    /**
     * Listen to when a collections position has changed
     */
    private CollectionReorderData collectionOrderUpdated;

    /**
     * Listen for Team Environment Updates
     */
    private TeamEnvironment teamEnvironmentUpdated;

    /**
     * Listen for Team Environment Creation Messages
     */
    private TeamEnvironment teamEnvironmentCreated;

    /**
     * Listen for Team Environment Deletion Messages
     */
    private TeamEnvironment teamEnvironmentDeleted;

    /**
     * Listens to when a Team Invitation is added
     */
    private TeamInvitation teamInvitationAdded;

    /**
     * Listens to when a Team Invitation is removed
     */
    private String teamInvitationRemoved;

    /**
     * Emits when a new request is added to a team
     */
    private TeamRequest teamRequestAdded;

    /**
     * Emitted when a request has been updated
     */
    private TeamRequest teamRequestUpdated;

    /**
     * Emitted when a request has been deleted. Only the id of the request is emitted.
     */
    private String teamRequestDeleted;

    /**
     * Emitted when a requests position has been changed in its collection
     */
    private RequestReorderData requestOrderUpdated;

    /**
     * Emitted when a request has been moved from one collection into another
     */
    private TeamRequest requestMoved;

    /**
     * Listen for user updates
     */
    private User userUpdated;

    /**
     * Listen for user deletion
     */
    private User userDeleted;

    /**
     * Listen for User Collection Creation
     */
    private UserCollection userCollectionCreated;

    /**
     * Listen to when a User Collection has been updated.
     */
    private UserCollection userCollectionUpdated;

    /**
     * Listen to when a User Collection has been deleted
     */
    private UserCollectionRemovedData userCollectionRemoved;

    /**
     * Listen to when a User Collection has been moved
     */
    private UserCollection userCollectionMoved;

    /**
     * Listen to when a User Collections position has changed
     */
    private UserCollectionReorderData userCollectionOrderUpdated;

    /**
     * Listen for User Environment Creation
     */
    private UserEnvironment userEnvironmentCreated;

    /**
     * Listen for User Environment updates
     */
    private UserEnvironment userEnvironmentUpdated;

    /**
     * Listen for User Environment deletion
     */
    private UserEnvironment userEnvironmentDeleted;

    /**
     * Listen for User Environment DeleteMany
     */
    private Integer userEnvironmentDeleteMany;

    /**
     * Listen for User History Creation
     */
    private UserHistory userHistoryCreated;

    /**
     * Listen for User History update
     */
    private UserHistory userHistoryUpdated;

    /**
     * Listen for User History deletion
     */
    private UserHistory userHistoryDeleted;

    /**
     * Listen for User History deleted many
     */
    private UserHistoryDeletedManyData userHistoryDeletedMany;

    /**
     * Listen for User Request Creation
     */
    private UserRequest userRequestCreated;

    /**
     * Listen for User Request Update
     */
    private UserRequest userRequestUpdated;

    /**
     * Listen for User Request Deletion
     */
    private UserRequest userRequestDeleted;

    /**
     * Listen for User Request Moved
     */
    private UserRequestReorderData userRequestMoved;

    /**
     * Listen for user setting creation
     */
    private UserSettings userSettingsCreated;

    /**
     * Listen for user setting updates
     */
    private UserSettings userSettingsUpdated;

    public Subscription build() {
                  Subscription result = new Subscription();
                      result.userInvited = this.userInvited;
          result.myShortcodesCreated = this.myShortcodesCreated;
          result.myShortcodesUpdated = this.myShortcodesUpdated;
          result.myShortcodesRevoked = this.myShortcodesRevoked;
          result.teamMemberAdded = this.teamMemberAdded;
          result.teamMemberUpdated = this.teamMemberUpdated;
          result.teamMemberRemoved = this.teamMemberRemoved;
          result.teamCollectionAdded = this.teamCollectionAdded;
          result.teamCollectionUpdated = this.teamCollectionUpdated;
          result.teamCollectionRemoved = this.teamCollectionRemoved;
          result.teamCollectionMoved = this.teamCollectionMoved;
          result.collectionOrderUpdated = this.collectionOrderUpdated;
          result.teamEnvironmentUpdated = this.teamEnvironmentUpdated;
          result.teamEnvironmentCreated = this.teamEnvironmentCreated;
          result.teamEnvironmentDeleted = this.teamEnvironmentDeleted;
          result.teamInvitationAdded = this.teamInvitationAdded;
          result.teamInvitationRemoved = this.teamInvitationRemoved;
          result.teamRequestAdded = this.teamRequestAdded;
          result.teamRequestUpdated = this.teamRequestUpdated;
          result.teamRequestDeleted = this.teamRequestDeleted;
          result.requestOrderUpdated = this.requestOrderUpdated;
          result.requestMoved = this.requestMoved;
          result.userUpdated = this.userUpdated;
          result.userDeleted = this.userDeleted;
          result.userCollectionCreated = this.userCollectionCreated;
          result.userCollectionUpdated = this.userCollectionUpdated;
          result.userCollectionRemoved = this.userCollectionRemoved;
          result.userCollectionMoved = this.userCollectionMoved;
          result.userCollectionOrderUpdated = this.userCollectionOrderUpdated;
          result.userEnvironmentCreated = this.userEnvironmentCreated;
          result.userEnvironmentUpdated = this.userEnvironmentUpdated;
          result.userEnvironmentDeleted = this.userEnvironmentDeleted;
          result.userEnvironmentDeleteMany = this.userEnvironmentDeleteMany;
          result.userHistoryCreated = this.userHistoryCreated;
          result.userHistoryUpdated = this.userHistoryUpdated;
          result.userHistoryDeleted = this.userHistoryDeleted;
          result.userHistoryDeletedMany = this.userHistoryDeletedMany;
          result.userRequestCreated = this.userRequestCreated;
          result.userRequestUpdated = this.userRequestUpdated;
          result.userRequestDeleted = this.userRequestDeleted;
          result.userRequestMoved = this.userRequestMoved;
          result.userSettingsCreated = this.userSettingsCreated;
          result.userSettingsUpdated = this.userSettingsUpdated;
                      return result;
    }

    /**
     * Listen for User Invitation
     */
    public Subscription.Builder userInvited(
        InvitedUser userInvited) {
      this.userInvited = userInvited;
      return this;
    }

    /**
     * Listen for shortcode creation
     */
    public Subscription.Builder myShortcodesCreated(
        Shortcode myShortcodesCreated) {
      this.myShortcodesCreated = myShortcodesCreated;
      return this;
    }

    /**
     * Listen for Shortcode updates
     */
    public Subscription.Builder myShortcodesUpdated(
        Shortcode myShortcodesUpdated) {
      this.myShortcodesUpdated = myShortcodesUpdated;
      return this;
    }

    /**
     * Listen for shortcode deletion
     */
    public Subscription.Builder myShortcodesRevoked(
        Shortcode myShortcodesRevoked) {
      this.myShortcodesRevoked = myShortcodesRevoked;
      return this;
    }

    /**
     * Listen to when a new team member being added to the team. The emitted value is the new team member added.
     */
    public Subscription.Builder teamMemberAdded(
        TeamMember teamMemberAdded) {
      this.teamMemberAdded = teamMemberAdded;
      return this;
    }

    /**
     * Listen to when a team member status has been updated. The emitted value is the new team member status
     */
    public Subscription.Builder teamMemberUpdated(
        TeamMember teamMemberUpdated) {
      this.teamMemberUpdated = teamMemberUpdated;
      return this;
    }

    /**
     * Listen to when a team member has been removed. The emitted value is the uid of the user removed
     */
    public Subscription.Builder teamMemberRemoved(
        String teamMemberRemoved) {
      this.teamMemberRemoved = teamMemberRemoved;
      return this;
    }

    /**
     * Listen to when a collection has been added to a team. The emitted value is the team added
     */
    public Subscription.Builder teamCollectionAdded(
        TeamCollection teamCollectionAdded) {
      this.teamCollectionAdded = teamCollectionAdded;
      return this;
    }

    /**
     * Listen to when a collection has been updated.
     */
    public Subscription.Builder teamCollectionUpdated(
        TeamCollection teamCollectionUpdated) {
      this.teamCollectionUpdated = teamCollectionUpdated;
      return this;
    }

    /**
     * Listen to when a collection has been removed
     */
    public Subscription.Builder teamCollectionRemoved(
        String teamCollectionRemoved) {
      this.teamCollectionRemoved = teamCollectionRemoved;
      return this;
    }

    /**
     * Listen to when a collection has been moved
     */
    public Subscription.Builder teamCollectionMoved(
        TeamCollection teamCollectionMoved) {
      this.teamCollectionMoved = teamCollectionMoved;
      return this;
    }

    /**
     * Listen to when a collections position has changed
     */
    public Subscription.Builder collectionOrderUpdated(
        CollectionReorderData collectionOrderUpdated) {
      this.collectionOrderUpdated = collectionOrderUpdated;
      return this;
    }

    /**
     * Listen for Team Environment Updates
     */
    public Subscription.Builder teamEnvironmentUpdated(
        TeamEnvironment teamEnvironmentUpdated) {
      this.teamEnvironmentUpdated = teamEnvironmentUpdated;
      return this;
    }

    /**
     * Listen for Team Environment Creation Messages
     */
    public Subscription.Builder teamEnvironmentCreated(
        TeamEnvironment teamEnvironmentCreated) {
      this.teamEnvironmentCreated = teamEnvironmentCreated;
      return this;
    }

    /**
     * Listen for Team Environment Deletion Messages
     */
    public Subscription.Builder teamEnvironmentDeleted(
        TeamEnvironment teamEnvironmentDeleted) {
      this.teamEnvironmentDeleted = teamEnvironmentDeleted;
      return this;
    }

    /**
     * Listens to when a Team Invitation is added
     */
    public Subscription.Builder teamInvitationAdded(
        TeamInvitation teamInvitationAdded) {
      this.teamInvitationAdded = teamInvitationAdded;
      return this;
    }

    /**
     * Listens to when a Team Invitation is removed
     */
    public Subscription.Builder teamInvitationRemoved(
        String teamInvitationRemoved) {
      this.teamInvitationRemoved = teamInvitationRemoved;
      return this;
    }

    /**
     * Emits when a new request is added to a team
     */
    public Subscription.Builder teamRequestAdded(
        TeamRequest teamRequestAdded) {
      this.teamRequestAdded = teamRequestAdded;
      return this;
    }

    /**
     * Emitted when a request has been updated
     */
    public Subscription.Builder teamRequestUpdated(
        TeamRequest teamRequestUpdated) {
      this.teamRequestUpdated = teamRequestUpdated;
      return this;
    }

    /**
     * Emitted when a request has been deleted. Only the id of the request is emitted.
     */
    public Subscription.Builder teamRequestDeleted(
        String teamRequestDeleted) {
      this.teamRequestDeleted = teamRequestDeleted;
      return this;
    }

    /**
     * Emitted when a requests position has been changed in its collection
     */
    public Subscription.Builder requestOrderUpdated(
        RequestReorderData requestOrderUpdated) {
      this.requestOrderUpdated = requestOrderUpdated;
      return this;
    }

    /**
     * Emitted when a request has been moved from one collection into another
     */
    public Subscription.Builder requestMoved(
        TeamRequest requestMoved) {
      this.requestMoved = requestMoved;
      return this;
    }

    /**
     * Listen for user updates
     */
    public Subscription.Builder userUpdated(
        User userUpdated) {
      this.userUpdated = userUpdated;
      return this;
    }

    /**
     * Listen for user deletion
     */
    public Subscription.Builder userDeleted(
        User userDeleted) {
      this.userDeleted = userDeleted;
      return this;
    }

    /**
     * Listen for User Collection Creation
     */
    public Subscription.Builder userCollectionCreated(
        UserCollection userCollectionCreated) {
      this.userCollectionCreated = userCollectionCreated;
      return this;
    }

    /**
     * Listen to when a User Collection has been updated.
     */
    public Subscription.Builder userCollectionUpdated(
        UserCollection userCollectionUpdated) {
      this.userCollectionUpdated = userCollectionUpdated;
      return this;
    }

    /**
     * Listen to when a User Collection has been deleted
     */
    public Subscription.Builder userCollectionRemoved(
        UserCollectionRemovedData userCollectionRemoved) {
      this.userCollectionRemoved = userCollectionRemoved;
      return this;
    }

    /**
     * Listen to when a User Collection has been moved
     */
    public Subscription.Builder userCollectionMoved(
        UserCollection userCollectionMoved) {
      this.userCollectionMoved = userCollectionMoved;
      return this;
    }

    /**
     * Listen to when a User Collections position has changed
     */
    public Subscription.Builder userCollectionOrderUpdated(
        UserCollectionReorderData userCollectionOrderUpdated) {
      this.userCollectionOrderUpdated = userCollectionOrderUpdated;
      return this;
    }

    /**
     * Listen for User Environment Creation
     */
    public Subscription.Builder userEnvironmentCreated(
        UserEnvironment userEnvironmentCreated) {
      this.userEnvironmentCreated = userEnvironmentCreated;
      return this;
    }

    /**
     * Listen for User Environment updates
     */
    public Subscription.Builder userEnvironmentUpdated(
        UserEnvironment userEnvironmentUpdated) {
      this.userEnvironmentUpdated = userEnvironmentUpdated;
      return this;
    }

    /**
     * Listen for User Environment deletion
     */
    public Subscription.Builder userEnvironmentDeleted(
        UserEnvironment userEnvironmentDeleted) {
      this.userEnvironmentDeleted = userEnvironmentDeleted;
      return this;
    }

    /**
     * Listen for User Environment DeleteMany
     */
    public Subscription.Builder userEnvironmentDeleteMany(
        Integer userEnvironmentDeleteMany) {
      this.userEnvironmentDeleteMany = userEnvironmentDeleteMany;
      return this;
    }

    /**
     * Listen for User History Creation
     */
    public Subscription.Builder userHistoryCreated(
        UserHistory userHistoryCreated) {
      this.userHistoryCreated = userHistoryCreated;
      return this;
    }

    /**
     * Listen for User History update
     */
    public Subscription.Builder userHistoryUpdated(
        UserHistory userHistoryUpdated) {
      this.userHistoryUpdated = userHistoryUpdated;
      return this;
    }

    /**
     * Listen for User History deletion
     */
    public Subscription.Builder userHistoryDeleted(
        UserHistory userHistoryDeleted) {
      this.userHistoryDeleted = userHistoryDeleted;
      return this;
    }

    /**
     * Listen for User History deleted many
     */
    public Subscription.Builder userHistoryDeletedMany(
        UserHistoryDeletedManyData userHistoryDeletedMany) {
      this.userHistoryDeletedMany = userHistoryDeletedMany;
      return this;
    }

    /**
     * Listen for User Request Creation
     */
    public Subscription.Builder userRequestCreated(
        UserRequest userRequestCreated) {
      this.userRequestCreated = userRequestCreated;
      return this;
    }

    /**
     * Listen for User Request Update
     */
    public Subscription.Builder userRequestUpdated(
        UserRequest userRequestUpdated) {
      this.userRequestUpdated = userRequestUpdated;
      return this;
    }

    /**
     * Listen for User Request Deletion
     */
    public Subscription.Builder userRequestDeleted(
        UserRequest userRequestDeleted) {
      this.userRequestDeleted = userRequestDeleted;
      return this;
    }

    /**
     * Listen for User Request Moved
     */
    public Subscription.Builder userRequestMoved(
        UserRequestReorderData userRequestMoved) {
      this.userRequestMoved = userRequestMoved;
      return this;
    }

    /**
     * Listen for user setting creation
     */
    public Subscription.Builder userSettingsCreated(
        UserSettings userSettingsCreated) {
      this.userSettingsCreated = userSettingsCreated;
      return this;
    }

    /**
     * Listen for user setting updates
     */
    public Subscription.Builder userSettingsUpdated(
        UserSettings userSettingsUpdated) {
      this.userSettingsUpdated = userSettingsUpdated;
      return this;
    }
  }
}
