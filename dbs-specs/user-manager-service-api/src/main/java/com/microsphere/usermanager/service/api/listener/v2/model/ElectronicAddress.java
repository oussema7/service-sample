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
 * ElectronicAddress
 */
@JsonPropertyOrder({
  ElectronicAddress.JSON_PROPERTY_TYPE,
  ElectronicAddress.JSON_PROPERTY_PRIMARY,
  ElectronicAddress.JSON_PROPERTY_ADDRESS,
  ElectronicAddress.JSON_PROPERTY_ADDITIONS
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:56.279646600+01:00[Africa/Tunis]")
public  class ElectronicAddress {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_PRIMARY = "primary";
  private Boolean primary;

  public static final String JSON_PROPERTY_ADDRESS = "address";
  private String address;

  public static final String JSON_PROPERTY_ADDITIONS = "additions";
  private Map<String, String> additions = null;


  public ElectronicAddress type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Key identifying the type of electronic address, e.g. work or personal.
   * @return type
  **/
  @NotNull
 @Size(min=1,max=36)  @ApiModelProperty(required = true, value = "Key identifying the type of electronic address, e.g. work or personal.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public ElectronicAddress primary(Boolean primary) {
    
    this.primary = primary;
    return this;
  }

   /**
   * Flag denoting whether this is the main electronic address.
   * @return primary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Flag denoting whether this is the main electronic address.")
  @JsonProperty(JSON_PROPERTY_PRIMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPrimary() {
    return primary;
  }


  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }


  public ElectronicAddress address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * Address.
   * @return address
  **/
  @NotNull
 @Size(min=1,max=255)  @ApiModelProperty(required = true, value = "Address.")
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public ElectronicAddress additions(Map<String, String> additions) {
    
    this.additions = additions;
    return this;
  }

  public ElectronicAddress putAdditionsItem(String key, String additionsItem) {
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
    ElectronicAddress electronicAddress = (ElectronicAddress) o;
    return Objects.equals(this.type, electronicAddress.type) &&
        Objects.equals(this.primary, electronicAddress.primary) &&
        Objects.equals(this.address, electronicAddress.address) &&
        Objects.equals(this.additions, electronicAddress.additions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, primary, address, additions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElectronicAddress {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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
