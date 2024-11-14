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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * ServiceAgreementByPermissionSetAllOf
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class ServiceAgreementByPermissionSetAllOf 
 {
    @JsonProperty("id")
    private  String id;

    @JsonProperty("externalId")
    private  String externalId;

    @JsonProperty("name")
    private  String name;

    @JsonProperty("isMaster")
    private  Boolean isMaster;

    @JsonProperty("regularUserAps")
    private List<BigDecimal> regularUserAps = null;

    @JsonProperty("adminUserAps")
    private List<BigDecimal> adminUserAps = null;


    public ServiceAgreementByPermissionSetAllOf id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Service agreement internal id
     * @return id
     */
    @ApiModelProperty(value = "Service agreement internal id")
    
    public  String getId() {
        return id;
    }

    public void setId( String id) {
        this.id = id;
    }


    public ServiceAgreementByPermissionSetAllOf externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * Service agreement external id
     * @return externalId
     */
    @ApiModelProperty(value = "Service agreement external id")
    
    public  String getExternalId() {
        return externalId;
    }

    public void setExternalId( String externalId) {
        this.externalId = externalId;
    }


    public ServiceAgreementByPermissionSetAllOf name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Service agreement name
     * @return name
     */
    @ApiModelProperty(value = "Service agreement name")
    
    public  String getName() {
        return name;
    }

    public void setName( String name) {
        this.name = name;
    }


    public ServiceAgreementByPermissionSetAllOf isMaster(Boolean isMaster) {
        this.isMaster = isMaster;
        return this;
    }

    /**
     * Is Service agreement master
     * @return isMaster
     */
    @ApiModelProperty(value = "Is Service agreement master")
    
    public  Boolean getIsMaster() {
        return isMaster;
    }

    public void setIsMaster( Boolean isMaster) {
        this.isMaster = isMaster;
    }


    public ServiceAgreementByPermissionSetAllOf regularUserAps(List<BigDecimal> regularUserAps) {
        this.regularUserAps = regularUserAps;
        return this;
    }

    public ServiceAgreementByPermissionSetAllOf addRegularUserApsItem(BigDecimal regularUserApsItem) {
        if (this.regularUserAps == null) {
            this.regularUserAps = new ArrayList<>();
        }
        this.regularUserAps.add(regularUserApsItem);
        return this;
    }

    /**
     * Assigned permission set ids assigned to service agreement as regular user
     * @return regularUserAps
     */
    @ApiModelProperty(value = "Assigned permission set ids assigned to service agreement as regular user")
    @Valid 
    public List<BigDecimal> getRegularUserAps() {
        return regularUserAps;
    }

    public void setRegularUserAps(List<BigDecimal> regularUserAps) {
        this.regularUserAps = regularUserAps;
    }


    public ServiceAgreementByPermissionSetAllOf adminUserAps(List<BigDecimal> adminUserAps) {
        this.adminUserAps = adminUserAps;
        return this;
    }

    public ServiceAgreementByPermissionSetAllOf addAdminUserApsItem(BigDecimal adminUserApsItem) {
        if (this.adminUserAps == null) {
            this.adminUserAps = new ArrayList<>();
        }
        this.adminUserAps.add(adminUserApsItem);
        return this;
    }

    /**
     * Assigned permission set ids assigned to service agreement as admin user
     * @return adminUserAps
     */
    @ApiModelProperty(value = "Assigned permission set ids assigned to service agreement as admin user")
    @Valid 
    public List<BigDecimal> getAdminUserAps() {
        return adminUserAps;
    }

    public void setAdminUserAps(List<BigDecimal> adminUserAps) {
        this.adminUserAps = adminUserAps;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ServiceAgreementByPermissionSetAllOf serviceAgreementByPermissionSetAllOf = (ServiceAgreementByPermissionSetAllOf) o;
        return Objects.equals(this.id, serviceAgreementByPermissionSetAllOf.id) &&
                Objects.equals(this.externalId, serviceAgreementByPermissionSetAllOf.externalId) &&
                Objects.equals(this.name, serviceAgreementByPermissionSetAllOf.name) &&
                Objects.equals(this.isMaster, serviceAgreementByPermissionSetAllOf.isMaster) &&
                Objects.equals(this.regularUserAps, serviceAgreementByPermissionSetAllOf.regularUserAps) &&
                Objects.equals(this.adminUserAps, serviceAgreementByPermissionSetAllOf.adminUserAps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            externalId,
            name,
            isMaster,
            regularUserAps,
            adminUserAps
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServiceAgreementByPermissionSetAllOf {\n");
        
        sb.append("        id: ").append(toIndentedString(id)).append("\n");
        sb.append("        externalId: ").append(toIndentedString(externalId)).append("\n");
        sb.append("        name: ").append(toIndentedString(name)).append("\n");
        sb.append("        isMaster: ").append(toIndentedString(isMaster)).append("\n");
        sb.append("        regularUserAps: ").append(toIndentedString(regularUserAps)).append("\n");
        sb.append("        adminUserAps: ").append(toIndentedString(adminUserAps)).append("\n");
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

