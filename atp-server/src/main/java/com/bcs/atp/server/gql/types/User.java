package com.bcs.atp.server.gql.types;

import java.lang.Boolean;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.time.OffsetDateTime;
import java.util.List;

public class User {
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
   * Flag to determine if user is an Admin or not
   */
  private Boolean isAdmin;

  /**
   * Date when the user account was created
   */
  private OffsetDateTime createdOn;

  /**
   * Stringified current REST session for logged-in User
   */
  private String currentRESTSession;

  /**
   * Stringified current GraphQL session for logged-in User
   */
  private String currentGQLSession;

  /**
   * Returns a list of users personal environments
   */
  private List<UserEnvironment> environments;

  /**
   * Returns the users global environments
   */
  private UserEnvironment globalEnvironments;

  /**
   * Returns a users REST history
   */
  private List<UserHistory> RESTHistory;

  /**
   * Returns a users GraphQL history
   */
  private List<UserHistory> GQLHistory;

  /**
   * Returns user settings
   */
  private UserSettings settings;

  public User() {
  }

  public User(String uid, String displayName, String email, String photoURL, Boolean isAdmin,
      OffsetDateTime createdOn, String currentRESTSession, String currentGQLSession,
      List<UserEnvironment> environments, UserEnvironment globalEnvironments,
      List<UserHistory> RESTHistory, List<UserHistory> GQLHistory, UserSettings settings) {
    this.uid = uid;
    this.displayName = displayName;
    this.email = email;
    this.photoURL = photoURL;
    this.isAdmin = isAdmin;
    this.createdOn = createdOn;
    this.currentRESTSession = currentRESTSession;
    this.currentGQLSession = currentGQLSession;
    this.environments = environments;
    this.globalEnvironments = globalEnvironments;
    this.RESTHistory = RESTHistory;
    this.GQLHistory = GQLHistory;
    this.settings = settings;
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
   * Flag to determine if user is an Admin or not
   */
  public Boolean getIsAdmin() {
    return isAdmin;
  }

  public void setIsAdmin(Boolean isAdmin) {
    this.isAdmin = isAdmin;
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

  /**
   * Stringified current REST session for logged-in User
   */
  public String getCurrentRESTSession() {
    return currentRESTSession;
  }

  public void setCurrentRESTSession(String currentRESTSession) {
    this.currentRESTSession = currentRESTSession;
  }

  /**
   * Stringified current GraphQL session for logged-in User
   */
  public String getCurrentGQLSession() {
    return currentGQLSession;
  }

  public void setCurrentGQLSession(String currentGQLSession) {
    this.currentGQLSession = currentGQLSession;
  }

  /**
   * Returns a list of users personal environments
   */
  public List<UserEnvironment> getEnvironments() {
    return environments;
  }

  public void setEnvironments(List<UserEnvironment> environments) {
    this.environments = environments;
  }

  /**
   * Returns the users global environments
   */
  public UserEnvironment getGlobalEnvironments() {
    return globalEnvironments;
  }

  public void setGlobalEnvironments(UserEnvironment globalEnvironments) {
    this.globalEnvironments = globalEnvironments;
  }

  /**
   * Returns a users REST history
   */
  public List<UserHistory> getRESTHistory() {
    return RESTHistory;
  }

  public void setRESTHistory(List<UserHistory> RESTHistory) {
    this.RESTHistory = RESTHistory;
  }

  /**
   * Returns a users GraphQL history
   */
  public List<UserHistory> getGQLHistory() {
    return GQLHistory;
  }

  public void setGQLHistory(List<UserHistory> GQLHistory) {
    this.GQLHistory = GQLHistory;
  }

  /**
   * Returns user settings
   */
  public UserSettings getSettings() {
    return settings;
  }

  public void setSettings(UserSettings settings) {
    this.settings = settings;
  }

  @Override
  public String toString() {
    return "User{" + "uid='" + uid + "'," +"displayName='" + displayName + "'," +"email='" + email + "'," +"photoURL='" + photoURL + "'," +"isAdmin='" + isAdmin + "'," +"createdOn='" + createdOn + "'," +"currentRESTSession='" + currentRESTSession + "'," +"currentGQLSession='" + currentGQLSession + "'," +"environments='" + environments + "'," +"globalEnvironments='" + globalEnvironments + "'," +"RESTHistory='" + RESTHistory + "'," +"GQLHistory='" + GQLHistory + "'," +"settings='" + settings + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User that = (User) o;
        return java.util.Objects.equals(uid, that.uid) &&
                            java.util.Objects.equals(displayName, that.displayName) &&
                            java.util.Objects.equals(email, that.email) &&
                            java.util.Objects.equals(photoURL, that.photoURL) &&
                            java.util.Objects.equals(isAdmin, that.isAdmin) &&
                            java.util.Objects.equals(createdOn, that.createdOn) &&
                            java.util.Objects.equals(currentRESTSession, that.currentRESTSession) &&
                            java.util.Objects.equals(currentGQLSession, that.currentGQLSession) &&
                            java.util.Objects.equals(environments, that.environments) &&
                            java.util.Objects.equals(globalEnvironments, that.globalEnvironments) &&
                            java.util.Objects.equals(RESTHistory, that.RESTHistory) &&
                            java.util.Objects.equals(GQLHistory, that.GQLHistory) &&
                            java.util.Objects.equals(settings, that.settings);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(uid, displayName, email, photoURL, isAdmin, createdOn, currentRESTSession, currentGQLSession, environments, globalEnvironments, RESTHistory, GQLHistory, settings);
  }

  public static User.Builder newBuilder() {
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
     * Flag to determine if user is an Admin or not
     */
    private Boolean isAdmin;

    /**
     * Date when the user account was created
     */
    private OffsetDateTime createdOn;

    /**
     * Stringified current REST session for logged-in User
     */
    private String currentRESTSession;

    /**
     * Stringified current GraphQL session for logged-in User
     */
    private String currentGQLSession;

    /**
     * Returns a list of users personal environments
     */
    private List<UserEnvironment> environments;

    /**
     * Returns the users global environments
     */
    private UserEnvironment globalEnvironments;

    /**
     * Returns a users REST history
     */
    private List<UserHistory> RESTHistory;

    /**
     * Returns a users GraphQL history
     */
    private List<UserHistory> GQLHistory;

    /**
     * Returns user settings
     */
    private UserSettings settings;

    public User build() {
                  User result = new User();
                      result.uid = this.uid;
          result.displayName = this.displayName;
          result.email = this.email;
          result.photoURL = this.photoURL;
          result.isAdmin = this.isAdmin;
          result.createdOn = this.createdOn;
          result.currentRESTSession = this.currentRESTSession;
          result.currentGQLSession = this.currentGQLSession;
          result.environments = this.environments;
          result.globalEnvironments = this.globalEnvironments;
          result.RESTHistory = this.RESTHistory;
          result.GQLHistory = this.GQLHistory;
          result.settings = this.settings;
                      return result;
    }

    /**
     * UID of the user
     */
    public User.Builder uid(String uid) {
      this.uid = uid;
      return this;
    }

    /**
     * Name of the user (if fetched)
     */
    public User.Builder displayName(
        String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * Email of the user
     */
    public User.Builder email(String email) {
      this.email = email;
      return this;
    }

    /**
     * URL to the profile photo of the user (if fetched)
     */
    public User.Builder photoURL(
        String photoURL) {
      this.photoURL = photoURL;
      return this;
    }

    /**
     * Flag to determine if user is an Admin or not
     */
    public User.Builder isAdmin(
        Boolean isAdmin) {
      this.isAdmin = isAdmin;
      return this;
    }

    /**
     * Date when the user account was created
     */
    public User.Builder createdOn(
        OffsetDateTime createdOn) {
      this.createdOn = createdOn;
      return this;
    }

    /**
     * Stringified current REST session for logged-in User
     */
    public User.Builder currentRESTSession(
        String currentRESTSession) {
      this.currentRESTSession = currentRESTSession;
      return this;
    }

    /**
     * Stringified current GraphQL session for logged-in User
     */
    public User.Builder currentGQLSession(
        String currentGQLSession) {
      this.currentGQLSession = currentGQLSession;
      return this;
    }

    /**
     * Returns a list of users personal environments
     */
    public User.Builder environments(
        List<UserEnvironment> environments) {
      this.environments = environments;
      return this;
    }

    /**
     * Returns the users global environments
     */
    public User.Builder globalEnvironments(
        UserEnvironment globalEnvironments) {
      this.globalEnvironments = globalEnvironments;
      return this;
    }

    /**
     * Returns a users REST history
     */
    public User.Builder RESTHistory(
        List<UserHistory> RESTHistory) {
      this.RESTHistory = RESTHistory;
      return this;
    }

    /**
     * Returns a users GraphQL history
     */
    public User.Builder GQLHistory(
        List<UserHistory> GQLHistory) {
      this.GQLHistory = GQLHistory;
      return this;
    }

    /**
     * Returns user settings
     */
    public User.Builder settings(
        UserSettings settings) {
      this.settings = settings;
      return this;
    }
  }
}
