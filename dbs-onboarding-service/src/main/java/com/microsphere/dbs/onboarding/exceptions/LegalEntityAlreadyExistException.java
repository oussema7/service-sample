package com.microsphere.dbs.onboarding.exceptions;

import com.backbase.buildingblocks.presentation.errors.ApiErrorException;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(HttpStatus.BAD_REQUEST)
public class LegalEntityAlreadyExistException extends ApiErrorException {

  private final String errorKey;
  private final String customerId;

  @JsonProperty("errorKey")
  public String getErrorKey() {
    return this.errorKey;
  }

  public LegalEntityAlreadyExistException(String message, String customerId) {
    super(message);
    this.customerId = customerId;
    this.errorKey = "legal-entity-already-exist-in-dbs";
  }

  public String getCustomerId() {
    return customerId;
  }
}
