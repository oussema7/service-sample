package com.microsphere.dbs.onboarding.exceptions;

import com.backbase.buildingblocks.presentation.errors.InternalServerErrorException;

public class ResiliateSubscriptionException extends InternalServerErrorException {

  public ResiliateSubscriptionException(){
    super("Subscription core bank resiliation failed");
  }

}
