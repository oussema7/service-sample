/*
 * Access Control service API
 * Manage user permissions, data groups, function groups and service agreements from service to service side
 *
 * The version of the OpenAPI document: 2.11.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://github.com/Backbase/backbase-openapi-tools).
 * https://github.com/Backbase/backbase-openapi-tools
 * Do not edit the class manually.
 */


package com.microsphere.accesscontrol.service.api.listener.v2.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.microsphere.accesscontrol.service.api.listener.v2.model.PersistenceDataGroupDataItems;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * An object which contain service agreement id with data group ids and data item ids.
 */
@ApiModel(description = "An object which contain service agreement id with data group ids and data item ids.")
@JsonPropertyOrder({
  PersistenceServiceAgreementDataGroupsAllOf.JSON_PROPERTY_SERVICE_AGREEMENT_ID,
  PersistenceServiceAgreementDataGroupsAllOf.JSON_PROPERTY_DATA_GROUPS
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:27.444046600+01:00[Africa/Tunis]")
public  class PersistenceServiceAgreementDataGroupsAllOf {
  public static final String JSON_PROPERTY_SERVICE_AGREEMENT_ID = "serviceAgreementId";
  private String serviceAgreementId;

  public static final String JSON_PROPERTY_DATA_GROUPS = "dataGroups";
  private List<PersistenceDataGroupDataItems> dataGroups = null;


  public PersistenceServiceAgreementDataGroupsAllOf serviceAgreementId(String serviceAgreementId) {
    
    this.serviceAgreementId = serviceAgreementId;
    return this;
  }

   /**
   * Service agreement id
   * @return serviceAgreementId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Service agreement id")
  @JsonProperty(JSON_PROPERTY_SERVICE_AGREEMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServiceAgreementId() {
    return serviceAgreementId;
  }


  public void setServiceAgreementId(String serviceAgreementId) {
    this.serviceAgreementId = serviceAgreementId;
  }


  public PersistenceServiceAgreementDataGroupsAllOf dataGroups(List<PersistenceDataGroupDataItems> dataGroups) {
    
    this.dataGroups = dataGroups;
    return this;
  }

  public PersistenceServiceAgreementDataGroupsAllOf addDataGroupsItem(PersistenceDataGroupDataItems dataGroupsItem) {
    if (this.dataGroups == null) {
      this.dataGroups = new ArrayList<>();
    }
    this.dataGroups.add(dataGroupsItem);
    return this;
  }

   /**
   * List of data group ids with data item ids
   * @return dataGroups
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "List of data group ids with data item ids")
  @JsonProperty(JSON_PROPERTY_DATA_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PersistenceDataGroupDataItems> getDataGroups() {
    return dataGroups;
  }


  public void setDataGroups(List<PersistenceDataGroupDataItems> dataGroups) {
    this.dataGroups = dataGroups;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PersistenceServiceAgreementDataGroupsAllOf persistenceServiceAgreementDataGroupsAllOf = (PersistenceServiceAgreementDataGroupsAllOf) o;
    return Objects.equals(this.serviceAgreementId, persistenceServiceAgreementDataGroupsAllOf.serviceAgreementId) &&
        Objects.equals(this.dataGroups, persistenceServiceAgreementDataGroupsAllOf.dataGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceAgreementId, dataGroups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PersistenceServiceAgreementDataGroupsAllOf {\n");
    sb.append("    serviceAgreementId: ").append(toIndentedString(serviceAgreementId)).append("\n");
    sb.append("    dataGroups: ").append(toIndentedString(dataGroups)).append("\n");
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

