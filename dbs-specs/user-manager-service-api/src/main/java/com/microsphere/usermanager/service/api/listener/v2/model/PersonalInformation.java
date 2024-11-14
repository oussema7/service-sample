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
 * PersonalInformation
 */
@JsonPropertyOrder({
  PersonalInformation.JSON_PROPERTY_GENDER,
  PersonalInformation.JSON_PROPERTY_DATE_OF_BIRTH,
  PersonalInformation.JSON_PROPERTY_COUNTRY_OF_BIRTH,
  PersonalInformation.JSON_PROPERTY_COUNTRY_OF_RESIDENCE,
  PersonalInformation.JSON_PROPERTY_NATIONALITIES,
  PersonalInformation.JSON_PROPERTY_MARITAL_STATUS,
  PersonalInformation.JSON_PROPERTY_EDUCATION_LEVEL,
  PersonalInformation.JSON_PROPERTY_EMPLOYER,
  PersonalInformation.JSON_PROPERTY_EMPLOYMENT_STATUS,
  PersonalInformation.JSON_PROPERTY_ADDITIONS
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:56.279646600+01:00[Africa/Tunis]")
public  class PersonalInformation {
  public static final String JSON_PROPERTY_GENDER = "gender";
  private String gender;

  public static final String JSON_PROPERTY_DATE_OF_BIRTH = "dateOfBirth";
  private String dateOfBirth;

  public static final String JSON_PROPERTY_COUNTRY_OF_BIRTH = "countryOfBirth";
  private String countryOfBirth;

  public static final String JSON_PROPERTY_COUNTRY_OF_RESIDENCE = "countryOfResidence";
  private String countryOfResidence;

  public static final String JSON_PROPERTY_NATIONALITIES = "nationalities";
  private List<String> nationalities = null;

  public static final String JSON_PROPERTY_MARITAL_STATUS = "maritalStatus";
  private String maritalStatus;

  public static final String JSON_PROPERTY_EDUCATION_LEVEL = "educationLevel";
  private String educationLevel;

  public static final String JSON_PROPERTY_EMPLOYER = "employer";
  private String employer;

  public static final String JSON_PROPERTY_EMPLOYMENT_STATUS = "employmentStatus";
  private String employmentStatus;

  public static final String JSON_PROPERTY_ADDITIONS = "additions";
  private Map<String, String> additions = null;


  public PersonalInformation gender(String gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * User&#39;s gender.
   * @return gender
  **/
  @javax.annotation.Nullable
 @Size(min=1,max=255)  @ApiModelProperty(value = "User's gender.")
  @JsonProperty(JSON_PROPERTY_GENDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGender() {
    return gender;
  }


  public void setGender(String gender) {
    this.gender = gender;
  }


  public PersonalInformation dateOfBirth(String dateOfBirth) {
    
    this.dateOfBirth = dateOfBirth;
    return this;
  }

   /**
   * User&#39;s DOB.
   * @return dateOfBirth
  **/
  @javax.annotation.Nullable
 @Size(min=1,max=255)  @ApiModelProperty(value = "User's DOB.")
  @JsonProperty(JSON_PROPERTY_DATE_OF_BIRTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDateOfBirth() {
    return dateOfBirth;
  }


  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }


  public PersonalInformation countryOfBirth(String countryOfBirth) {
    
    this.countryOfBirth = countryOfBirth;
    return this;
  }

   /**
   * User&#39;s country of birth.
   * @return countryOfBirth
  **/
  @javax.annotation.Nullable
 @Size(min=1,max=255)  @ApiModelProperty(value = "User's country of birth.")
  @JsonProperty(JSON_PROPERTY_COUNTRY_OF_BIRTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountryOfBirth() {
    return countryOfBirth;
  }


  public void setCountryOfBirth(String countryOfBirth) {
    this.countryOfBirth = countryOfBirth;
  }


  public PersonalInformation countryOfResidence(String countryOfResidence) {
    
    this.countryOfResidence = countryOfResidence;
    return this;
  }

   /**
   * User&#39;s country of residence.
   * @return countryOfResidence
  **/
  @javax.annotation.Nullable
 @Size(min=1,max=255)  @ApiModelProperty(value = "User's country of residence.")
  @JsonProperty(JSON_PROPERTY_COUNTRY_OF_RESIDENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountryOfResidence() {
    return countryOfResidence;
  }


  public void setCountryOfResidence(String countryOfResidence) {
    this.countryOfResidence = countryOfResidence;
  }


  public PersonalInformation nationalities(List<String> nationalities) {
    
    this.nationalities = nationalities;
    return this;
  }

  public PersonalInformation addNationalitiesItem(String nationalitiesItem) {
    if (this.nationalities == null) {
      this.nationalities = new ArrayList<>();
    }
    this.nationalities.add(nationalitiesItem);
    return this;
  }

   /**
   * User&#39;s nationalities
   * @return nationalities
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User's nationalities")
  @JsonProperty(JSON_PROPERTY_NATIONALITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getNationalities() {
    return nationalities;
  }


  public void setNationalities(List<String> nationalities) {
    this.nationalities = nationalities;
  }


  public PersonalInformation maritalStatus(String maritalStatus) {
    
    this.maritalStatus = maritalStatus;
    return this;
  }

   /**
   * User&#39;s marital status.
   * @return maritalStatus
  **/
  @javax.annotation.Nullable
 @Size(min=1,max=255)  @ApiModelProperty(value = "User's marital status.")
  @JsonProperty(JSON_PROPERTY_MARITAL_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMaritalStatus() {
    return maritalStatus;
  }


  public void setMaritalStatus(String maritalStatus) {
    this.maritalStatus = maritalStatus;
  }


  public PersonalInformation educationLevel(String educationLevel) {
    
    this.educationLevel = educationLevel;
    return this;
  }

   /**
   * User&#39;s education level.
   * @return educationLevel
  **/
  @javax.annotation.Nullable
 @Size(min=1,max=255)  @ApiModelProperty(value = "User's education level.")
  @JsonProperty(JSON_PROPERTY_EDUCATION_LEVEL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEducationLevel() {
    return educationLevel;
  }


  public void setEducationLevel(String educationLevel) {
    this.educationLevel = educationLevel;
  }


  public PersonalInformation employer(String employer) {
    
    this.employer = employer;
    return this;
  }

   /**
   * User&#39;s employer name.
   * @return employer
  **/
  @javax.annotation.Nullable
 @Size(min=1,max=255)  @ApiModelProperty(value = "User's employer name.")
  @JsonProperty(JSON_PROPERTY_EMPLOYER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmployer() {
    return employer;
  }


  public void setEmployer(String employer) {
    this.employer = employer;
  }


  public PersonalInformation employmentStatus(String employmentStatus) {
    
    this.employmentStatus = employmentStatus;
    return this;
  }

   /**
   * User&#39;s employment status.
   * @return employmentStatus
  **/
  @javax.annotation.Nullable
 @Size(min=1,max=255)  @ApiModelProperty(value = "User's employment status.")
  @JsonProperty(JSON_PROPERTY_EMPLOYMENT_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmploymentStatus() {
    return employmentStatus;
  }


  public void setEmploymentStatus(String employmentStatus) {
    this.employmentStatus = employmentStatus;
  }


  public PersonalInformation additions(Map<String, String> additions) {
    
    this.additions = additions;
    return this;
  }

  public PersonalInformation putAdditionsItem(String key, String additionsItem) {
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
    PersonalInformation personalInformation = (PersonalInformation) o;
    return Objects.equals(this.gender, personalInformation.gender) &&
        Objects.equals(this.dateOfBirth, personalInformation.dateOfBirth) &&
        Objects.equals(this.countryOfBirth, personalInformation.countryOfBirth) &&
        Objects.equals(this.countryOfResidence, personalInformation.countryOfResidence) &&
        Objects.equals(this.nationalities, personalInformation.nationalities) &&
        Objects.equals(this.maritalStatus, personalInformation.maritalStatus) &&
        Objects.equals(this.educationLevel, personalInformation.educationLevel) &&
        Objects.equals(this.employer, personalInformation.employer) &&
        Objects.equals(this.employmentStatus, personalInformation.employmentStatus) &&
        Objects.equals(this.additions, personalInformation.additions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gender, dateOfBirth, countryOfBirth, countryOfResidence, nationalities, maritalStatus, educationLevel, employer, employmentStatus, additions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersonalInformation {\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    dateOfBirth: ").append(toIndentedString(dateOfBirth)).append("\n");
    sb.append("    countryOfBirth: ").append(toIndentedString(countryOfBirth)).append("\n");
    sb.append("    countryOfResidence: ").append(toIndentedString(countryOfResidence)).append("\n");
    sb.append("    nationalities: ").append(toIndentedString(nationalities)).append("\n");
    sb.append("    maritalStatus: ").append(toIndentedString(maritalStatus)).append("\n");
    sb.append("    educationLevel: ").append(toIndentedString(educationLevel)).append("\n");
    sb.append("    employer: ").append(toIndentedString(employer)).append("\n");
    sb.append("    employmentStatus: ").append(toIndentedString(employmentStatus)).append("\n");
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

