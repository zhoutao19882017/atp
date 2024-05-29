package com.bcs.atp.server.gql.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class TeamInvitation {
  /**
   * ID of the invite
   */
  private String id;

  /**
   * ID of the team the invite is to
   */
  private String teamID;

  /**
   * UID of the creator of the invite
   */
  private String creatorUid;

  /**
   * Email of the invitee
   */
  private String inviteeEmail;

  /**
   * The role that will be given to the invitee
   */
  private TeamMemberRole inviteeRole;

  /**
   * Get the team associated to the invite
   */
  private Team team;

  /**
   * Get the creator of the invite
   */
  private User creator;

  public TeamInvitation() {
  }

  public TeamInvitation(String id, String teamID, String creatorUid, String inviteeEmail,
      TeamMemberRole inviteeRole, Team team, User creator) {
    this.id = id;
    this.teamID = teamID;
    this.creatorUid = creatorUid;
    this.inviteeEmail = inviteeEmail;
    this.inviteeRole = inviteeRole;
    this.team = team;
    this.creator = creator;
  }

  /**
   * ID of the invite
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * ID of the team the invite is to
   */
  public String getTeamID() {
    return teamID;
  }

  public void setTeamID(String teamID) {
    this.teamID = teamID;
  }

  /**
   * UID of the creator of the invite
   */
  public String getCreatorUid() {
    return creatorUid;
  }

  public void setCreatorUid(String creatorUid) {
    this.creatorUid = creatorUid;
  }

  /**
   * Email of the invitee
   */
  public String getInviteeEmail() {
    return inviteeEmail;
  }

  public void setInviteeEmail(String inviteeEmail) {
    this.inviteeEmail = inviteeEmail;
  }

  /**
   * The role that will be given to the invitee
   */
  public TeamMemberRole getInviteeRole() {
    return inviteeRole;
  }

  public void setInviteeRole(TeamMemberRole inviteeRole) {
    this.inviteeRole = inviteeRole;
  }

  /**
   * Get the team associated to the invite
   */
  public Team getTeam() {
    return team;
  }

  public void setTeam(Team team) {
    this.team = team;
  }

  /**
   * Get the creator of the invite
   */
  public User getCreator() {
    return creator;
  }

  public void setCreator(User creator) {
    this.creator = creator;
  }

  @Override
  public String toString() {
    return "TeamInvitation{" + "id='" + id + "'," +"teamID='" + teamID + "'," +"creatorUid='" + creatorUid + "'," +"inviteeEmail='" + inviteeEmail + "'," +"inviteeRole='" + inviteeRole + "'," +"team='" + team + "'," +"creator='" + creator + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeamInvitation that = (TeamInvitation) o;
        return java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(teamID, that.teamID) &&
                            java.util.Objects.equals(creatorUid, that.creatorUid) &&
                            java.util.Objects.equals(inviteeEmail, that.inviteeEmail) &&
                            java.util.Objects.equals(inviteeRole, that.inviteeRole) &&
                            java.util.Objects.equals(team, that.team) &&
                            java.util.Objects.equals(creator, that.creator);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, teamID, creatorUid, inviteeEmail, inviteeRole, team, creator);
  }

  public static TeamInvitation.Builder newBuilder(
      ) {
    return new Builder();
  }

  public static class Builder {
    /**
     * ID of the invite
     */
    private String id;

    /**
     * ID of the team the invite is to
     */
    private String teamID;

    /**
     * UID of the creator of the invite
     */
    private String creatorUid;

    /**
     * Email of the invitee
     */
    private String inviteeEmail;

    /**
     * The role that will be given to the invitee
     */
    private TeamMemberRole inviteeRole;

    /**
     * Get the team associated to the invite
     */
    private Team team;

    /**
     * Get the creator of the invite
     */
    private User creator;

    public TeamInvitation build() {
                  TeamInvitation result = new TeamInvitation();
                      result.id = this.id;
          result.teamID = this.teamID;
          result.creatorUid = this.creatorUid;
          result.inviteeEmail = this.inviteeEmail;
          result.inviteeRole = this.inviteeRole;
          result.team = this.team;
          result.creator = this.creator;
                      return result;
    }

    /**
     * ID of the invite
     */
    public TeamInvitation.Builder id(
        String id) {
      this.id = id;
      return this;
    }

    /**
     * ID of the team the invite is to
     */
    public TeamInvitation.Builder teamID(
        String teamID) {
      this.teamID = teamID;
      return this;
    }

    /**
     * UID of the creator of the invite
     */
    public TeamInvitation.Builder creatorUid(
        String creatorUid) {
      this.creatorUid = creatorUid;
      return this;
    }

    /**
     * Email of the invitee
     */
    public TeamInvitation.Builder inviteeEmail(
        String inviteeEmail) {
      this.inviteeEmail = inviteeEmail;
      return this;
    }

    /**
     * The role that will be given to the invitee
     */
    public TeamInvitation.Builder inviteeRole(
        TeamMemberRole inviteeRole) {
      this.inviteeRole = inviteeRole;
      return this;
    }

    /**
     * Get the team associated to the invite
     */
    public TeamInvitation.Builder team(
        Team team) {
      this.team = team;
      return this;
    }

    /**
     * Get the creator of the invite
     */
    public TeamInvitation.Builder creator(
        User creator) {
      this.creator = creator;
      return this;
    }
  }
}
