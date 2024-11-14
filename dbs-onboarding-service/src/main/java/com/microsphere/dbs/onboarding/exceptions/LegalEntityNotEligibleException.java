package com.microsphere.dbs.onboarding.exceptions;

import com.backbase.buildingblocks.presentation.errors.ApiErrorException;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class LegalEntityNotEligibleException extends ApiErrorException {

  private final String errorKey;

  @JsonProperty("errorKey")
  public String getErrorKey() {
    return this.errorKey;
  }

  public LegalEntityNotEligibleException(String message) {
    super(message);
    this.errorKey = "legal-entity-not-eligible";
  }
}
