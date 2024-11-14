package com.microsphere.bank.common.client.api.client.resttemplate.configurer;

import com.microsphere.bank.common.client.api.SecureApiClientProperties;
import org.springframework.web.client.ResponseErrorHandler;

/**
 * Configuration properties for the api client that depends in the RestTemplate object
 *
 * @author cesarl
 */
public class RestTemplateApiClientProperties extends SecureApiClientProperties {

    private ResponseErrorHandler responseErrorHandler;

    public ResponseErrorHandler getResponseErrorHandler() {
        return responseErrorHandler;
    }

    public void setResponseErrorHandler(ResponseErrorHandler responseErrorHandler) {
        this.responseErrorHandler = responseErrorHandler;
    }
}
