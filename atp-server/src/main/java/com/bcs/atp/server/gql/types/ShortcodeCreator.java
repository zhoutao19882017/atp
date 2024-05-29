package com.bcs.atp.server.gql.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class ShortcodeCreator {
  /**
   * Uid of user who created the shortcode
   */
  private String uid;

  /**
   * Email of user who created the shortcode
   */
  private String email;

  public ShortcodeCreator() {
  }

  public ShortcodeCreator(String uid, String email) {
    this.uid = uid;
    this.email = email;
  }

  /**
   * Uid of user who created the shortcode
   */
  public String getUid() {
    return uid;
  }

  public void setUid(String uid) {
    this.uid = uid;
  }

  /**
   * Email of user who created the shortcode
   */
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public String toString() {
    return "ShortcodeCreator{" + "uid='" + uid + "'," +"email='" + email + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShortcodeCreator that = (ShortcodeCreator) o;
        return java.util.Objects.equals(uid, that.uid) &&
                            java.util.Objects.equals(email, that.email);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(uid, email);
  }

  public static ShortcodeCreator.Builder newBuilder(
      ) {
    return new Builder();
  }

  public static class Builder {
    /**
     * Uid of user who created the shortcode
     */
    private String uid;

    /**
     * Email of user who created the shortcode
     */
    private String email;

    public ShortcodeCreator build() {
                  ShortcodeCreator result = new ShortcodeCreator();
                      result.uid = this.uid;
          result.email = this.email;
                      return result;
    }

    /**
     * Uid of user who created the shortcode
     */
    public ShortcodeCreator.Builder uid(
        String uid) {
      this.uid = uid;
      return this;
    }

    /**
     * Email of user who created the shortcode
     */
    public ShortcodeCreator.Builder email(
        String email) {
      this.email = email;
      return this;
    }
  }
}
