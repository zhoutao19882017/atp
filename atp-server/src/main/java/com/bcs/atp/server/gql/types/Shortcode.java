package com.bcs.atp.server.gql.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;

public class Shortcode {
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

  public Shortcode() {
  }

  public Shortcode(String id, String request, String properties, OffsetDateTime createdOn) {
    this.id = id;
    this.request = request;
    this.properties = properties;
    this.createdOn = createdOn;
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

  @Override
  public String toString() {
    return "Shortcode{" + "id='" + id + "'," +"request='" + request + "'," +"properties='" + properties + "'," +"createdOn='" + createdOn + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shortcode that = (Shortcode) o;
        return java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(request, that.request) &&
                            java.util.Objects.equals(properties, that.properties) &&
                            java.util.Objects.equals(createdOn, that.createdOn);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, request, properties, createdOn);
  }

  public static Shortcode.Builder newBuilder() {
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

    public Shortcode build() {
                  Shortcode result = new Shortcode();
                      result.id = this.id;
          result.request = this.request;
          result.properties = this.properties;
          result.createdOn = this.createdOn;
                      return result;
    }

    /**
     * The 12 digit alphanumeric code
     */
    public Shortcode.Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * JSON string representing the request data
     */
    public Shortcode.Builder request(
        String request) {
      this.request = request;
      return this;
    }

    /**
     * JSON string representing the properties for an embed
     */
    public Shortcode.Builder properties(
        String properties) {
      this.properties = properties;
      return this;
    }

    /**
     * Timestamp of when the Shortcode was created
     */
    public Shortcode.Builder createdOn(
        OffsetDateTime createdOn) {
      this.createdOn = createdOn;
      return this;
    }
  }
}
