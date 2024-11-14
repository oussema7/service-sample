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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * AccountPresentationArrangementLegalEntityIds
 */
@JsonPropertyOrder({
  AccountPresentationArrangementLegalEntityIds.JSON_PROPERTY_ARRANGEMENT_ID,
  AccountPresentationArrangementLegalEntityIds.JSON_PROPERTY_LEGAL_ENTITY_IDS
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:30:51.050595100+01:00[Africa/Tunis]")
public  class AccountPresentationArrangementLegalEntityIds extends AdditionalProperties {
  public static final String JSON_PROPERTY_ARRANGEMENT_ID = "arrangementId";
  private String arrangementId;

  public static final String JSON_PROPERTY_LEGAL_ENTITY_IDS = "legalEntityIds";
  private List<String> legalEntityIds = new ArrayList<>();


  public AccountPresentationArrangementLegalEntityIds arrangementId(String arrangementId) {
    
    this.arrangementId = arrangementId;
    return this;
  }

   /**
   * A unique identifier for the arrangement.
   * @return arrangementId
  **/
  @NotNull
 @Size(max=36)  @ApiModelProperty(required = true, value = "A unique identifier for the arrangement.")
  @JsonProperty(JSON_PROPERTY_ARRANGEMENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getArrangementId() {
    return arrangementId;
  }


  public void setArrangementId(String arrangementId) {
    this.arrangementId = arrangementId;
  }


  public AccountPresentationArrangementLegalEntityIds legalEntityIds(List<String> legalEntityIds) {
    
    this.legalEntityIds = legalEntityIds;
    return this;
  }

  public AccountPresentationArrangementLegalEntityIds addLegalEntityIdsItem(String legalEntityIdsItem) {
    this.legalEntityIds.add(legalEntityIdsItem);
    return this;
  }

   /**
   * Get legalEntityIds
   * @return legalEntityIds
  **/
  @NotNull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_LEGAL_ENTITY_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getLegalEntityIds() {
    return legalEntityIds;
  }


  public void setLegalEntityIds(List<String> legalEntityIds) {
    this.legalEntityIds = legalEntityIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountPresentationArrangementLegalEntityIds accountPresentationArrangementLegalEntityIds = (AccountPresentationArrangementLegalEntityIds) o;
    return Objects.equals(this.arrangementId, accountPresentationArrangementLegalEntityIds.arrangementId) &&
        Objects.equals(this.legalEntityIds, accountPresentationArrangementLegalEntityIds.legalEntityIds) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrangementId, legalEntityIds, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountPresentationArrangementLegalEntityIds {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    arrangementId: ").append(toIndentedString(arrangementId)).append("\n");
    sb.append("    legalEntityIds: ").append(toIndentedString(legalEntityIds)).append("\n");
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
