package com.microsphere.onboarding.client.api.configuration;


import com.backbase.buildingblocks.communication.http.HttpCommunicationConfiguration;
import com.microsphere.onboarding.client.api.listener.ApiClient;
import com.microsphere.onboarding.client.api.listener.v2.SubscriptionsApi;
import javax.validation.constraints.Pattern;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@AutoConfigureAfter(
  name = {"com.backbase.buildingblocks.communication.http.HttpCommunicationConfiguration",
    "com.microsphere.buildingblocks.backend.security.auth.config.SecurityContextUtilConfiguration"}
)
public class ApiClientAutoConfiguration {

  private String serviceId = "onboarding-service";

  @Value("${microsphere.communication.http.default-scheme:http}")
  @Pattern(regexp = "https?")
  private String scheme;


  @Bean
  public SubscriptionsApi getLegalEntitySubscriptionCoreBankIdApi(
    @Qualifier(HttpCommunicationConfiguration.INTER_SERVICE_REST_TEMPLATE_BEAN_NAME) RestTemplate restTemplate) {
    return new SubscriptionsApi(this.buildApiClient(restTemplate));
  }

  private ApiClient buildApiClient(RestTemplate restTemplate) {
    ApiClient apiClient = new ApiClient(restTemplate);

    apiClient.setBasePath(scheme + "://" + serviceId);
    apiClient.addDefaultHeader(HttpCommunicationConfiguration.INTERCEPTORS_ENABLED_HEADER,
      Boolean.TRUE.toString());
    return apiClient;
  }
}