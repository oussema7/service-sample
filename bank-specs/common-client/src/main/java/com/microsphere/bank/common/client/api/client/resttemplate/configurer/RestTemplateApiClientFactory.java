package com.microsphere.bank.common.client.api.client.resttemplate.configurer;

import com.microsphere.bank.common.client.api.ApiClientFactory;
import com.microsphere.bank.common.client.api.client.resttemplate.ApiClient;

public class RestTemplateApiClientFactory implements
    ApiClientFactory<ApiClient, RestTemplateApiClientProperties> {

    private RestTemplateApiClientConfigurer configurer;

    public RestTemplateApiClientFactory(RestTemplateApiClientConfigurer configurer) {
        this.configurer = configurer;
    }

    @Override
    public ApiClient create(RestTemplateApiClientProperties properties) {
        ApiClient apiClient = new ApiClient();
        configurer.configure(apiClient, properties);
        return apiClient;
    }
}
