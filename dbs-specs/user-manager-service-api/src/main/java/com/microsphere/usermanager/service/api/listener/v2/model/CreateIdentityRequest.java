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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * CreateIdentityRequest
 */
@JsonPropertyOrder({
  CreateIdentityRequest.JSON_PROPERTY_EXTERNAL_ID,
  CreateIdentityRequest.JSON_PROPERTY_LEGAL_ENTITY_INTERNAL_ID,
  CreateIdentityRequest.JSON_PROPERTY_FULL_NAME,
  CreateIdentityRequest.JSON_PROPERTY_EMAIL_ADDRESS,
  CreateIdentityRequest.JSON_PROPERTY_MOBILE_NUMBER,
  CreateIdentityRequest.JSON_PROPERTY_GIVEN_NAME,
  CreateIdentityRequest.JSON_PROPERTY_FAMILY_NAME,
  CreateIdentityRequest.JSON_PROPERTY_ATTRIBUTES,
  CreateIdentityRequest.JSON_PROPERTY_ADDITIONS
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:56.279646600+01:00[Africa/Tunis]")
public  class CreateIdentityRequest {
  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  private String externalId;

  public static final String JSON_PROPERTY_LEGAL_ENTITY_INTERNAL_ID = "legalEntityInternalId";
  private String legalEntityInternalId;

  public static final String JSON_PROPERTY_FULL_NAME = "fullName";
  private String fullName;

  public static final String JSON_PROPERTY_EMAIL_ADDRESS = "emailAddress";
  private String emailAddress;

  public static final String JSON_PROPERTY_MOBILE_NUMBER = "mobileNumber";
  private String mobileNumber;

  public static final String JSON_PROPERTY_GIVEN_NAME = "givenName";
  private String givenName;

  public static final String JSON_PROPERTY_FAMILY_NAME = "familyName";
  private String familyName;

  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private Map<String, String> attributes = null;

  public static final String JSON_PROPERTY_ADDITIONS = "additions";
  private Map<String, String> additions = null;


  public CreateIdentityRequest externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * external Id (username) of the user.
   * @return externalId
  **/
  @javax.annotation.Nullable
 @Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1,max=64)  @ApiModelProperty(value = "external Id (username) of the user.")
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalId() {
    return externalId;
  }


  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public CreateIdentityRequest legalEntityInternalId(String legalEntityInternalId) {
    
    this.legalEntityInternalId = legalEntityInternalId;
    return this;
  }

   /**
   * Internal (MicroSphere) ID of the Legal Entity the user will belong to.
   * @return legalEntityInternalId
  **/
  @NotNull
 @Pattern(regexp="^\\S+$") @Size(min=1,max=36)  @ApiModelProperty(required = true, value = "Internal (MicroSphere) ID of the Legal Entity the user will belong to.")
  @JsonProperty(JSON_PROPERTY_LEGAL_ENTITY_INTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLegalEntityInternalId() {
    return legalEntityInternalId;
  }


  public void setLegalEntityInternalId(String legalEntityInternalId) {
    this.legalEntityInternalId = legalEntityInternalId;
  }


  public CreateIdentityRequest fullName(String fullName) {
    
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


  public CreateIdentityRequest emailAddress(String emailAddress) {
    
    this.emailAddress = emailAddress;
    return this;
  }

   /**
   * Email address of user
   * @return emailAddress
  **/
  @javax.annotation.Nullable
 @Size(min=3,max=254)  @ApiModelProperty(value = "Email address of user")
  @JsonProperty(JSON_PROPERTY_EMAIL_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmailAddress() {
    return emailAddress;
  }


  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }


  public CreateIdentityRequest mobileNumber(String mobileNumber) {
    
    this.mobileNumber = mobileNumber;
    return this;
  }

   /**
   * Mobile number of user
   * @return mobileNumber
  **/
  @javax.annotation.Nullable
 @Size(min=1,max=20)  @ApiModelProperty(value = "Mobile number of user")
  @JsonProperty(JSON_PROPERTY_MOBILE_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMobileNumber() {
    return mobileNumber;
  }


  public void setMobileNumber(String mobileNumber) {
    this.mobileNumber = mobileNumber;
  }


  public CreateIdentityRequest givenName(String givenName) {
    
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


  public CreateIdentityRequest familyName(String familyName) {
    
    this.familyName = familyName;
    return this;
  }

   /**
   * Get familyName
   * @return familyName
  **/
  @javax.annotation.Nullable
 @Size(min=1,max=255)  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FAMILY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFamilyName() {
    return familyName;
  }


  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }


  public CreateIdentityRequest attributes(Map<String, String> attributes) {
    
    this.attributes = attributes;
    return this;
  }

  public CreateIdentityRequest putAttributesItem(String key, String attributesItem) {
    if (this.attributes == null) {
      this.attributes = new HashMap<>();
    }
    this.attributes.put(key, attributesItem);
    return this;
  }

   /**
   * Custom attributes to be added to the user.
   * @return attributes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Custom attributes to be added to the user.")
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getAttributes() {
    return attributes;
  }


  public void setAttributes(Map<String, String> attributes) {
    this.attributes = attributes;
  }


  public CreateIdentityRequest additions(Map<String, String> additions) {
    
    this.additions = additions;
    return this;
  }

  public CreateIdentityRequest putAdditionsItem(String key, String additionsItem) {
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
    CreateIdentityRequest createIdentityRequest = (CreateIdentityRequest) o;
    return Objects.equals(this.externalId, createIdentityRequest.externalId) &&
        Objects.equals(this.legalEntityInternalId, createIdentityRequest.legalEntityInternalId) &&
        Objects.equals(this.fullName, createIdentityRequest.fullName) &&
        Objects.equals(this.emailAddress, createIdentityRequest.emailAddress) &&
        Objects.equals(this.mobileNumber, createIdentityRequest.mobileNumber) &&
        Objects.equals(this.givenName, createIdentityRequest.givenName) &&
        Objects.equals(this.familyName, createIdentityRequest.familyName) &&
        Objects.equals(this.attributes, createIdentityRequest.attributes) &&
        Objects.equals(this.additions, createIdentityRequest.additions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalId, legalEntityInternalId, fullName, emailAddress, mobileNumber, givenName, familyName, attributes, additions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateIdentityRequest {\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    legalEntityInternalId: ").append(toIndentedString(legalEntityInternalId)).append("\n");
    sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
    sb.append("    emailAddress: ").append(toIndentedString(emailAddress)).append("\n");
    sb.append("    mobileNumber: ").append(toIndentedString(mobileNumber)).append("\n");
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
