package com.bcs.atp.server.gql.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class UserRequestReorderData {
  /**
   * User request being moved
   */
  private UserRequest request;

  /**
   * User request succeeding the request being moved in its new position
   */
  private UserRequest nextRequest;

  public UserRequestReorderData() {
  }

  public UserRequestReorderData(UserRequest request, UserRequest nextRequest) {
    this.request = request;
    this.nextRequest = nextRequest;
  }

  /**
   * User request being moved
   */
  public UserRequest getRequest() {
    return request;
  }

  public void setRequest(UserRequest request) {
    this.request = request;
  }

  /**
   * User request succeeding the request being moved in its new position
   */
  public UserRequest getNextRequest() {
    return nextRequest;
  }

  public void setNextRequest(UserRequest nextRequest) {
    this.nextRequest = nextRequest;
  }

  @Override
  public String toString() {
    return "UserRequestReorderData{" + "request='" + request + "'," +"nextRequest='" + nextRequest + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserRequestReorderData that = (UserRequestReorderData) o;
        return java.util.Objects.equals(request, that.request) &&
                            java.util.Objects.equals(nextRequest, that.nextRequest);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(request, nextRequest);
  }

  public static UserRequestReorderData.Builder newBuilder(
      ) {
    return new Builder();
  }

  public static class Builder {
    /**
     * User request being moved
     */
    private UserRequest request;

    /**
     * User request succeeding the request being moved in its new position
     */
    private UserRequest nextRequest;

    public UserRequestReorderData build() {
                  UserRequestReorderData result = new UserRequestReorderData();
                      result.request = this.request;
          result.nextRequest = this.nextRequest;
                      return result;
    }

    /**
     * User request being moved
     */
    public UserRequestReorderData.Builder request(
        UserRequest request) {
      this.request = request;
      return this;
    }

    /**
     * User request succeeding the request being moved in its new position
     */
    public UserRequestReorderData.Builder nextRequest(
        UserRequest nextRequest) {
      this.nextRequest = nextRequest;
      return this;
    }
  }
}
