package com.bcs.atp.server.gql.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class InfraConfig {
  /**
   * Infra Config Name
   */
  private String name;

  /**
   * Infra Config Value
   */
  private String value;

  public InfraConfig() {
  }

  public InfraConfig(String name, String value) {
    this.name = name;
    this.value = value;
  }

  /**
   * Infra Config Name
   */
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Infra Config Value
   */
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "InfraConfig{" + "name='" + name + "'," +"value='" + value + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InfraConfig that = (InfraConfig) o;
        return java.util.Objects.equals(name, that.name) &&
                            java.util.Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(name, value);
  }

  public static InfraConfig.Builder newBuilder(
      ) {
    return new Builder();
  }

  public static class Builder {
    /**
     * Infra Config Name
     */
    private String name;

    /**
     * Infra Config Value
     */
    private String value;

    public InfraConfig build() {
                  InfraConfig result = new InfraConfig();
                      result.name = this.name;
          result.value = this.value;
                      return result;
    }

    /**
     * Infra Config Name
     */
    public InfraConfig.Builder name(
        String name) {
      this.name = name;
      return this;
    }

    /**
     * Infra Config Value
     */
    public InfraConfig.Builder value(
        String value) {
      this.value = value;
      return this;
    }
  }
}
