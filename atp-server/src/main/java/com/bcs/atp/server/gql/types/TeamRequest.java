package com.bcs.atp.server.gql.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class TeamRequest {
  /**
   * ID of the request
   */
  private String id;

  /**
   * ID of the collection the request belongs to.
   */
  private String collectionID;

  /**
   * ID of the team the request belongs to.
   */
  private String teamID;

  /**
   * JSON string representing the request data
   */
  private String request;

  /**
   * Displayed title of the request
   */
  private String title;

  /**
   * Team the request belongs to
   */
  private Team team;

  /**
   * Collection the request belongs to
   */
  private TeamCollection collection;

  public TeamRequest() {
  }

  public TeamRequest(String id, String collectionID, String teamID, String request, String title,
      Team team, TeamCollection collection) {
    this.id = id;
    this.collectionID = collectionID;
    this.teamID = teamID;
    this.request = request;
    this.title = title;
    this.team = team;
    this.collection = collection;
  }

  /**
   * ID of the request
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * ID of the collection the request belongs to.
   */
  public String getCollectionID() {
    return collectionID;
  }

  public void setCollectionID(String collectionID) {
    this.collectionID = collectionID;
  }

  /**
   * ID of the team the request belongs to.
   */
  public String getTeamID() {
    return teamID;
  }

  public void setTeamID(String teamID) {
    this.teamID = teamID;
  }

  /**
   * JSON string representing the request data
   */
  public String getRequest() {
    return request;
  }

  public void setRequest(String request) {
    this.request = request;
  }

  /**
   * Displayed title of the request
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Team the request belongs to
   */
  public Team getTeam() {
    return team;
  }

  public void setTeam(Team team) {
    this.team = team;
  }

  /**
   * Collection the request belongs to
   */
  public TeamCollection getCollection() {
    return collection;
  }

  public void setCollection(TeamCollection collection) {
    this.collection = collection;
  }

  @Override
  public String toString() {
    return "TeamRequest{" + "id='" + id + "'," +"collectionID='" + collectionID + "'," +"teamID='" + teamID + "'," +"request='" + request + "'," +"title='" + title + "'," +"team='" + team + "'," +"collection='" + collection + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeamRequest that = (TeamRequest) o;
        return java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(collectionID, that.collectionID) &&
                            java.util.Objects.equals(teamID, that.teamID) &&
                            java.util.Objects.equals(request, that.request) &&
                            java.util.Objects.equals(title, that.title) &&
                            java.util.Objects.equals(team, that.team) &&
                            java.util.Objects.equals(collection, that.collection);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, collectionID, teamID, request, title, team, collection);
  }

  public static TeamRequest.Builder newBuilder(
      ) {
    return new Builder();
  }

  public static class Builder {
    /**
     * ID of the request
     */
    private String id;

    /**
     * ID of the collection the request belongs to.
     */
    private String collectionID;

    /**
     * ID of the team the request belongs to.
     */
    private String teamID;

    /**
     * JSON string representing the request data
     */
    private String request;

    /**
     * Displayed title of the request
     */
    private String title;

    /**
     * Team the request belongs to
     */
    private Team team;

    /**
     * Collection the request belongs to
     */
    private TeamCollection collection;

    public TeamRequest build() {
                  TeamRequest result = new TeamRequest();
                      result.id = this.id;
          result.collectionID = this.collectionID;
          result.teamID = this.teamID;
          result.request = this.request;
          result.title = this.title;
          result.team = this.team;
          result.collection = this.collection;
                      return result;
    }

    /**
     * ID of the request
     */
    public TeamRequest.Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * ID of the collection the request belongs to.
     */
    public TeamRequest.Builder collectionID(
        String collectionID) {
      this.collectionID = collectionID;
      return this;
    }

    /**
     * ID of the team the request belongs to.
     */
    public TeamRequest.Builder teamID(
        String teamID) {
      this.teamID = teamID;
      return this;
    }

    /**
     * JSON string representing the request data
     */
    public TeamRequest.Builder request(
        String request) {
      this.request = request;
      return this;
    }

    /**
     * Displayed title of the request
     */
    public TeamRequest.Builder title(
        String title) {
      this.title = title;
      return this;
    }

    /**
     * Team the request belongs to
     */
    public TeamRequest.Builder team(Team team) {
      this.team = team;
      return this;
    }

    /**
     * Collection the request belongs to
     */
    public TeamRequest.Builder collection(
        TeamCollection collection) {
      this.collection = collection;
      return this;
    }
  }
}
