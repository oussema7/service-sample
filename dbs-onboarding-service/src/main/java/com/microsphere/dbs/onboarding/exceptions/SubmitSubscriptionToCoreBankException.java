package com.microsphere.dbs.onboarding.exceptions;

import com.backbase.buildingblocks.presentation.errors.InternalServerErrorException;

public class SubmitSubscriptionToCoreBankException extends InternalServerErrorException {

  public SubmitSubscriptionToCoreBankException(Throwable cause) {
    super("Submitting subscription to core bank failed", cause);
  }

}