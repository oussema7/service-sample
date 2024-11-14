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
import com.microsphere.accesscontrol.service.api.listener.v2.model.PresentationDataGroupIdentifier;
import com.microsphere.accesscontrol.service.api.listener.v2.model.PresentationIdentifier;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * Function/Data group pair
 */
@ApiModel(description = "Function/Data group pair")
@JsonPropertyOrder({
  PresentationFunctionGroupDataGroup.JSON_PROPERTY_FUNCTION_GROUP_IDENTIFIER,
  PresentationFunctionGroupDataGroup.JSON_PROPERTY_DATA_GROUP_IDENTIFIERS
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:27.444046600+01:00[Africa/Tunis]")
public  class PresentationFunctionGroupDataGroup {
  public static final String JSON_PROPERTY_FUNCTION_GROUP_IDENTIFIER = "functionGroupIdentifier";
  private PresentationIdentifier functionGroupIdentifier;

  public static final String JSON_PROPERTY_DATA_GROUP_IDENTIFIERS = "dataGroupIdentifiers";
  private List<PresentationDataGroupIdentifier> dataGroupIdentifiers = null;


  public PresentationFunctionGroupDataGroup functionGroupIdentifier(PresentationIdentifier functionGroupIdentifier) {
    
    this.functionGroupIdentifier = functionGroupIdentifier;
    return this;
  }

   /**
   * Get functionGroupIdentifier
   * @return functionGroupIdentifier
  **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_FUNCTION_GROUP_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public PresentationIdentifier getFunctionGroupIdentifier() {
    return functionGroupIdentifier;
  }


  public void setFunctionGroupIdentifier(PresentationIdentifier functionGroupIdentifier) {
    this.functionGroupIdentifier = functionGroupIdentifier;
  }


  public PresentationFunctionGroupDataGroup dataGroupIdentifiers(List<PresentationDataGroupIdentifier> dataGroupIdentifiers) {
    
    this.dataGroupIdentifiers = dataGroupIdentifiers;
    return this;
  }

  public PresentationFunctionGroupDataGroup addDataGroupIdentifiersItem(PresentationDataGroupIdentifier dataGroupIdentifiersItem) {
    if (this.dataGroupIdentifiers == null) {
      this.dataGroupIdentifiers = new ArrayList<>();
    }
    this.dataGroupIdentifiers.add(dataGroupIdentifiersItem);
    return this;
  }

   /**
   * Identifiers of the data groups that belong to the given function group
   * @return dataGroupIdentifiers
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "Identifiers of the data groups that belong to the given function group")
  @JsonProperty(JSON_PROPERTY_DATA_GROUP_IDENTIFIERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PresentationDataGroupIdentifier> getDataGroupIdentifiers() {
    return dataGroupIdentifiers;
  }


  public void setDataGroupIdentifiers(List<PresentationDataGroupIdentifier> dataGroupIdentifiers) {
    this.dataGroupIdentifiers = dataGroupIdentifiers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PresentationFunctionGroupDataGroup presentationFunctionGroupDataGroup = (PresentationFunctionGroupDataGroup) o;
    return Objects.equals(this.functionGroupIdentifier, presentationFunctionGroupDataGroup.functionGroupIdentifier) &&
        Objects.equals(this.dataGroupIdentifiers, presentationFunctionGroupDataGroup.dataGroupIdentifiers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(functionGroupIdentifier, dataGroupIdentifiers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PresentationFunctionGroupDataGroup {\n");
    sb.append("    functionGroupIdentifier: ").append(toIndentedString(functionGroupIdentifier)).append("\n");
    sb.append("    dataGroupIdentifiers: ").append(toIndentedString(dataGroupIdentifiers)).append("\n");
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
