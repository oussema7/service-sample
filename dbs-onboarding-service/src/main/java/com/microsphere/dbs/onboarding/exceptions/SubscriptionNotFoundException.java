package com.microsphere.dbs.onboarding.exceptions;
import com.backbase.buildingblocks.presentation.errors.InternalServerErrorException;
import com.backbase.buildingblocks.presentation.errors.NotFoundException;


public class SubscriptionNotFoundException extends NotFoundException {

  public SubscriptionNotFoundException() {
    super("Subscription Not Found Exception");
  }

}
