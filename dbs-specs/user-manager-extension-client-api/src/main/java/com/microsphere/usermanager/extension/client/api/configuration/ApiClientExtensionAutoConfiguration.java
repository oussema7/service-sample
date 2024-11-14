package com.microsphere.usermanager.extension.client.api.configuration;


import com.backbase.buildingblocks.communication.http.HttpCommunicationConfiguration;
import com.microsphere.usermanager.extension.client.api.listener.ApiClient;
import com.microsphere.usermanager.extension.client.api.listener.v2.IdentityManagementServiceApi;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import javax.validation.constraints.Pattern;

@Configuration
@AutoConfigureAfter(
  name = {"com.backbase.buildingblocks.communication.http.HttpCommunicationConfiguration",
    "com.microsphere.buildingblocks.backend.security.auth.config.SecurityContextUtilConfiguration"}
)
public class ApiClientExtensionAutoConfiguration {
  private String serviceId = "user-manager";

  @Value("${microsphere.communication.http.default-scheme:http}")
  @Pattern(regexp = "https?")
  private String scheme;

  /**
   * Creates a REST client.
   *
   * @param restTemplate the RestTemplate for the client.
   * @return the client.
   */
  @Bean
  public IdentityManagementServiceApi createIdentityManagementServiceApi(@Qualifier(HttpCommunicationConfiguration.INTER_SERVICE_REST_TEMPLATE_BEAN_NAME) RestTemplate restTemplate){
    return new IdentityManagementServiceApi(this.buildApiClient(restTemplate));
  }

  private ApiClient buildApiClient(RestTemplate restTemplate) {
    ApiClient apiClient = new ApiClient(restTemplate);

    apiClient.setBasePath(scheme + "://" + serviceId);
    apiClient.addDefaultHeader(HttpCommunicationConfiguration.INTERCEPTORS_ENABLED_HEADER,
      Boolean.TRUE.toString());
    return apiClient;
  }
}
