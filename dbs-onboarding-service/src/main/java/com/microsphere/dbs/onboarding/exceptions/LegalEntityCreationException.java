package com.microsphere.dbs.onboarding.exceptions;

import com.backbase.buildingblocks.presentation.errors.InternalServerErrorException;

public class LegalEntityCreationException extends InternalServerErrorException {

  public LegalEntityCreationException(Throwable cause) {
    super("Legal entity creation failed", cause);
  }

}
