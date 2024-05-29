package com.bcs.atp.server.gql.types;

import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.List;

public class TeamCollection {
  /**
   * ID of the collection
   */
  private String id;

  /**
   * Displayed title of the collection
   */
  private String title;

  /**
   * JSON string representing the collection data
   */
  private String data;

  /**
   * ID of the collection
   */
  private String parentID;

  /**
   * Team the collection belongs to
   */
  private Team team;

  /**
   * Return the parent Team Collection (null if root )
   */
  private TeamCollection _parent;

  /**
   * List of children Team Collections
   */
  private List<TeamCollection> children;

  public TeamCollection() {
  }

  public TeamCollection(String id, String title, String data, String parentID, Team team,
      TeamCollection _parent, List<TeamCollection> children) {
    this.id = id;
    this.title = title;
    this.data = data;
    this.parentID = parentID;
    this.team = team;
    this._parent = _parent;
    this.children = children;
  }

  /**
   * ID of the collection
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Displayed title of the collection
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * JSON string representing the collection data
   */
  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  /**
   * ID of the collection
   */
  public String getParentID() {
    return parentID;
  }

  public void setParentID(String parentID) {
    this.parentID = parentID;
  }

  /**
   * Team the collection belongs to
   */
  public Team getTeam() {
    return team;
  }

  public void setTeam(Team team) {
    this.team = team;
  }

  /**
   * Return the parent Team Collection (null if root )
   */
  public TeamCollection getParent() {
    return _parent;
  }

  public void setParent(TeamCollection _parent) {
    this._parent = _parent;
  }

  /**
   * List of children Team Collections
   */
  public List<TeamCollection> getChildren() {
    return children;
  }

  public void setChildren(List<TeamCollection> children) {
    this.children = children;
  }

  @Override
  public String toString() {
    return "TeamCollection{" + "id='" + id + "'," +"title='" + title + "'," +"data='" + data + "'," +"parentID='" + parentID + "'," +"team='" + team + "'," +"parent='" + _parent + "'," +"children='" + children + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeamCollection that = (TeamCollection) o;
        return java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(title, that.title) &&
                            java.util.Objects.equals(data, that.data) &&
                            java.util.Objects.equals(parentID, that.parentID) &&
                            java.util.Objects.equals(team, that.team) &&
                            java.util.Objects.equals(_parent, that._parent) &&
                            java.util.Objects.equals(children, that.children);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, title, data, parentID, team, _parent, children);
  }

  public static TeamCollection.Builder newBuilder(
      ) {
    return new Builder();
  }

  public static class Builder {
    /**
     * ID of the collection
     */
    private String id;

    /**
     * Displayed title of the collection
     */
    private String title;

    /**
     * JSON string representing the collection data
     */
    private String data;

    /**
     * ID of the collection
     */
    private String parentID;

    /**
     * Team the collection belongs to
     */
    private Team team;

    /**
     * Return the parent Team Collection (null if root )
     */
    private TeamCollection _parent;

    /**
     * List of children Team Collections
     */
    private List<TeamCollection> children;

    public TeamCollection build() {
                  TeamCollection result = new TeamCollection();
                      result.id = this.id;
          result.title = this.title;
          result.data = this.data;
          result.parentID = this.parentID;
          result.team = this.team;
          result._parent = this._parent;
          result.children = this.children;
                      return result;
    }

    /**
     * ID of the collection
     */
    public TeamCollection.Builder id(
        String id) {
      this.id = id;
      return this;
    }

    /**
     * Displayed title of the collection
     */
    public TeamCollection.Builder title(
        String title) {
      this.title = title;
      return this;
    }

    /**
     * JSON string representing the collection data
     */
    public TeamCollection.Builder data(
        String data) {
      this.data = data;
      return this;
    }

    /**
     * ID of the collection
     */
    public TeamCollection.Builder parentID(
        String parentID) {
      this.parentID = parentID;
      return this;
    }

    /**
     * Team the collection belongs to
     */
    public TeamCollection.Builder team(
        Team team) {
      this.team = team;
      return this;
    }

    /**
     * Return the parent Team Collection (null if root )
     */
    public TeamCollection.Builder _parent(
        TeamCollection _parent) {
      this._parent = _parent;
      return this;
    }

    /**
     * List of children Team Collections
     */
    public TeamCollection.Builder children(
        List<TeamCollection> children) {
      this.children = children;
      return this;
    }
  }
}
