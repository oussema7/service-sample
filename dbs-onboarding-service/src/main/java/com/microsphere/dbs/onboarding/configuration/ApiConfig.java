package com.microsphere.dbs.onboarding.configuration;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import com.microsphere.bank.backend.accounts.api.UpdateIbsApi;
import com.microsphere.bank.backend.legalEntity.api.DefaultApi;

@Configuration
@RequiredArgsConstructor
public class ApiConfig {

  private final ApiConfigurationProperty apiConfigurationProperty;

  @Bean
  public DefaultApi getLegalEntityApi() {
    DefaultApi defaultApi = new DefaultApi();
    defaultApi.setApiClient(new com.microsphere.bank.backend.legalEntity.ApiClient()
        .setBasePath(apiConfigurationProperty.getLegalEntityApiUrl()));
    return defaultApi;
  }

  @Bean
  public com.microsphere.bank.backend.resiliatesubscription.api.DefaultApi resiliateSubscription() {
    com.microsphere.bank.backend.resiliatesubscription.api.DefaultApi defaultApi = new com.microsphere.bank.backend.resiliatesubscription.api.DefaultApi();
    defaultApi.setApiClient(new com.microsphere.bank.backend.resiliatesubscription.ApiClient()
        .setBasePath(apiConfigurationProperty.getLegalEntityApiUrl()));
    return defaultApi;
  }

  @Bean
  public com.microsphere.bank.backend.holding_subscription_client.api.DefaultApi getSubscriptionApi() {
    com.microsphere.bank.backend.holding_subscription_client.api.DefaultApi defaultApi = new com.microsphere.bank.backend.holding_subscription_client.api.DefaultApi();
    defaultApi.setApiClient(new com.microsphere.bank.backend.holding_subscription_client.ApiClient()
        .setBasePath(apiConfigurationProperty.getLegalEntityApiUrl()));
    return defaultApi;
  }

  @Bean
  public com.microsphere.bank.backend.holding_accounts.api.DefaultApi customerAccountsApi() {
    com.microsphere.bank.backend.holding_accounts.api.DefaultApi defaultApi = new com.microsphere.bank.backend.holding_accounts.api.DefaultApi();
    defaultApi.setApiClient(new com.microsphere.bank.backend.holding_accounts.ApiClient()
        .setBasePath(apiConfigurationProperty.getPullAccountUrl()));
    return defaultApi;
  }


  @Bean
  @Primary
  public UpdateIbsApi updateIbsApi() {
    UpdateIbsApi ibsApi = new UpdateIbsApi();
    ibsApi.setApiClient(
        new com.microsphere.bank.backend.accounts.ApiClient().setBasePath(
            apiConfigurationProperty.getIbsApiUrl()));
    return ibsApi;
  }
}
