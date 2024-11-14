package com.microsphere.dbs.onboarding.exceptions;

import com.backbase.buildingblocks.presentation.errors.InternalServerErrorException;

public class RealmNotFoundException extends InternalServerErrorException {

  public RealmNotFoundException(String message) {
    super(message);
  }
}
