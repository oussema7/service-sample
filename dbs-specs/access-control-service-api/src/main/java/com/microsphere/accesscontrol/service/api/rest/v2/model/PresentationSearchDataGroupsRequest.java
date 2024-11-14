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
import com.microsphere.accesscontrol.service.api.rest.v2.model.LegalEntityIdentifier;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationItemIdentifier;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationServiceAgreementIdentifier;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * PresentationSearchDataGroupsRequest
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class PresentationSearchDataGroupsRequest 
 {
    @JsonProperty("serviceAgreementIdentifier")
    private  PresentationServiceAgreementIdentifier serviceAgreementIdentifier;

    @JsonProperty("dataItemIdentifier")
    private  PresentationItemIdentifier dataItemIdentifier;

    @JsonProperty("legalEntityIdentifier")
    private  LegalEntityIdentifier legalEntityIdentifier;


    public PresentationSearchDataGroupsRequest serviceAgreementIdentifier(PresentationServiceAgreementIdentifier serviceAgreementIdentifier) {
        this.serviceAgreementIdentifier = serviceAgreementIdentifier;
        return this;
    }

    /**
     * Get serviceAgreementIdentifier
     * @return serviceAgreementIdentifier
     */
    @ApiModelProperty(value = "")
    @Valid 
    public  PresentationServiceAgreementIdentifier getServiceAgreementIdentifier() {
        return serviceAgreementIdentifier;
    }

    public void setServiceAgreementIdentifier( PresentationServiceAgreementIdentifier serviceAgreementIdentifier) {
        this.serviceAgreementIdentifier = serviceAgreementIdentifier;
    }


    public PresentationSearchDataGroupsRequest dataItemIdentifier(PresentationItemIdentifier dataItemIdentifier) {
        this.dataItemIdentifier = dataItemIdentifier;
        return this;
    }

    /**
     * Get dataItemIdentifier
     * @return dataItemIdentifier
     */
    @ApiModelProperty(value = "")
    @Valid 
    public  PresentationItemIdentifier getDataItemIdentifier() {
        return dataItemIdentifier;
    }

    public void setDataItemIdentifier( PresentationItemIdentifier dataItemIdentifier) {
        this.dataItemIdentifier = dataItemIdentifier;
    }


    public PresentationSearchDataGroupsRequest legalEntityIdentifier(LegalEntityIdentifier legalEntityIdentifier) {
        this.legalEntityIdentifier = legalEntityIdentifier;
        return this;
    }

    /**
     * Get legalEntityIdentifier
     * @return legalEntityIdentifier
     */
    @ApiModelProperty(value = "")
    @Valid 
    public  LegalEntityIdentifier getLegalEntityIdentifier() {
        return legalEntityIdentifier;
    }

    public void setLegalEntityIdentifier( LegalEntityIdentifier legalEntityIdentifier) {
        this.legalEntityIdentifier = legalEntityIdentifier;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PresentationSearchDataGroupsRequest presentationSearchDataGroupsRequest = (PresentationSearchDataGroupsRequest) o;
        return Objects.equals(this.serviceAgreementIdentifier, presentationSearchDataGroupsRequest.serviceAgreementIdentifier) &&
                Objects.equals(this.dataItemIdentifier, presentationSearchDataGroupsRequest.dataItemIdentifier) &&
                Objects.equals(this.legalEntityIdentifier, presentationSearchDataGroupsRequest.legalEntityIdentifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            serviceAgreementIdentifier,
            dataItemIdentifier,
            legalEntityIdentifier
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PresentationSearchDataGroupsRequest {\n");
        
        sb.append("        serviceAgreementIdentifier: ").append(toIndentedString(serviceAgreementIdentifier)).append("\n");
        sb.append("        dataItemIdentifier: ").append(toIndentedString(dataItemIdentifier)).append("\n");
        sb.append("        legalEntityIdentifier: ").append(toIndentedString(legalEntityIdentifier)).append("\n");
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

