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
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * Service agreement item
 */
@ApiModel(description = "Service agreement item")
@JsonPropertyOrder({
  ServiceAgreementItemQueryAllOf.JSON_PROPERTY_CREATOR_LEGAL_ENTITY,
  ServiceAgreementItemQueryAllOf.JSON_PROPERTY_STATUS,
  ServiceAgreementItemQueryAllOf.JSON_PROPERTY_ID,
  ServiceAgreementItemQueryAllOf.JSON_PROPERTY_EXTERNAL_ID,
  ServiceAgreementItemQueryAllOf.JSON_PROPERTY_NAME,
  ServiceAgreementItemQueryAllOf.JSON_PROPERTY_DESCRIPTION,
  ServiceAgreementItemQueryAllOf.JSON_PROPERTY_IS_MASTER,
  ServiceAgreementItemQueryAllOf.JSON_PROPERTY_VALID_FROM,
  ServiceAgreementItemQueryAllOf.JSON_PROPERTY_VALID_UNTIL
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:27.444046600+01:00[Africa/Tunis]")
public  class ServiceAgreementItemQueryAllOf {
  public static final String JSON_PROPERTY_CREATOR_LEGAL_ENTITY = "creatorLegalEntity";
  private String creatorLegalEntity;

  public static final String JSON_PROPERTY_STATUS = "status";
  private Status status;

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

  public static final String JSON_PROPERTY_VALID_FROM = "validFrom";
  private OffsetDateTime validFrom;

  public static final String JSON_PROPERTY_VALID_UNTIL = "validUntil";
  private OffsetDateTime validUntil;


  public ServiceAgreementItemQueryAllOf creatorLegalEntity(String creatorLegalEntity) {
    
    this.creatorLegalEntity = creatorLegalEntity;
    return this;
  }

   /**
   * Universally Unique Identifier.
   * @return creatorLegalEntity
  **/
  @javax.annotation.Nullable
 @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  @ApiModelProperty(value = "Universally Unique Identifier.")
  @JsonProperty(JSON_PROPERTY_CREATOR_LEGAL_ENTITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatorLegalEntity() {
    return creatorLegalEntity;
  }


  public void setCreatorLegalEntity(String creatorLegalEntity) {
    this.creatorLegalEntity = creatorLegalEntity;
  }


  public ServiceAgreementItemQueryAllOf status(Status status) {
    
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


  public ServiceAgreementItemQueryAllOf id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Universally Unique Identifier.
   * @return id
  **/
  @javax.annotation.Nullable
 @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  @ApiModelProperty(value = "Universally Unique Identifier.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public ServiceAgreementItemQueryAllOf externalId(String externalId) {
    
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


  public ServiceAgreementItemQueryAllOf name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Service agreement name
   * @return name
  **/
  @javax.annotation.Nullable
 @Size(min=1)  @ApiModelProperty(value = "Service agreement name")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ServiceAgreementItemQueryAllOf description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Service agreement description
   * @return description
  **/
  @javax.annotation.Nullable
 @Size(min=1)  @ApiModelProperty(value = "Service agreement description")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ServiceAgreementItemQueryAllOf isMaster(Boolean isMaster) {
    
    this.isMaster = isMaster;
    return this;
  }

   /**
   * Is master service agreement
   * @return isMaster
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Is master service agreement")
  @JsonProperty(JSON_PROPERTY_IS_MASTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsMaster() {
    return isMaster;
  }


  public void setIsMaster(Boolean isMaster) {
    this.isMaster = isMaster;
  }


  public ServiceAgreementItemQueryAllOf validFrom(OffsetDateTime validFrom) {
    
    this.validFrom = validFrom;
    return this;
  }

   /**
   * Start date and time of the service agreement.
   * @return validFrom
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "Start date and time of the service agreement.")
  @JsonProperty(JSON_PROPERTY_VALID_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getValidFrom() {
    return validFrom;
  }


  public void setValidFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
  }


  public ServiceAgreementItemQueryAllOf validUntil(OffsetDateTime validUntil) {
    
    this.validUntil = validUntil;
    return this;
  }

   /**
   * End date and time of the service agreement.
   * @return validUntil
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "End date and time of the service agreement.")
  @JsonProperty(JSON_PROPERTY_VALID_UNTIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getValidUntil() {
    return validUntil;
  }


  public void setValidUntil(OffsetDateTime validUntil) {
    this.validUntil = validUntil;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceAgreementItemQueryAllOf serviceAgreementItemQueryAllOf = (ServiceAgreementItemQueryAllOf) o;
    return Objects.equals(this.creatorLegalEntity, serviceAgreementItemQueryAllOf.creatorLegalEntity) &&
        Objects.equals(this.status, serviceAgreementItemQueryAllOf.status) &&
        Objects.equals(this.id, serviceAgreementItemQueryAllOf.id) &&
        Objects.equals(this.externalId, serviceAgreementItemQueryAllOf.externalId) &&
        Objects.equals(this.name, serviceAgreementItemQueryAllOf.name) &&
        Objects.equals(this.description, serviceAgreementItemQueryAllOf.description) &&
        Objects.equals(this.isMaster, serviceAgreementItemQueryAllOf.isMaster) &&
        Objects.equals(this.validFrom, serviceAgreementItemQueryAllOf.validFrom) &&
        Objects.equals(this.validUntil, serviceAgreementItemQueryAllOf.validUntil);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creatorLegalEntity, status, id, externalId, name, description, isMaster, validFrom, validUntil);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceAgreementItemQueryAllOf {\n");
    sb.append("    creatorLegalEntity: ").append(toIndentedString(creatorLegalEntity)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    isMaster: ").append(toIndentedString(isMaster)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
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

