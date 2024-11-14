package com.microsphere.dbs.onboarding.exceptions;

import com.backbase.buildingblocks.presentation.errors.ApiErrorException;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(HttpStatus.NOT_FOUND)
public class LegalEntityNotExistInCoreBankException extends ApiErrorException {

  private String errorKey;

  @JsonProperty("errorKey")
  public String getErrorKey() {
    return this.errorKey;
  }

  public LegalEntityNotExistInCoreBankException(String message) {
    super(message);
    this.errorKey = "legal-entity-not-found-in-core-bank";
  }
}
