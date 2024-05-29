package com.bcs.atp.server.gql.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;

public class UserSettings {
  /**
   * ID of the User Setting
   */
  private String id;

  /**
   * ID of the user this setting belongs to
   */
  private String userUid;

  /**
   * Stringified JSON settings object
   */
  private String properties;

  /**
   * Last updated on
   */
  private OffsetDateTime updatedOn;

  public UserSettings() {
  }

  public UserSettings(String id, String userUid, String properties, OffsetDateTime updatedOn) {
    this.id = id;
    this.userUid = userUid;
    this.properties = properties;
    this.updatedOn = updatedOn;
  }

  /**
   * ID of the User Setting
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * ID of the user this setting belongs to
   */
  public String getUserUid() {
    return userUid;
  }

  public void setUserUid(String userUid) {
    this.userUid = userUid;
  }

  /**
   * Stringified JSON settings object
   */
  public String getProperties() {
    return properties;
  }

  public void setProperties(String properties) {
    this.properties = properties;
  }

  /**
   * Last updated on
   */
  public OffsetDateTime getUpdatedOn() {
    return updatedOn;
  }

  public void setUpdatedOn(OffsetDateTime updatedOn) {
    this.updatedOn = updatedOn;
  }

  @Override
  public String toString() {
    return "UserSettings{" + "id='" + id + "'," +"userUid='" + userUid + "'," +"properties='" + properties + "'," +"updatedOn='" + updatedOn + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserSettings that = (UserSettings) o;
        return java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(userUid, that.userUid) &&
                            java.util.Objects.equals(properties, that.properties) &&
                            java.util.Objects.equals(updatedOn, that.updatedOn);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, userUid, properties, updatedOn);
  }

  public static UserSettings.Builder newBuilder(
      ) {
    return new Builder();
  }

  public static class Builder {
    /**
     * ID of the User Setting
     */
    private String id;

    /**
     * ID of the user this setting belongs to
     */
    private String userUid;

    /**
     * Stringified JSON settings object
     */
    private String properties;

    /**
     * Last updated on
     */
    private OffsetDateTime updatedOn;

    public UserSettings build() {
                  UserSettings result = new UserSettings();
                      result.id = this.id;
          result.userUid = this.userUid;
          result.properties = this.properties;
          result.updatedOn = this.updatedOn;
                      return result;
    }

    /**
     * ID of the User Setting
     */
    public UserSettings.Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * ID of the user this setting belongs to
     */
    public UserSettings.Builder userUid(
        String userUid) {
      this.userUid = userUid;
      return this;
    }

    /**
     * Stringified JSON settings object
     */
    public UserSettings.Builder properties(
        String properties) {
      this.properties = properties;
      return this;
    }

    /**
     * Last updated on
     */
    public UserSettings.Builder updatedOn(
        OffsetDateTime updatedOn) {
      this.updatedOn = updatedOn;
      return this;
    }
  }
}
