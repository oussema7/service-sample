package com.microsphere.bank.common.client.api.client.resttemplate.configurer;

import com.microsphere.bank.common.client.api.ApiClientConfigurer;
import com.microsphere.bank.common.client.api.ConfigurableApiClient;
import org.springframework.web.client.RestTemplate;

/**
 * Class that contains the customization logic for the api client that is generated with the resttemplate library
 * and use a RestTemplate to implement the http calls.
 *
 * @author cesarl
 */
public class RestTemplateApiClientConfigurer implements
    ApiClientConfigurer<RestTemplate, RestTemplateApiClientProperties> {

    private RestTemplateConfigurer restTemplateConfigurer;

    public RestTemplateApiClientConfigurer(RestTemplateConfigurer restTemplateConfigurer) {
        this.restTemplateConfigurer = restTemplateConfigurer;
    }

    public void configure(ConfigurableApiClient<RestTemplate> apiClient, RestTemplateApiClientProperties properties) {
        apiClient.setBasePath(properties.getBasePath());
        restTemplateConfigurer.customize(apiClient.getConnectionObject(), properties);
    }
}
