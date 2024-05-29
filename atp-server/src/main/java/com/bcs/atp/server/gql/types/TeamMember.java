package com.bcs.atp.server.gql.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class TeamMember {
  /**
   * Membership ID of the Team Member
   */
  private String membershipID;

  /**
   * Role of the given team member in the given team
   */
  private TeamMemberRole role;

  private User user;

  public TeamMember() {
  }

  public TeamMember(String membershipID, TeamMemberRole role, User user) {
    this.membershipID = membershipID;
    this.role = role;
    this.user = user;
  }

  /**
   * Membership ID of the Team Member
   */
  public String getMembershipID() {
    return membershipID;
  }

  public void setMembershipID(String membershipID) {
    this.membershipID = membershipID;
  }

  /**
   * Role of the given team member in the given team
   */
  public TeamMemberRole getRole() {
    return role;
  }

  public void setRole(TeamMemberRole role) {
    this.role = role;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  @Override
  public String toString() {
    return "TeamMember{" + "membershipID='" + membershipID + "'," +"role='" + role + "'," +"user='" + user + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeamMember that = (TeamMember) o;
        return java.util.Objects.equals(membershipID, that.membershipID) &&
                            java.util.Objects.equals(role, that.role) &&
                            java.util.Objects.equals(user, that.user);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(membershipID, role, user);
  }

  public static TeamMember.Builder newBuilder(
      ) {
    return new Builder();
  }

  public static class Builder {
    /**
     * Membership ID of the Team Member
     */
    private String membershipID;

    /**
     * Role of the given team member in the given team
     */
    private TeamMemberRole role;

    private User user;

    public TeamMember build() {
                  TeamMember result = new TeamMember();
                      result.membershipID = this.membershipID;
          result.role = this.role;
          result.user = this.user;
                      return result;
    }

    /**
     * Membership ID of the Team Member
     */
    public TeamMember.Builder membershipID(
        String membershipID) {
      this.membershipID = membershipID;
      return this;
    }

    /**
     * Role of the given team member in the given team
     */
    public TeamMember.Builder role(
        TeamMemberRole role) {
      this.role = role;
      return this;
    }

    public TeamMember.Builder user(User user) {
      this.user = user;
      return this;
    }
  }
}
