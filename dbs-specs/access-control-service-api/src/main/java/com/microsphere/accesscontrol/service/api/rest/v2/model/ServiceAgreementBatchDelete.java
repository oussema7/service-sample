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
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationServiceAgreementIdentifier;
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
 * ServiceAgreementBatchDelete
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class ServiceAgreementBatchDelete 
 {
    @JsonProperty("serviceAgreementIdentifiers")
    private List<PresentationServiceAgreementIdentifier> serviceAgreementIdentifiers = null;

    @JsonProperty("accessToken")
    private @Pattern(regexp="^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$") @Size(min=1, max=36)  String accessToken;


    public ServiceAgreementBatchDelete serviceAgreementIdentifiers(List<PresentationServiceAgreementIdentifier> serviceAgreementIdentifiers) {
        this.serviceAgreementIdentifiers = serviceAgreementIdentifiers;
        return this;
    }

    public ServiceAgreementBatchDelete addServiceAgreementIdentifiersItem(PresentationServiceAgreementIdentifier serviceAgreementIdentifiersItem) {
        if (this.serviceAgreementIdentifiers == null) {
            this.serviceAgreementIdentifiers = new ArrayList<>();
        }
        this.serviceAgreementIdentifiers.add(serviceAgreementIdentifiersItem);
        return this;
    }

    /**
     * Get serviceAgreementIdentifiers
     * @return serviceAgreementIdentifiers
     */
    @ApiModelProperty(value = "")
    @Valid @Size(min=1) 
    public List<PresentationServiceAgreementIdentifier> getServiceAgreementIdentifiers() {
        return serviceAgreementIdentifiers;
    }

    public void setServiceAgreementIdentifiers(List<PresentationServiceAgreementIdentifier> serviceAgreementIdentifiers) {
        this.serviceAgreementIdentifiers = serviceAgreementIdentifiers;
    }


    public ServiceAgreementBatchDelete accessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * Universally Unique IDentifier.
     * @return accessToken
     */
    @ApiModelProperty(value = "Universally Unique IDentifier.")
    @Pattern(regexp="^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$") @Size(min=1, max=36) 
    public @Pattern(regexp="^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$") @Size(min=1, max=36)  String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(@Pattern(regexp="^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$") @Size(min=1, max=36)  String accessToken) {
        this.accessToken = accessToken;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServiceAgreementBatchDelete serviceAgreementBatchDelete = (ServiceAgreementBatchDelete) o;
        return Objects.equals(this.serviceAgreementIdentifiers, serviceAgreementBatchDelete.serviceAgreementIdentifiers) &&
                Objects.equals(this.accessToken, serviceAgreementBatchDelete.accessToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            serviceAgreementIdentifiers,
            accessToken
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceAgreementBatchDelete {\n");
        
        sb.append("        serviceAgreementIdentifiers: ").append(toIndentedString(serviceAgreementIdentifiers)).append("\n");
        sb.append("        accessToken: ").append(toIndentedString(accessToken)).append("\n");
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

