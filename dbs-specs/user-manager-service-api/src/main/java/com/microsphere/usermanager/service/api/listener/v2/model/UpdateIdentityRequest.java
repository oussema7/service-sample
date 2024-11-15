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
 * UpdateIdentityRequest
 */
@JsonPropertyOrder({
  UpdateIdentityRequest.JSON_PROPERTY_FULL_NAME,
  UpdateIdentityRequest.JSON_PROPERTY_EMAIL_ADDRESS,
  UpdateIdentityRequest.JSON_PROPERTY_MOBILE_NUMBER,
  UpdateIdentityRequest.JSON_PROPERTY_REQUIRED_ACTIONS,
  UpdateIdentityRequest.JSON_PROPERTY_GIVEN_NAME,
  UpdateIdentityRequest.JSON_PROPERTY_FAMILY_NAME,
  UpdateIdentityRequest.JSON_PROPERTY_ATTRIBUTES,
  UpdateIdentityRequest.JSON_PROPERTY_ADDITIONS
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:56.279646600+01:00[Africa/Tunis]")
public  class UpdateIdentityRequest {
  public static final String JSON_PROPERTY_FULL_NAME = "fullName";
  private String fullName;

  public static final String JSON_PROPERTY_EMAIL_ADDRESS = "emailAddress";
  private String emailAddress;

  public static final String JSON_PROPERTY_MOBILE_NUMBER = "mobileNumber";
  private String mobileNumber;

  public static final String JSON_PROPERTY_REQUIRED_ACTIONS = "requiredActions";
  private List<String> requiredActions = null;

  public static final String JSON_PROPERTY_GIVEN_NAME = "givenName";
  private String givenName;

  public static final String JSON_PROPERTY_FAMILY_NAME = "familyName";
  private String familyName;

  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private Map<String, String> attributes = null;

  public static final String JSON_PROPERTY_ADDITIONS = "additions";
  private Map<String, String> additions = null;


  public UpdateIdentityRequest fullName(String fullName) {
    
    this.fullName = fullName;
    return this;
  }

   /**
   * Full name of the user.
   * @return fullName
  **/
  @javax.annotation.Nullable
 @Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1,max=255)  @ApiModelProperty(value = "Full name of the user.")
  @JsonProperty(JSON_PROPERTY_FULL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFullName() {
    return fullName;
  }


  public void setFullName(String fullName) {
    this.fullName = fullName;
  }


  public UpdateIdentityRequest emailAddress(String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * Email address of user.
   * @return emailAddress
  **/
  @javax.annotation.Nullable
 @Size(min=3,max=254)  @ApiModelProperty(value = "Email address of user.")
  @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmailAddress() {
    return emailAddress;
  }


  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public UpdateIdentityRequest mobileNumber(String mobileNumber) {
    
    this.mobileNumber = mobileNumber;
    return this;
  }

   /**
   * Mobile number of user.
   * @return mobileNumber
  **/
  @javax.annotation.Nullable
 @Size(max=20)  @ApiModelProperty(value = "Mobile number of user.")
  @JsonProperty(JSON_PROPERTY_MOBILE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMobileNumber() {
    return mobileNumber;
  }


  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }


  public UpdateIdentityRequest requiredActions(List<String> requiredActions) {
    
    this.requiredActions = requiredActions;
    return this;
  }

  public UpdateIdentityRequest addRequiredActionsItem(String requiredActionsItem) {
    if (this.requiredActions == null) {
      this.requiredActions = new ArrayList<>();
    }
    this.requiredActions.add(requiredActionsItem);
    return this;
  }

   /**
   * User will be required to perform these actions when they next log in. Allowable values are configurable in Identity.
   * @return requiredActions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User will be required to perform these actions when they next log in. Allowable values are configurable in Identity.")
  @JsonProperty(JSON_PROPERTY_REQUIRED_ACTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getRequiredActions() {
    return requiredActions;
  }


  public void setRequiredActions(List<String> requiredActions) {
    this.requiredActions = requiredActions;
  }


  public UpdateIdentityRequest givenName(String givenName) {
    
    this.givenName = givenName;
    return this;
  }

   /**
   * Get givenName
   * @return givenName
  **/
  @javax.annotation.Nullable
 @Size(min=1,max=255)  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_GIVEN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGivenName() {
    return givenName;
  }


  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }


  public UpdateIdentityRequest familyName(String familyName) {
    
    this.familyName = familyName;
    return this;
  }

   /**
   * Get familyName
   * @return familyName
  **/
  @javax.annotation.Nullable
 @Size(max=255)  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FAMILY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFamilyName() {
    return familyName;
  }


  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }


  public UpdateIdentityRequest attributes(Map<String, String> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public UpdateIdentityRequest putAttributesItem(String key, String attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * Custom attributes of the user
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Custom attributes of the user")
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getAttributes() {
    return attributes;
  }


  public void setAttributes(Map<String, String> attributes) {
    this.attributes = attributes;
  }


  public UpdateIdentityRequest additions(Map<String, String> additions) {
    
    this.additions = additions;
    return this;
  }

  public UpdateIdentityRequest putAdditionsItem(String key, String additionsItem) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateIdentityRequest updateIdentityRequest = (UpdateIdentityRequest) o;
    return Objects.equals(this.fullName, updateIdentityRequest.fullName) &&
        Objects.equals(this.emailAddress, updateIdentityRequest.emailAddress) &&
        Objects.equals(this.mobileNumber, updateIdentityRequest.mobileNumber) &&
        Objects.equals(this.requiredActions, updateIdentityRequest.requiredActions) &&
        Objects.equals(this.givenName, updateIdentityRequest.givenName) &&
        Objects.equals(this.familyName, updateIdentityRequest.familyName) &&
        Objects.equals(this.attributes, updateIdentityRequest.attributes) &&
        Objects.equals(this.additions, updateIdentityRequest.additions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fullName, emailAddress, mobileNumber, requiredActions, givenName, familyName, attributes, additions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateIdentityRequest {\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
    sb.append("    requiredActions: ").append(toIndentedString(requiredActions)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

