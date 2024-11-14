package com.microsphere.dbs.onboarding.exceptions;

import com.backbase.buildingblocks.presentation.errors.InternalServerErrorException;

public class ServiceAgreementCreationException extends InternalServerErrorException {

  public ServiceAgreementCreationException(Throwable cause) {
    super("Service agreement creation failed", cause);
  }

}
