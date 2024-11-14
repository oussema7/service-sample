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
package com.microsphere.usermanager.extension.client.api.rest.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsphere.usermanager.extension.client.api.rest.v2.model.EnrollmentStatus;
import com.microsphere.usermanager.extension.client.api.rest.v2.model.LegalEntityType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * RegistrationStatus
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:58.643479400+01:00[Africa/Tunis]")

public class RegistrationStatus 
 {
    @JsonProperty("userId")
    private  String userId;

    @JsonProperty("enrollmentStatus")
    private  EnrollmentStatus enrollmentStatus;

    @JsonProperty("legalEntityType")
    private  LegalEntityType legalEntityType;


    public RegistrationStatus userId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * This flag indicates if the current user id
     * @return userId
     */
    @ApiModelProperty(value = "This flag indicates if the current user id")
    
    public  String getUserId() {
        return userId;
    }

    public void setUserId( String userId) {
        this.userId = userId;
    }


    public RegistrationStatus enrollmentStatus(EnrollmentStatus enrollmentStatus) {
        this.enrollmentStatus = enrollmentStatus;
        return this;
    }

    /**
     * Get enrollmentStatus
     * @return enrollmentStatus
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull @Valid 
    public  EnrollmentStatus getEnrollmentStatus() {
        return enrollmentStatus;
    }

    public void setEnrollmentStatus( EnrollmentStatus enrollmentStatus) {
        this.enrollmentStatus = enrollmentStatus;
    }


    public RegistrationStatus legalEntityType(LegalEntityType legalEntityType) {
        this.legalEntityType = legalEntityType;
        return this;
    }

    /**
     * Get legalEntityType
     * @return legalEntityType
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull @Valid 
    public  LegalEntityType getLegalEntityType() {
        return legalEntityType;
    }

    public void setLegalEntityType( LegalEntityType legalEntityType) {
        this.legalEntityType = legalEntityType;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RegistrationStatus registrationStatus = (RegistrationStatus) o;
        return Objects.equals(this.userId, registrationStatus.userId) &&
                Objects.equals(this.enrollmentStatus, registrationStatus.enrollmentStatus) &&
                Objects.equals(this.legalEntityType, registrationStatus.legalEntityType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            userId,
            enrollmentStatus,
            legalEntityType
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RegistrationStatus {\n");
        
        sb.append("        userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("        enrollmentStatus: ").append(toIndentedString(enrollmentStatus)).append("\n");
        sb.append("        legalEntityType: ").append(toIndentedString(legalEntityType)).append("\n");
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

