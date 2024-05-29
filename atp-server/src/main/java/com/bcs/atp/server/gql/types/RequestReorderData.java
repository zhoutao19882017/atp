package com.bcs.atp.server.gql.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class RequestReorderData {
  /**
   * Team Request being moved
   */
  private TeamRequest request;

  /**
   * Team Request succeeding the request being moved in its new position
   */
  private TeamRequest nextRequest;

  public RequestReorderData() {
  }

  public RequestReorderData(TeamRequest request, TeamRequest nextRequest) {
    this.request = request;
    this.nextRequest = nextRequest;
  }

  /**
   * Team Request being moved
   */
  public TeamRequest getRequest() {
    return request;
  }

  public void setRequest(TeamRequest request) {
    this.request = request;
  }

  /**
   * Team Request succeeding the request being moved in its new position
   */
  public TeamRequest getNextRequest() {
    return nextRequest;
  }

  public void setNextRequest(TeamRequest nextRequest) {
    this.nextRequest = nextRequest;
  }

  @Override
  public String toString() {
    return "RequestReorderData{" + "request='" + request + "'," +"nextRequest='" + nextRequest + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RequestReorderData that = (RequestReorderData) o;
        return java.util.Objects.equals(request, that.request) &&
                            java.util.Objects.equals(nextRequest, that.nextRequest);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(request, nextRequest);
  }

  public static RequestReorderData.Builder newBuilder(
      ) {
    return new Builder();
  }

  public static class Builder {
    /**
     * Team Request being moved
     */
    private TeamRequest request;

    /**
     * Team Request succeeding the request being moved in its new position
     */
    private TeamRequest nextRequest;

    public RequestReorderData build() {
                  RequestReorderData result = new RequestReorderData();
                      result.request = this.request;
          result.nextRequest = this.nextRequest;
                      return result;
    }

    /**
     * Team Request being moved
     */
    public RequestReorderData.Builder request(
        TeamRequest request) {
      this.request = request;
      return this;
    }

    /**
     * Team Request succeeding the request being moved in its new position
     */
    public RequestReorderData.Builder nextRequest(
        TeamRequest nextRequest) {
      this.nextRequest = nextRequest;
      return this;
    }
  }
}
