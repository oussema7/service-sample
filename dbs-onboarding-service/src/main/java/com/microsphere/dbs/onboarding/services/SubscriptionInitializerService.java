package com.microsphere.dbs.onboarding.services;

public interface SubscriptionInitializerService {

  void initializeSubscriptionAsync(String customerId, String customerName);

  void initializeIbsAsync(String customerId);
}
