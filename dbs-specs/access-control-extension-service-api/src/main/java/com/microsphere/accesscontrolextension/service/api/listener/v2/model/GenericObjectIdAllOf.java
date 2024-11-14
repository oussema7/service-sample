/*
 * Legal Entity Ancestor Service API
 * OpenApi Endpoints for managing Legal Entities Ancestors. 
 *
 * The version of the OpenAPI document: v2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://github.com/Backbase/backbase-openapi-tools).
 * https://github.com/Backbase/backbase-openapi-tools
 * Do not edit the class manually.
 */


package com.microsphere.accesscontrolextension.service.api.listener.v2.model;

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
 * GenericObjectIdAllOf
 */
@JsonPropertyOrder({
  GenericObjectIdAllOf.JSON_PROPERTY_ID
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:46.958085800+01:00[Africa/Tunis]")
public  class GenericObjectIdAllOf {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;


  public GenericObjectIdAllOf id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Universally Unique IDentifier.
   * @return id
  **/
  @javax.annotation.Nullable
 @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") @Size(min=1,max=36)  @ApiModelProperty(value = "Universally Unique IDentifier.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenericObjectIdAllOf genericObjectIdAllOf = (GenericObjectIdAllOf) o;
    return Objects.equals(this.id, genericObjectIdAllOf.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericObjectIdAllOf {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

