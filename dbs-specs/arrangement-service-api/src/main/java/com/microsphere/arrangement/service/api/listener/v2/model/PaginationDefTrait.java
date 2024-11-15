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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * PaginationDefTrait
 */
@JsonPropertyOrder({
  PaginationDefTrait.JSON_PROPERTY_FROM,
  PaginationDefTrait.JSON_PROPERTY_SIZE
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:30:51.050595100+01:00[Africa/Tunis]")
public  class PaginationDefTrait {
  public static final String JSON_PROPERTY_FROM = "from";
  private Integer from = 0;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Integer size = 10;


  public PaginationDefTrait from(Integer from) {
    
    this.from = from;
    return this;
  }

   /**
   * Skip over pages of elements by specifying a start value for the query.
   * minimum: 0
   * @return from
  **/
  @javax.annotation.Nullable
 @Min(0)  @ApiModelProperty(example = "20", value = "Skip over pages of elements by specifying a start value for the query.")
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getFrom() {
    return from;
  }


  public void setFrom(Integer from) {
    this.from = from;
  }


  public PaginationDefTrait size(Integer size) {
    
    this.size = size;
    return this;
  }

   /**
   * Limit the number of elements in the response (defaults to 10).
   * minimum: 1
   * @return size
  **/
  @javax.annotation.Nullable
 @Min(1)  @ApiModelProperty(example = "10", value = "Limit the number of elements in the response (defaults to 10).")
  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getSize() {
    return size;
  }


  public void setSize(Integer size) {
    this.size = size;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaginationDefTrait paginationDefTrait = (PaginationDefTrait) o;
    return Objects.equals(this.from, paginationDefTrait.from) &&
        Objects.equals(this.size, paginationDefTrait.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, size);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaginationDefTrait {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

