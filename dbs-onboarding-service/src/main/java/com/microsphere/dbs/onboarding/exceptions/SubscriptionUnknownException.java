package com.microsphere.dbs.onboarding.exceptions;

import com.backbase.buildingblocks.presentation.errors.InternalServerErrorException;

public class SubscriptionUnknownException extends InternalServerErrorException {

  public SubscriptionUnknownException() {
    super("Create subscription unknown exception");
  }

}
