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
import com.microsphere.approval.service.api.listener.v2.model.PresentationEntitlementDto;
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
 * Filter on assigned policies in combination with External Service agreement and [resource]s + [business function]s
 */
@ApiModel(description = "Filter on assigned policies in combination with External Service agreement and [resource]s + [business function]s")
@JsonPropertyOrder({
  PostFilterPolicyAssignmentRequest.JSON_PROPERTY_EXTERNAL_SERVICE_AGREEMENT_ID,
  PostFilterPolicyAssignmentRequest.JSON_PROPERTY_ENTITLEMENTS,
  PostFilterPolicyAssignmentRequest.JSON_PROPERTY_ADDITIONS
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:49.266495+01:00[Africa/Tunis]")
public  class PostFilterPolicyAssignmentRequest {
  public static final String JSON_PROPERTY_EXTERNAL_SERVICE_AGREEMENT_ID = "externalServiceAgreementId";
  private String externalServiceAgreementId;

  public static final String JSON_PROPERTY_ENTITLEMENTS = "entitlements";
  private List<PresentationEntitlementDto> entitlements = null;

  public static final String JSON_PROPERTY_ADDITIONS = "additions";
  private Map<String, String> additions = null;


  public PostFilterPolicyAssignmentRequest externalServiceAgreementId(String externalServiceAgreementId) {
    
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


  public PostFilterPolicyAssignmentRequest entitlements(List<PresentationEntitlementDto> entitlements) {
    
    this.entitlements = entitlements;
    return this;
  }

  public PostFilterPolicyAssignmentRequest addEntitlementsItem(PresentationEntitlementDto entitlementsItem) {
    if (this.entitlements == null) {
      this.entitlements = new ArrayList<>();
    }
    this.entitlements.add(entitlementsItem);
    return this;
  }

   /**
   * List of resource with functions to filter on.
   * @return entitlements
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "List of resource with functions to filter on.")
  @JsonProperty(JSON_PROPERTY_ENTITLEMENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PresentationEntitlementDto> getEntitlements() {
    return entitlements;
  }


  public void setEntitlements(List<PresentationEntitlementDto> entitlements) {
    this.entitlements = entitlements;
  }


  public PostFilterPolicyAssignmentRequest additions(Map<String, String> additions) {
    
    this.additions = additions;
    return this;
  }

  public PostFilterPolicyAssignmentRequest putAdditionsItem(String key, String additionsItem) {
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
    PostFilterPolicyAssignmentRequest postFilterPolicyAssignmentRequest = (PostFilterPolicyAssignmentRequest) o;
    return Objects.equals(this.externalServiceAgreementId, postFilterPolicyAssignmentRequest.externalServiceAgreementId) &&
        Objects.equals(this.entitlements, postFilterPolicyAssignmentRequest.entitlements) &&
        Objects.equals(this.additions, postFilterPolicyAssignmentRequest.additions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalServiceAgreementId, entitlements, additions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostFilterPolicyAssignmentRequest {\n");
    sb.append("    externalServiceAgreementId: ").append(toIndentedString(externalServiceAgreementId)).append("\n");
    sb.append("    entitlements: ").append(toIndentedString(entitlements)).append("\n");
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

