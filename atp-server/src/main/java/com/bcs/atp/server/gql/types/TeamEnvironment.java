package com.bcs.atp.server.gql.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class TeamEnvironment {
  /**
   * ID of the Team Environment
   */
  private String id;

  /**
   * ID of the team this environment belongs to
   */
  private String teamID;

  /**
   * Name of the environment
   */
  private String name;

  /**
   * All variables present in the environment
   */
  private String variables;

  public TeamEnvironment() {
  }

  public TeamEnvironment(String id, String teamID, String name, String variables) {
    this.id = id;
    this.teamID = teamID;
    this.name = name;
    this.variables = variables;
  }

  /**
   * ID of the Team Environment
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * ID of the team this environment belongs to
   */
  public String getTeamID() {
    return teamID;
  }

  public void setTeamID(String teamID) {
    this.teamID = teamID;
  }

  /**
   * Name of the environment
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * All variables present in the environment
   */
  public String getVariables() {
    return variables;
  }

  public void setVariables(String variables) {
    this.variables = variables;
  }

  @Override
  public String toString() {
    return "TeamEnvironment{" + "id='" + id + "'," +"teamID='" + teamID + "'," +"name='" + name + "'," +"variables='" + variables + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeamEnvironment that = (TeamEnvironment) o;
        return java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(teamID, that.teamID) &&
                            java.util.Objects.equals(name, that.name) &&
                            java.util.Objects.equals(variables, that.variables);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, teamID, name, variables);
  }

  public static TeamEnvironment.Builder newBuilder(
      ) {
    return new Builder();
  }

  public static class Builder {
    /**
     * ID of the Team Environment
     */
    private String id;

    /**
     * ID of the team this environment belongs to
     */
    private String teamID;

    /**
     * Name of the environment
     */
    private String name;

    /**
     * All variables present in the environment
     */
    private String variables;

    public TeamEnvironment build() {
                  TeamEnvironment result = new TeamEnvironment();
                      result.id = this.id;
          result.teamID = this.teamID;
          result.name = this.name;
          result.variables = this.variables;
                      return result;
    }

    /**
     * ID of the Team Environment
     */
    public TeamEnvironment.Builder id(
        String id) {
      this.id = id;
      return this;
    }

    /**
     * ID of the team this environment belongs to
     */
    public TeamEnvironment.Builder teamID(
        String teamID) {
      this.teamID = teamID;
      return this;
    }

    /**
     * Name of the environment
     */
    public TeamEnvironment.Builder name(
        String name) {
      this.name = name;
      return this;
    }

    /**
     * All variables present in the environment
     */
    public TeamEnvironment.Builder variables(
        String variables) {
      this.variables = variables;
      return this;
    }
  }
}
