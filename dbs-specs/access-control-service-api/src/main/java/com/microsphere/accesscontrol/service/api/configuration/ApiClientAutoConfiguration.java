package com.microsphere.accesscontrol.service.api.configuration;

import com.microsphere.accesscontrol.service.api.listener.ApiClient;
import com.microsphere.accesscontrol.service.api.listener.v2.DataGroupApi;
import com.microsphere.accesscontrol.service.api.listener.v2.DataGroupsApi;
import com.microsphere.accesscontrol.service.api.listener.v2.FunctionGroupApi;
import com.microsphere.accesscontrol.service.api.listener.v2.FunctionGroupsApi;
import com.microsphere.accesscontrol.service.api.listener.v2.LegalEntitiesApi;
import com.microsphere.accesscontrol.service.api.listener.v2.LegalEntityApi;
import com.microsphere.accesscontrol.service.api.listener.v2.PermissionSetApi;
import com.microsphere.accesscontrol.service.api.listener.v2.ServiceAgreementApi;
import com.microsphere.accesscontrol.service.api.listener.v2.ServiceAgreementsApi;
import com.microsphere.accesscontrol.service.api.listener.v2.ServiceAgreementsQueryApi;
import com.microsphere.accesscontrol.service.api.listener.v2.UserContextApi;
import com.microsphere.accesscontrol.service.api.listener.v2.UserQueryApi;
import com.microsphere.accesscontrol.service.api.listener.v2.UsersApi;
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
@ConfigurationProperties("microsphere.communication.services.accesscontrol")
@AutoConfigureAfter(
  name = {"com.backbase.buildingblocks.communication.http.HttpCommunicationConfiguration",
    "com.microsphere.buildingblocks.backend.security.auth.config.SecurityContextUtilConfiguration"}
)
public class ApiClientAutoConfiguration {

  private String serviceId = "access-control";

  @Value("${microsphere.communication.http.default-scheme:http}")
  @Pattern(regexp = "https?")
  private String scheme;
  @Bean
  public LegalEntitiesApi buildAccessControlLegalEntitiesApi(
    @Qualifier(HttpCommunicationConfiguration.INTER_SERVICE_REST_TEMPLATE_BEAN_NAME)
    RestTemplate restTemplate) {
    return new LegalEntitiesApi(this.buildApiClient(restTemplate));
  }

  @Bean
  public LegalEntityApi buildAccessControlLegalEntityApi(
    @Qualifier(HttpCommunicationConfiguration.INTER_SERVICE_REST_TEMPLATE_BEAN_NAME)
    RestTemplate restTemplate) {
    return new LegalEntityApi(this.buildApiClient(restTemplate));
  }

  @Bean
  public UserQueryApi buildAccessControlUserQueryApi(
    @Qualifier(HttpCommunicationConfiguration.INTER_SERVICE_REST_TEMPLATE_BEAN_NAME)
    RestTemplate restTemplate) {
    return new UserQueryApi(this.buildApiClient(restTemplate));
  }

  @Bean
  public UsersApi buildAccessControlUsersApi(
    @Qualifier(HttpCommunicationConfiguration.INTER_SERVICE_REST_TEMPLATE_BEAN_NAME)
    RestTemplate restTemplate) {
    return new UsersApi(this.buildApiClient(restTemplate));
  }

  @Bean
  public FunctionGroupApi buildAccessControlFunctionGroupApi(
    @Qualifier(HttpCommunicationConfiguration.INTER_SERVICE_REST_TEMPLATE_BEAN_NAME)
    RestTemplate restTemplate) {
    return new FunctionGroupApi(this.buildApiClient(restTemplate));
  }

  @Bean
  public FunctionGroupsApi buildAccessControlFunctionGroupsApi(
    @Qualifier(HttpCommunicationConfiguration.INTER_SERVICE_REST_TEMPLATE_BEAN_NAME)
    RestTemplate restTemplate) {
    return new FunctionGroupsApi(this.buildApiClient(restTemplate));
  }

  @Bean
  public DataGroupApi buildAccessControlDataGroupApi(
    @Qualifier(HttpCommunicationConfiguration.INTER_SERVICE_REST_TEMPLATE_BEAN_NAME)
    RestTemplate restTemplate) {
    return new DataGroupApi(this.buildApiClient(restTemplate));
  }

  @Bean
  public DataGroupsApi buildAccessControlDataGroupsApi(
    @Qualifier(HttpCommunicationConfiguration.INTER_SERVICE_REST_TEMPLATE_BEAN_NAME)
    RestTemplate restTemplate) {
    return new DataGroupsApi(this.buildApiClient(restTemplate));
  }

  @Bean
  public ServiceAgreementApi buildAccessControlServiceAgreementApi(
    @Qualifier(HttpCommunicationConfiguration.INTER_SERVICE_REST_TEMPLATE_BEAN_NAME)
    RestTemplate restTemplate) {
    return new ServiceAgreementApi(this.buildApiClient(restTemplate));
  }

  @Bean
  public ServiceAgreementsApi buildAccessControlServiceAgreementsApi(
    @Qualifier(HttpCommunicationConfiguration.INTER_SERVICE_REST_TEMPLATE_BEAN_NAME)
    RestTemplate restTemplate) {
    return new ServiceAgreementsApi(this.buildApiClient(restTemplate));
  }

  @Bean
  public UserContextApi buildUserContextApi(
    @Qualifier(HttpCommunicationConfiguration.INTER_SERVICE_REST_TEMPLATE_BEAN_NAME)
    RestTemplate restTemplate) {
    return new UserContextApi(this.buildApiClient(restTemplate));
  }

  @Bean
  public PermissionSetApi buildPermissionSetApi(
    @Qualifier(HttpCommunicationConfiguration.INTER_SERVICE_REST_TEMPLATE_BEAN_NAME)
    RestTemplate restTemplate) {
    return new PermissionSetApi(this.buildApiClient(restTemplate));
  }

  @Bean
  public ServiceAgreementsQueryApi buildServiceAgreementsQueryApi(
    @Qualifier(HttpCommunicationConfiguration.INTER_SERVICE_REST_TEMPLATE_BEAN_NAME)
    RestTemplate restTemplate) {
    return new ServiceAgreementsQueryApi(this.buildApiClient(restTemplate));
  }

  private ApiClient buildApiClient(RestTemplate restTemplate) {
    ApiClient apiClient = new ApiClient(restTemplate);
    apiClient.setBasePath(scheme + "://" + serviceId);
    apiClient.addDefaultHeader(HttpCommunicationConfiguration.INTERCEPTORS_ENABLED_HEADER,
      Boolean.TRUE.toString());
    return apiClient;
  }


}