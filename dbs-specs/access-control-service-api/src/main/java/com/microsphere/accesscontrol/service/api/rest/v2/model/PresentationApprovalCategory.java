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
package com.microsphere.accesscontrol.service.api.rest.v2.model;

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
 * Category of approval
 */
public enum PresentationApprovalCategory {
  
  ASSIGN_PERMISSIONS("Assign Permissions"),
  
  MANAGE_DATA_GROUPS("Manage Data Groups"),
  
  MANAGE_LIMITS("Manage Limits"),
  
  MANAGE_SHADOW_LIMITS("Manage Shadow Limits"),
  
  UNLOCK_USER("Unlock User"),
  
  MANAGE_FUNCTION_GROUPS("Manage Function Groups");

  private String value;

  PresentationApprovalCategory(String value) {
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
  public static PresentationApprovalCategory fromValue(String value) {
    for (PresentationApprovalCategory b : PresentationApprovalCategory.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

