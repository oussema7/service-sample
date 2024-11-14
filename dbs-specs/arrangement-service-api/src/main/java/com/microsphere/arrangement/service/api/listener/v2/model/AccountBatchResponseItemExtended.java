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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.microsphere.arrangement.service.api.listener.v2.model.AccountPersistenceAction;
import com.microsphere.arrangement.service.api.listener.v2.model.AdditionalProperties;
import com.microsphere.arrangement.service.api.listener.v2.model.BatchResponseStatusCode;
import com.microsphere.arrangement.service.api.listener.v2.model.ErrorItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * AccountBatchResponseItemExtended
 */
@JsonPropertyOrder({
  AccountBatchResponseItemExtended.JSON_PROPERTY_ARRANGEMENT_ID,
  AccountBatchResponseItemExtended.JSON_PROPERTY_ACTION,
  AccountBatchResponseItemExtended.JSON_PROPERTY_RESOURCE_ID,
  AccountBatchResponseItemExtended.JSON_PROPERTY_STATUS,
  AccountBatchResponseItemExtended.JSON_PROPERTY_ERRORS
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:30:51.050595100+01:00[Africa/Tunis]")
public  class AccountBatchResponseItemExtended extends AdditionalProperties {
  public static final String JSON_PROPERTY_ARRANGEMENT_ID = "arrangementId";
  private String arrangementId;

  public static final String JSON_PROPERTY_ACTION = "action";
  private AccountPersistenceAction action;

  public static final String JSON_PROPERTY_RESOURCE_ID = "resourceId";
  private String resourceId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private BatchResponseStatusCode status;

  public static final String JSON_PROPERTY_ERRORS = "errors";
  private List<ErrorItem> errors = null;


  public AccountBatchResponseItemExtended arrangementId(String arrangementId) {
    
    this.arrangementId = arrangementId;
    return this;
  }

   /**
   * Arrangement id
   * @return arrangementId
  **/
  @javax.annotation.Nullable
 @Size(min=1,max=36)  @ApiModelProperty(value = "Arrangement id")
  @JsonProperty(JSON_PROPERTY_ARRANGEMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getArrangementId() {
    return arrangementId;
  }


  public void setArrangementId(String arrangementId) {
    this.arrangementId = arrangementId;
  }


  public AccountBatchResponseItemExtended action(AccountPersistenceAction action) {
    
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ACTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public AccountPersistenceAction getAction() {
    return action;
  }


  public void setAction(AccountPersistenceAction action) {
    this.action = action;
  }


  public AccountBatchResponseItemExtended resourceId(String resourceId) {
    
    this.resourceId = resourceId;
    return this;
  }

   /**
   * Id of the resource
   * @return resourceId
  **/
  @NotNull
 @Size(min=1)  @ApiModelProperty(required = true, value = "Id of the resource")
  @JsonProperty(JSON_PROPERTY_RESOURCE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getResourceId() {
    return resourceId;
  }


  public void setResourceId(String resourceId) {
    this.resourceId = resourceId;
  }


  public AccountBatchResponseItemExtended status(BatchResponseStatusCode status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BatchResponseStatusCode getStatus() {
    return status;
  }


  public void setStatus(BatchResponseStatusCode status) {
    this.status = status;
  }


  public AccountBatchResponseItemExtended errors(List<ErrorItem> errors) {
    
    this.errors = errors;
    return this;
  }

  public AccountBatchResponseItemExtended addErrorsItem(ErrorItem errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * List of error messages
   * @return errors
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "List of error messages")
  @JsonProperty(JSON_PROPERTY_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ErrorItem> getErrors() {
    return errors;
  }


  public void setErrors(List<ErrorItem> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountBatchResponseItemExtended accountBatchResponseItemExtended = (AccountBatchResponseItemExtended) o;
    return Objects.equals(this.arrangementId, accountBatchResponseItemExtended.arrangementId) &&
        Objects.equals(this.action, accountBatchResponseItemExtended.action) &&
        Objects.equals(this.resourceId, accountBatchResponseItemExtended.resourceId) &&
        Objects.equals(this.status, accountBatchResponseItemExtended.status) &&
        Objects.equals(this.errors, accountBatchResponseItemExtended.errors) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrangementId, action, resourceId, status, errors, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountBatchResponseItemExtended {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    arrangementId: ").append(toIndentedString(arrangementId)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
