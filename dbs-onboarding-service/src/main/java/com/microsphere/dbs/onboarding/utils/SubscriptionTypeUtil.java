package com.microsphere.dbs.onboarding.utils;

import com.backbase.buildingblocks.presentation.errors.BadRequestException;

public class SubscriptionTypeUtil {

  private static final String COMPANY_TYPE = "COMPANY";
  private static final String HOLDING_TYPE = "HOLDING";
  private static final String EXTERNAL_COMPANY_TYPE = "100";
  private static final String EXTERNAL_HOLDING_TYPE = "200";

  public static String getExternalSubscriptionType(String subscriptionType) {
    switch (subscriptionType) {
      case HOLDING_TYPE:
        return EXTERNAL_HOLDING_TYPE;
      case COMPANY_TYPE:
        return EXTERNAL_COMPANY_TYPE;
      default:
        throw new BadRequestException("Invalid subscription type.");
    }
  }

  public static String getSubscriptionType(String externalSubscriptionType) {
    switch (externalSubscriptionType) {
      case EXTERNAL_HOLDING_TYPE:
        return HOLDING_TYPE;
      case EXTERNAL_COMPANY_TYPE:
        return COMPANY_TYPE;
      default:
        throw new BadRequestException("Invalid subscription type.");
    }
  }
}