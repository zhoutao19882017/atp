package com.bcs.atp.server.gql.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class EnableAndDisableSSOArgs {
  /**
   * Auth Provider
   */
  private AuthProvider provider;

  /**
   * Auth Provider Status
   */
  private ServiceStatus status;

  public EnableAndDisableSSOArgs() {
  }

  public EnableAndDisableSSOArgs(AuthProvider provider, ServiceStatus status) {
    this.provider = provider;
    this.status = status;
  }

  /**
   * Auth Provider
   */
  public AuthProvider getProvider() {
    return provider;
  }

  public void setProvider(AuthProvider provider) {
    this.provider = provider;
  }

  /**
   * Auth Provider Status
   */
  public ServiceStatus getStatus() {
    return status;
  }

  public void setStatus(ServiceStatus status) {
    this.status = status;
  }

  @Override
  public String toString() {
    return "EnableAndDisableSSOArgs{" + "provider='" + provider + "'," +"status='" + status + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EnableAndDisableSSOArgs that = (EnableAndDisableSSOArgs) o;
        return java.util.Objects.equals(provider, that.provider) &&
                            java.util.Objects.equals(status, that.status);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(provider, status);
  }

  public static EnableAndDisableSSOArgs.Builder newBuilder(
      ) {
    return new Builder();
  }

  public static class Builder {
    /**
     * Auth Provider
     */
    private AuthProvider provider;

    /**
     * Auth Provider Status
     */
    private ServiceStatus status;

    public EnableAndDisableSSOArgs build() {
                  EnableAndDisableSSOArgs result = new EnableAndDisableSSOArgs();
                      result.provider = this.provider;
          result.status = this.status;
                      return result;
    }

    /**
     * Auth Provider
     */
    public EnableAndDisableSSOArgs.Builder provider(
        AuthProvider provider) {
      this.provider = provider;
      return this;
    }

    /**
     * Auth Provider Status
     */
    public EnableAndDisableSSOArgs.Builder status(
        ServiceStatus status) {
      this.status = status;
      return this;
    }
  }
}
