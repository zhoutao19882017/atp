package com.bcs.atp.server.gql.mutations;

import com.netflix.graphql.dgs.DgsComponent;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@DgsComponent
public class ShortcodeAdminMutations {
/**
 *     """Revoke Shortcode by ID"""
 *   revokeShortcodeByAdmin(
 *     """The shortcode to delete"""
 *     code: ID!
 *   ): Boolean!
 *
 *   """Create a shortcode for the given request."""
 *   createShortcode(
 *     """JSON string of the request object"""
 *     request: String!
 *
 *     """JSON string of the properties of the embed"""
 *     properties: String
 *   ): Shortcode!
 *
 *   """Update a user generated Shortcode"""
 *   updateEmbedProperties(
 *     """The Shortcode to update"""
 *     code: ID!
 *
 *     """JSON string of the properties of the embed"""
 *     properties: String!
 *   ): Shortcode!
 *
 *   """Revoke a user generated shortcode"""
 *   revokeShortcode(
 *     """The shortcode to remove"""
 *     code: ID!
 *   ): Boolean!
 */
}
