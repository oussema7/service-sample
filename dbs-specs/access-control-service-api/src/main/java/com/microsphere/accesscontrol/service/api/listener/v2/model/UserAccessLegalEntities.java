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
import com.microsphere.accesscontrol.service.api.listener.v2.model.AccessResourceType;
import com.microsphere.accesscontrol.service.api.listener.v2.model.AdditionalPropertiesAware;
import com.microsphere.accesscontrol.service.api.listener.v2.model.UserAccessLegalEntitiesAllOf;
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
 * UserAccessLegalEntities
 */
@JsonPropertyOrder({
  UserAccessLegalEntities.JSON_PROPERTY_ADDITIONS,
  UserAccessLegalEntities.JSON_PROPERTY_CONTEXT_SERVICE_AGREEMENT_ID,
  UserAccessLegalEntities.JSON_PROPERTY_USER_LEGAL_ENTITY_ID,
  UserAccessLegalEntities.JSON_PROPERTY_ACCESS_RESOURCE_TYPE
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:27.444046600+01:00[Africa/Tunis]")
public  class UserAccessLegalEntities {
  public static final String JSON_PROPERTY_ADDITIONS = "additions";
  private Map<String, String> additions = null;

  public static final String JSON_PROPERTY_CONTEXT_SERVICE_AGREEMENT_ID = "contextServiceAgreementId";
  private String contextServiceAgreementId;

  public static final String JSON_PROPERTY_USER_LEGAL_ENTITY_ID = "userLegalEntityId";
  private String userLegalEntityId;

  public static final String JSON_PROPERTY_ACCESS_RESOURCE_TYPE = "accessResourceType";
  private AccessResourceType accessResourceType;


  public UserAccessLegalEntities additions(Map<String, String> additions) {
    
    this.additions = additions;
    return this;
  }

  public UserAccessLegalEntities putAdditionsItem(String key, String additionsItem) {
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


  public UserAccessLegalEntities contextServiceAgreementId(String contextServiceAgreementId) {
    
    this.contextServiceAgreementId = contextServiceAgreementId;
    return this;
  }

   /**
   * Universally Unique Identifier.
   * @return contextServiceAgreementId
  **/
  @javax.annotation.Nullable
 @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  @ApiModelProperty(value = "Universally Unique Identifier.")
  @JsonProperty(JSON_PROPERTY_CONTEXT_SERVICE_AGREEMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getContextServiceAgreementId() {
    return contextServiceAgreementId;
  }


  public void setContextServiceAgreementId(String contextServiceAgreementId) {
    this.contextServiceAgreementId = contextServiceAgreementId;
  }


  public UserAccessLegalEntities userLegalEntityId(String userLegalEntityId) {
    
    this.userLegalEntityId = userLegalEntityId;
    return this;
  }

   /**
   * Universally Unique Identifier.
   * @return userLegalEntityId
  **/
  @NotNull
 @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  @ApiModelProperty(required = true, value = "Universally Unique Identifier.")
  @JsonProperty(JSON_PROPERTY_USER_LEGAL_ENTITY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUserLegalEntityId() {
    return userLegalEntityId;
  }


  public void setUserLegalEntityId(String userLegalEntityId) {
    this.userLegalEntityId = userLegalEntityId;
  }


  public UserAccessLegalEntities accessResourceType(AccessResourceType accessResourceType) {
    
    this.accessResourceType = accessResourceType;
    return this;
  }

   /**
   * Get accessResourceType
   * @return accessResourceType
  **/
  @NotNull
  @Valid
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ACCESS_RESOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AccessResourceType getAccessResourceType() {
    return accessResourceType;
  }


  public void setAccessResourceType(AccessResourceType accessResourceType) {
    this.accessResourceType = accessResourceType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAccessLegalEntities userAccessLegalEntities = (UserAccessLegalEntities) o;
    return Objects.equals(this.additions, userAccessLegalEntities.additions) &&
        Objects.equals(this.contextServiceAgreementId, userAccessLegalEntities.contextServiceAgreementId) &&
        Objects.equals(this.userLegalEntityId, userAccessLegalEntities.userLegalEntityId) &&
        Objects.equals(this.accessResourceType, userAccessLegalEntities.accessResourceType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additions, contextServiceAgreementId, userLegalEntityId, accessResourceType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAccessLegalEntities {\n");
    sb.append("    additions: ").append(toIndentedString(additions)).append("\n");
    sb.append("    contextServiceAgreementId: ").append(toIndentedString(contextServiceAgreementId)).append("\n");
    sb.append("    userLegalEntityId: ").append(toIndentedString(userLegalEntityId)).append("\n");
    sb.append("    accessResourceType: ").append(toIndentedString(accessResourceType)).append("\n");
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

