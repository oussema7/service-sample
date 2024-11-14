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
import com.microsphere.accesscontrol.service.api.listener.v2.model.PresentationDataGroupDetails;
import com.microsphere.accesscontrol.service.api.listener.v2.model.PresentationServiceAgreementIds;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * PresentationServiceAgreementWithDataGroupsItemAllOf
 */
@JsonPropertyOrder({
  PresentationServiceAgreementWithDataGroupsItemAllOf.JSON_PROPERTY_SERVICE_AGREEMENT,
  PresentationServiceAgreementWithDataGroupsItemAllOf.JSON_PROPERTY_DATA_GROUPS
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:27.444046600+01:00[Africa/Tunis]")
public  class PresentationServiceAgreementWithDataGroupsItemAllOf {
  public static final String JSON_PROPERTY_SERVICE_AGREEMENT = "serviceAgreement";
  private PresentationServiceAgreementIds serviceAgreement;

  public static final String JSON_PROPERTY_DATA_GROUPS = "dataGroups";
  private List<PresentationDataGroupDetails> dataGroups = null;


  public PresentationServiceAgreementWithDataGroupsItemAllOf serviceAgreement(PresentationServiceAgreementIds serviceAgreement) {
    
    this.serviceAgreement = serviceAgreement;
    return this;
  }

   /**
   * Get serviceAgreement
   * @return serviceAgreement
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SERVICE_AGREEMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PresentationServiceAgreementIds getServiceAgreement() {
    return serviceAgreement;
  }


  public void setServiceAgreement(PresentationServiceAgreementIds serviceAgreement) {
    this.serviceAgreement = serviceAgreement;
  }


  public PresentationServiceAgreementWithDataGroupsItemAllOf dataGroups(List<PresentationDataGroupDetails> dataGroups) {
    
    this.dataGroups = dataGroups;
    return this;
  }

  public PresentationServiceAgreementWithDataGroupsItemAllOf addDataGroupsItem(PresentationDataGroupDetails dataGroupsItem) {
    if (this.dataGroups == null) {
      this.dataGroups = new ArrayList<>();
    }
    this.dataGroups.add(dataGroupsItem);
    return this;
  }

   /**
   * List of data groups
   * @return dataGroups
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "List of data groups")
  @JsonProperty(JSON_PROPERTY_DATA_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<PresentationDataGroupDetails> getDataGroups() {
    return dataGroups;
  }


  public void setDataGroups(List<PresentationDataGroupDetails> dataGroups) {
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
    PresentationServiceAgreementWithDataGroupsItemAllOf presentationServiceAgreementWithDataGroupsItemAllOf = (PresentationServiceAgreementWithDataGroupsItemAllOf) o;
    return Objects.equals(this.serviceAgreement, presentationServiceAgreementWithDataGroupsItemAllOf.serviceAgreement) &&
        Objects.equals(this.dataGroups, presentationServiceAgreementWithDataGroupsItemAllOf.dataGroups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceAgreement, dataGroups);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PresentationServiceAgreementWithDataGroupsItemAllOf {\n");
    sb.append("    serviceAgreement: ").append(toIndentedString(serviceAgreement)).append("\n");
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

