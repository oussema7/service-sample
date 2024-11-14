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
 * PostalAddress
 */
@JsonPropertyOrder({
  PostalAddress.JSON_PROPERTY_TYPE,
  PostalAddress.JSON_PROPERTY_PRIMARY,
  PostalAddress.JSON_PROPERTY_DEPARTMENT,
  PostalAddress.JSON_PROPERTY_SUB_DEPARTMENT,
  PostalAddress.JSON_PROPERTY_ADDRESS_LINE,
  PostalAddress.JSON_PROPERTY_BUILDING_NUMBER,
  PostalAddress.JSON_PROPERTY_STREET_NAME,
  PostalAddress.JSON_PROPERTY_TOWN_NAME,
  PostalAddress.JSON_PROPERTY_POSTAL_CODE,
  PostalAddress.JSON_PROPERTY_COUNTRY_SUB_DIVISION,
  PostalAddress.JSON_PROPERTY_COUNTRY,
  PostalAddress.JSON_PROPERTY_ADDITIONS
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:56.279646600+01:00[Africa/Tunis]")
public  class PostalAddress {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_PRIMARY = "primary";
  private Boolean primary;

  public static final String JSON_PROPERTY_DEPARTMENT = "department";
  private String department;

  public static final String JSON_PROPERTY_SUB_DEPARTMENT = "subDepartment";
  private String subDepartment;

  public static final String JSON_PROPERTY_ADDRESS_LINE = "addressLine";
  private String addressLine;

  public static final String JSON_PROPERTY_BUILDING_NUMBER = "buildingNumber";
  private String buildingNumber;

  public static final String JSON_PROPERTY_STREET_NAME = "streetName";
  private String streetName;

  public static final String JSON_PROPERTY_TOWN_NAME = "townName";
  private String townName;

  public static final String JSON_PROPERTY_POSTAL_CODE = "postalCode";
  private String postalCode;

  public static final String JSON_PROPERTY_COUNTRY_SUB_DIVISION = "countrySubDivision";
  private String countrySubDivision;

  public static final String JSON_PROPERTY_COUNTRY = "country";
  private String country;

  public static final String JSON_PROPERTY_ADDITIONS = "additions";
  private Map<String, String> additions = null;


  public PostalAddress type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Key identifying the type of postal address, e.g. residential, business, po-box, mail-to, delivery-to.
   * @return type
  **/
  @NotNull
 @Size(min=1,max=36)  @ApiModelProperty(required = true, value = "Key identifying the type of postal address, e.g. residential, business, po-box, mail-to, delivery-to.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public PostalAddress primary(Boolean primary) {
    
    this.primary = primary;
    return this;
  }

   /**
   * Flag denoting whether this is the main postal address.
   * @return primary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Flag denoting whether this is the main postal address.")
  @JsonProperty(JSON_PROPERTY_PRIMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPrimary() {
    return primary;
  }


  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }


  public PostalAddress department(String department) {
    
    this.department = department;
    return this;
  }

   /**
   * Department.
   * @return department
  **/
  @javax.annotation.Nullable
 @Size(max=70)  @ApiModelProperty(value = "Department.")
  @JsonProperty(JSON_PROPERTY_DEPARTMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDepartment() {
    return department;
  }


  public void setDepartment(String department) {
    this.department = department;
  }


  public PostalAddress subDepartment(String subDepartment) {
    
    this.subDepartment = subDepartment;
    return this;
  }

   /**
   * Sub Department.
   * @return subDepartment
  **/
  @javax.annotation.Nullable
 @Size(max=70)  @ApiModelProperty(value = "Sub Department.")
  @JsonProperty(JSON_PROPERTY_SUB_DEPARTMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubDepartment() {
    return subDepartment;
  }


  public void setSubDepartment(String subDepartment) {
    this.subDepartment = subDepartment;
  }


  public PostalAddress addressLine(String addressLine) {
    
    this.addressLine = addressLine;
    return this;
  }

   /**
   * Address Line.
   * @return addressLine
  **/
  @javax.annotation.Nullable
 @Size(max=70)  @ApiModelProperty(value = "Address Line.")
  @JsonProperty(JSON_PROPERTY_ADDRESS_LINE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAddressLine() {
    return addressLine;
  }


  public void setAddressLine(String addressLine) {
    this.addressLine = addressLine;
  }


  public PostalAddress buildingNumber(String buildingNumber) {
    
    this.buildingNumber = buildingNumber;
    return this;
  }

   /**
   * Building number.
   * @return buildingNumber
  **/
  @javax.annotation.Nullable
 @Size(max=255)  @ApiModelProperty(value = "Building number.")
  @JsonProperty(JSON_PROPERTY_BUILDING_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBuildingNumber() {
    return buildingNumber;
  }


  public void setBuildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
  }


  public PostalAddress streetName(String streetName) {
    
    this.streetName = streetName;
    return this;
  }

   /**
   * Street.
   * @return streetName
  **/
  @javax.annotation.Nullable
 @Size(max=255)  @ApiModelProperty(value = "Street.")
  @JsonProperty(JSON_PROPERTY_STREET_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStreetName() {
    return streetName;
  }


  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }


  public PostalAddress townName(String townName) {
    
    this.townName = townName;
    return this;
  }

   /**
   * Town.
   * @return townName
  **/
  @javax.annotation.Nullable
 @Size(max=35)  @ApiModelProperty(value = "Town.")
  @JsonProperty(JSON_PROPERTY_TOWN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTownName() {
    return townName;
  }


  public void setTownName(String townName) {
    this.townName = townName;
  }


  public PostalAddress postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postcode.
   * @return postalCode
  **/
  @javax.annotation.Nullable
 @Size(max=16)  @ApiModelProperty(value = "Postcode.")
  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPostalCode() {
    return postalCode;
  }


  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public PostalAddress countrySubDivision(String countrySubDivision) {
    
    this.countrySubDivision = countrySubDivision;
    return this;
  }

   /**
   * Country sub-division.
   * @return countrySubDivision
  **/
  @javax.annotation.Nullable
 @Size(max=35)  @ApiModelProperty(value = "Country sub-division.")
  @JsonProperty(JSON_PROPERTY_COUNTRY_SUB_DIVISION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountrySubDivision() {
    return countrySubDivision;
  }


  public void setCountrySubDivision(String countrySubDivision) {
    this.countrySubDivision = countrySubDivision;
  }


  public PostalAddress country(String country) {
    
    this.country = country;
    return this;
  }

   /**
   * Country code - ISO 3166.
   * @return country
  **/
  @javax.annotation.Nullable
 @Size(max=3)  @ApiModelProperty(value = "Country code - ISO 3166.")
  @JsonProperty(JSON_PROPERTY_COUNTRY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCountry() {
    return country;
  }


  public void setCountry(String country) {
    this.country = country;
  }


  public PostalAddress additions(Map<String, String> additions) {
    
    this.additions = additions;
    return this;
  }

  public PostalAddress putAdditionsItem(String key, String additionsItem) {
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
    PostalAddress postalAddress = (PostalAddress) o;
    return Objects.equals(this.type, postalAddress.type) &&
        Objects.equals(this.primary, postalAddress.primary) &&
        Objects.equals(this.department, postalAddress.department) &&
        Objects.equals(this.subDepartment, postalAddress.subDepartment) &&
        Objects.equals(this.addressLine, postalAddress.addressLine) &&
        Objects.equals(this.buildingNumber, postalAddress.buildingNumber) &&
        Objects.equals(this.streetName, postalAddress.streetName) &&
        Objects.equals(this.townName, postalAddress.townName) &&
        Objects.equals(this.postalCode, postalAddress.postalCode) &&
        Objects.equals(this.countrySubDivision, postalAddress.countrySubDivision) &&
        Objects.equals(this.country, postalAddress.country) &&
        Objects.equals(this.additions, postalAddress.additions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, primary, department, subDepartment, addressLine, buildingNumber, streetName, townName, postalCode, countrySubDivision, country, additions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostalAddress {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    subDepartment: ").append(toIndentedString(subDepartment)).append("\n");
    sb.append("    addressLine: ").append(toIndentedString(addressLine)).append("\n");
    sb.append("    buildingNumber: ").append(toIndentedString(buildingNumber)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    townName: ").append(toIndentedString(townName)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    countrySubDivision: ").append(toIndentedString(countrySubDivision)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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
