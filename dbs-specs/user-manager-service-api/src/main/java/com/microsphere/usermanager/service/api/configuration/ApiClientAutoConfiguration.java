package com.microsphere.usermanager.service.api.configuration;

import com.backbase.buildingblocks.communication.http.HttpCommunicationConfiguration;
import com.microsphere.usermanager.service.api.listener.ApiClient;
import com.microsphere.usermanager.service.api.listener.v2.IdentityManagementApi;
import com.microsphere.usermanager.service.api.listener.v2.UserManagementApi;
import com.microsphere.usermanager.service.api.listener.v2.UserProfileManagementApi;
import javax.validation.constraints.Pattern;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ConfigurationProperties("microsphere.communication.services.pandp.user.query")
@AutoConfigureAfter(
  name = {"com.backbase.buildingblocks.communication.http.HttpCommunicationConfiguration",
    "com.microsphere.buildingblocks.backend.security.auth.config.SecurityContextUtilConfiguration"}
)
public class ApiClientAutoConfiguration {

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
  public IdentityManagementApi createIdentityManagementApi(
    @Qualifier(HttpCommunicationConfiguration.INTER_SERVICE_REST_TEMPLATE_BEAN_NAME) RestTemplate restTemplate) {
    return new IdentityManagementApi(this.buildApiClient(restTemplate));
  }

  /**
   * Creates a REST client.
   *
   * @param restTemplate the RestTemplate for the client.
   * @return the client.
   */
  @Bean
  public UserManagementApi createUserManagerApi(
    @Qualifier(HttpCommunicationConfiguration.INTER_SERVICE_REST_TEMPLATE_BEAN_NAME) RestTemplate restTemplate) {
    return new UserManagementApi(this.buildApiClient(restTemplate));
  }

  /**
   * Creates a REST client.
   *
   * @param restTemplate the RestTemplate for the client.
   * @return the client.
   */
  @Bean
  public UserProfileManagementApi createUserProfileManagementApi(
    @Qualifier(HttpCommunicationConfiguration.INTER_SERVICE_REST_TEMPLATE_BEAN_NAME) RestTemplate restTemplate) {
    return new UserProfileManagementApi(this.buildApiClient(restTemplate));
  }

  private ApiClient buildApiClient(RestTemplate restTemplate) {
    ApiClient apiClient = new ApiClient(restTemplate);

    apiClient.setBasePath(scheme + "://" + serviceId);
    apiClient.addDefaultHeader(HttpCommunicationConfiguration.INTERCEPTORS_ENABLED_HEADER,
      Boolean.TRUE.toString());
    return apiClient;
  }
}