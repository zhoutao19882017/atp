package com.bcs.atp.server.gql.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;

public class UserHistory {
  /**
   * ID of the user request in history
   */
  private String id;

  /**
   * ID of the user this history belongs to
   */
  private String userUid;

  /**
   * Type of the request in the history
   */
  private ReqType reqType;

  /**
   * JSON string representing the request data
   */
  private String request;

  /**
   * JSON string representing the response meta-data
   */
  private String responseMetadata;

  /**
   * If the request in the history starred
   */
  private Boolean isStarred;

  /**
   * Timestamp of when the request was executed or history was created
   */
  private OffsetDateTime executedOn;

  public UserHistory() {
  }

  public UserHistory(String id, String userUid, ReqType reqType, String request,
      String responseMetadata, Boolean isStarred, OffsetDateTime executedOn) {
    this.id = id;
    this.userUid = userUid;
    this.reqType = reqType;
    this.request = request;
    this.responseMetadata = responseMetadata;
    this.isStarred = isStarred;
    this.executedOn = executedOn;
  }

  /**
   * ID of the user request in history
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * ID of the user this history belongs to
   */
  public String getUserUid() {
    return userUid;
  }

  public void setUserUid(String userUid) {
    this.userUid = userUid;
  }

  /**
   * Type of the request in the history
   */
  public ReqType getReqType() {
    return reqType;
  }

  public void setReqType(ReqType reqType) {
    this.reqType = reqType;
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
   * JSON string representing the response meta-data
   */
  public String getResponseMetadata() {
    return responseMetadata;
  }

  public void setResponseMetadata(String responseMetadata) {
    this.responseMetadata = responseMetadata;
  }

  /**
   * If the request in the history starred
   */
  public Boolean getIsStarred() {
    return isStarred;
  }

  public void setIsStarred(Boolean isStarred) {
    this.isStarred = isStarred;
  }

  /**
   * Timestamp of when the request was executed or history was created
   */
  public OffsetDateTime getExecutedOn() {
    return executedOn;
  }

  public void setExecutedOn(OffsetDateTime executedOn) {
    this.executedOn = executedOn;
  }

  @Override
  public String toString() {
    return "UserHistory{" + "id='" + id + "'," +"userUid='" + userUid + "'," +"reqType='" + reqType + "'," +"request='" + request + "'," +"responseMetadata='" + responseMetadata + "'," +"isStarred='" + isStarred + "'," +"executedOn='" + executedOn + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserHistory that = (UserHistory) o;
        return java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(userUid, that.userUid) &&
                            java.util.Objects.equals(reqType, that.reqType) &&
                            java.util.Objects.equals(request, that.request) &&
                            java.util.Objects.equals(responseMetadata, that.responseMetadata) &&
                            java.util.Objects.equals(isStarred, that.isStarred) &&
                            java.util.Objects.equals(executedOn, that.executedOn);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, userUid, reqType, request, responseMetadata, isStarred, executedOn);
  }

  public static UserHistory.Builder newBuilder(
      ) {
    return new Builder();
  }

  public static class Builder {
    /**
     * ID of the user request in history
     */
    private String id;

    /**
     * ID of the user this history belongs to
     */
    private String userUid;

    /**
     * Type of the request in the history
     */
    private ReqType reqType;

    /**
     * JSON string representing the request data
     */
    private String request;

    /**
     * JSON string representing the response meta-data
     */
    private String responseMetadata;

    /**
     * If the request in the history starred
     */
    private Boolean isStarred;

    /**
     * Timestamp of when the request was executed or history was created
     */
    private OffsetDateTime executedOn;

    public UserHistory build() {
                  UserHistory result = new UserHistory();
                      result.id = this.id;
          result.userUid = this.userUid;
          result.reqType = this.reqType;
          result.request = this.request;
          result.responseMetadata = this.responseMetadata;
          result.isStarred = this.isStarred;
          result.executedOn = this.executedOn;
                      return result;
    }

    /**
     * ID of the user request in history
     */
    public UserHistory.Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * ID of the user this history belongs to
     */
    public UserHistory.Builder userUid(
        String userUid) {
      this.userUid = userUid;
      return this;
    }

    /**
     * Type of the request in the history
     */
    public UserHistory.Builder reqType(
        ReqType reqType) {
      this.reqType = reqType;
      return this;
    }

    /**
     * JSON string representing the request data
     */
    public UserHistory.Builder request(
        String request) {
      this.request = request;
      return this;
    }

    /**
     * JSON string representing the response meta-data
     */
    public UserHistory.Builder responseMetadata(
        String responseMetadata) {
      this.responseMetadata = responseMetadata;
      return this;
    }

    /**
     * If the request in the history starred
     */
    public UserHistory.Builder isStarred(
        Boolean isStarred) {
      this.isStarred = isStarred;
      return this;
    }

    /**
     * Timestamp of when the request was executed or history was created
     */
    public UserHistory.Builder executedOn(
        OffsetDateTime executedOn) {
      this.executedOn = executedOn;
      return this;
    }
  }
}
