package com.microsphere.approval.service.api.configuration;

import com.microsphere.approval.service.api.listener.ApiClient;
import com.microsphere.approval.service.api.listener.v2.ApprovalsApi;
import com.microsphere.approval.service.api.listener.v2.PolicyAssignmentsApi;
import com.backbase.buildingblocks.communication.http.HttpCommunicationConfiguration;
import javax.validation.constraints.Pattern;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ConfigurationProperties("microsphere.communication.services.approval")
@AutoConfigureAfter(
  name = {"com.backbase.buildingblocks.communication.http.HttpCommunicationConfiguration",
    "com.microsphere.buildingblocks.backend.security.auth.config.SecurityContextUtilConfiguration"}
)
public class ApiClientAutoConfiguration {

  private String serviceId = "approval-service";

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
  public ApprovalsApi createApprovalsApi(
    @Qualifier(HttpCommunicationConfiguration.INTER_SERVICE_REST_TEMPLATE_BEAN_NAME) RestTemplate restTemplate) {
    return new ApprovalsApi(this.buildApiClient(restTemplate));
  }

  @Bean
  public PolicyAssignmentsApi createPolicyAssignmentsApi(
    @Qualifier(HttpCommunicationConfiguration.INTER_SERVICE_REST_TEMPLATE_BEAN_NAME) RestTemplate restTemplate) {
    return new PolicyAssignmentsApi(this.buildApiClient(restTemplate));
  }

  private ApiClient buildApiClient(RestTemplate restTemplate) {
    ApiClient apiClient = new ApiClient(restTemplate);
    apiClient.setBasePath(scheme + "://" + serviceId);
    apiClient.addDefaultHeader(HttpCommunicationConfiguration.INTERCEPTORS_ENABLED_HEADER,
      Boolean.TRUE.toString());
    return apiClient;
  }
}