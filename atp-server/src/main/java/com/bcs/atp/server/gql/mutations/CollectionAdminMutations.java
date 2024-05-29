package com.bcs.atp.server.gql.mutations;

import com.netflix.graphql.dgs.DgsComponent;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@DgsComponent
public class CollectionAdminMutations {
/**
 *     """
 *   Creates a collection at the root of the team hierarchy (no parent collection)
 *   """
 *   createRootCollection(
 *     """ID of the team"""
 *     teamID: ID!
 *
 *     """Title of the new collection"""
 *     title: String!
 *
 *     """JSON string representing the collection data"""
 *     data: String
 *   ): TeamCollection!
 *
 *   """Import collections from JSON string to the specified Team"""
 *   importCollectionsFromJSON(
 *     """Id of the team to add to"""
 *     teamID: ID!
 *
 *     """JSON string to import"""
 *     jsonString: String!
 *
 *     """
 *     ID to the collection to which to import to (null if to import to the root of team)
 *     """
 *     parentCollectionID: ID
 *   ): Boolean!
 *
 *   """
 *   Replace existing collections of a specific team with collections in JSON string
 *   """
 *   replaceCollectionsWithJSON(
 *     """Id of the team to add to"""
 *     teamID: ID!
 *
 *     """JSON string to replace with"""
 *     jsonString: String!
 *
 *     """
 *     ID to the collection to which to import to (null if to import to the root of team)
 *     """
 *     parentCollectionID: ID
 *   ): Boolean!
 *
 *   """Create a collection that has a parent collection"""
 *   createChildCollection(
 *     """ID of the parent to the new collection"""
 *     collectionID: ID!
 *
 *     """Title of the new collection"""
 *     childTitle: String!
 *
 *     """JSON string representing the collection data"""
 *     data: String
 *   ): TeamCollection!
 *
 *   """Rename a collection"""
 *   renameCollection(
 *     """ID of the collection"""
 *     collectionID: ID!
 *
 *     """The updated title of the collection"""
 *     newTitle: String!
 *   ): TeamCollection! @deprecated(reason: "Switch to updateTeamCollection mutation instead")
 *
 *   """Delete a collection"""
 *   deleteCollection(
 *     """ID of the collection"""
 *     collectionID: ID!
 *   ): Boolean!
 *
 *   """Move a collection into a new parent collection or the root of the team"""
 *   moveCollection(
 *     """ID of the parent to the new collection"""
 *     parentCollectionID: ID
 *
 *     """ID of the collection"""
 *     collectionID: ID!
 *   ): TeamCollection!
 *
 *   """Update the order of collections"""
 *   updateCollectionOrder(
 *     """ID of the collection"""
 *     collectionID: ID!
 *
 *     """
 *     ID of the collection that comes after the updated collection in its new position
 *     """
 *     destCollID: ID
 *   ): Boolean!
 *
 *   """Update Team Collection details"""
 *   updateTeamCollection(
 *     """ID of the collection"""
 *     collectionID: ID!
 *
 *     """The updated title of the collection"""
 *     newTitle: String
 *
 *     """JSON string representing the collection data"""
 *     data: String
 *   ): TeamCollection!
 *
 *
 *
 *    """Creates root REST user collection(no parent user collection)"""
 *   createRESTRootUserCollection(
 *     """Title of the new user collection"""
 *     title: String!
 *
 *     """JSON string representing the collection data"""
 *     data: String
 *   ): UserCollection!
 *
 *   """Creates root GraphQL user collection(no parent user collection)"""
 *   createGQLRootUserCollection(
 *     """Title of the new user collection"""
 *     title: String!
 *
 *     """JSON string representing the collection data"""
 *     data: String
 *   ): UserCollection!
 *
 *   """Creates a new child GraphQL user collection"""
 *   createGQLChildUserCollection(
 *     """Title of the new user collection"""
 *     title: String!
 *
 *     """ID of the parent to the new user collection"""
 *     parentUserCollectionID: ID!
 *
 *     """JSON string representing the collection data"""
 *     data: String
 *   ): UserCollection!
 *
 *   """Creates a new child REST user collection"""
 *   createRESTChildUserCollection(
 *     """Title of the new user collection"""
 *     title: String!
 *
 *     """ID of the parent to the new user collection"""
 *     parentUserCollectionID: ID!
 *
 *     """JSON string representing the collection data"""
 *     data: String
 *   ): UserCollection!
 *
 *   """Rename a user collection"""
 *   renameUserCollection(
 *     """ID of the user collection"""
 *     userCollectionID: ID!
 *
 *     """The updated title of the user collection"""
 *     newTitle: String!
 *   ): UserCollection!
 *
 *   """Delete a user collection"""
 *   deleteUserCollection(
 *     """ID of the user collection"""
 *     userCollectionID: ID!
 *   ): Boolean!
 *
 *   """Move user collection into new parent or root"""
 *   moveUserCollection(
 *     """ID of the parent to the new collection"""
 *     destCollectionID: ID
 *
 *     """ID of the collection"""
 *     userCollectionID: ID!
 *   ): UserCollection!
 *
 *   """
 *   Update the order of UserCollections inside parent collection or in root
 *   """
 *   updateUserCollectionOrder(
 *     """ID of collection being moved"""
 *     collectionID: ID!
 *
 *     """ID of collection being moved"""
 *     nextCollectionID: ID
 *   ): Boolean!
 *
 *   """Import collections from JSON string to the specified Team"""
 *   importUserCollectionsFromJSON(
 *     """JSON string to import"""
 *     jsonString: String!
 *
 *     """Type of UserCollection"""
 *     reqType: ReqType!
 *
 *     """
 *     ID to the collection to which to import into (null if to import into the root of the user)
 *     """
 *     parentCollectionID: ID
 *   ): Boolean!
 *
 *   """Update a UserCollection"""
 *   updateUserCollection(
 *     """ID of the user collection"""
 *     userCollectionID: ID!
 *
 *     """The updated title of the user collection"""
 *     newTitle: String
 *
 *     """JSON string representing the collection data"""
 *     data: String
 *   ): UserCollection!
 *
 */
}
