package com.bcs.atp.server.gql.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class UserCollectionExportJSONData {
  /**
   * Stringified contents of the collection
   */
  private String exportedCollection;

  /**
   * Type of the user collection
   */
  private ReqType collectionType;

  public UserCollectionExportJSONData() {
  }

  public UserCollectionExportJSONData(String exportedCollection, ReqType collectionType) {
    this.exportedCollection = exportedCollection;
    this.collectionType = collectionType;
  }

  /**
   * Stringified contents of the collection
   */
  public String getExportedCollection() {
    return exportedCollection;
  }

  public void setExportedCollection(String exportedCollection) {
    this.exportedCollection = exportedCollection;
  }

  /**
   * Type of the user collection
   */
  public ReqType getCollectionType() {
    return collectionType;
  }

  public void setCollectionType(ReqType collectionType) {
    this.collectionType = collectionType;
  }

  @Override
  public String toString() {
    return "UserCollectionExportJSONData{" + "exportedCollection='" + exportedCollection + "'," +"collectionType='" + collectionType + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserCollectionExportJSONData that = (UserCollectionExportJSONData) o;
        return java.util.Objects.equals(exportedCollection, that.exportedCollection) &&
                            java.util.Objects.equals(collectionType, that.collectionType);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(exportedCollection, collectionType);
  }

  public static UserCollectionExportJSONData.Builder newBuilder(
      ) {
    return new Builder();
  }

  public static class Builder {
    /**
     * Stringified contents of the collection
     */
    private String exportedCollection;

    /**
     * Type of the user collection
     */
    private ReqType collectionType;

    public UserCollectionExportJSONData build() {
                  UserCollectionExportJSONData result = new UserCollectionExportJSONData();
                      result.exportedCollection = this.exportedCollection;
          result.collectionType = this.collectionType;
                      return result;
    }

    /**
     * Stringified contents of the collection
     */
    public UserCollectionExportJSONData.Builder exportedCollection(
        String exportedCollection) {
      this.exportedCollection = exportedCollection;
      return this;
    }

    /**
     * Type of the user collection
     */
    public UserCollectionExportJSONData.Builder collectionType(
        ReqType collectionType) {
      this.collectionType = collectionType;
      return this;
    }
  }
}
