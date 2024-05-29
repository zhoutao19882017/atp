package com.bcs.atp.server.gql.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class UserCollectionReorderData {
  /**
   * User Collection being moved
   */
  private UserCollection userCollection;

  /**
   * User Collection succeeding the collection being moved in its new position
   */
  private UserCollection nextUserCollection;

  public UserCollectionReorderData() {
  }

  public UserCollectionReorderData(UserCollection userCollection,
      UserCollection nextUserCollection) {
    this.userCollection = userCollection;
    this.nextUserCollection = nextUserCollection;
  }

  /**
   * User Collection being moved
   */
  public UserCollection getUserCollection() {
    return userCollection;
  }

  public void setUserCollection(UserCollection userCollection) {
    this.userCollection = userCollection;
  }

  /**
   * User Collection succeeding the collection being moved in its new position
   */
  public UserCollection getNextUserCollection() {
    return nextUserCollection;
  }

  public void setNextUserCollection(UserCollection nextUserCollection) {
    this.nextUserCollection = nextUserCollection;
  }

  @Override
  public String toString() {
    return "UserCollectionReorderData{" + "userCollection='" + userCollection + "'," +"nextUserCollection='" + nextUserCollection + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserCollectionReorderData that = (UserCollectionReorderData) o;
        return java.util.Objects.equals(userCollection, that.userCollection) &&
                            java.util.Objects.equals(nextUserCollection, that.nextUserCollection);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(userCollection, nextUserCollection);
  }

  public static UserCollectionReorderData.Builder newBuilder(
      ) {
    return new Builder();
  }

  public static class Builder {
    /**
     * User Collection being moved
     */
    private UserCollection userCollection;

    /**
     * User Collection succeeding the collection being moved in its new position
     */
    private UserCollection nextUserCollection;

    public UserCollectionReorderData build() {
                  UserCollectionReorderData result = new UserCollectionReorderData();
                      result.userCollection = this.userCollection;
          result.nextUserCollection = this.nextUserCollection;
                      return result;
    }

    /**
     * User Collection being moved
     */
    public UserCollectionReorderData.Builder userCollection(
        UserCollection userCollection) {
      this.userCollection = userCollection;
      return this;
    }

    /**
     * User Collection succeeding the collection being moved in its new position
     */
    public UserCollectionReorderData.Builder nextUserCollection(
        UserCollection nextUserCollection) {
      this.nextUserCollection = nextUserCollection;
      return this;
    }
  }
}
