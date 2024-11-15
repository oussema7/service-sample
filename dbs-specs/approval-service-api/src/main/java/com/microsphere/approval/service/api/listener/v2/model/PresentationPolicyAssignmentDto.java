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
import com.microsphere.approval.service.api.listener.v2.model.PresentationDataGroupSpecificPolicyAssignmentBulkRequestBounds;
import com.microsphere.approval.service.api.listener.v2.model.PresentationPolicyAssignmentRequestBounds;
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
 * The policy assignment.
 */
@ApiModel(description = "The policy assignment.")
@JsonPropertyOrder({
  PresentationPolicyAssignmentDto.JSON_PROPERTY_ID,
  PresentationPolicyAssignmentDto.JSON_PROPERTY_EXTERNAL_SERVICE_AGREEMENT_ID,
  PresentationPolicyAssignmentDto.JSON_PROPERTY_RESOURCE,
  PresentationPolicyAssignmentDto.JSON_PROPERTY_FUNCTIONS,
  PresentationPolicyAssignmentDto.JSON_PROPERTY_BOUNDS,
  PresentationPolicyAssignmentDto.JSON_PROPERTY_DATA_GROUP_SPECIFIC_BOUNDS,
  PresentationPolicyAssignmentDto.JSON_PROPERTY_ADDITIONS
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:49.266495+01:00[Africa/Tunis]")
public  class PresentationPolicyAssignmentDto {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_EXTERNAL_SERVICE_AGREEMENT_ID = "externalServiceAgreementId";
  private String externalServiceAgreementId;

  public static final String JSON_PROPERTY_RESOURCE = "resource";
  private String resource;

  public static final String JSON_PROPERTY_FUNCTIONS = "functions";
  private List<String> functions = null;

  public static final String JSON_PROPERTY_BOUNDS = "bounds";
  private List<PresentationPolicyAssignmentRequestBounds> bounds = null;

  public static final String JSON_PROPERTY_DATA_GROUP_SPECIFIC_BOUNDS = "dataGroupSpecificBounds";
  private List<PresentationDataGroupSpecificPolicyAssignmentBulkRequestBounds> dataGroupSpecificBounds = null;

  public static final String JSON_PROPERTY_ADDITIONS = "additions";
  private Map<String, String> additions = null;


  public PresentationPolicyAssignmentDto id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Universal Unique Identifier, 
   * @return id
  **/
  @NotNull
 @Pattern(regexp="^[0-9a-fA-F]{8}-?[0-9a-fA-F]{4}-?[1-5][0-9a-fA-F]{3}-?[89abAB][0-9a-fA-F]{3}-?[0-9a-fA-F]{12}$")  @ApiModelProperty(required = true, value = "Universal Unique Identifier, ")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public PresentationPolicyAssignmentDto externalServiceAgreementId(String externalServiceAgreementId) {
    
    this.externalServiceAgreementId = externalServiceAgreementId;
    return this;
  }

   /**
   * A simple definition for an external service agreement identifier.
   * @return externalServiceAgreementId
  **/
  @NotNull
 @Size(min=1,max=64)  @ApiModelProperty(required = true, value = "A simple definition for an external service agreement identifier.")
  @JsonProperty(JSON_PROPERTY_EXTERNAL_SERVICE_AGREEMENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getExternalServiceAgreementId() {
    return externalServiceAgreementId;
  }


  public void setExternalServiceAgreementId(String externalServiceAgreementId) {
    this.externalServiceAgreementId = externalServiceAgreementId;
  }


  public PresentationPolicyAssignmentDto resource(String resource) {
    
    this.resource = resource;
    return this;
  }

   /**
   * This is the name of the resource.
   * @return resource
  **/
  @javax.annotation.Nullable
 @Size(max=32)  @ApiModelProperty(value = "This is the name of the resource.")
  @JsonProperty(JSON_PROPERTY_RESOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getResource() {
    return resource;
  }


  public void setResource(String resource) {
    this.resource = resource;
  }


  public PresentationPolicyAssignmentDto functions(List<String> functions) {
    
    this.functions = functions;
    return this;
  }

  public PresentationPolicyAssignmentDto addFunctionsItem(String functionsItem) {
    if (this.functions == null) {
      this.functions = new ArrayList<>();
    }
    this.functions.add(functionsItem);
    return this;
  }

   /**
   * Business functions to assign the policy to.
   * @return functions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Business functions to assign the policy to.")
  @JsonProperty(JSON_PROPERTY_FUNCTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getFunctions() {
    return functions;
  }


  public void setFunctions(List<String> functions) {
    this.functions = functions;
  }


  public PresentationPolicyAssignmentDto bounds(List<PresentationPolicyAssignmentRequestBounds> bounds) {
    
    this.bounds = bounds;
    return this;
  }

  public PresentationPolicyAssignmentDto addBoundsItem(PresentationPolicyAssignmentRequestBounds boundsItem) {
    if (this.bounds == null) {
      this.bounds = new ArrayList<>();
    }
    this.bounds.add(boundsItem);
    return this;
  }

   /**
   * Get bounds
   * @return bounds
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BOUNDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PresentationPolicyAssignmentRequestBounds> getBounds() {
    return bounds;
  }


  public void setBounds(List<PresentationPolicyAssignmentRequestBounds> bounds) {
    this.bounds = bounds;
  }


  public PresentationPolicyAssignmentDto dataGroupSpecificBounds(List<PresentationDataGroupSpecificPolicyAssignmentBulkRequestBounds> dataGroupSpecificBounds) {
    
    this.dataGroupSpecificBounds = dataGroupSpecificBounds;
    return this;
  }

  public PresentationPolicyAssignmentDto addDataGroupSpecificBoundsItem(PresentationDataGroupSpecificPolicyAssignmentBulkRequestBounds dataGroupSpecificBoundsItem) {
    if (this.dataGroupSpecificBounds == null) {
      this.dataGroupSpecificBounds = new ArrayList<>();
    }
    this.dataGroupSpecificBounds.add(dataGroupSpecificBoundsItem);
    return this;
  }

   /**
   * Get dataGroupSpecificBounds
   * @return dataGroupSpecificBounds
  **/
  @javax.annotation.Nullable
  @Valid
 @Size(min=0,max=10)  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATA_GROUP_SPECIFIC_BOUNDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PresentationDataGroupSpecificPolicyAssignmentBulkRequestBounds> getDataGroupSpecificBounds() {
    return dataGroupSpecificBounds;
  }


  public void setDataGroupSpecificBounds(List<PresentationDataGroupSpecificPolicyAssignmentBulkRequestBounds> dataGroupSpecificBounds) {
    this.dataGroupSpecificBounds = dataGroupSpecificBounds;
  }


  public PresentationPolicyAssignmentDto additions(Map<String, String> additions) {
    
    this.additions = additions;
    return this;
  }

  public PresentationPolicyAssignmentDto putAdditionsItem(String key, String additionsItem) {
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
    PresentationPolicyAssignmentDto presentationPolicyAssignmentDto = (PresentationPolicyAssignmentDto) o;
    return Objects.equals(this.id, presentationPolicyAssignmentDto.id) &&
        Objects.equals(this.externalServiceAgreementId, presentationPolicyAssignmentDto.externalServiceAgreementId) &&
        Objects.equals(this.resource, presentationPolicyAssignmentDto.resource) &&
        Objects.equals(this.functions, presentationPolicyAssignmentDto.functions) &&
        Objects.equals(this.bounds, presentationPolicyAssignmentDto.bounds) &&
        Objects.equals(this.dataGroupSpecificBounds, presentationPolicyAssignmentDto.dataGroupSpecificBounds) &&
        Objects.equals(this.additions, presentationPolicyAssignmentDto.additions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, externalServiceAgreementId, resource, functions, bounds, dataGroupSpecificBounds, additions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PresentationPolicyAssignmentDto {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    externalServiceAgreementId: ").append(toIndentedString(externalServiceAgreementId)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    functions: ").append(toIndentedString(functions)).append("\n");
    sb.append("    bounds: ").append(toIndentedString(bounds)).append("\n");
    sb.append("    dataGroupSpecificBounds: ").append(toIndentedString(dataGroupSpecificBounds)).append("\n");
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

