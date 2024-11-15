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
import com.microsphere.accesscontrol.service.api.listener.v2.model.AdditionalPropertiesAware;
import com.microsphere.accesscontrol.service.api.listener.v2.model.GetContextsAllOf;
import com.microsphere.accesscontrol.service.api.listener.v2.model.Usercontextitem;
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
 * GetContexts
 */
@JsonPropertyOrder({
  GetContexts.JSON_PROPERTY_ADDITIONS,
  GetContexts.JSON_PROPERTY_ELEMENTS,
  GetContexts.JSON_PROPERTY_TOTAL_ELEMENTS
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:27.444046600+01:00[Africa/Tunis]")
public  class GetContexts {
  public static final String JSON_PROPERTY_ADDITIONS = "additions";
  private Map<String, String> additions = null;

  public static final String JSON_PROPERTY_ELEMENTS = "elements";
  private List<Usercontextitem> elements = new ArrayList<>();

  public static final String JSON_PROPERTY_TOTAL_ELEMENTS = "totalElements";
  private Long totalElements;


  public GetContexts additions(Map<String, String> additions) {
    
    this.additions = additions;
    return this;
  }

  public GetContexts putAdditionsItem(String key, String additionsItem) {
    if (this.additions == null) {
      this.additions = new HashMap<>();
    }
    this.additions.put(key, additionsItem);
    return this;
  }

   /**
   * Get additions
   * @return additions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADDITIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getAdditions() {
    return additions;
  }


  public void setAdditions(Map<String, String> additions) {
    this.additions = additions;
  }


  public GetContexts elements(List<Usercontextitem> elements) {
    
    this.elements = elements;
    return this;
  }

  public GetContexts addElementsItem(Usercontextitem elementsItem) {
    this.elements.add(elementsItem);
    return this;
  }

   /**
   * List of user contexts
   * @return elements
  **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "List of user contexts")
  @JsonProperty(JSON_PROPERTY_ELEMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Usercontextitem> getElements() {
    return elements;
  }


  public void setElements(List<Usercontextitem> elements) {
    this.elements = elements;
  }


  public GetContexts totalElements(Long totalElements) {
    
    this.totalElements = totalElements;
    return this;
  }

   /**
   * total number of elements matching the query
   * @return totalElements
  **/
  @NotNull
  @ApiModelProperty(required = true, value = "total number of elements matching the query")
  @JsonProperty(JSON_PROPERTY_TOTAL_ELEMENTS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getTotalElements() {
    return totalElements;
  }


  public void setTotalElements(Long totalElements) {
    this.totalElements = totalElements;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetContexts getContexts = (GetContexts) o;
    return Objects.equals(this.additions, getContexts.additions) &&
        Objects.equals(this.elements, getContexts.elements) &&
        Objects.equals(this.totalElements, getContexts.totalElements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additions, elements, totalElements);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetContexts {\n");
    sb.append("    additions: ").append(toIndentedString(additions)).append("\n");
    sb.append("    elements: ").append(toIndentedString(elements)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
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

