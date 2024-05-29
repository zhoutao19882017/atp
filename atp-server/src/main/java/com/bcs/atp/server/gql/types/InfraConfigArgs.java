package com.bcs.atp.server.gql.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class InfraConfigArgs {
  /**
   * Infra Config Name
   */
  private InfraConfigEnum name;

  /**
   * Infra Config Value
   */
  private String value;

  public InfraConfigArgs() {
  }

  public InfraConfigArgs(InfraConfigEnum name, String value) {
    this.name = name;
    this.value = value;
  }

  /**
   * Infra Config Name
   */
  public InfraConfigEnum getName() {
    return name;
  }

  public void setName(InfraConfigEnum name) {
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
    return "InfraConfigArgs{" + "name='" + name + "'," +"value='" + value + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InfraConfigArgs that = (InfraConfigArgs) o;
        return java.util.Objects.equals(name, that.name) &&
                            java.util.Objects.equals(value, that.value);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(name, value);
  }

  public static InfraConfigArgs.Builder newBuilder(
      ) {
    return new Builder();
  }

  public static class Builder {
    /**
     * Infra Config Name
     */
    private InfraConfigEnum name;

    /**
     * Infra Config Value
     */
    private String value;

    public InfraConfigArgs build() {
                  InfraConfigArgs result = new InfraConfigArgs();
                      result.name = this.name;
          result.value = this.value;
                      return result;
    }

    /**
     * Infra Config Name
     */
    public InfraConfigArgs.Builder name(
        InfraConfigEnum name) {
      this.name = name;
      return this;
    }

    /**
     * Infra Config Value
     */
    public InfraConfigArgs.Builder value(
        String value) {
      this.value = value;
      return this;
    }
  }
}
