package com.microsphere.dbs.onboarding.exceptions;

import com.backbase.buildingblocks.presentation.errors.InternalServerErrorException;

public class DefaultPolicyAssignmentException extends InternalServerErrorException {

  public DefaultPolicyAssignmentException(Throwable cause) {
    super("Default policies assignment failed", cause);
  }

}
