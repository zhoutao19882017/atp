package com.bcs.atp.server.gql.mutations;

import com.netflix.graphql.dgs.DgsComponent;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@DgsComponent
public class InfraConfigAdminMutations {
  /**
   *   """Update Infra Configs"""
   *   updateInfraConfigs(
   *     """InfraConfigs to update"""
   *     infraConfigs: [InfraConfigArgs!]!
   *   ): [InfraConfig!]!
   *
   *   """Enable or disable analytics collection"""
   *   toggleAnalyticsCollection(
   *     """Toggle analytics collection"""
   *     status: ServiceStatus!
   *   ): Boolean!
   *
   *   """Reset Infra Configs with default values (.env)"""
   *   resetInfraConfigs: Boolean!
   *
   *   """Enable or Disable SSO for login/signup"""
   *   enableAndDisableSSO(
   *     """SSO provider and status"""
   *     providerInfo: [EnableAndDisableSSOArgs!]!
   *   ): Boolean!
   */
}
