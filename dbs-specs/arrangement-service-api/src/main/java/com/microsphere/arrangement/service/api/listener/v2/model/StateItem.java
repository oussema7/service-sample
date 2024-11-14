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
import com.microsphere.arrangement.service.api.listener.v2.model.AdditionalProperties;
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
 * StateItem
 */
@JsonPropertyOrder({
  StateItem.JSON_PROPERTY_EXTERNAL_STATE_ID,
  StateItem.JSON_PROPERTY_STATE
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:30:51.050595100+01:00[Africa/Tunis]")
public  class StateItem extends AdditionalProperties {
  public static final String JSON_PROPERTY_EXTERNAL_STATE_ID = "externalStateId";
  private String externalStateId;

  public static final String JSON_PROPERTY_STATE = "state";
  private String state;


  public StateItem externalStateId(String externalStateId) {
    
    this.externalStateId = externalStateId;
    return this;
  }

   /**
   * An external unique identifier for the arrangement state object.
   * @return externalStateId
  **/
  @javax.annotation.Nullable
 @Size(max=50)  @ApiModelProperty(value = "An external unique identifier for the arrangement state object.")
  @JsonProperty(JSON_PROPERTY_EXTERNAL_STATE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalStateId() {
    return externalStateId;
  }


  public void setExternalStateId(String externalStateId) {
    this.externalStateId = externalStateId;
  }


  public StateItem state(String state) {
    
    this.state = state;
    return this;
  }

   /**
   * Name that describes the specific arrangement state.
   * @return state
  **/
  @javax.annotation.Nullable
 @Size(max=50)  @ApiModelProperty(value = "Name that describes the specific arrangement state.")
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StateItem stateItem = (StateItem) o;
    return Objects.equals(this.externalStateId, stateItem.externalStateId) &&
        Objects.equals(this.state, stateItem.state) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalStateId, state, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StateItem {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    externalStateId: ").append(toIndentedString(externalStateId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
