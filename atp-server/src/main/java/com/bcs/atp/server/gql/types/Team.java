package com.bcs.atp.server.gql.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;

public class Team {
  /**
   * ID of the team
   */
  private String id;

  /**
   * Displayed name of the team
   */
  private String name;

  /**
   * Returns the list of members of a team
   */
  private List<TeamMember> members;

  /**
   * Returns the list of members of a team
   */
  private List<TeamMember> teamMembers;

  /**
   * The role of the current user in the team
   */
  private TeamMemberRole myRole;

  /**
   * The number of users with the OWNER role in the team
   */
  private Integer ownersCount;

  /**
   * The number of users with the EDITOR role in the team
   */
  private Integer editorsCount;

  /**
   * The number of users with the VIEWER role in the team
   */
  private Integer viewersCount;

  /**
   * Returns all Team Environments for the given Team
   */
  private List<TeamEnvironment> teamEnvironments;

  /**
   * Get all the active invites in the team
   */
  private List<TeamInvitation> teamInvitations;

  public Team() {
  }

  public Team(String id, String name, List<TeamMember> members, List<TeamMember> teamMembers,
      TeamMemberRole myRole, Integer ownersCount, Integer editorsCount, Integer viewersCount,
      List<TeamEnvironment> teamEnvironments, List<TeamInvitation> teamInvitations) {
    this.id = id;
    this.name = name;
    this.members = members;
    this.teamMembers = teamMembers;
    this.myRole = myRole;
    this.ownersCount = ownersCount;
    this.editorsCount = editorsCount;
    this.viewersCount = viewersCount;
    this.teamEnvironments = teamEnvironments;
    this.teamInvitations = teamInvitations;
  }

  /**
   * ID of the team
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Displayed name of the team
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Returns the list of members of a team
   */
  public List<TeamMember> getMembers() {
    return members;
  }

  public void setMembers(List<TeamMember> members) {
    this.members = members;
  }

  /**
   * Returns the list of members of a team
   */
  public List<TeamMember> getTeamMembers() {
    return teamMembers;
  }

  public void setTeamMembers(List<TeamMember> teamMembers) {
    this.teamMembers = teamMembers;
  }

  /**
   * The role of the current user in the team
   */
  public TeamMemberRole getMyRole() {
    return myRole;
  }

  public void setMyRole(TeamMemberRole myRole) {
    this.myRole = myRole;
  }

  /**
   * The number of users with the OWNER role in the team
   */
  public Integer getOwnersCount() {
    return ownersCount;
  }

  public void setOwnersCount(Integer ownersCount) {
    this.ownersCount = ownersCount;
  }

  /**
   * The number of users with the EDITOR role in the team
   */
  public Integer getEditorsCount() {
    return editorsCount;
  }

  public void setEditorsCount(Integer editorsCount) {
    this.editorsCount = editorsCount;
  }

  /**
   * The number of users with the VIEWER role in the team
   */
  public Integer getViewersCount() {
    return viewersCount;
  }

  public void setViewersCount(Integer viewersCount) {
    this.viewersCount = viewersCount;
  }

  /**
   * Returns all Team Environments for the given Team
   */
  public List<TeamEnvironment> getTeamEnvironments() {
    return teamEnvironments;
  }

  public void setTeamEnvironments(List<TeamEnvironment> teamEnvironments) {
    this.teamEnvironments = teamEnvironments;
  }

  /**
   * Get all the active invites in the team
   */
  public List<TeamInvitation> getTeamInvitations() {
    return teamInvitations;
  }

  public void setTeamInvitations(List<TeamInvitation> teamInvitations) {
    this.teamInvitations = teamInvitations;
  }

  @Override
  public String toString() {
    return "Team{" + "id='" + id + "'," +"name='" + name + "'," +"members='" + members + "'," +"teamMembers='" + teamMembers + "'," +"myRole='" + myRole + "'," +"ownersCount='" + ownersCount + "'," +"editorsCount='" + editorsCount + "'," +"viewersCount='" + viewersCount + "'," +"teamEnvironments='" + teamEnvironments + "'," +"teamInvitations='" + teamInvitations + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Team that = (Team) o;
        return java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(name, that.name) &&
                            java.util.Objects.equals(members, that.members) &&
                            java.util.Objects.equals(teamMembers, that.teamMembers) &&
                            java.util.Objects.equals(myRole, that.myRole) &&
                            java.util.Objects.equals(ownersCount, that.ownersCount) &&
                            java.util.Objects.equals(editorsCount, that.editorsCount) &&
                            java.util.Objects.equals(viewersCount, that.viewersCount) &&
                            java.util.Objects.equals(teamEnvironments, that.teamEnvironments) &&
                            java.util.Objects.equals(teamInvitations, that.teamInvitations);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, name, members, teamMembers, myRole, ownersCount, editorsCount, viewersCount, teamEnvironments, teamInvitations);
  }

  public static Team.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * ID of the team
     */
    private String id;

    /**
     * Displayed name of the team
     */
    private String name;

    /**
     * Returns the list of members of a team
     */
    private List<TeamMember> members;

    /**
     * Returns the list of members of a team
     */
    private List<TeamMember> teamMembers;

    /**
     * The role of the current user in the team
     */
    private TeamMemberRole myRole;

    /**
     * The number of users with the OWNER role in the team
     */
    private Integer ownersCount;

    /**
     * The number of users with the EDITOR role in the team
     */
    private Integer editorsCount;

    /**
     * The number of users with the VIEWER role in the team
     */
    private Integer viewersCount;

    /**
     * Returns all Team Environments for the given Team
     */
    private List<TeamEnvironment> teamEnvironments;

    /**
     * Get all the active invites in the team
     */
    private List<TeamInvitation> teamInvitations;

    public Team build() {
                  Team result = new Team();
                      result.id = this.id;
          result.name = this.name;
          result.members = this.members;
          result.teamMembers = this.teamMembers;
          result.myRole = this.myRole;
          result.ownersCount = this.ownersCount;
          result.editorsCount = this.editorsCount;
          result.viewersCount = this.viewersCount;
          result.teamEnvironments = this.teamEnvironments;
          result.teamInvitations = this.teamInvitations;
                      return result;
    }

    /**
     * ID of the team
     */
    public Team.Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * Displayed name of the team
     */
    public Team.Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Returns the list of members of a team
     */
    public Team.Builder members(
        List<TeamMember> members) {
      this.members = members;
      return this;
    }

    /**
     * Returns the list of members of a team
     */
    public Team.Builder teamMembers(
        List<TeamMember> teamMembers) {
      this.teamMembers = teamMembers;
      return this;
    }

    /**
     * The role of the current user in the team
     */
    public Team.Builder myRole(
        TeamMemberRole myRole) {
      this.myRole = myRole;
      return this;
    }

    /**
     * The number of users with the OWNER role in the team
     */
    public Team.Builder ownersCount(
        Integer ownersCount) {
      this.ownersCount = ownersCount;
      return this;
    }

    /**
     * The number of users with the EDITOR role in the team
     */
    public Team.Builder editorsCount(
        Integer editorsCount) {
      this.editorsCount = editorsCount;
      return this;
    }

    /**
     * The number of users with the VIEWER role in the team
     */
    public Team.Builder viewersCount(
        Integer viewersCount) {
      this.viewersCount = viewersCount;
      return this;
    }

    /**
     * Returns all Team Environments for the given Team
     */
    public Team.Builder teamEnvironments(
        List<TeamEnvironment> teamEnvironments) {
      this.teamEnvironments = teamEnvironments;
      return this;
    }

    /**
     * Get all the active invites in the team
     */
    public Team.Builder teamInvitations(
        List<TeamInvitation> teamInvitations) {
      this.teamInvitations = teamInvitations;
      return this;
    }
  }
}
