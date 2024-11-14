package com.microsphere.bank.common.client.api;

/**
 * Interface that all the configurators classes must implement, the classes that configures an ApiClient object must
 * implement this interface
 *
 * @param <C> The connection object, it could be a RestTemplate or HttpConnection it depends of the library used to generate
 *           the client, it could be any object so it's difficult to constrain the type
 * @param <T> The Properties class used to configure the api Client
 *
 * @author cesarl
 */
public interface ApiClientConfigurer<C, T extends ApiClientProperties> {

    /**
     * Configure an api client object, all the objects that could be configured must implement the interface
     * {@link ConfigurableApiClient}
     * @param apiClient the api client object to be configured
     * @param properties the properties defined for the configuration
     */
    void configure(ConfigurableApiClient<C> apiClient, T properties);
}
