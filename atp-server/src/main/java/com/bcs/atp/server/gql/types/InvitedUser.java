package com.bcs.atp.server.gql.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;

public class InvitedUser {
  /**
   * Admin UID
   */
  private String adminUid;

  /**
   * Admin email
   */
  private String adminEmail;

  /**
   * Invitee email
   */
  private String inviteeEmail;

  /**
   * Date when the user invitation was sent
   */
  private OffsetDateTime invitedOn;

  public InvitedUser() {
  }

  public InvitedUser(String adminUid, String adminEmail, String inviteeEmail,
      OffsetDateTime invitedOn) {
    this.adminUid = adminUid;
    this.adminEmail = adminEmail;
    this.inviteeEmail = inviteeEmail;
    this.invitedOn = invitedOn;
  }

  /**
   * Admin UID
   */
  public String getAdminUid() {
    return adminUid;
  }

  public void setAdminUid(String adminUid) {
    this.adminUid = adminUid;
  }

  /**
   * Admin email
   */
  public String getAdminEmail() {
    return adminEmail;
  }

  public void setAdminEmail(String adminEmail) {
    this.adminEmail = adminEmail;
  }

  /**
   * Invitee email
   */
  public String getInviteeEmail() {
    return inviteeEmail;
  }

  public void setInviteeEmail(String inviteeEmail) {
    this.inviteeEmail = inviteeEmail;
  }

  /**
   * Date when the user invitation was sent
   */
  public OffsetDateTime getInvitedOn() {
    return invitedOn;
  }

  public void setInvitedOn(OffsetDateTime invitedOn) {
    this.invitedOn = invitedOn;
  }

  @Override
  public String toString() {
    return "InvitedUser{" + "adminUid='" + adminUid + "'," +"adminEmail='" + adminEmail + "'," +"inviteeEmail='" + inviteeEmail + "'," +"invitedOn='" + invitedOn + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvitedUser that = (InvitedUser) o;
        return java.util.Objects.equals(adminUid, that.adminUid) &&
                            java.util.Objects.equals(adminEmail, that.adminEmail) &&
                            java.util.Objects.equals(inviteeEmail, that.inviteeEmail) &&
                            java.util.Objects.equals(invitedOn, that.invitedOn);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(adminUid, adminEmail, inviteeEmail, invitedOn);
  }

  public static InvitedUser.Builder newBuilder(
      ) {
    return new Builder();
  }

  public static class Builder {
    /**
     * Admin UID
     */
    private String adminUid;

    /**
     * Admin email
     */
    private String adminEmail;

    /**
     * Invitee email
     */
    private String inviteeEmail;

    /**
     * Date when the user invitation was sent
     */
    private OffsetDateTime invitedOn;

    public InvitedUser build() {
                  InvitedUser result = new InvitedUser();
                      result.adminUid = this.adminUid;
          result.adminEmail = this.adminEmail;
          result.inviteeEmail = this.inviteeEmail;
          result.invitedOn = this.invitedOn;
                      return result;
    }

    /**
     * Admin UID
     */
    public InvitedUser.Builder adminUid(
        String adminUid) {
      this.adminUid = adminUid;
      return this;
    }

    /**
     * Admin email
     */
    public InvitedUser.Builder adminEmail(
        String adminEmail) {
      this.adminEmail = adminEmail;
      return this;
    }

    /**
     * Invitee email
     */
    public InvitedUser.Builder inviteeEmail(
        String inviteeEmail) {
      this.inviteeEmail = inviteeEmail;
      return this;
    }

    /**
     * Date when the user invitation was sent
     */
    public InvitedUser.Builder invitedOn(
        OffsetDateTime invitedOn) {
      this.invitedOn = invitedOn;
      return this;
    }
  }
}
