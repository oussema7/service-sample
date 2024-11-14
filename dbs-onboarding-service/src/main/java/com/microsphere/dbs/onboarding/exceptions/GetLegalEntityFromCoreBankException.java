package com.microsphere.dbs.onboarding.exceptions;

import com.backbase.buildingblocks.presentation.errors.InternalServerErrorException;

public class GetLegalEntityFromCoreBankException extends InternalServerErrorException {

  public GetLegalEntityFromCoreBankException(Throwable cause) {
    super("Get Legal entity from core bank failed", cause);
  }

}
