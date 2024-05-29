package com.bcs.atp.server.gql.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;

public class Infra {
  /**
   * Admin who executed the action
   */
  private Admin executedBy;

  /**
   * Returns a list of all admin users in infra
   */
  private List<User> admins;

  /**
   * Returns a user info by UID
   */
  private User userInfo;

  /**
   * Returns a list of all the users in infra
   */
  private List<User> allUsers;

  /**
   * Returns a list of all the users in infra
   */
  private List<User> allUsersV2;

  /**
   * Returns a list of all the invited users
   */
  private List<InvitedUser> invitedUsers;

  /**
   * Returns a list of all the teams in the infra
   */
  private List<Team> allTeams;

  /**
   * Returns a team info by ID when requested by Admin
   */
  private Team teamInfo;

  /**
   * Return count of all the members in a team
   */
  private Integer membersCountInTeam;

  /**
   * Return count of all the stored collections in a team
   */
  private Integer collectionCountInTeam;

  /**
   * Return count of all the stored requests in a team
   */
  private Integer requestCountInTeam;

  /**
   * Return count of all the stored environments in a team
   */
  private Integer environmentCountInTeam;

  /**
   * Return all the pending invitations in a team
   */
  private List<TeamInvitation> pendingInvitationCountInTeam;

  /**
   * Return total number of Users in organization
   */
  private Integer usersCount;

  /**
   * Return total number of Teams in organization
   */
  private Integer teamsCount;

  /**
   * Return total number of Team Collections in organization
   */
  private Integer teamCollectionsCount;

  /**
   * Return total number of Team Requests in organization
   */
  private Integer teamRequestsCount;

  /**
   * Returns a list of all the shortcodes in the infra
   */
  private List<ShortcodeWithUserEmail> allShortcodes;

  public Infra() {
  }

  public Infra(Admin executedBy, List<User> admins, User userInfo, List<User> allUsers,
      List<User> allUsersV2, List<InvitedUser> invitedUsers, List<Team> allTeams, Team teamInfo,
      Integer membersCountInTeam, Integer collectionCountInTeam, Integer requestCountInTeam,
      Integer environmentCountInTeam, List<TeamInvitation> pendingInvitationCountInTeam,
      Integer usersCount, Integer teamsCount, Integer teamCollectionsCount,
      Integer teamRequestsCount, List<ShortcodeWithUserEmail> allShortcodes) {
    this.executedBy = executedBy;
    this.admins = admins;
    this.userInfo = userInfo;
    this.allUsers = allUsers;
    this.allUsersV2 = allUsersV2;
    this.invitedUsers = invitedUsers;
    this.allTeams = allTeams;
    this.teamInfo = teamInfo;
    this.membersCountInTeam = membersCountInTeam;
    this.collectionCountInTeam = collectionCountInTeam;
    this.requestCountInTeam = requestCountInTeam;
    this.environmentCountInTeam = environmentCountInTeam;
    this.pendingInvitationCountInTeam = pendingInvitationCountInTeam;
    this.usersCount = usersCount;
    this.teamsCount = teamsCount;
    this.teamCollectionsCount = teamCollectionsCount;
    this.teamRequestsCount = teamRequestsCount;
    this.allShortcodes = allShortcodes;
  }

  /**
   * Admin who executed the action
   */
  public Admin getExecutedBy() {
    return executedBy;
  }

  public void setExecutedBy(Admin executedBy) {
    this.executedBy = executedBy;
  }

  /**
   * Returns a list of all admin users in infra
   */
  public List<User> getAdmins() {
    return admins;
  }

  public void setAdmins(List<User> admins) {
    this.admins = admins;
  }

  /**
   * Returns a user info by UID
   */
  public User getUserInfo() {
    return userInfo;
  }

  public void setUserInfo(User userInfo) {
    this.userInfo = userInfo;
  }

  /**
   * Returns a list of all the users in infra
   */
  public List<User> getAllUsers() {
    return allUsers;
  }

  public void setAllUsers(List<User> allUsers) {
    this.allUsers = allUsers;
  }

  /**
   * Returns a list of all the users in infra
   */
  public List<User> getAllUsersV2() {
    return allUsersV2;
  }

  public void setAllUsersV2(List<User> allUsersV2) {
    this.allUsersV2 = allUsersV2;
  }

  /**
   * Returns a list of all the invited users
   */
  public List<InvitedUser> getInvitedUsers() {
    return invitedUsers;
  }

  public void setInvitedUsers(List<InvitedUser> invitedUsers) {
    this.invitedUsers = invitedUsers;
  }

  /**
   * Returns a list of all the teams in the infra
   */
  public List<Team> getAllTeams() {
    return allTeams;
  }

  public void setAllTeams(List<Team> allTeams) {
    this.allTeams = allTeams;
  }

  /**
   * Returns a team info by ID when requested by Admin
   */
  public Team getTeamInfo() {
    return teamInfo;
  }

  public void setTeamInfo(Team teamInfo) {
    this.teamInfo = teamInfo;
  }

  /**
   * Return count of all the members in a team
   */
  public Integer getMembersCountInTeam() {
    return membersCountInTeam;
  }

  public void setMembersCountInTeam(Integer membersCountInTeam) {
    this.membersCountInTeam = membersCountInTeam;
  }

  /**
   * Return count of all the stored collections in a team
   */
  public Integer getCollectionCountInTeam() {
    return collectionCountInTeam;
  }

  public void setCollectionCountInTeam(Integer collectionCountInTeam) {
    this.collectionCountInTeam = collectionCountInTeam;
  }

  /**
   * Return count of all the stored requests in a team
   */
  public Integer getRequestCountInTeam() {
    return requestCountInTeam;
  }

  public void setRequestCountInTeam(Integer requestCountInTeam) {
    this.requestCountInTeam = requestCountInTeam;
  }

  /**
   * Return count of all the stored environments in a team
   */
  public Integer getEnvironmentCountInTeam() {
    return environmentCountInTeam;
  }

  public void setEnvironmentCountInTeam(Integer environmentCountInTeam) {
    this.environmentCountInTeam = environmentCountInTeam;
  }

  /**
   * Return all the pending invitations in a team
   */
  public List<TeamInvitation> getPendingInvitationCountInTeam() {
    return pendingInvitationCountInTeam;
  }

  public void setPendingInvitationCountInTeam(List<TeamInvitation> pendingInvitationCountInTeam) {
    this.pendingInvitationCountInTeam = pendingInvitationCountInTeam;
  }

  /**
   * Return total number of Users in organization
   */
  public Integer getUsersCount() {
    return usersCount;
  }

  public void setUsersCount(Integer usersCount) {
    this.usersCount = usersCount;
  }

  /**
   * Return total number of Teams in organization
   */
  public Integer getTeamsCount() {
    return teamsCount;
  }

  public void setTeamsCount(Integer teamsCount) {
    this.teamsCount = teamsCount;
  }

  /**
   * Return total number of Team Collections in organization
   */
  public Integer getTeamCollectionsCount() {
    return teamCollectionsCount;
  }

  public void setTeamCollectionsCount(Integer teamCollectionsCount) {
    this.teamCollectionsCount = teamCollectionsCount;
  }

  /**
   * Return total number of Team Requests in organization
   */
  public Integer getTeamRequestsCount() {
    return teamRequestsCount;
  }

  public void setTeamRequestsCount(Integer teamRequestsCount) {
    this.teamRequestsCount = teamRequestsCount;
  }

  /**
   * Returns a list of all the shortcodes in the infra
   */
  public List<ShortcodeWithUserEmail> getAllShortcodes() {
    return allShortcodes;
  }

  public void setAllShortcodes(List<ShortcodeWithUserEmail> allShortcodes) {
    this.allShortcodes = allShortcodes;
  }

  @Override
  public String toString() {
    return "Infra{" + "executedBy='" + executedBy + "'," +"admins='" + admins + "'," +"userInfo='" + userInfo + "'," +"allUsers='" + allUsers + "'," +"allUsersV2='" + allUsersV2 + "'," +"invitedUsers='" + invitedUsers + "'," +"allTeams='" + allTeams + "'," +"teamInfo='" + teamInfo + "'," +"membersCountInTeam='" + membersCountInTeam + "'," +"collectionCountInTeam='" + collectionCountInTeam + "'," +"requestCountInTeam='" + requestCountInTeam + "'," +"environmentCountInTeam='" + environmentCountInTeam + "'," +"pendingInvitationCountInTeam='" + pendingInvitationCountInTeam + "'," +"usersCount='" + usersCount + "'," +"teamsCount='" + teamsCount + "'," +"teamCollectionsCount='" + teamCollectionsCount + "'," +"teamRequestsCount='" + teamRequestsCount + "'," +"allShortcodes='" + allShortcodes + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Infra that = (Infra) o;
        return java.util.Objects.equals(executedBy, that.executedBy) &&
                            java.util.Objects.equals(admins, that.admins) &&
                            java.util.Objects.equals(userInfo, that.userInfo) &&
                            java.util.Objects.equals(allUsers, that.allUsers) &&
                            java.util.Objects.equals(allUsersV2, that.allUsersV2) &&
                            java.util.Objects.equals(invitedUsers, that.invitedUsers) &&
                            java.util.Objects.equals(allTeams, that.allTeams) &&
                            java.util.Objects.equals(teamInfo, that.teamInfo) &&
                            java.util.Objects.equals(membersCountInTeam, that.membersCountInTeam) &&
                            java.util.Objects.equals(collectionCountInTeam, that.collectionCountInTeam) &&
                            java.util.Objects.equals(requestCountInTeam, that.requestCountInTeam) &&
                            java.util.Objects.equals(environmentCountInTeam, that.environmentCountInTeam) &&
                            java.util.Objects.equals(pendingInvitationCountInTeam, that.pendingInvitationCountInTeam) &&
                            java.util.Objects.equals(usersCount, that.usersCount) &&
                            java.util.Objects.equals(teamsCount, that.teamsCount) &&
                            java.util.Objects.equals(teamCollectionsCount, that.teamCollectionsCount) &&
                            java.util.Objects.equals(teamRequestsCount, that.teamRequestsCount) &&
                            java.util.Objects.equals(allShortcodes, that.allShortcodes);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(executedBy, admins, userInfo, allUsers, allUsersV2, invitedUsers, allTeams, teamInfo, membersCountInTeam, collectionCountInTeam, requestCountInTeam, environmentCountInTeam, pendingInvitationCountInTeam, usersCount, teamsCount, teamCollectionsCount, teamRequestsCount, allShortcodes);
  }

  public static Infra.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * Admin who executed the action
     */
    private Admin executedBy;

    /**
     * Returns a list of all admin users in infra
     */
    private List<User> admins;

    /**
     * Returns a user info by UID
     */
    private User userInfo;

    /**
     * Returns a list of all the users in infra
     */
    private List<User> allUsers;

    /**
     * Returns a list of all the users in infra
     */
    private List<User> allUsersV2;

    /**
     * Returns a list of all the invited users
     */
    private List<InvitedUser> invitedUsers;

    /**
     * Returns a list of all the teams in the infra
     */
    private List<Team> allTeams;

    /**
     * Returns a team info by ID when requested by Admin
     */
    private Team teamInfo;

    /**
     * Return count of all the members in a team
     */
    private Integer membersCountInTeam;

    /**
     * Return count of all the stored collections in a team
     */
    private Integer collectionCountInTeam;

    /**
     * Return count of all the stored requests in a team
     */
    private Integer requestCountInTeam;

    /**
     * Return count of all the stored environments in a team
     */
    private Integer environmentCountInTeam;

    /**
     * Return all the pending invitations in a team
     */
    private List<TeamInvitation> pendingInvitationCountInTeam;

    /**
     * Return total number of Users in organization
     */
    private Integer usersCount;

    /**
     * Return total number of Teams in organization
     */
    private Integer teamsCount;

    /**
     * Return total number of Team Collections in organization
     */
    private Integer teamCollectionsCount;

    /**
     * Return total number of Team Requests in organization
     */
    private Integer teamRequestsCount;

    /**
     * Returns a list of all the shortcodes in the infra
     */
    private List<ShortcodeWithUserEmail> allShortcodes;

    public Infra build() {
                  Infra result = new Infra();
                      result.executedBy = this.executedBy;
          result.admins = this.admins;
          result.userInfo = this.userInfo;
          result.allUsers = this.allUsers;
          result.allUsersV2 = this.allUsersV2;
          result.invitedUsers = this.invitedUsers;
          result.allTeams = this.allTeams;
          result.teamInfo = this.teamInfo;
          result.membersCountInTeam = this.membersCountInTeam;
          result.collectionCountInTeam = this.collectionCountInTeam;
          result.requestCountInTeam = this.requestCountInTeam;
          result.environmentCountInTeam = this.environmentCountInTeam;
          result.pendingInvitationCountInTeam = this.pendingInvitationCountInTeam;
          result.usersCount = this.usersCount;
          result.teamsCount = this.teamsCount;
          result.teamCollectionsCount = this.teamCollectionsCount;
          result.teamRequestsCount = this.teamRequestsCount;
          result.allShortcodes = this.allShortcodes;
                      return result;
    }

    /**
     * Admin who executed the action
     */
    public Infra.Builder executedBy(
        Admin executedBy) {
      this.executedBy = executedBy;
      return this;
    }

    /**
     * Returns a list of all admin users in infra
     */
    public Infra.Builder admins(
        List<User> admins) {
      this.admins = admins;
      return this;
    }

    /**
     * Returns a user info by UID
     */
    public Infra.Builder userInfo(
        User userInfo) {
      this.userInfo = userInfo;
      return this;
    }

    /**
     * Returns a list of all the users in infra
     */
    public Infra.Builder allUsers(
        List<User> allUsers) {
      this.allUsers = allUsers;
      return this;
    }

    /**
     * Returns a list of all the users in infra
     */
    public Infra.Builder allUsersV2(
        List<User> allUsersV2) {
      this.allUsersV2 = allUsersV2;
      return this;
    }

    /**
     * Returns a list of all the invited users
     */
    public Infra.Builder invitedUsers(
        List<InvitedUser> invitedUsers) {
      this.invitedUsers = invitedUsers;
      return this;
    }

    /**
     * Returns a list of all the teams in the infra
     */
    public Infra.Builder allTeams(
        List<Team> allTeams) {
      this.allTeams = allTeams;
      return this;
    }

    /**
     * Returns a team info by ID when requested by Admin
     */
    public Infra.Builder teamInfo(
        Team teamInfo) {
      this.teamInfo = teamInfo;
      return this;
    }

    /**
     * Return count of all the members in a team
     */
    public Infra.Builder membersCountInTeam(
        Integer membersCountInTeam) {
      this.membersCountInTeam = membersCountInTeam;
      return this;
    }

    /**
     * Return count of all the stored collections in a team
     */
    public Infra.Builder collectionCountInTeam(
        Integer collectionCountInTeam) {
      this.collectionCountInTeam = collectionCountInTeam;
      return this;
    }

    /**
     * Return count of all the stored requests in a team
     */
    public Infra.Builder requestCountInTeam(
        Integer requestCountInTeam) {
      this.requestCountInTeam = requestCountInTeam;
      return this;
    }

    /**
     * Return count of all the stored environments in a team
     */
    public Infra.Builder environmentCountInTeam(
        Integer environmentCountInTeam) {
      this.environmentCountInTeam = environmentCountInTeam;
      return this;
    }

    /**
     * Return all the pending invitations in a team
     */
    public Infra.Builder pendingInvitationCountInTeam(
        List<TeamInvitation> pendingInvitationCountInTeam) {
      this.pendingInvitationCountInTeam = pendingInvitationCountInTeam;
      return this;
    }

    /**
     * Return total number of Users in organization
     */
    public Infra.Builder usersCount(
        Integer usersCount) {
      this.usersCount = usersCount;
      return this;
    }

    /**
     * Return total number of Teams in organization
     */
    public Infra.Builder teamsCount(
        Integer teamsCount) {
      this.teamsCount = teamsCount;
      return this;
    }

    /**
     * Return total number of Team Collections in organization
     */
    public Infra.Builder teamCollectionsCount(
        Integer teamCollectionsCount) {
      this.teamCollectionsCount = teamCollectionsCount;
      return this;
    }

    /**
     * Return total number of Team Requests in organization
     */
    public Infra.Builder teamRequestsCount(
        Integer teamRequestsCount) {
      this.teamRequestsCount = teamRequestsCount;
      return this;
    }

    /**
     * Returns a list of all the shortcodes in the infra
     */
    public Infra.Builder allShortcodes(
        List<ShortcodeWithUserEmail> allShortcodes) {
      this.allShortcodes = allShortcodes;
      return this;
    }
  }
}
