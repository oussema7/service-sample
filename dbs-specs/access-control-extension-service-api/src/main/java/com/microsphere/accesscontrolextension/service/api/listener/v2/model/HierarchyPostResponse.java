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
import com.microsphere.accesscontrolextension.service.api.listener.v2.model.LegalEntityIdentifier;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * Get legal entity ancestors
 */
@ApiModel(description = "Get legal entity ancestors")
@JsonPropertyOrder({
  HierarchyPostResponse.JSON_PROPERTY_ROOT_ENTITY,
  HierarchyPostResponse.JSON_PROPERTY_SUBSIDIARIES
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:46.958085800+01:00[Africa/Tunis]")
public  class HierarchyPostResponse {
  public static final String JSON_PROPERTY_ROOT_ENTITY = "rootEntity";
  private LegalEntityIdentifier rootEntity;

  public static final String JSON_PROPERTY_SUBSIDIARIES = "subsidiaries";
  private List<LegalEntityIdentifier> subsidiaries = new ArrayList<>();


  public HierarchyPostResponse rootEntity(LegalEntityIdentifier rootEntity) {
    
    this.rootEntity = rootEntity;
    return this;
  }

   /**
   * Get rootEntity
   * @return rootEntity
  **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ROOT_ENTITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public LegalEntityIdentifier getRootEntity() {
    return rootEntity;
  }


  public void setRootEntity(LegalEntityIdentifier rootEntity) {
    this.rootEntity = rootEntity;
  }


  public HierarchyPostResponse subsidiaries(List<LegalEntityIdentifier> subsidiaries) {
    
    this.subsidiaries = subsidiaries;
    return this;
  }

  public HierarchyPostResponse addSubsidiariesItem(LegalEntityIdentifier subsidiariesItem) {
    this.subsidiaries.add(subsidiariesItem);
    return this;
  }

   /**
   * List of subsidiaries
   * @return subsidiaries
  **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "List of subsidiaries")
  @JsonProperty(JSON_PROPERTY_SUBSIDIARIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<LegalEntityIdentifier> getSubsidiaries() {
    return subsidiaries;
  }


  public void setSubsidiaries(List<LegalEntityIdentifier> subsidiaries) {
    this.subsidiaries = subsidiaries;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HierarchyPostResponse hierarchyPostResponse = (HierarchyPostResponse) o;
    return Objects.equals(this.rootEntity, hierarchyPostResponse.rootEntity) &&
        Objects.equals(this.subsidiaries, hierarchyPostResponse.subsidiaries);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rootEntity, subsidiaries);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HierarchyPostResponse {\n");
    sb.append("    rootEntity: ").append(toIndentedString(rootEntity)).append("\n");
    sb.append("    subsidiaries: ").append(toIndentedString(subsidiaries)).append("\n");
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
