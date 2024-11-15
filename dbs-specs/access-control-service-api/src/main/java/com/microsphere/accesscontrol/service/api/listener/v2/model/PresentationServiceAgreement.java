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
import com.microsphere.accesscontrol.service.api.listener.v2.model.Status;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * PresentationServiceAgreement
 */
@JsonPropertyOrder({
  PresentationServiceAgreement.JSON_PROPERTY_CREATOR_LEGAL_ENTITY,
  PresentationServiceAgreement.JSON_PROPERTY_STATUS,
  PresentationServiceAgreement.JSON_PROPERTY_NUMBER_OF_PARTICIPANTS,
  PresentationServiceAgreement.JSON_PROPERTY_CREATOR_LEGAL_ENTITY_NAME,
  PresentationServiceAgreement.JSON_PROPERTY_ID,
  PresentationServiceAgreement.JSON_PROPERTY_EXTERNAL_ID,
  PresentationServiceAgreement.JSON_PROPERTY_NAME,
  PresentationServiceAgreement.JSON_PROPERTY_DESCRIPTION,
  PresentationServiceAgreement.JSON_PROPERTY_IS_MASTER,
  PresentationServiceAgreement.JSON_PROPERTY_VALID_FROM_DATE,
  PresentationServiceAgreement.JSON_PROPERTY_VALID_FROM_TIME,
  PresentationServiceAgreement.JSON_PROPERTY_VALID_UNTIL_DATE,
  PresentationServiceAgreement.JSON_PROPERTY_VALID_UNTIL_TIME
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:27.444046600+01:00[Africa/Tunis]")
public  class PresentationServiceAgreement {
  public static final String JSON_PROPERTY_CREATOR_LEGAL_ENTITY = "creatorLegalEntity";
  private String creatorLegalEntity;

  public static final String JSON_PROPERTY_STATUS = "status";
  private Status status;

  public static final String JSON_PROPERTY_NUMBER_OF_PARTICIPANTS = "numberOfParticipants";
  private BigDecimal numberOfParticipants;

  public static final String JSON_PROPERTY_CREATOR_LEGAL_ENTITY_NAME = "creatorLegalEntityName";
  private String creatorLegalEntityName;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  private String externalId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_IS_MASTER = "isMaster";
  private Boolean isMaster;

  public static final String JSON_PROPERTY_VALID_FROM_DATE = "validFromDate";
  private String validFromDate;

  public static final String JSON_PROPERTY_VALID_FROM_TIME = "validFromTime";
  private String validFromTime;

  public static final String JSON_PROPERTY_VALID_UNTIL_DATE = "validUntilDate";
  private String validUntilDate;

  public static final String JSON_PROPERTY_VALID_UNTIL_TIME = "validUntilTime";
  private String validUntilTime;


  public PresentationServiceAgreement creatorLegalEntity(String creatorLegalEntity) {
    
    this.creatorLegalEntity = creatorLegalEntity;
    return this;
  }

   /**
   * Universally Unique Identifier.
   * @return creatorLegalEntity
  **/
  @NotNull
 @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  @ApiModelProperty(required = true, value = "Universally Unique Identifier.")
  @JsonProperty(JSON_PROPERTY_CREATOR_LEGAL_ENTITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCreatorLegalEntity() {
    return creatorLegalEntity;
  }


  public void setCreatorLegalEntity(String creatorLegalEntity) {
    this.creatorLegalEntity = creatorLegalEntity;
  }


  public PresentationServiceAgreement status(Status status) {
    
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

  public Status getStatus() {
    return status;
  }


  public void setStatus(Status status) {
    this.status = status;
  }


  public PresentationServiceAgreement numberOfParticipants(BigDecimal numberOfParticipants) {
    
    this.numberOfParticipants = numberOfParticipants;
    return this;
  }

   /**
   * number of legal entities participating in the service agreement
   * @return numberOfParticipants
  **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "number of legal entities participating in the service agreement")
  @JsonProperty(JSON_PROPERTY_NUMBER_OF_PARTICIPANTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BigDecimal getNumberOfParticipants() {
    return numberOfParticipants;
  }


  public void setNumberOfParticipants(BigDecimal numberOfParticipants) {
    this.numberOfParticipants = numberOfParticipants;
  }


  public PresentationServiceAgreement creatorLegalEntityName(String creatorLegalEntityName) {
    
    this.creatorLegalEntityName = creatorLegalEntityName;
    return this;
  }

   /**
   * Service agreement creator legal entity name
   * @return creatorLegalEntityName
  **/
  @NotNull
  @ApiModelProperty(required = true, value = "Service agreement creator legal entity name")
  @JsonProperty(JSON_PROPERTY_CREATOR_LEGAL_ENTITY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCreatorLegalEntityName() {
    return creatorLegalEntityName;
  }


  public void setCreatorLegalEntityName(String creatorLegalEntityName) {
    this.creatorLegalEntityName = creatorLegalEntityName;
  }


  public PresentationServiceAgreement id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Universally Unique Identifier.
   * @return id
  **/
  @NotNull
 @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  @ApiModelProperty(required = true, value = "Universally Unique Identifier.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public PresentationServiceAgreement externalId(String externalId) {
    
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


  public PresentationServiceAgreement name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Service agreement name to display
   * @return name
  **/
  @NotNull
 @Size(min=1,max=128)  @ApiModelProperty(required = true, value = "Service agreement name to display")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public PresentationServiceAgreement description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Brief text to describe service agreement
   * @return description
  **/
  @NotNull
 @Size(min=1,max=255)  @ApiModelProperty(required = true, value = "Brief text to describe service agreement")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public PresentationServiceAgreement isMaster(Boolean isMaster) {
    
    this.isMaster = isMaster;
    return this;
  }

   /**
   * Defines default service agreement when none selected, only one can hold true value
   * @return isMaster
  **/
  @NotNull
  @ApiModelProperty(required = true, value = "Defines default service agreement when none selected, only one can hold true value")
  @JsonProperty(JSON_PROPERTY_IS_MASTER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsMaster() {
    return isMaster;
  }


  public void setIsMaster(Boolean isMaster) {
    this.isMaster = isMaster;
  }


  public PresentationServiceAgreement validFromDate(String validFromDate) {
    
    this.validFromDate = validFromDate;
    return this;
  }

   /**
   * Start date of the service agreement. (date-only from RFC3339 - yyyy-MM-dd)
   * @return validFromDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Start date of the service agreement. (date-only from RFC3339 - yyyy-MM-dd)")
  @JsonProperty(JSON_PROPERTY_VALID_FROM_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValidFromDate() {
    return validFromDate;
  }


  public void setValidFromDate(String validFromDate) {
    this.validFromDate = validFromDate;
  }


  public PresentationServiceAgreement validFromTime(String validFromTime) {
    
    this.validFromTime = validFromTime;
    return this;
  }

   /**
   * Start time of the service agreement. (time-only from RFC3339 - HH:mm:ss)
   * @return validFromTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Start time of the service agreement. (time-only from RFC3339 - HH:mm:ss)")
  @JsonProperty(JSON_PROPERTY_VALID_FROM_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValidFromTime() {
    return validFromTime;
  }


  public void setValidFromTime(String validFromTime) {
    this.validFromTime = validFromTime;
  }


  public PresentationServiceAgreement validUntilDate(String validUntilDate) {
    
    this.validUntilDate = validUntilDate;
    return this;
  }

   /**
   * End date of the service agreement. (date-only from RFC3339 - yyyy-MM-dd)
   * @return validUntilDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "End date of the service agreement. (date-only from RFC3339 - yyyy-MM-dd)")
  @JsonProperty(JSON_PROPERTY_VALID_UNTIL_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValidUntilDate() {
    return validUntilDate;
  }


  public void setValidUntilDate(String validUntilDate) {
    this.validUntilDate = validUntilDate;
  }


  public PresentationServiceAgreement validUntilTime(String validUntilTime) {
    
    this.validUntilTime = validUntilTime;
    return this;
  }

   /**
   * End time of the service agreement. (time-only from RFC3339 - HH:mm:ss)
   * @return validUntilTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "End time of the service agreement. (time-only from RFC3339 - HH:mm:ss)")
  @JsonProperty(JSON_PROPERTY_VALID_UNTIL_TIME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getValidUntilTime() {
    return validUntilTime;
  }


  public void setValidUntilTime(String validUntilTime) {
    this.validUntilTime = validUntilTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PresentationServiceAgreement presentationServiceAgreement = (PresentationServiceAgreement) o;
    return Objects.equals(this.creatorLegalEntity, presentationServiceAgreement.creatorLegalEntity) &&
        Objects.equals(this.status, presentationServiceAgreement.status) &&
        Objects.equals(this.numberOfParticipants, presentationServiceAgreement.numberOfParticipants) &&
        Objects.equals(this.creatorLegalEntityName, presentationServiceAgreement.creatorLegalEntityName) &&
        Objects.equals(this.id, presentationServiceAgreement.id) &&
        Objects.equals(this.externalId, presentationServiceAgreement.externalId) &&
        Objects.equals(this.name, presentationServiceAgreement.name) &&
        Objects.equals(this.description, presentationServiceAgreement.description) &&
        Objects.equals(this.isMaster, presentationServiceAgreement.isMaster) &&
        Objects.equals(this.validFromDate, presentationServiceAgreement.validFromDate) &&
        Objects.equals(this.validFromTime, presentationServiceAgreement.validFromTime) &&
        Objects.equals(this.validUntilDate, presentationServiceAgreement.validUntilDate) &&
        Objects.equals(this.validUntilTime, presentationServiceAgreement.validUntilTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creatorLegalEntity, status, numberOfParticipants, creatorLegalEntityName, id, externalId, name, description, isMaster, validFromDate, validFromTime, validUntilDate, validUntilTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PresentationServiceAgreement {\n");
    sb.append("    creatorLegalEntity: ").append(toIndentedString(creatorLegalEntity)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    numberOfParticipants: ").append(toIndentedString(numberOfParticipants)).append("\n");
    sb.append("    creatorLegalEntityName: ").append(toIndentedString(creatorLegalEntityName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isMaster: ").append(toIndentedString(isMaster)).append("\n");
    sb.append("    validFromDate: ").append(toIndentedString(validFromDate)).append("\n");
    sb.append("    validFromTime: ").append(toIndentedString(validFromTime)).append("\n");
    sb.append("    validUntilDate: ").append(toIndentedString(validUntilDate)).append("\n");
    sb.append("    validUntilTime: ").append(toIndentedString(validUntilTime)).append("\n");
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

