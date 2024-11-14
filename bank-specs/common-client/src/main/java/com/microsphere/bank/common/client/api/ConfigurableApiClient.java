package com.microsphere.bank.common.client.api;

/**
 * All the api client objects that could be configured must implement this interface.
 * @param <T> The connection type object, this object could be a RestTemplate or an HttpConnection it depends in the
 *           library used to generate the client
 * @author cesarl
 */
public interface ConfigurableApiClient<T> {

    /**
     * Allows to configure the base path url for the api client.
     * @param basePath the base url as String
     * @return optional the api client or other object that could be useful in the configuration process
     */
    Object setBasePath(String basePath);

    /**
     * Retrieves the connection object used by the api client, because the api client could use different objects to
     * perform the http connection (RestTemplate, HttpConnection, OkHttpClient) this method provide a generic way
     * to retrieve this connection object.
     *
     * @return The connection object used by the api client to perform http calls.
     */
    T getConnectionObject();
}