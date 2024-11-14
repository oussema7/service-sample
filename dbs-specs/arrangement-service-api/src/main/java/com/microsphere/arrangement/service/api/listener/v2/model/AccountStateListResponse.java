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
import com.microsphere.arrangement.service.api.listener.v2.model.AccountStateStateItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * AccountStateListResponse
 */
@JsonPropertyOrder({
  AccountStateListResponse.JSON_PROPERTY_STATES
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:30:51.050595100+01:00[Africa/Tunis]")
public  class AccountStateListResponse {
  public static final String JSON_PROPERTY_STATES = "states";
  private List<AccountStateStateItem> states = new ArrayList<>();


  public AccountStateListResponse states(List<AccountStateStateItem> states) {
    
    this.states = states;
    return this;
  }

  public AccountStateListResponse addStatesItem(AccountStateStateItem statesItem) {
    this.states.add(statesItem);
    return this;
  }

   /**
   * Get states
   * @return states
  **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_STATES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<AccountStateStateItem> getStates() {
    return states;
  }


  public void setStates(List<AccountStateStateItem> states) {
    this.states = states;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountStateListResponse accountStateListResponse = (AccountStateListResponse) o;
    return Objects.equals(this.states, accountStateListResponse.states);
  }

  @Override
  public int hashCode() {
    return Objects.hash(states);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountStateListResponse {\n");
    sb.append("    states: ").append(toIndentedString(states)).append("\n");
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
