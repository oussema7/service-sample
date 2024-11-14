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
import com.microsphere.accesscontrol.service.api.listener.v2.model.PersistenceApprovalPermissionsGetResponseBodyAllOf;
import com.microsphere.accesscontrol.service.api.listener.v2.model.SelfApprovalPolicy;
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
 * PersistenceApprovalPermissionsGetResponseBody
 */
@JsonPropertyOrder({
  PersistenceApprovalPermissionsGetResponseBody.JSON_PROPERTY_ADDITIONS,
  PersistenceApprovalPermissionsGetResponseBody.JSON_PROPERTY_FUNCTION_GROUP_ID,
  PersistenceApprovalPermissionsGetResponseBody.JSON_PROPERTY_DATA_GROUP_IDS,
  PersistenceApprovalPermissionsGetResponseBody.JSON_PROPERTY_SELF_APPROVAL_POLICIES
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:27.444046600+01:00[Africa/Tunis]")
public  class PersistenceApprovalPermissionsGetResponseBody {
  public static final String JSON_PROPERTY_ADDITIONS = "additions";
  private Map<String, String> additions = null;

  public static final String JSON_PROPERTY_FUNCTION_GROUP_ID = "functionGroupId";
  private String functionGroupId;

  public static final String JSON_PROPERTY_DATA_GROUP_IDS = "dataGroupIds";
  private List<String> dataGroupIds = null;

  public static final String JSON_PROPERTY_SELF_APPROVAL_POLICIES = "selfApprovalPolicies";
  private List<SelfApprovalPolicy> selfApprovalPolicies = null;


  public PersistenceApprovalPermissionsGetResponseBody additions(Map<String, String> additions) {
    
    this.additions = additions;
    return this;
  }

  public PersistenceApprovalPermissionsGetResponseBody putAdditionsItem(String key, String additionsItem) {
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


  public PersistenceApprovalPermissionsGetResponseBody functionGroupId(String functionGroupId) {
    
    this.functionGroupId = functionGroupId;
    return this;
  }

   /**
   * Universally Unique Identifier.
   * @return functionGroupId
  **/
  @NotNull
 @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  @ApiModelProperty(required = true, value = "Universally Unique Identifier.")
  @JsonProperty(JSON_PROPERTY_FUNCTION_GROUP_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFunctionGroupId() {
    return functionGroupId;
  }


  public void setFunctionGroupId(String functionGroupId) {
    this.functionGroupId = functionGroupId;
  }


  public PersistenceApprovalPermissionsGetResponseBody dataGroupIds(List<String> dataGroupIds) {
    
    this.dataGroupIds = dataGroupIds;
    return this;
  }

  public PersistenceApprovalPermissionsGetResponseBody addDataGroupIdsItem(String dataGroupIdsItem) {
    if (this.dataGroupIds == null) {
      this.dataGroupIds = new ArrayList<>();
    }
    this.dataGroupIds.add(dataGroupIdsItem);
    return this;
  }

   /**
   * Get dataGroupIds
   * @return dataGroupIds
  **/
  @javax.annotation.Nullable
 @Size(min=0)  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATA_GROUP_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getDataGroupIds() {
    return dataGroupIds;
  }


  public void setDataGroupIds(List<String> dataGroupIds) {
    this.dataGroupIds = dataGroupIds;
  }


  public PersistenceApprovalPermissionsGetResponseBody selfApprovalPolicies(List<SelfApprovalPolicy> selfApprovalPolicies) {
    
    this.selfApprovalPolicies = selfApprovalPolicies;
    return this;
  }

  public PersistenceApprovalPermissionsGetResponseBody addSelfApprovalPoliciesItem(SelfApprovalPolicy selfApprovalPoliciesItem) {
    if (this.selfApprovalPolicies == null) {
      this.selfApprovalPolicies = new ArrayList<>();
    }
    this.selfApprovalPolicies.add(selfApprovalPoliciesItem);
    return this;
  }

   /**
   * Get selfApprovalPolicies
   * @return selfApprovalPolicies
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SELF_APPROVAL_POLICIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<SelfApprovalPolicy> getSelfApprovalPolicies() {
    return selfApprovalPolicies;
  }


  public void setSelfApprovalPolicies(List<SelfApprovalPolicy> selfApprovalPolicies) {
    this.selfApprovalPolicies = selfApprovalPolicies;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersistenceApprovalPermissionsGetResponseBody persistenceApprovalPermissionsGetResponseBody = (PersistenceApprovalPermissionsGetResponseBody) o;
    return Objects.equals(this.additions, persistenceApprovalPermissionsGetResponseBody.additions) &&
        Objects.equals(this.functionGroupId, persistenceApprovalPermissionsGetResponseBody.functionGroupId) &&
        Objects.equals(this.dataGroupIds, persistenceApprovalPermissionsGetResponseBody.dataGroupIds) &&
        Objects.equals(this.selfApprovalPolicies, persistenceApprovalPermissionsGetResponseBody.selfApprovalPolicies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additions, functionGroupId, dataGroupIds, selfApprovalPolicies);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersistenceApprovalPermissionsGetResponseBody {\n");
    sb.append("    additions: ").append(toIndentedString(additions)).append("\n");
    sb.append("    functionGroupId: ").append(toIndentedString(functionGroupId)).append("\n");
    sb.append("    dataGroupIds: ").append(toIndentedString(dataGroupIds)).append("\n");
    sb.append("    selfApprovalPolicies: ").append(toIndentedString(selfApprovalPolicies)).append("\n");
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
