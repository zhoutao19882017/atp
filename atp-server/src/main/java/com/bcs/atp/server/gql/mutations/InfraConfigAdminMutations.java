package com.bcs.atp.server.gql.mutations;

import com.bcs.atp.server.gql.types.ServiceStatus;
import com.bcs.atp.server.service.InfraConfigService;
import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsMutation;
import com.netflix.graphql.dgs.InputArgument;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

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
  @Autowired
  private InfraConfigService infraConfigService;

    /**
     * Enable or disable analytics collection.
     * @param status Service status to toggle analytics collection.
     * @return true if operation was successful, otherwise false.
     */
    @DgsMutation
    public boolean toggleAnalyticsCollection(@InputArgument("status") ServiceStatus status) {
        try {
            return infraConfigService.toggleAnalyticsCollection(status);
        } catch (Exception ex) {
            log.error("Failed to toggle analytics collection: {}", ex.getMessage());
            throw new RuntimeException("Error toggling analytics collection", ex);
        }
    }
}
