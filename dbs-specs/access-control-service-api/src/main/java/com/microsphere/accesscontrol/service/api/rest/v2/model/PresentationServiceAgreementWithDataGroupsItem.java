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
import com.microsphere.accesscontrol.service.api.rest.v2.model.AdditionalPropertiesAware;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationDataGroupDetails;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationServiceAgreementIds;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationServiceAgreementWithDataGroupsItemAllOf;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * PresentationServiceAgreementWithDataGroupsItem
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class PresentationServiceAgreementWithDataGroupsItem 
 {
    @JsonProperty("additions")
    private Map<String, String> additions = null;

    @JsonProperty("serviceAgreement")
    private  PresentationServiceAgreementIds serviceAgreement;

    @JsonProperty("dataGroups")
    private List<PresentationDataGroupDetails> dataGroups = null;


    public PresentationServiceAgreementWithDataGroupsItem additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public PresentationServiceAgreementWithDataGroupsItem putAdditionsItem(String key, String additionsItem) {
        if (this.additions == null) {
            this.additions = new HashMap<>();
        }
        this.additions.put(key, additionsItem);
        return this;
    }

    /**
     * Get additions
     * @return additions
     */
    @ApiModelProperty(value = "")
    
    public Map<String, String> getAdditions() {
        return additions;
    }

    public void setAdditions(Map<String, String> additions) {
        this.additions = additions;
    }


    public PresentationServiceAgreementWithDataGroupsItem serviceAgreement(PresentationServiceAgreementIds serviceAgreement) {
        this.serviceAgreement = serviceAgreement;
        return this;
    }

    /**
     * Get serviceAgreement
     * @return serviceAgreement
     */
    @ApiModelProperty(value = "")
    @Valid 
    public  PresentationServiceAgreementIds getServiceAgreement() {
        return serviceAgreement;
    }

    public void setServiceAgreement( PresentationServiceAgreementIds serviceAgreement) {
        this.serviceAgreement = serviceAgreement;
    }


    public PresentationServiceAgreementWithDataGroupsItem dataGroups(List<PresentationDataGroupDetails> dataGroups) {
        this.dataGroups = dataGroups;
        return this;
    }

    public PresentationServiceAgreementWithDataGroupsItem addDataGroupsItem(PresentationDataGroupDetails dataGroupsItem) {
        if (this.dataGroups == null) {
            this.dataGroups = new ArrayList<>();
        }
        this.dataGroups.add(dataGroupsItem);
        return this;
    }

    /**
     * List of data groups
     * @return dataGroups
     */
    @ApiModelProperty(value = "List of data groups")
    @Valid 
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
        PresentationServiceAgreementWithDataGroupsItem presentationServiceAgreementWithDataGroupsItem = (PresentationServiceAgreementWithDataGroupsItem) o;
        return Objects.equals(this.additions, presentationServiceAgreementWithDataGroupsItem.additions) &&
                Objects.equals(this.serviceAgreement, presentationServiceAgreementWithDataGroupsItem.serviceAgreement) &&
                Objects.equals(this.dataGroups, presentationServiceAgreementWithDataGroupsItem.dataGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            additions,
            serviceAgreement,
            dataGroups
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PresentationServiceAgreementWithDataGroupsItem {\n");
        
        sb.append("        additions: ").append(toIndentedString(additions)).append("\n");
        sb.append("        serviceAgreement: ").append(toIndentedString(serviceAgreement)).append("\n");
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

