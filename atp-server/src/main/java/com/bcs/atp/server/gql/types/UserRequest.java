package com.bcs.atp.server.gql.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;

public class UserRequest {
  /**
   * ID of the user request
   */
  private String id;

  /**
   * ID of the parent collection ID
   */
  private String collectionID;

  /**
   * Title of the user request
   */
  private String title;

  /**
   * Content/Body of the user request
   */
  private String request;

  /**
   * Type (GRAPHQL/REST) of the user request
   */
  private ReqType type;

  /**
   * Date of the user request creation
   */
  private OffsetDateTime createdOn;

  /**
   * Returns the user of the user request
   */
  private User user;

  public UserRequest() {
  }

  public UserRequest(String id, String collectionID, String title, String request, ReqType type,
      OffsetDateTime createdOn, User user) {
    this.id = id;
    this.collectionID = collectionID;
    this.title = title;
    this.request = request;
    this.type = type;
    this.createdOn = createdOn;
    this.user = user;
  }

  /**
   * ID of the user request
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * ID of the parent collection ID
   */
  public String getCollectionID() {
    return collectionID;
  }

  public void setCollectionID(String collectionID) {
    this.collectionID = collectionID;
  }

  /**
   * Title of the user request
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Content/Body of the user request
   */
  public String getRequest() {
    return request;
  }

  public void setRequest(String request) {
    this.request = request;
  }

  /**
   * Type (GRAPHQL/REST) of the user request
   */
  public ReqType getType() {
    return type;
  }

  public void setType(ReqType type) {
    this.type = type;
  }

  /**
   * Date of the user request creation
   */
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
  }

  /**
   * Returns the user of the user request
   */
  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  @Override
  public String toString() {
    return "UserRequest{" + "id='" + id + "'," +"collectionID='" + collectionID + "'," +"title='" + title + "'," +"request='" + request + "'," +"type='" + type + "'," +"createdOn='" + createdOn + "'," +"user='" + user + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserRequest that = (UserRequest) o;
        return java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(collectionID, that.collectionID) &&
                            java.util.Objects.equals(title, that.title) &&
                            java.util.Objects.equals(request, that.request) &&
                            java.util.Objects.equals(type, that.type) &&
                            java.util.Objects.equals(createdOn, that.createdOn) &&
                            java.util.Objects.equals(user, that.user);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, collectionID, title, request, type, createdOn, user);
  }

  public static UserRequest.Builder newBuilder(
      ) {
    return new Builder();
  }

  public static class Builder {
    /**
     * ID of the user request
     */
    private String id;

    /**
     * ID of the parent collection ID
     */
    private String collectionID;

    /**
     * Title of the user request
     */
    private String title;

    /**
     * Content/Body of the user request
     */
    private String request;

    /**
     * Type (GRAPHQL/REST) of the user request
     */
    private ReqType type;

    /**
     * Date of the user request creation
     */
    private OffsetDateTime createdOn;

    /**
     * Returns the user of the user request
     */
    private User user;

    public UserRequest build() {
                  UserRequest result = new UserRequest();
                      result.id = this.id;
          result.collectionID = this.collectionID;
          result.title = this.title;
          result.request = this.request;
          result.type = this.type;
          result.createdOn = this.createdOn;
          result.user = this.user;
                      return result;
    }

    /**
     * ID of the user request
     */
    public UserRequest.Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * ID of the parent collection ID
     */
    public UserRequest.Builder collectionID(
        String collectionID) {
      this.collectionID = collectionID;
      return this;
    }

    /**
     * Title of the user request
     */
    public UserRequest.Builder title(
        String title) {
      this.title = title;
      return this;
    }

    /**
     * Content/Body of the user request
     */
    public UserRequest.Builder request(
        String request) {
      this.request = request;
      return this;
    }

    /**
     * Type (GRAPHQL/REST) of the user request
     */
    public UserRequest.Builder type(
        ReqType type) {
      this.type = type;
      return this;
    }

    /**
     * Date of the user request creation
     */
    public UserRequest.Builder createdOn(
        OffsetDateTime createdOn) {
      this.createdOn = createdOn;
      return this;
    }

    /**
     * Returns the user of the user request
     */
    public UserRequest.Builder user(User user) {
      this.user = user;
      return this;
    }
  }
}
