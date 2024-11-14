package com.microsphere.bank.common.client.api;

import java.io.File;

/**
 * Configuration properties for an api client that allows to https connections. The certificate (self-signed or no)
 * must be imported in a key trust store and this must be provided in the <b>trustStore</b> property, if the trustStore
 * is protected by password this must be provided in plain text along with the trustStore.
 *
 * @author cesarl
 */
public class SecureApiClientProperties extends ApiClientProperties {

    private File trustStore;
    private String trustStorePassword;

    public File getTrustStore() {
        return trustStore;
    }

    public void setTrustStore(File trustStore) {
        this.trustStore = trustStore;
    }

    public void setTrustStore(File trustStore, String trustStorePassword) {
        this.trustStore = trustStore;
        this.trustStorePassword = trustStorePassword;
    }

    public String getTrustStorePassword() {
        return trustStorePassword;
    }

}
