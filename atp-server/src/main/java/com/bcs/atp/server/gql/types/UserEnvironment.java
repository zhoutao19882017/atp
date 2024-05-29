package com.bcs.atp.server.gql.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class UserEnvironment {
  /**
   * ID of the User Environment
   */
  private String id;

  /**
   * ID of the user this environment belongs to
   */
  private String userUid;

  /**
   * Name of the environment
   */
  private String name;

  /**
   * All variables present in the environment
   */
  private String variables;

  /**
   * Flag to indicate the environment is global or not
   */
  private Boolean isGlobal;

  public UserEnvironment() {
  }

  public UserEnvironment(String id, String userUid, String name, String variables,
      Boolean isGlobal) {
    this.id = id;
    this.userUid = userUid;
    this.name = name;
    this.variables = variables;
    this.isGlobal = isGlobal;
  }

  /**
   * ID of the User Environment
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * ID of the user this environment belongs to
   */
  public String getUserUid() {
    return userUid;
  }

  public void setUserUid(String userUid) {
    this.userUid = userUid;
  }

  /**
   * Name of the environment
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * All variables present in the environment
   */
  public String getVariables() {
    return variables;
  }

  public void setVariables(String variables) {
    this.variables = variables;
  }

  /**
   * Flag to indicate the environment is global or not
   */
  public Boolean getIsGlobal() {
    return isGlobal;
  }

  public void setIsGlobal(Boolean isGlobal) {
    this.isGlobal = isGlobal;
  }

  @Override
  public String toString() {
    return "UserEnvironment{" + "id='" + id + "'," +"userUid='" + userUid + "'," +"name='" + name + "'," +"variables='" + variables + "'," +"isGlobal='" + isGlobal + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEnvironment that = (UserEnvironment) o;
        return java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(userUid, that.userUid) &&
                            java.util.Objects.equals(name, that.name) &&
                            java.util.Objects.equals(variables, that.variables) &&
                            java.util.Objects.equals(isGlobal, that.isGlobal);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, userUid, name, variables, isGlobal);
  }

  public static UserEnvironment.Builder newBuilder(
      ) {
    return new Builder();
  }

  public static class Builder {
    /**
     * ID of the User Environment
     */
    private String id;

    /**
     * ID of the user this environment belongs to
     */
    private String userUid;

    /**
     * Name of the environment
     */
    private String name;

    /**
     * All variables present in the environment
     */
    private String variables;

    /**
     * Flag to indicate the environment is global or not
     */
    private Boolean isGlobal;

    public UserEnvironment build() {
                  UserEnvironment result = new UserEnvironment();
                      result.id = this.id;
          result.userUid = this.userUid;
          result.name = this.name;
          result.variables = this.variables;
          result.isGlobal = this.isGlobal;
                      return result;
    }

    /**
     * ID of the User Environment
     */
    public UserEnvironment.Builder id(
        String id) {
      this.id = id;
      return this;
    }

    /**
     * ID of the user this environment belongs to
     */
    public UserEnvironment.Builder userUid(
        String userUid) {
      this.userUid = userUid;
      return this;
    }

    /**
     * Name of the environment
     */
    public UserEnvironment.Builder name(
        String name) {
      this.name = name;
      return this;
    }

    /**
     * All variables present in the environment
     */
    public UserEnvironment.Builder variables(
        String variables) {
      this.variables = variables;
      return this;
    }

    /**
     * Flag to indicate the environment is global or not
     */
    public UserEnvironment.Builder isGlobal(
        Boolean isGlobal) {
      this.isGlobal = isGlobal;
      return this;
    }
  }
}
