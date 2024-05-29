package com.bcs.atp.server.gql.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class CollectionReorderData {
  /**
   * Team Collection being moved
   */
  private TeamCollection collection;

  /**
   * Team Collection succeeding the collection being moved in its new position
   */
  private TeamCollection nextCollection;

  public CollectionReorderData() {
  }

  public CollectionReorderData(TeamCollection collection, TeamCollection nextCollection) {
    this.collection = collection;
    this.nextCollection = nextCollection;
  }

  /**
   * Team Collection being moved
   */
  public TeamCollection getCollection() {
    return collection;
  }

  public void setCollection(TeamCollection collection) {
    this.collection = collection;
  }

  /**
   * Team Collection succeeding the collection being moved in its new position
   */
  public TeamCollection getNextCollection() {
    return nextCollection;
  }

  public void setNextCollection(TeamCollection nextCollection) {
    this.nextCollection = nextCollection;
  }

  @Override
  public String toString() {
    return "CollectionReorderData{" + "collection='" + collection + "'," +"nextCollection='" + nextCollection + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CollectionReorderData that = (CollectionReorderData) o;
        return java.util.Objects.equals(collection, that.collection) &&
                            java.util.Objects.equals(nextCollection, that.nextCollection);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(collection, nextCollection);
  }

  public static CollectionReorderData.Builder newBuilder(
      ) {
    return new Builder();
  }

  public static class Builder {
    /**
     * Team Collection being moved
     */
    private TeamCollection collection;

    /**
     * Team Collection succeeding the collection being moved in its new position
     */
    private TeamCollection nextCollection;

    public CollectionReorderData build() {
                  CollectionReorderData result = new CollectionReorderData();
                      result.collection = this.collection;
          result.nextCollection = this.nextCollection;
                      return result;
    }

    /**
     * Team Collection being moved
     */
    public CollectionReorderData.Builder collection(
        TeamCollection collection) {
      this.collection = collection;
      return this;
    }

    /**
     * Team Collection succeeding the collection being moved in its new position
     */
    public CollectionReorderData.Builder nextCollection(
        TeamCollection nextCollection) {
      this.nextCollection = nextCollection;
      return this;
    }
  }
}
