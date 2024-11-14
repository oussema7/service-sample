package com.microsphere.bank.common.client.api.client.resttemplate.configuration;

import com.microsphere.bank.common.client.api.ApiClientConfigurer;
import com.microsphere.bank.common.client.api.client.resttemplate.configurer.RestTemplateApiClientConfigurer;
import com.microsphere.bank.common.client.api.client.resttemplate.configurer.RestTemplateApiClientFactory;
import com.microsphere.bank.common.client.api.client.resttemplate.configurer.RestTemplateConfigurer;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnMissingBean(ApiClientConfigurer.class)
public class RestTemplateClientConfigurator {

    @Bean
    public RestTemplateConfigurer restTemplateConfigurer() {
        return new RestTemplateConfigurer();
    }

    @Bean
    public RestTemplateApiClientConfigurer restTemplateApiClientConfigurer() {
        return new RestTemplateApiClientConfigurer(restTemplateConfigurer());
    }

    @Bean
    public RestTemplateApiClientFactory restTemplateApiClientFactory() {
        return new RestTemplateApiClientFactory(restTemplateApiClientConfigurer());
    }
}
