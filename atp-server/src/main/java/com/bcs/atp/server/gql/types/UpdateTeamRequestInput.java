package com.bcs.atp.server.gql.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class UpdateTeamRequestInput {
  /**
   * JSON string representing the request data
   */
  private String request;

  /**
   * Displayed title of the request
   */
  private String title;

  public UpdateTeamRequestInput() {
  }

  public UpdateTeamRequestInput(String request, String title) {
    this.request = request;
    this.title = title;
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
    return "UpdateTeamRequestInput{" + "request='" + request + "'," +"title='" + title + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UpdateTeamRequestInput that = (UpdateTeamRequestInput) o;
        return java.util.Objects.equals(request, that.request) &&
                            java.util.Objects.equals(title, that.title);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(request, title);
  }

  public static UpdateTeamRequestInput.Builder newBuilder(
      ) {
    return new Builder();
  }

  public static class Builder {
    /**
     * JSON string representing the request data
     */
    private String request;

    /**
     * Displayed title of the request
     */
    private String title;

    public UpdateTeamRequestInput build() {
                  UpdateTeamRequestInput result = new UpdateTeamRequestInput();
                      result.request = this.request;
          result.title = this.title;
                      return result;
    }

    /**
     * JSON string representing the request data
     */
    public UpdateTeamRequestInput.Builder request(
        String request) {
      this.request = request;
      return this;
    }

    /**
     * Displayed title of the request
     */
    public UpdateTeamRequestInput.Builder title(
        String title) {
      this.title = title;
      return this;
    }
  }
}
