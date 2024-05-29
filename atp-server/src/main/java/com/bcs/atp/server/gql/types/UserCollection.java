package com.bcs.atp.server.gql.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;

public class UserCollection {
  /**
   * ID of the user collection
   */
  private String id;

  /**
   * Displayed title of the user collection
   */
  private String title;

  /**
   * JSON string representing the collection data
   */
  private String data;

  /**
   * Type of the user collection
   */
  private ReqType type;

  /**
   * User the collection belongs to
   */
  private User user;

  /**
   * Parent user collection (null if root)
   */
  private UserCollection _parent;

  /**
   * List of children REST user collection
   */
  private List<UserCollection> childrenREST;

  /**
   * List of children GraphQL user collection
   */
  private List<UserCollection> childrenGQL;

  /**
   * Returns user requests of a user collection
   */
  private List<UserRequest> requests;

  public UserCollection() {
  }

  public UserCollection(String id, String title, String data, ReqType type, User user,
      UserCollection _parent, List<UserCollection> childrenREST, List<UserCollection> childrenGQL,
      List<UserRequest> requests) {
    this.id = id;
    this.title = title;
    this.data = data;
    this.type = type;
    this.user = user;
    this._parent = _parent;
    this.childrenREST = childrenREST;
    this.childrenGQL = childrenGQL;
    this.requests = requests;
  }

  /**
   * ID of the user collection
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Displayed title of the user collection
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * JSON string representing the collection data
   */
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  /**
   * Type of the user collection
   */
  public ReqType getType() {
    return type;
  }

  public void setType(ReqType type) {
    this.type = type;
  }

  /**
   * User the collection belongs to
   */
  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  /**
   * Parent user collection (null if root)
   */
  public UserCollection getParent() {
    return _parent;
  }

  public void setParent(UserCollection _parent) {
    this._parent = _parent;
  }

  /**
   * List of children REST user collection
   */
  public List<UserCollection> getChildrenREST() {
    return childrenREST;
  }

  public void setChildrenREST(List<UserCollection> childrenREST) {
    this.childrenREST = childrenREST;
  }

  /**
   * List of children GraphQL user collection
   */
  public List<UserCollection> getChildrenGQL() {
    return childrenGQL;
  }

  public void setChildrenGQL(List<UserCollection> childrenGQL) {
    this.childrenGQL = childrenGQL;
  }

  /**
   * Returns user requests of a user collection
   */
  public List<UserRequest> getRequests() {
    return requests;
  }

  public void setRequests(List<UserRequest> requests) {
    this.requests = requests;
  }

  @Override
  public String toString() {
    return "UserCollection{" + "id='" + id + "'," +"title='" + title + "'," +"data='" + data + "'," +"type='" + type + "'," +"user='" + user + "'," +"parent='" + _parent + "'," +"childrenREST='" + childrenREST + "'," +"childrenGQL='" + childrenGQL + "'," +"requests='" + requests + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserCollection that = (UserCollection) o;
        return java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(title, that.title) &&
                            java.util.Objects.equals(data, that.data) &&
                            java.util.Objects.equals(type, that.type) &&
                            java.util.Objects.equals(user, that.user) &&
                            java.util.Objects.equals(_parent, that._parent) &&
                            java.util.Objects.equals(childrenREST, that.childrenREST) &&
                            java.util.Objects.equals(childrenGQL, that.childrenGQL) &&
                            java.util.Objects.equals(requests, that.requests);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, title, data, type, user, _parent, childrenREST, childrenGQL, requests);
  }

  public static UserCollection.Builder newBuilder(
      ) {
    return new Builder();
  }

  public static class Builder {
    /**
     * ID of the user collection
     */
    private String id;

    /**
     * Displayed title of the user collection
     */
    private String title;

    /**
     * JSON string representing the collection data
     */
    private String data;

    /**
     * Type of the user collection
     */
    private ReqType type;

    /**
     * User the collection belongs to
     */
    private User user;

    /**
     * Parent user collection (null if root)
     */
    private UserCollection _parent;

    /**
     * List of children REST user collection
     */
    private List<UserCollection> childrenREST;

    /**
     * List of children GraphQL user collection
     */
    private List<UserCollection> childrenGQL;

    /**
     * Returns user requests of a user collection
     */
    private List<UserRequest> requests;

    public UserCollection build() {
                  UserCollection result = new UserCollection();
                      result.id = this.id;
          result.title = this.title;
          result.data = this.data;
          result.type = this.type;
          result.user = this.user;
          result._parent = this._parent;
          result.childrenREST = this.childrenREST;
          result.childrenGQL = this.childrenGQL;
          result.requests = this.requests;
                      return result;
    }

    /**
     * ID of the user collection
     */
    public UserCollection.Builder id(
        String id) {
      this.id = id;
      return this;
    }

    /**
     * Displayed title of the user collection
     */
    public UserCollection.Builder title(
        String title) {
      this.title = title;
      return this;
    }

    /**
     * JSON string representing the collection data
     */
    public UserCollection.Builder data(
        String data) {
      this.data = data;
      return this;
    }

    /**
     * Type of the user collection
     */
    public UserCollection.Builder type(
        ReqType type) {
      this.type = type;
      return this;
    }

    /**
     * User the collection belongs to
     */
    public UserCollection.Builder user(
        User user) {
      this.user = user;
      return this;
    }

    /**
     * Parent user collection (null if root)
     */
    public UserCollection.Builder _parent(
        UserCollection _parent) {
      this._parent = _parent;
      return this;
    }

    /**
     * List of children REST user collection
     */
    public UserCollection.Builder childrenREST(
        List<UserCollection> childrenREST) {
      this.childrenREST = childrenREST;
      return this;
    }

    /**
     * List of children GraphQL user collection
     */
    public UserCollection.Builder childrenGQL(
        List<UserCollection> childrenGQL) {
      this.childrenGQL = childrenGQL;
      return this;
    }

    /**
     * Returns user requests of a user collection
     */
    public UserCollection.Builder requests(
        List<UserRequest> requests) {
      this.requests = requests;
      return this;
    }
  }
}
