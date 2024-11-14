package com.microsphere.dbs.onboarding.exceptions;

import com.backbase.buildingblocks.presentation.errors.InternalServerErrorException;

public class GetAccountsFromCoreBankException extends InternalServerErrorException {

  public GetAccountsFromCoreBankException(Throwable cause) {
    super("Get accounts from core bank failed", cause);
  }

}
