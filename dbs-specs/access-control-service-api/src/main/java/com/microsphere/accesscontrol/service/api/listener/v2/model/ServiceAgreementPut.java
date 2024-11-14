/*
 * Access Control service API
 * Manage user permissions, data groups, function groups and service agreements from service to service side
 *
 * The version of the OpenAPI document: 2.11.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://github.com/Backbase/backbase-openapi-tools).
 * https://github.com/Backbase/backbase-openapi-tools
 * Do not edit the class manually.
 */


package com.microsphere.accesscontrol.service.api.listener.v2.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.microsphere.accesscontrol.service.api.listener.v2.model.AdditionalPropertiesAware;
import com.microsphere.accesscontrol.service.api.listener.v2.model.ServiceAgreementPutAllOf;
import com.microsphere.accesscontrol.service.api.listener.v2.model.Status;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * ServiceAgreementPut
 */
@JsonPropertyOrder({
  ServiceAgreementPut.JSON_PROPERTY_ADDITIONS,
  ServiceAgreementPut.JSON_PROPERTY_NAME,
  ServiceAgreementPut.JSON_PROPERTY_DESCRIPTION,
  ServiceAgreementPut.JSON_PROPERTY_EXTERNAL_ID,
  ServiceAgreementPut.JSON_PROPERTY_VALID_FROM_DATE,
  ServiceAgreementPut.JSON_PROPERTY_VALID_FROM_TIME,
  ServiceAgreementPut.JSON_PROPERTY_VALID_UNTIL_DATE,
  ServiceAgreementPut.JSON_PROPERTY_VALID_UNTIL_TIME,
  ServiceAgreementPut.JSON_PROPERTY_STATUS
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:27.444046600+01:00[Africa/Tunis]")
public  class ServiceAgreementPut {
  public static final String JSON_PROPERTY_ADDITIONS = "additions";
  private Map<String, String> additions = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  private String externalId;

  public static final String JSON_PROPERTY_VALID_FROM_DATE = "validFromDate";
  private String validFromDate;

  public static final String JSON_PROPERTY_VALID_FROM_TIME = "validFromTime";
  private String validFromTime;

  public static final String JSON_PROPERTY_VALID_UNTIL_DATE = "validUntilDate";
  private String validUntilDate;

  public static final String JSON_PROPERTY_VALID_UNTIL_TIME = "validUntilTime";
  private String validUntilTime;

  public static final String JSON_PROPERTY_STATUS = "status";
  private Status status;


  public ServiceAgreementPut additions(Map<String, String> additions) {
    
    this.additions = additions;
    return this;
  }

  public ServiceAgreementPut putAdditionsItem(String key, String additionsItem) {
    if (this.additions == null) {
      this.additions = new HashMap<>();
    }
    this.additions.put(key, additionsItem);
    return this;
  }

   /**
   * Get additions
   * @return additions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADDITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getAdditions() {
    return additions;
  }


  public void setAdditions(Map<String, String> additions) {
    this.additions = additions;
  }


  public ServiceAgreementPut name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Service Agreement name
   * @return name
  **/
  @javax.annotation.Nullable
 @Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1,max=128)  @ApiModelProperty(value = "Service Agreement name")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ServiceAgreementPut description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Service Agreement description
   * @return description
  **/
  @javax.annotation.Nullable
 @Pattern(regexp="^(\\S|\\n)((.|\\n)*(\\S|\\n))?$") @Size(min=1,max=255)  @ApiModelProperty(value = "Service Agreement description")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ServiceAgreementPut externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * External Unique Identifier.
   * @return externalId
  **/
  @javax.annotation.Nullable
 @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1,max=64)  @ApiModelProperty(value = "External Unique Identifier.")
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public ServiceAgreementPut validFromDate(String validFromDate) {
    
    this.validFromDate = validFromDate;
    return this;
  }

   /**
   * Start date of the service agreement.
   * @return validFromDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Start date of the service agreement.")
  @JsonProperty(JSON_PROPERTY_VALID_FROM_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValidFromDate() {
    return validFromDate;
  }


  public void setValidFromDate(String validFromDate) {
    this.validFromDate = validFromDate;
  }


  public ServiceAgreementPut validFromTime(String validFromTime) {
    
    this.validFromTime = validFromTime;
    return this;
  }

   /**
   * Start time of the service agreement.
   * @return validFromTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Start time of the service agreement.")
  @JsonProperty(JSON_PROPERTY_VALID_FROM_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValidFromTime() {
    return validFromTime;
  }


  public void setValidFromTime(String validFromTime) {
    this.validFromTime = validFromTime;
  }


  public ServiceAgreementPut validUntilDate(String validUntilDate) {
    
    this.validUntilDate = validUntilDate;
    return this;
  }

   /**
   * End date of the service agreement.
   * @return validUntilDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "End date of the service agreement.")
  @JsonProperty(JSON_PROPERTY_VALID_UNTIL_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValidUntilDate() {
    return validUntilDate;
  }


  public void setValidUntilDate(String validUntilDate) {
    this.validUntilDate = validUntilDate;
  }


  public ServiceAgreementPut validUntilTime(String validUntilTime) {
    
    this.validUntilTime = validUntilTime;
    return this;
  }

   /**
   * End time of the service agreement.
   * @return validUntilTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "End time of the service agreement.")
  @JsonProperty(JSON_PROPERTY_VALID_UNTIL_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValidUntilTime() {
    return validUntilTime;
  }


  public void setValidUntilTime(String validUntilTime) {
    this.validUntilTime = validUntilTime;
  }


  public ServiceAgreementPut status(Status status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Status getStatus() {
    return status;
  }


  public void setStatus(Status status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceAgreementPut serviceAgreementPut = (ServiceAgreementPut) o;
    return Objects.equals(this.additions, serviceAgreementPut.additions) &&
        Objects.equals(this.name, serviceAgreementPut.name) &&
        Objects.equals(this.description, serviceAgreementPut.description) &&
        Objects.equals(this.externalId, serviceAgreementPut.externalId) &&
        Objects.equals(this.validFromDate, serviceAgreementPut.validFromDate) &&
        Objects.equals(this.validFromTime, serviceAgreementPut.validFromTime) &&
        Objects.equals(this.validUntilDate, serviceAgreementPut.validUntilDate) &&
        Objects.equals(this.validUntilTime, serviceAgreementPut.validUntilTime) &&
        Objects.equals(this.status, serviceAgreementPut.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additions, name, description, externalId, validFromDate, validFromTime, validUntilDate, validUntilTime, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceAgreementPut {\n");
    sb.append("    additions: ").append(toIndentedString(additions)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    validFromDate: ").append(toIndentedString(validFromDate)).append("\n");
    sb.append("    validFromTime: ").append(toIndentedString(validFromTime)).append("\n");
    sb.append("    validUntilDate: ").append(toIndentedString(validUntilDate)).append("\n");
    sb.append("    validUntilTime: ").append(toIndentedString(validUntilTime)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
