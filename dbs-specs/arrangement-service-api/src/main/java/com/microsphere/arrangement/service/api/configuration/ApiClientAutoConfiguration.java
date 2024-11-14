package com.microsphere.arrangement.service.api.configuration;

import com.backbase.buildingblocks.communication.http.HttpCommunicationConfiguration;
import com.microsphere.arrangement.service.api.listener.ApiClient;
import com.microsphere.arrangement.service.api.listener.v2.AccountsApi;
import com.microsphere.arrangement.service.api.listener.v2.ArrangementsApi;
import com.microsphere.arrangement.service.api.listener.v2.ProductKindsApi;
import com.microsphere.arrangement.service.api.listener.v2.ProductSummaryApi;
import com.microsphere.arrangement.service.api.listener.v2.ProductsApi;
import javax.validation.constraints.Pattern;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ConfigurationProperties("microsphere.communication.services.arrangement-manager")
@AutoConfigureAfter(
  name = {"com.backbase.buildingblocks.communication.http.HttpCommunicationConfiguration",
    "com.microsphere.buildingblocks.backend.security.auth.config.SecurityContextUtilConfiguration"}
)
public class ApiClientAutoConfiguration {

  private String serviceId = "arrangement-manager";

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
  public ArrangementsApi createArrangementsApi(
    @Qualifier(HttpCommunicationConfiguration.INTER_SERVICE_REST_TEMPLATE_BEAN_NAME) RestTemplate restTemplate) {
    return new ArrangementsApi(this.buildApiClient(restTemplate));
  }

  /**
   * Creates a REST client.
   *
   * @param restTemplate the RestTemplate for the client.
   * @return the client.
   */
  @Bean
  public ProductKindsApi createProductKindsApi(
    @Qualifier(HttpCommunicationConfiguration.INTER_SERVICE_REST_TEMPLATE_BEAN_NAME) RestTemplate restTemplate) {
    return new ProductKindsApi(this.buildApiClient(restTemplate));
  }

  /**
   * Creates a REST client.
   *
   * @param restTemplate the RestTemplate for the client.
   * @return the client.
   */
  @Bean
  public AccountsApi createAccountsApi(
    @Qualifier(HttpCommunicationConfiguration.INTER_SERVICE_REST_TEMPLATE_BEAN_NAME) RestTemplate restTemplate) {
    return new AccountsApi(this.buildApiClient(restTemplate));
  }

  /**
   * Creates a REST client.
   *
   * @param restTemplate the RestTemplate for the client.
   * @return the client.
   */
  @Bean
  public ProductSummaryApi createProductSummaryApi(
    @Qualifier(HttpCommunicationConfiguration.INTER_SERVICE_REST_TEMPLATE_BEAN_NAME) RestTemplate restTemplate) {
    return new ProductSummaryApi(this.buildApiClient(restTemplate));
  }

  @Bean
  public ProductsApi createProductsApi(
    @Qualifier(HttpCommunicationConfiguration.INTER_SERVICE_REST_TEMPLATE_BEAN_NAME) RestTemplate restTemplate) {
    return new ProductsApi(this.buildApiClient(restTemplate));
  }

  private ApiClient buildApiClient(RestTemplate restTemplate) {
    ApiClient apiClient = new ApiClient(restTemplate);
    apiClient.setBasePath(scheme + "://" + serviceId);
    apiClient.addDefaultHeader(HttpCommunicationConfiguration.INTERCEPTORS_ENABLED_HEADER,
      Boolean.TRUE.toString());
    return apiClient;
  }
}