package com.bcs.atp.server.gql.types;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class UserHistoryDeletedManyData {
  /**
   * Number of user histories deleted
   */
  private Integer count;

  /**
   * Type of the request in the history
   */
  private ReqType reqType;

  public UserHistoryDeletedManyData() {
  }

  public UserHistoryDeletedManyData(Integer count, ReqType reqType) {
    this.count = count;
    this.reqType = reqType;
  }

  /**
   * Number of user histories deleted
   */
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
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

  @Override
  public String toString() {
    return "UserHistoryDeletedManyData{" + "count='" + count + "'," +"reqType='" + reqType + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserHistoryDeletedManyData that = (UserHistoryDeletedManyData) o;
        return java.util.Objects.equals(count, that.count) &&
                            java.util.Objects.equals(reqType, that.reqType);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(count, reqType);
  }

  public static UserHistoryDeletedManyData.Builder newBuilder(
      ) {
    return new Builder();
  }

  public static class Builder {
    /**
     * Number of user histories deleted
     */
    private Integer count;

    /**
     * Type of the request in the history
     */
    private ReqType reqType;

    public UserHistoryDeletedManyData build() {
                  UserHistoryDeletedManyData result = new UserHistoryDeletedManyData();
                      result.count = this.count;
          result.reqType = this.reqType;
                      return result;
    }

    /**
     * Number of user histories deleted
     */
    public UserHistoryDeletedManyData.Builder count(
        Integer count) {
      this.count = count;
      return this;
    }

    /**
     * Type of the request in the history
     */
    public UserHistoryDeletedManyData.Builder reqType(
        ReqType reqType) {
      this.reqType = reqType;
      return this;
    }
  }
}
