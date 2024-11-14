package com.microsphere.bank.common.client.api;

/**
 * The most common properties that could be used to configure an api client object
 *
 * @author cesarl
 */
public class ApiClientProperties {

    private String basePath;

    public String getBasePath() {
        return basePath;
    }

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }
}
