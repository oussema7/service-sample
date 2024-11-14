package com.microsphere.dbs.onboarding.models;

import java.util.HashMap;
import java.util.Map;
import lombok.Getter;

@Getter
public enum ExternalSubscriptionStatus {

  ACTIVE("ACTIVE"),
  RESCINDED("RESCINDED"),
  INACTIVE("INACTIVE");

  private static final Map<String, ExternalSubscriptionStatus> statusCodeMap = new HashMap<>();

  static {
    statusCodeMap.put("2", ExternalSubscriptionStatus.ACTIVE);
    statusCodeMap.put("1", ExternalSubscriptionStatus.INACTIVE);
    statusCodeMap.put("3", ExternalSubscriptionStatus.RESCINDED);
  }

  private final String value;

  ExternalSubscriptionStatus(String value) {
    this.value = value;
  }

  public static ExternalSubscriptionStatus getStatusFromCode(String value) {
    return statusCodeMap.get(value);
  }

}
