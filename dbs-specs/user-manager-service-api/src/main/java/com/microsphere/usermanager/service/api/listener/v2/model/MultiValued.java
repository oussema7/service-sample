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
 * MultiValued
 */
@JsonPropertyOrder({
  MultiValued.JSON_PROPERTY_VALUE,
  MultiValued.JSON_PROPERTY_DISPLAY,
  MultiValued.JSON_PROPERTY_TYPE,
  MultiValued.JSON_PROPERTY_PRIMARY,
  MultiValued.JSON_PROPERTY_ADDITIONS
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:56.279646600+01:00[Africa/Tunis]")
public  class MultiValued {
  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public static final String JSON_PROPERTY_DISPLAY = "display";
  private String display;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public static final String JSON_PROPERTY_PRIMARY = "primary";
  private Boolean primary;

  public static final String JSON_PROPERTY_ADDITIONS = "additions";
  private Map<String, String> additions = null;


  public MultiValued value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * The attribute&#39;s significant value. e.g canonicalized email address or photo url
   * @return value
  **/
  @NotNull
 @Size(min=1,max=2000)  @ApiModelProperty(required = true, value = "The attribute's significant value. e.g canonicalized email address or photo url")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }


  public MultiValued display(String display) {
    
    this.display = display;
    return this;
  }

   /**
   * A human-readable name, primarily used for display purposes
   * @return display
  **/
  @javax.annotation.Nullable
 @Size(min=1,max=255)  @ApiModelProperty(value = "A human-readable name, primarily used for display purposes")
  @JsonProperty(JSON_PROPERTY_DISPLAY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplay() {
    return display;
  }


  public void setDisplay(String display) {
    this.display = display;
  }


  public MultiValued type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * A label indicating the attribute&#39;s function, e.g., &#39;work&#39; or &#39;home&#39;.
   * @return type
  **/
  @javax.annotation.Nullable
 @Size(min=1,max=255)  @ApiModelProperty(value = "A label indicating the attribute's function, e.g., 'work' or 'home'.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public MultiValued primary(Boolean primary) {
    
    this.primary = primary;
    return this;
  }

   /**
   * A Boolean value indicating the &#39;primary&#39; or preferred physical address.
   * @return primary
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A Boolean value indicating the 'primary' or preferred physical address.")
  @JsonProperty(JSON_PROPERTY_PRIMARY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getPrimary() {
    return primary;
  }


  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }


  public MultiValued additions(Map<String, String> additions) {
    
    this.additions = additions;
    return this;
  }

  public MultiValued putAdditionsItem(String key, String additionsItem) {
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
    MultiValued multiValued = (MultiValued) o;
    return Objects.equals(this.value, multiValued.value) &&
        Objects.equals(this.display, multiValued.display) &&
        Objects.equals(this.type, multiValued.type) &&
        Objects.equals(this.primary, multiValued.primary) &&
        Objects.equals(this.additions, multiValued.additions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, display, type, primary, additions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MultiValued {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
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
