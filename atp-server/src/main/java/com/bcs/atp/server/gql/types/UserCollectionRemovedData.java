package com.bcs.atp.server.gql.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class UserCollectionRemovedData {
  /**
   * ID of User Collection being removed
   */
  private String id;

  /**
   * Type of the user collection
   */
  private ReqType type;

  public UserCollectionRemovedData() {
  }

  public UserCollectionRemovedData(String id, ReqType type) {
    this.id = id;
    this.type = type;
  }

  /**
   * ID of User Collection being removed
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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

  @Override
  public String toString() {
    return "UserCollectionRemovedData{" + "id='" + id + "'," +"type='" + type + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserCollectionRemovedData that = (UserCollectionRemovedData) o;
        return java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(type, that.type);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, type);
  }

  public static UserCollectionRemovedData.Builder newBuilder(
      ) {
    return new Builder();
  }

  public static class Builder {
    /**
     * ID of User Collection being removed
     */
    private String id;

    /**
     * Type of the user collection
     */
    private ReqType type;

    public UserCollectionRemovedData build() {
                  UserCollectionRemovedData result = new UserCollectionRemovedData();
                      result.id = this.id;
          result.type = this.type;
                      return result;
    }

    /**
     * ID of User Collection being removed
     */
    public UserCollectionRemovedData.Builder id(
        String id) {
      this.id = id;
      return this;
    }

    /**
     * Type of the user collection
     */
    public UserCollectionRemovedData.Builder type(
        ReqType type) {
      this.type = type;
      return this;
    }
  }
}
