package com.bcs.atp.server.gql.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class UserDeletionResult {
  /**
   * UID of the user
   */
  private String userUID;

  /**
   * Flag to determine if user deletion was successful or not
   */
  private Boolean isDeleted;

  /**
   * Error message if user deletion was not successful
   */
  private String errorMessage;

  public UserDeletionResult() {
  }

  public UserDeletionResult(String userUID, Boolean isDeleted, String errorMessage) {
    this.userUID = userUID;
    this.isDeleted = isDeleted;
    this.errorMessage = errorMessage;
  }

  /**
   * UID of the user
   */
  public String getUserUID() {
    return userUID;
  }

  public void setUserUID(String userUID) {
    this.userUID = userUID;
  }

  /**
   * Flag to determine if user deletion was successful or not
   */
  public Boolean getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  /**
   * Error message if user deletion was not successful
   */
  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  @Override
  public String toString() {
    return "UserDeletionResult{" + "userUID='" + userUID + "'," +"isDeleted='" + isDeleted + "'," +"errorMessage='" + errorMessage + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserDeletionResult that = (UserDeletionResult) o;
        return java.util.Objects.equals(userUID, that.userUID) &&
                            java.util.Objects.equals(isDeleted, that.isDeleted) &&
                            java.util.Objects.equals(errorMessage, that.errorMessage);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(userUID, isDeleted, errorMessage);
  }

  public static UserDeletionResult.Builder newBuilder(
      ) {
    return new Builder();
  }

  public static class Builder {
    /**
     * UID of the user
     */
    private String userUID;

    /**
     * Flag to determine if user deletion was successful or not
     */
    private Boolean isDeleted;

    /**
     * Error message if user deletion was not successful
     */
    private String errorMessage;

    public UserDeletionResult build() {
                  UserDeletionResult result = new UserDeletionResult();
                      result.userUID = this.userUID;
          result.isDeleted = this.isDeleted;
          result.errorMessage = this.errorMessage;
                      return result;
    }

    /**
     * UID of the user
     */
    public UserDeletionResult.Builder userUID(
        String userUID) {
      this.userUID = userUID;
      return this;
    }

    /**
     * Flag to determine if user deletion was successful or not
     */
    public UserDeletionResult.Builder isDeleted(
        Boolean isDeleted) {
      this.isDeleted = isDeleted;
      return this;
    }

    /**
     * Error message if user deletion was not successful
     */
    public UserDeletionResult.Builder errorMessage(
        String errorMessage) {
      this.errorMessage = errorMessage;
      return this;
    }
  }
}
