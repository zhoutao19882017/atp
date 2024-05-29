package com.bcs.atp.server.gql.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;

public class Admin {
  /**
   * UID of the user
   */
  private String uid;

  /**
   * Name of the user (if fetched)
   */
  private String displayName;

  /**
   * Email of the user
   */
  private String email;

  /**
   * URL to the profile photo of the user (if fetched)
   */
  private String photoURL;

  /**
   * Date when the user account was created
   */
  private OffsetDateTime createdOn;

  public Admin() {
  }

  public Admin(String uid, String displayName, String email, String photoURL,
      OffsetDateTime createdOn) {
    this.uid = uid;
    this.displayName = displayName;
    this.email = email;
    this.photoURL = photoURL;
    this.createdOn = createdOn;
  }

  /**
   * UID of the user
   */
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  /**
   * Name of the user (if fetched)
   */
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  /**
   * Email of the user
   */
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * URL to the profile photo of the user (if fetched)
   */
  public String getPhotoURL() {
    return photoURL;
  }

  public void setPhotoURL(String photoURL) {
    this.photoURL = photoURL;
  }

  /**
   * Date when the user account was created
   */
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
  }

  @Override
  public String toString() {
    return "Admin{" + "uid='" + uid + "'," +"displayName='" + displayName + "'," +"email='" + email + "'," +"photoURL='" + photoURL + "'," +"createdOn='" + createdOn + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Admin that = (Admin) o;
        return java.util.Objects.equals(uid, that.uid) &&
                            java.util.Objects.equals(displayName, that.displayName) &&
                            java.util.Objects.equals(email, that.email) &&
                            java.util.Objects.equals(photoURL, that.photoURL) &&
                            java.util.Objects.equals(createdOn, that.createdOn);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(uid, displayName, email, photoURL, createdOn);
  }

  public static Admin.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    /**
     * UID of the user
     */
    private String uid;

    /**
     * Name of the user (if fetched)
     */
    private String displayName;

    /**
     * Email of the user
     */
    private String email;

    /**
     * URL to the profile photo of the user (if fetched)
     */
    private String photoURL;

    /**
     * Date when the user account was created
     */
    private OffsetDateTime createdOn;

    public Admin build() {
                  Admin result = new Admin();
                      result.uid = this.uid;
          result.displayName = this.displayName;
          result.email = this.email;
          result.photoURL = this.photoURL;
          result.createdOn = this.createdOn;
                      return result;
    }

    /**
     * UID of the user
     */
    public Admin.Builder uid(String uid) {
      this.uid = uid;
      return this;
    }

    /**
     * Name of the user (if fetched)
     */
    public Admin.Builder displayName(
        String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * Email of the user
     */
    public Admin.Builder email(String email) {
      this.email = email;
      return this;
    }

    /**
     * URL to the profile photo of the user (if fetched)
     */
    public Admin.Builder photoURL(
        String photoURL) {
      this.photoURL = photoURL;
      return this;
    }

    /**
     * Date when the user account was created
     */
    public Admin.Builder createdOn(
        OffsetDateTime createdOn) {
      this.createdOn = createdOn;
      return this;
    }
  }
}
