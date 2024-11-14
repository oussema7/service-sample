package com.microsphere.bank.common.client.api.client.resttemplate.configurer;

import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.ssl.SSLContextBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.client.BufferingClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.util.StringUtils;
import org.springframework.web.client.RestTemplate;

/**
 * Configure the {@link RestTemplate} object with the {@link RestTemplateApiClientProperties}
 *
 * @author cesarl
 */
public class RestTemplateConfigurer {

    private static final Logger Logger = LoggerFactory.getLogger(RestTemplateConfigurer.class);
    private static final int VALIDATE_AFTER_INACTIVITY = 100;

    public void customize(RestTemplate restTemplate, RestTemplateApiClientProperties properties) {
        if (properties.getResponseErrorHandler() != null) {
            restTemplate.setErrorHandler(properties.getResponseErrorHandler());
        }
        this.configureRequestFactory(restTemplate, properties);
    }

    private void configureRequestFactory(RestTemplate restTemplate, RestTemplateApiClientProperties properties) {
        Logger.debug("Creating request factory");
        PoolingHttpClientConnectionManager connectionManager = createConnectionManager(properties);
        connectionManager.setValidateAfterInactivity(VALIDATE_AFTER_INACTIVITY);
        restTemplate.setRequestFactory(createRequestFactory(connectionManager));
    }

    private BufferingClientHttpRequestFactory createRequestFactory(PoolingHttpClientConnectionManager connManager) {
        CloseableHttpClient httpClient = HttpClients.custom()
                .setConnectionManager(connManager)
                .build();
        HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory(httpClient);
        return new BufferingClientHttpRequestFactory(factory);
    }

    @SuppressWarnings("unchecked")
    private PoolingHttpClientConnectionManager createConnectionManager(RestTemplateApiClientProperties properties) {
        try {
            if (properties.getTrustStore() != null && properties.getTrustStorePassword() != null) {
                return new PoolingHttpClientConnectionManager(createSslHttpRegistry(properties));
            }
            return new PoolingHttpClientConnectionManager();
        } catch (Exception e) {
            Logger.error("Creation of request factory failed with error", e);
            throw new RuntimeException("Creation of request factory failed", e);
        }
    }

    private Registry createSslHttpRegistry(RestTemplateApiClientProperties properties) throws Exception {
        Logger.debug("Creating request factory with SSL Configuration");
        SSLContextBuilder sslContextBuilder = new SSLContextBuilder();
        if (StringUtils.isEmpty(properties.getTrustStorePassword())) {
            sslContextBuilder.loadTrustMaterial(properties.getTrustStore());
        } else {
            sslContextBuilder.loadTrustMaterial(properties.getTrustStore(), properties.getTrustStorePassword().toCharArray());
        }
        SSLConnectionSocketFactory socketFactory = new SSLConnectionSocketFactory(sslContextBuilder.build());
        return RegistryBuilder.create()
                .register("https", socketFactory)
                .build();
    }
}
