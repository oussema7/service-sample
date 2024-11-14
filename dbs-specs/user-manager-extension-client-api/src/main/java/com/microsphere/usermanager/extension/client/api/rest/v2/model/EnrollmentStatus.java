/*
Boat Generator configuration:
    useBeanValidation: true
    useOptional: false
    addServletRequest: false
    useLombokAnnotations: false
    openApiNullable: true
    useSetForUniqueItems: false
    useWithModifiers: false
*/
package com.microsphere.usermanager.extension.client.api.rest.v2.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * User Enrollment status (ENROLLED, NOT_ENROLLED or UNKNOWN)
 */
public enum EnrollmentStatus {
  
  ENROLLED("ENROLLED"),
  
  NOT_ENROLLED("NOT_ENROLLED"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  EnrollmentStatus(String value) {
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
  public static EnrollmentStatus fromValue(String value) {
    for (EnrollmentStatus b : EnrollmentStatus.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

