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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * PresentationServiceAgreementIdentifier
 */
@JsonPropertyOrder({
  PresentationServiceAgreementIdentifier.JSON_PROPERTY_ID_IDENTIFIER,
  PresentationServiceAgreementIdentifier.JSON_PROPERTY_NAME_IDENTIFIER,
  PresentationServiceAgreementIdentifier.JSON_PROPERTY_EXTERNAL_ID_IDENTIFIER
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:27.444046600+01:00[Africa/Tunis]")
public  class PresentationServiceAgreementIdentifier {
  public static final String JSON_PROPERTY_ID_IDENTIFIER = "idIdentifier";
  private String idIdentifier;

  public static final String JSON_PROPERTY_NAME_IDENTIFIER = "nameIdentifier";
  private String nameIdentifier;

  public static final String JSON_PROPERTY_EXTERNAL_ID_IDENTIFIER = "externalIdIdentifier";
  private String externalIdIdentifier;


  public PresentationServiceAgreementIdentifier idIdentifier(String idIdentifier) {
    
    this.idIdentifier = idIdentifier;
    return this;
  }

   /**
   * Entity ID.
   * @return idIdentifier
  **/
  @javax.annotation.Nullable
 @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") @Size(min=1,max=36)  @ApiModelProperty(value = "Entity ID.")
  @JsonProperty(JSON_PROPERTY_ID_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIdIdentifier() {
    return idIdentifier;
  }


  public void setIdIdentifier(String idIdentifier) {
    this.idIdentifier = idIdentifier;
  }


  public PresentationServiceAgreementIdentifier nameIdentifier(String nameIdentifier) {
    
    this.nameIdentifier = nameIdentifier;
    return this;
  }

   /**
   * Entity name.
   * @return nameIdentifier
  **/
  @javax.annotation.Nullable
 @Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1,max=128)  @ApiModelProperty(value = "Entity name.")
  @JsonProperty(JSON_PROPERTY_NAME_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNameIdentifier() {
    return nameIdentifier;
  }


  public void setNameIdentifier(String nameIdentifier) {
    this.nameIdentifier = nameIdentifier;
  }


  public PresentationServiceAgreementIdentifier externalIdIdentifier(String externalIdIdentifier) {
    
    this.externalIdIdentifier = externalIdIdentifier;
    return this;
  }

   /**
   * External service agreement identifier.
   * @return externalIdIdentifier
  **/
  @javax.annotation.Nullable
 @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1,max=64)  @ApiModelProperty(value = "External service agreement identifier.")
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalIdIdentifier() {
    return externalIdIdentifier;
  }


  public void setExternalIdIdentifier(String externalIdIdentifier) {
    this.externalIdIdentifier = externalIdIdentifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PresentationServiceAgreementIdentifier presentationServiceAgreementIdentifier = (PresentationServiceAgreementIdentifier) o;
    return Objects.equals(this.idIdentifier, presentationServiceAgreementIdentifier.idIdentifier) &&
        Objects.equals(this.nameIdentifier, presentationServiceAgreementIdentifier.nameIdentifier) &&
        Objects.equals(this.externalIdIdentifier, presentationServiceAgreementIdentifier.externalIdIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idIdentifier, nameIdentifier, externalIdIdentifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PresentationServiceAgreementIdentifier {\n");
    sb.append("    idIdentifier: ").append(toIndentedString(idIdentifier)).append("\n");
    sb.append("    nameIdentifier: ").append(toIndentedString(nameIdentifier)).append("\n");
    sb.append("    externalIdIdentifier: ").append(toIndentedString(externalIdIdentifier)).append("\n");
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

