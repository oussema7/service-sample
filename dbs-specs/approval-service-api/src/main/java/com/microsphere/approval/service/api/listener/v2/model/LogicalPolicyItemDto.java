/*
 * Approvals service
 * Other services approve or reject approvals, and update approval types, policies, and policy assignments.
 *
 * The version of the OpenAPI document: 2.5.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://github.com/Backbase/backbase-openapi-tools).
 * https://github.com/Backbase/backbase-openapi-tools
 * Do not edit the class manually.
 */


package com.microsphere.approval.service.api.listener.v2.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.microsphere.approval.service.api.listener.v2.model.CreatePolicyItemDto;
import com.microsphere.approval.service.api.listener.v2.model.LogicalOperator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * A policy declaration that allows you to add logical operators to the contained policy items.
 */
@ApiModel(description = "A policy declaration that allows you to add logical operators to the contained policy items.")
@JsonPropertyOrder({
  LogicalPolicyItemDto.JSON_PROPERTY_RANK,
  LogicalPolicyItemDto.JSON_PROPERTY_OPERATOR,
  LogicalPolicyItemDto.JSON_PROPERTY_ITEMS,
  LogicalPolicyItemDto.JSON_PROPERTY_ADDITIONS
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:49.266495+01:00[Africa/Tunis]")
public  class LogicalPolicyItemDto {
  public static final String JSON_PROPERTY_RANK = "rank";
  private Integer rank;

  public static final String JSON_PROPERTY_OPERATOR = "operator";
  private LogicalOperator operator;

  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<CreatePolicyItemDto> items = null;

  public static final String JSON_PROPERTY_ADDITIONS = "additions";
  private Map<String, String> additions = null;


  public LogicalPolicyItemDto rank(Integer rank) {
    
    this.rank = rank;
    return this;
  }

   /**
   * Rank of this logical operation with 1 as the highest precedence. The rank must be unique inside the create request.
   * minimum: 1
   * @return rank
  **/
  @javax.annotation.Nullable
 @Min(1)  @ApiModelProperty(value = "Rank of this logical operation with 1 as the highest precedence. The rank must be unique inside the create request.")
  @JsonProperty(JSON_PROPERTY_RANK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Integer getRank() {
    return rank;
  }


  public void setRank(Integer rank) {
    this.rank = rank;
  }


  public LogicalPolicyItemDto operator(LogicalOperator operator) {
    
    this.operator = operator;
    return this;
  }

   /**
   * Get operator
   * @return operator
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_OPERATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public LogicalOperator getOperator() {
    return operator;
  }


  public void setOperator(LogicalOperator operator) {
    this.operator = operator;
  }


  public LogicalPolicyItemDto items(List<CreatePolicyItemDto> items) {
    
    this.items = items;
    return this;
  }

  public LogicalPolicyItemDto addItemsItem(CreatePolicyItemDto itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * List of policy items inside this logical operation.
   * @return items
  **/
  @javax.annotation.Nullable
  @Valid
 @Size(min=0,max=5)  @ApiModelProperty(value = "List of policy items inside this logical operation.")
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<CreatePolicyItemDto> getItems() {
    return items;
  }


  public void setItems(List<CreatePolicyItemDto> items) {
    this.items = items;
  }


  public LogicalPolicyItemDto additions(Map<String, String> additions) {
    
    this.additions = additions;
    return this;
  }

  public LogicalPolicyItemDto putAdditionsItem(String key, String additionsItem) {
    if (this.additions == null) {
      this.additions = new HashMap<>();
    }
    this.additions.put(key, additionsItem);
    return this;
  }

   /**
   * Additional properties
   * @return additions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Additional properties")
  @JsonProperty(JSON_PROPERTY_ADDITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getAdditions() {
    return additions;
  }


  public void setAdditions(Map<String, String> additions) {
    this.additions = additions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogicalPolicyItemDto logicalPolicyItemDto = (LogicalPolicyItemDto) o;
    return Objects.equals(this.rank, logicalPolicyItemDto.rank) &&
        Objects.equals(this.operator, logicalPolicyItemDto.operator) &&
        Objects.equals(this.items, logicalPolicyItemDto.items) &&
        Objects.equals(this.additions, logicalPolicyItemDto.additions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rank, operator, items, additions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogicalPolicyItemDto {\n");
    sb.append("    rank: ").append(toIndentedString(rank)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    additions: ").append(toIndentedString(additions)).append("\n");
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

