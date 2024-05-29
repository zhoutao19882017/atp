package com.bcs.atp.server.gql.mutations;

import com.netflix.graphql.dgs.DgsComponent;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@DgsComponent
public class TeamAdminMutations {
/**
 *   """Create a new team by providing the user uid to nominate as Team owner"""
 *   createTeamByAdmin(
 *     """users uid to make team owner"""
 *     userUid: ID!
 *
 *     """Displayed name of the team"""
 *     name: String!
 *   ): Team!
 *
 *   """Change the role of a user in a team"""
 *   changeUserRoleInTeamByAdmin(
 *     """users UID"""
 *     userUID: ID!
 *
 *     """team ID"""
 *     teamID: ID!
 *
 *     """updated team role"""
 *     newRole: TeamMemberRole!
 *   ): TeamMember!
 *
 *   """Remove the user from a team"""
 *   removeUserFromTeamByAdmin(
 *     """users UID"""
 *     userUid: ID!
 *
 *     """team ID"""
 *     teamID: ID!
 *   ): Boolean!
 *
 *   """Add a user to a team with email and team member role"""
 *   addUserToTeamByAdmin(
 *     """team ID"""
 *     teamID: ID!
 *
 *     """The role of the user to add in the team"""
 *     role: TeamMemberRole!
 *
 *     """Email of the user to add to team"""
 *     userEmail: String!
 *   ): TeamMember!
 *
 *   """Change a team name"""
 *   renameTeamByAdmin(
 *     """ID of the team"""
 *     teamID: ID!
 *
 *     """The updated name of the team"""
 *     newName: String!
 *   ): Team!
 *
 *   """Delete a team"""
 *   deleteTeamByAdmin(
 *     """ID of the team"""
 *     teamID: ID!
 *   ): Boolean!
 *
 *   """Revoke a team Invite by Invite ID"""
 *   revokeTeamInviteByAdmin(
 *     """Team Invite ID"""
 *     inviteID: ID!
 *   ): Boolean!
 *
 *     """Creates a team owned by the executing user"""
 *   createTeam(
 *     """Displayed name of the team"""
 *     name: String!
 *   ): Team!
 *
 *   """Leaves a team the executing user is a part of"""
 *   leaveTeam(
 *     """ID of the Team to leave"""
 *     teamID: ID!
 *   ): Boolean!
 *
 *   """Removes the team member from the team"""
 *   removeTeamMember(
 *     """ID of the Team to remove user from"""
 *     teamID: ID!
 *
 *     """ID of the user to remove from the given team"""
 *     userUid: ID!
 *   ): Boolean!
 *
 *   """Renames a team"""
 *   renameTeam(
 *     """ID of the team"""
 *     teamID: ID!
 *
 *     """The updated name of the team"""
 *     newName: String!
 *   ): Team!
 *
 *   """Deletes the team"""
 *   deleteTeam(
 *     """ID of the team"""
 *     teamID: ID!
 *   ): Boolean!
 *
 *   """Update role of a team member the executing user owns"""
 *   updateTeamMemberRole(
 *     """ID of the affected team"""
 *     teamID: ID!
 *
 *     """UID of the affected user"""
 *     userUid: ID!
 *
 *     """Updated role value"""
 *     newRole: TeamMemberRole!
 *   ): TeamMember!
 *
 *
 *
 *   """Creates a Team Invitation"""
 *   createTeamInvitation(
 *     """ID of the Team ID to invite from"""
 *     teamID: ID!
 *
 *     """Email of the user to invite"""
 *     inviteeEmail: String!
 *
 *     """Role to be given to the user"""
 *     inviteeRole: TeamMemberRole!
 *   ): TeamInvitation!
 *
 *   """Revokes an invitation and deletes it"""
 *   revokeTeamInvitation(
 *     """ID of the invite to revoke"""
 *     inviteID: ID!
 *   ): Boolean!
 *
 *   """Accept an Invitation"""
 *   acceptTeamInvitation(
 *     """ID of the Invite to accept"""
 *     inviteID: ID!
 *   ): TeamMember!
 */
}
