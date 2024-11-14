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
import com.microsphere.accesscontrol.service.api.listener.v2.model.NameIdentifier;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * PresentationIdentifier
 */
@JsonPropertyOrder({
  PresentationIdentifier.JSON_PROPERTY_ID_IDENTIFIER,
  PresentationIdentifier.JSON_PROPERTY_NAME_IDENTIFIER
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:27.444046600+01:00[Africa/Tunis]")
public  class PresentationIdentifier {
  public static final String JSON_PROPERTY_ID_IDENTIFIER = "idIdentifier";
  private String idIdentifier;

  public static final String JSON_PROPERTY_NAME_IDENTIFIER = "nameIdentifier";
  private NameIdentifier nameIdentifier;


  public PresentationIdentifier idIdentifier(String idIdentifier) {
    
    this.idIdentifier = idIdentifier;
    return this;
  }

   /**
   * Entity ID.
   * @return idIdentifier
  **/
  @javax.annotation.Nullable
 @Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1,max=36)  @ApiModelProperty(value = "Entity ID.")
  @JsonProperty(JSON_PROPERTY_ID_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getIdIdentifier() {
    return idIdentifier;
  }


  public void setIdIdentifier(String idIdentifier) {
    this.idIdentifier = idIdentifier;
  }


  public PresentationIdentifier nameIdentifier(NameIdentifier nameIdentifier) {
    
    this.nameIdentifier = nameIdentifier;
    return this;
  }

   /**
   * Get nameIdentifier
   * @return nameIdentifier
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_NAME_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public NameIdentifier getNameIdentifier() {
    return nameIdentifier;
  }


  public void setNameIdentifier(NameIdentifier nameIdentifier) {
    this.nameIdentifier = nameIdentifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PresentationIdentifier presentationIdentifier = (PresentationIdentifier) o;
    return Objects.equals(this.idIdentifier, presentationIdentifier.idIdentifier) &&
        Objects.equals(this.nameIdentifier, presentationIdentifier.nameIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idIdentifier, nameIdentifier);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PresentationIdentifier {\n");
    sb.append("    idIdentifier: ").append(toIndentedString(idIdentifier)).append("\n");
    sb.append("    nameIdentifier: ").append(toIndentedString(nameIdentifier)).append("\n");
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

