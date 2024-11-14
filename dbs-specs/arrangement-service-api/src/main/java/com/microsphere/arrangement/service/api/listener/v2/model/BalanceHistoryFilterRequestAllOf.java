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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * BalanceHistoryFilterRequestAllOf
 */
@JsonPropertyOrder({
  BalanceHistoryFilterRequestAllOf.JSON_PROPERTY_ARRANGEMENT_IDS,
  BalanceHistoryFilterRequestAllOf.JSON_PROPERTY_DATE_FROM,
  BalanceHistoryFilterRequestAllOf.JSON_PROPERTY_DATE_TO
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:30:51.050595100+01:00[Africa/Tunis]")
public  class BalanceHistoryFilterRequestAllOf {
  public static final String JSON_PROPERTY_ARRANGEMENT_IDS = "arrangementIds";
  private List<String> arrangementIds = null;

  public static final String JSON_PROPERTY_DATE_FROM = "dateFrom";
  private OffsetDateTime dateFrom;

  public static final String JSON_PROPERTY_DATE_TO = "dateTo";
  private OffsetDateTime dateTo;


  public BalanceHistoryFilterRequestAllOf arrangementIds(List<String> arrangementIds) {
    
    this.arrangementIds = arrangementIds;
    return this;
  }

  public BalanceHistoryFilterRequestAllOf addArrangementIdsItem(String arrangementIdsItem) {
    if (this.arrangementIds == null) {
      this.arrangementIds = new ArrayList<>();
    }
    this.arrangementIds.add(arrangementIdsItem);
    return this;
  }

   /**
   * A list of arrangements ids for querying database
   * @return arrangementIds
  **/
  @javax.annotation.Nullable
 @Size(min=1)  @ApiModelProperty(value = "A list of arrangements ids for querying database")
  @JsonProperty(JSON_PROPERTY_ARRANGEMENT_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getArrangementIds() {
    return arrangementIds;
  }


  public void setArrangementIds(List<String> arrangementIds) {
    this.arrangementIds = arrangementIds;
  }


  public BalanceHistoryFilterRequestAllOf dateFrom(OffsetDateTime dateFrom) {
    
    this.dateFrom = dateFrom;
    return this;
  }

   /**
   * Get dateFrom
   * @return dateFrom
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATE_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDateFrom() {
    return dateFrom;
  }


  public void setDateFrom(OffsetDateTime dateFrom) {
    this.dateFrom = dateFrom;
  }


  public BalanceHistoryFilterRequestAllOf dateTo(OffsetDateTime dateTo) {
    
    this.dateTo = dateTo;
    return this;
  }

   /**
   * Get dateTo
   * @return dateTo
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DATE_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getDateTo() {
    return dateTo;
  }


  public void setDateTo(OffsetDateTime dateTo) {
    this.dateTo = dateTo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BalanceHistoryFilterRequestAllOf balanceHistoryFilterRequestAllOf = (BalanceHistoryFilterRequestAllOf) o;
    return Objects.equals(this.arrangementIds, balanceHistoryFilterRequestAllOf.arrangementIds) &&
        Objects.equals(this.dateFrom, balanceHistoryFilterRequestAllOf.dateFrom) &&
        Objects.equals(this.dateTo, balanceHistoryFilterRequestAllOf.dateTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(arrangementIds, dateFrom, dateTo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalanceHistoryFilterRequestAllOf {\n");
    sb.append("    arrangementIds: ").append(toIndentedString(arrangementIds)).append("\n");
    sb.append("    dateFrom: ").append(toIndentedString(dateFrom)).append("\n");
    sb.append("    dateTo: ").append(toIndentedString(dateTo)).append("\n");
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

