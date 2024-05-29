package com.bcs.atp.server.gql.mutations;

import com.netflix.graphql.dgs.DgsComponent;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@DgsComponent
public class EnvironmentAdminMutations {
/**
 *   """Create a new Team Environment for given Team ID"""
 *   createTeamEnvironment(
 *     """Name of the Team Environment"""
 *     name: String!
 *
 *     """ID of the Team"""
 *     teamID: ID!
 *
 *     """JSON string of the variables object"""
 *     variables: String!
 *   ): TeamEnvironment!
 *
 *   """Delete a Team Environment for given Team ID"""
 *   deleteTeamEnvironment(
 *     """ID of the Team Environment"""
 *     id: ID!
 *   ): Boolean!
 *
 *   """
 *   Add/Edit a single environment variable or variables to a Team Environment
 *   """
 *   updateTeamEnvironment(
 *     """ID of the Team Environment"""
 *     id: ID!
 *
 *     """Name of the Team Environment"""
 *     name: String!
 *
 *     """JSON string of the variables object"""
 *     variables: String!
 *   ): TeamEnvironment!
 *
 *   """Delete all variables from a Team Environment"""
 *   deleteAllVariablesFromTeamEnvironment(
 *     """ID of the Team Environment"""
 *     id: ID!
 *   ): TeamEnvironment!
 *
 *   """Create a duplicate of an existing environment"""
 *   createDuplicateEnvironment(
 *     """ID of the Team Environment"""
 *     id: ID!
 *   ): TeamEnvironment!
 *
 *
 *     """Create a new personal user environment for given user uid"""
 *   createUserEnvironment(
 *     """Name of the User Environment, if global send an empty string"""
 *     name: String!
 *
 *     """JSON string of the variables object"""
 *     variables: String!
 *   ): UserEnvironment!
 *
 *   """Create a new global user environment for given user uid"""
 *   createUserGlobalEnvironment(
 *     """JSON string of the variables object"""
 *     variables: String!
 *   ): UserEnvironment!
 *
 *   """Updates a users personal or global environment"""
 *   updateUserEnvironment(
 *     """ID of the user environment"""
 *     id: ID!
 *
 *     """Name of the User Environment, if global send an empty string"""
 *     name: String!
 *
 *     """JSON string of the variables object"""
 *     variables: String!
 *   ): UserEnvironment!
 *
 *   """Deletes a users personal environment"""
 *   deleteUserEnvironment(
 *     """ID of the user environment"""
 *     id: ID!
 *   ): Boolean!
 *
 *   """Deletes all of users personal environments"""
 *   deleteUserEnvironments: Int!
 *
 *   """Deletes all variables inside a users global environment"""
 *   clearGlobalEnvironments(
 *     """ID of the users global environment"""
 *     id: ID!
 *   ): UserEnvironment!
 */
}
