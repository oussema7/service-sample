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
 * Name
 */
@JsonPropertyOrder({
  Name.JSON_PROPERTY_FORMATTED,
  Name.JSON_PROPERTY_FAMILY_NAME,
  Name.JSON_PROPERTY_GIVEN_NAME,
  Name.JSON_PROPERTY_MIDDLE_NAME,
  Name.JSON_PROPERTY_HONORIFIC_PREFIX,
  Name.JSON_PROPERTY_HONORIFIC_SUFFIX,
  Name.JSON_PROPERTY_ADDITIONS
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:56.279646600+01:00[Africa/Tunis]")
public  class Name {
  public static final String JSON_PROPERTY_FORMATTED = "formatted";
  private String formatted;

  public static final String JSON_PROPERTY_FAMILY_NAME = "familyName";
  private String familyName;

  public static final String JSON_PROPERTY_GIVEN_NAME = "givenName";
  private String givenName;

  public static final String JSON_PROPERTY_MIDDLE_NAME = "middleName";
  private String middleName;

  public static final String JSON_PROPERTY_HONORIFIC_PREFIX = "honorificPrefix";
  private String honorificPrefix;

  public static final String JSON_PROPERTY_HONORIFIC_SUFFIX = "honorificSuffix";
  private String honorificSuffix;

  public static final String JSON_PROPERTY_ADDITIONS = "additions";
  private Map<String, String> additions = null;


  public Name formatted(String formatted) {
    
    this.formatted = formatted;
    return this;
  }

   /**
   * The full name, including all middle names, titles, and suffixes as appropriate, formatted for display
   * @return formatted
  **/
  @javax.annotation.Nullable
 @Size(min=1,max=2000)  @ApiModelProperty(value = "The full name, including all middle names, titles, and suffixes as appropriate, formatted for display")
  @JsonProperty(JSON_PROPERTY_FORMATTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFormatted() {
    return formatted;
  }


  public void setFormatted(String formatted) {
    this.formatted = formatted;
  }


  public Name familyName(String familyName) {
    
    this.familyName = familyName;
    return this;
  }

   /**
   * The family name(s) of the User, or last name(s) in most Western languages
   * @return familyName
  **/
  @javax.annotation.Nullable
 @Size(min=1,max=255)  @ApiModelProperty(value = "The family name(s) of the User, or last name(s) in most Western languages")
  @JsonProperty(JSON_PROPERTY_FAMILY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFamilyName() {
    return familyName;
  }


  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }


  public Name givenName(String givenName) {
    
    this.givenName = givenName;
    return this;
  }

   /**
   * The given name(s) of the User, or first name(s) in most Western languages
   * @return givenName
  **/
  @javax.annotation.Nullable
 @Size(min=1,max=255)  @ApiModelProperty(value = "The given name(s) of the User, or first name(s) in most Western languages")
  @JsonProperty(JSON_PROPERTY_GIVEN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGivenName() {
    return givenName;
  }


  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }


  public Name middleName(String middleName) {
    
    this.middleName = middleName;
    return this;
  }

   /**
   * The middle name(s) of the User
   * @return middleName
  **/
  @javax.annotation.Nullable
 @Size(min=1,max=255)  @ApiModelProperty(value = "The middle name(s) of the User")
  @JsonProperty(JSON_PROPERTY_MIDDLE_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMiddleName() {
    return middleName;
  }


  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }


  public Name honorificPrefix(String honorificPrefix) {
    
    this.honorificPrefix = honorificPrefix;
    return this;
  }

   /**
   * The honorific prefix(es) of the User, or title in most Western languages
   * @return honorificPrefix
  **/
  @javax.annotation.Nullable
 @Size(min=1,max=255)  @ApiModelProperty(value = "The honorific prefix(es) of the User, or title in most Western languages")
  @JsonProperty(JSON_PROPERTY_HONORIFIC_PREFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHonorificPrefix() {
    return honorificPrefix;
  }


  public void setHonorificPrefix(String honorificPrefix) {
    this.honorificPrefix = honorificPrefix;
  }


  public Name honorificSuffix(String honorificSuffix) {
    
    this.honorificSuffix = honorificSuffix;
    return this;
  }

   /**
   * The honorific suffix(es) of the User, or suffix in most Western languages
   * @return honorificSuffix
  **/
  @javax.annotation.Nullable
 @Size(min=1,max=255)  @ApiModelProperty(value = "The honorific suffix(es) of the User, or suffix in most Western languages")
  @JsonProperty(JSON_PROPERTY_HONORIFIC_SUFFIX)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHonorificSuffix() {
    return honorificSuffix;
  }


  public void setHonorificSuffix(String honorificSuffix) {
    this.honorificSuffix = honorificSuffix;
  }


  public Name additions(Map<String, String> additions) {
    
    this.additions = additions;
    return this;
  }

  public Name putAdditionsItem(String key, String additionsItem) {
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
    Name name = (Name) o;
    return Objects.equals(this.formatted, name.formatted) &&
        Objects.equals(this.familyName, name.familyName) &&
        Objects.equals(this.givenName, name.givenName) &&
        Objects.equals(this.middleName, name.middleName) &&
        Objects.equals(this.honorificPrefix, name.honorificPrefix) &&
        Objects.equals(this.honorificSuffix, name.honorificSuffix) &&
        Objects.equals(this.additions, name.additions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formatted, familyName, givenName, middleName, honorificPrefix, honorificSuffix, additions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Name {\n");
    sb.append("    formatted: ").append(toIndentedString(formatted)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    middleName: ").append(toIndentedString(middleName)).append("\n");
    sb.append("    honorificPrefix: ").append(toIndentedString(honorificPrefix)).append("\n");
    sb.append("    honorificSuffix: ").append(toIndentedString(honorificSuffix)).append("\n");
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
