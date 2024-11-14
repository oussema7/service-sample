/*
 * Arrangement Manager Service API
 * This API allows other DBS services to operate on products
 *
 * The version of the OpenAPI document: 2.7.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://github.com/Backbase/backbase-openapi-tools).
 * https://github.com/Backbase/backbase-openapi-tools
 * Do not edit the class manually.
 */


package com.microsphere.arrangement.service.api.listener.v2.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Gets or Sets BatchResponseStatusCode
 */
public enum BatchResponseStatusCode {
  
  HTTP_STATUS_OK("200"),
  
  HTTP_STATUS_BAD_REQUEST("400"),
  
  HTTP_STATUS_NOT_FOUND("404"),
  
  HTTP_STATUS_INTERNAL_SERVER_ERROR("500");

  private String value;

  BatchResponseStatusCode(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static BatchResponseStatusCode fromValue(String value) {
    for (BatchResponseStatusCode b : BatchResponseStatusCode.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

