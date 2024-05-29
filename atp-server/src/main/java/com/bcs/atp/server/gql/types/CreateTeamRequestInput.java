package com.bcs.atp.server.gql.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class CreateTeamRequestInput {
  /**
   * ID of the team the collection belongs to
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

  public CreateTeamRequestInput() {
  }

  public CreateTeamRequestInput(String teamID, String request, String title) {
    this.teamID = teamID;
    this.request = request;
    this.title = title;
  }

  /**
   * ID of the team the collection belongs to
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

  @Override
  public String toString() {
    return "CreateTeamRequestInput{" + "teamID='" + teamID + "'," +"request='" + request + "'," +"title='" + title + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CreateTeamRequestInput that = (CreateTeamRequestInput) o;
        return java.util.Objects.equals(teamID, that.teamID) &&
                            java.util.Objects.equals(request, that.request) &&
                            java.util.Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(teamID, request, title);
  }

  public static CreateTeamRequestInput.Builder newBuilder(
      ) {
    return new Builder();
  }

  public static class Builder {
    /**
     * ID of the team the collection belongs to
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

    public CreateTeamRequestInput build() {
                  CreateTeamRequestInput result = new CreateTeamRequestInput();
                      result.teamID = this.teamID;
          result.request = this.request;
          result.title = this.title;
                      return result;
    }

    /**
     * ID of the team the collection belongs to
     */
    public CreateTeamRequestInput.Builder teamID(
        String teamID) {
      this.teamID = teamID;
      return this;
    }

    /**
     * JSON string representing the request data
     */
    public CreateTeamRequestInput.Builder request(
        String request) {
      this.request = request;
      return this;
    }

    /**
     * Displayed title of the request
     */
    public CreateTeamRequestInput.Builder title(
        String title) {
      this.title = title;
      return this;
    }
  }
}
