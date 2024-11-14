/*
 * User Manager service
 * Create, retrieve, and manage users and their relationships with internal (DBS services) and external (CRM systems) resources. 
 *
 * The version of the OpenAPI document: 2.6.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://github.com/Backbase/backbase-openapi-tools).
 * https://github.com/Backbase/backbase-openapi-tools
 * Do not edit the class manually.
 */


package com.microsphere.usermanager.service.api.listener.v2.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.microsphere.usermanager.service.api.listener.v2.model.GetUserIdAndLegalEntityId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * GetUserIdsAndLegalEntities
 */
@JsonPropertyOrder({
  GetUserIdsAndLegalEntities.JSON_PROPERTY_TOTAL_ELEMENTS,
  GetUserIdsAndLegalEntities.JSON_PROPERTY_LEGAL_ENTITIES
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:56.279646600+01:00[Africa/Tunis]")
public  class GetUserIdsAndLegalEntities {
  public static final String JSON_PROPERTY_TOTAL_ELEMENTS = "totalElements";
  private Long totalElements;

  public static final String JSON_PROPERTY_LEGAL_ENTITIES = "legalEntities";
  private List<GetUserIdAndLegalEntityId> legalEntities = new ArrayList<>();


  public GetUserIdsAndLegalEntities totalElements(Long totalElements) {
    
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


  public GetUserIdsAndLegalEntities legalEntities(List<GetUserIdAndLegalEntityId> legalEntities) {
    
    this.legalEntities = legalEntities;
    return this;
  }

  public GetUserIdsAndLegalEntities addLegalEntitiesItem(GetUserIdAndLegalEntityId legalEntitiesItem) {
    this.legalEntities.add(legalEntitiesItem);
    return this;
  }

   /**
   * Get legalEntities
   * @return legalEntities
  **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LEGAL_ENTITIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<GetUserIdAndLegalEntityId> getLegalEntities() {
    return legalEntities;
  }


  public void setLegalEntities(List<GetUserIdAndLegalEntityId> legalEntities) {
    this.legalEntities = legalEntities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetUserIdsAndLegalEntities getUserIdsAndLegalEntities = (GetUserIdsAndLegalEntities) o;
    return Objects.equals(this.totalElements, getUserIdsAndLegalEntities.totalElements) &&
        Objects.equals(this.legalEntities, getUserIdsAndLegalEntities.legalEntities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalElements, legalEntities);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetUserIdsAndLegalEntities {\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    legalEntities: ").append(toIndentedString(legalEntities)).append("\n");
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

