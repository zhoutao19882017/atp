package com.bcs.atp.server.gql.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;

public class ShortcodeWithUserEmail {
  /**
   * The 12 digit alphanumeric code
   */
  private String id;

  /**
   * JSON string representing the request data
   */
  private String request;

  /**
   * JSON string representing the properties for an embed
   */
  private String properties;

  /**
   * Timestamp of when the Shortcode was created
   */
  private OffsetDateTime createdOn;

  /**
   * Details of user who created the shortcode
   */
  private ShortcodeCreator creator;

  public ShortcodeWithUserEmail() {
  }

  public ShortcodeWithUserEmail(String id, String request, String properties,
      OffsetDateTime createdOn, ShortcodeCreator creator) {
    this.id = id;
    this.request = request;
    this.properties = properties;
    this.createdOn = createdOn;
    this.creator = creator;
  }

  /**
   * The 12 digit alphanumeric code
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * JSON string representing the request data
   */
  public String getRequest() {
    return request;
  }

  public void setRequest(String request) {
    this.request = request;
  }

  /**
   * JSON string representing the properties for an embed
   */
  public String getProperties() {
    return properties;
  }

  public void setProperties(String properties) {
    this.properties = properties;
  }

  /**
   * Timestamp of when the Shortcode was created
   */
  public OffsetDateTime getCreatedOn() {
    return createdOn;
  }

  public void setCreatedOn(OffsetDateTime createdOn) {
    this.createdOn = createdOn;
  }

  /**
   * Details of user who created the shortcode
   */
  public ShortcodeCreator getCreator() {
    return creator;
  }

  public void setCreator(ShortcodeCreator creator) {
    this.creator = creator;
  }

  @Override
  public String toString() {
    return "ShortcodeWithUserEmail{" + "id='" + id + "'," +"request='" + request + "'," +"properties='" + properties + "'," +"createdOn='" + createdOn + "'," +"creator='" + creator + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShortcodeWithUserEmail that = (ShortcodeWithUserEmail) o;
        return java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(request, that.request) &&
                            java.util.Objects.equals(properties, that.properties) &&
                            java.util.Objects.equals(createdOn, that.createdOn) &&
                            java.util.Objects.equals(creator, that.creator);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, request, properties, createdOn, creator);
  }

  public static ShortcodeWithUserEmail.Builder newBuilder(
      ) {
    return new Builder();
  }

  public static class Builder {
    /**
     * The 12 digit alphanumeric code
     */
    private String id;

    /**
     * JSON string representing the request data
     */
    private String request;

    /**
     * JSON string representing the properties for an embed
     */
    private String properties;

    /**
     * Timestamp of when the Shortcode was created
     */
    private OffsetDateTime createdOn;

    /**
     * Details of user who created the shortcode
     */
    private ShortcodeCreator creator;

    public ShortcodeWithUserEmail build() {
                  ShortcodeWithUserEmail result = new ShortcodeWithUserEmail();
                      result.id = this.id;
          result.request = this.request;
          result.properties = this.properties;
          result.createdOn = this.createdOn;
          result.creator = this.creator;
                      return result;
    }

    /**
     * The 12 digit alphanumeric code
     */
    public ShortcodeWithUserEmail.Builder id(
        String id) {
      this.id = id;
      return this;
    }

    /**
     * JSON string representing the request data
     */
    public ShortcodeWithUserEmail.Builder request(
        String request) {
      this.request = request;
      return this;
    }

    /**
     * JSON string representing the properties for an embed
     */
    public ShortcodeWithUserEmail.Builder properties(
        String properties) {
      this.properties = properties;
      return this;
    }

    /**
     * Timestamp of when the Shortcode was created
     */
    public ShortcodeWithUserEmail.Builder createdOn(
        OffsetDateTime createdOn) {
      this.createdOn = createdOn;
      return this;
    }

    /**
     * Details of user who created the shortcode
     */
    public ShortcodeWithUserEmail.Builder creator(
        ShortcodeCreator creator) {
      this.creator = creator;
      return this;
    }
  }
}
