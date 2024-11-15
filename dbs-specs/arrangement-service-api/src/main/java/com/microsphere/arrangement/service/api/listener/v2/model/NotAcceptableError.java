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
import com.microsphere.arrangement.service.api.listener.v2.model.ApiError;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * NotAcceptableError
 */
@JsonPropertyOrder({
  NotAcceptableError.JSON_PROPERTY_SUPPORTED_MEDIA_TYPES
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:30:51.050595100+01:00[Africa/Tunis]")
public  class NotAcceptableError extends ApiError {
  public static final String JSON_PROPERTY_SUPPORTED_MEDIA_TYPES = "supportedMediaTypes";
  private List<String> supportedMediaTypes = null;


  public NotAcceptableError supportedMediaTypes(List<String> supportedMediaTypes) {
    
    this.supportedMediaTypes = supportedMediaTypes;
    return this;
  }

  public NotAcceptableError addSupportedMediaTypesItem(String supportedMediaTypesItem) {
    if (this.supportedMediaTypes == null) {
      this.supportedMediaTypes = new ArrayList<>();
    }
    this.supportedMediaTypes.add(supportedMediaTypesItem);
    return this;
  }

   /**
   * List of supported media types for this endpoint
   * @return supportedMediaTypes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of supported media types for this endpoint")
  @JsonProperty(JSON_PROPERTY_SUPPORTED_MEDIA_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getSupportedMediaTypes() {
    return supportedMediaTypes;
  }


  public void setSupportedMediaTypes(List<String> supportedMediaTypes) {
    this.supportedMediaTypes = supportedMediaTypes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotAcceptableError notAcceptableError = (NotAcceptableError) o;
    return Objects.equals(this.supportedMediaTypes, notAcceptableError.supportedMediaTypes) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supportedMediaTypes, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotAcceptableError {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    supportedMediaTypes: ").append(toIndentedString(supportedMediaTypes)).append("\n");
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

