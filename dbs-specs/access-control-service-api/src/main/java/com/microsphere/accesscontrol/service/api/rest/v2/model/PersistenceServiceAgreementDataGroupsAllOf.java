/*
Boat Generator configuration:
    useBeanValidation: true
    useOptional: false
    addServletRequest: false
    useLombokAnnotations: false
    openApiNullable: true
    useSetForUniqueItems: false
    useWithModifiers: false
*/
package com.microsphere.accesscontrol.service.api.rest.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PersistenceDataGroupDataItems;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * An object which contain service agreement id with data group ids and data item ids.
 */
@ApiModel(description = "An object which contain service agreement id with data group ids and data item ids.")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class PersistenceServiceAgreementDataGroupsAllOf 
 {
    @JsonProperty("serviceAgreementId")
    private  String serviceAgreementId;

    @JsonProperty("dataGroups")
    private List<PersistenceDataGroupDataItems> dataGroups = null;


    public PersistenceServiceAgreementDataGroupsAllOf serviceAgreementId(String serviceAgreementId) {
        this.serviceAgreementId = serviceAgreementId;
        return this;
    }

    /**
     * Service agreement id
     * @return serviceAgreementId
     */
    @ApiModelProperty(value = "Service agreement id")
    
    public  String getServiceAgreementId() {
        return serviceAgreementId;
    }

    public void setServiceAgreementId( String serviceAgreementId) {
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
     */
    @ApiModelProperty(value = "List of data group ids with data item ids")
    @Valid 
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
        return Objects.hash(
            serviceAgreementId,
            dataGroups
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PersistenceServiceAgreementDataGroupsAllOf {\n");
        
        sb.append("        serviceAgreementId: ").append(toIndentedString(serviceAgreementId)).append("\n");
        sb.append("        dataGroups: ").append(toIndentedString(dataGroups)).append("\n");
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
        return o.toString().replace("\n", "\n        ");
    }
}

