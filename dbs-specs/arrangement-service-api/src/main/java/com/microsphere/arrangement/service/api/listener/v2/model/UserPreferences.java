/*
 * Arrangement Manager Service API
 * This API allows other DBS services to operate on products
 *
 * The version of the OpenAPI document: 2.7.3
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://github.com/Backbase/backbase-openapi-tools).
 * https://github.com/Backbase/backbase-openapi-tools
 * Do not edit the class manually.
 */


package com.microsphere.arrangement.service.api.listener.v2.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.microsphere.arrangement.service.api.listener.v2.model.AdditionalProperties;
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
 * User defined preferences for a specific arrangement. Note: each user might have different preferences
 */
@ApiModel(description = "User defined preferences for a specific arrangement. Note: each user might have different preferences")
@JsonPropertyOrder({
  UserPreferences.JSON_PROPERTY_ALIAS,
  UserPreferences.JSON_PROPERTY_VISIBLE,
  UserPreferences.JSON_PROPERTY_FAVORITE
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:30:51.050595100+01:00[Africa/Tunis]")
public  class UserPreferences extends AdditionalProperties {
  public static final String JSON_PROPERTY_ALIAS = "alias";
  private String alias;

  public static final String JSON_PROPERTY_VISIBLE = "visible";
  private Boolean visible;

  public static final String JSON_PROPERTY_FAVORITE = "favorite";
  private Boolean favorite;


  public UserPreferences alias(String alias) {
    
    this.alias = alias;
    return this;
  }

   /**
   * The name that can be assigned by the user to label the arrangement
   * @return alias
  **/
  @javax.annotation.Nullable
 @Size(max=50)  @ApiModelProperty(value = "The name that can be assigned by the user to label the arrangement")
  @JsonProperty(JSON_PROPERTY_ALIAS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAlias() {
    return alias;
  }


  public void setAlias(String alias) {
    this.alias = alias;
  }


  public UserPreferences visible(Boolean visible) {
    
    this.visible = visible;
    return this;
  }

   /**
   * User indicator whether to show or hide the arrangement on the front end
   * @return visible
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "User indicator whether to show or hide the arrangement on the front end")
  @JsonProperty(JSON_PROPERTY_VISIBLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getVisible() {
    return visible;
  }


  public void setVisible(Boolean visible) {
    this.visible = visible;
  }


  public UserPreferences favorite(Boolean favorite) {
    
    this.favorite = favorite;
    return this;
  }

   /**
   * Indication whether an arrangement can be favorable for a user
   * @return favorite
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indication whether an arrangement can be favorable for a user")
  @JsonProperty(JSON_PROPERTY_FAVORITE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getFavorite() {
    return favorite;
  }


  public void setFavorite(Boolean favorite) {
    this.favorite = favorite;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserPreferences userPreferences = (UserPreferences) o;
    return Objects.equals(this.alias, userPreferences.alias) &&
        Objects.equals(this.visible, userPreferences.visible) &&
        Objects.equals(this.favorite, userPreferences.favorite) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alias, visible, favorite, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPreferences {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
    sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
    sb.append("    favorite: ").append(toIndentedString(favorite)).append("\n");
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
