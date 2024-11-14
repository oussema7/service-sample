package com.microsphere.bank.common.client.api;

public interface ApiClientFactory<T extends ConfigurableApiClient, V extends ApiClientProperties> {

    T create(V properties);
}
