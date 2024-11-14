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
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * BbApiDeprecation
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class BbApiDeprecation 
 {
    @JsonProperty("deprecatedFromVersion")
    private  String deprecatedFromVersion;

    @JsonProperty("removedFromVersion")
    private  String removedFromVersion;

    @JsonProperty("reason")
    private  String reason;

    @JsonProperty("description")
    private  String description;


    public BbApiDeprecation deprecatedFromVersion(String deprecatedFromVersion) {
        this.deprecatedFromVersion = deprecatedFromVersion;
        return this;
    }

    /**
     * Version of the product from which the endpoint has been deprecated and should no longer be used
     * @return deprecatedFromVersion
     */
    @ApiModelProperty(required = true, value = "Version of the product from which the endpoint has been deprecated and should no longer be used")
    @NotNull 
    public  String getDeprecatedFromVersion() {
        return deprecatedFromVersion;
    }

    public void setDeprecatedFromVersion( String deprecatedFromVersion) {
        this.deprecatedFromVersion = deprecatedFromVersion;
    }


    public BbApiDeprecation removedFromVersion(String removedFromVersion) {
        this.removedFromVersion = removedFromVersion;
        return this;
    }

    /**
     * Version of the product from which the API endpoint will be removed
     * @return removedFromVersion
     */
    @ApiModelProperty(required = true, value = "Version of the product from which the API endpoint will be removed")
    @NotNull 
    public  String getRemovedFromVersion() {
        return removedFromVersion;
    }

    public void setRemovedFromVersion( String removedFromVersion) {
        this.removedFromVersion = removedFromVersion;
    }


    public BbApiDeprecation reason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * The reason the API endpoint was deprecated
     * @return reason
     */
    @ApiModelProperty(required = true, value = "The reason the API endpoint was deprecated")
    @NotNull 
    public  String getReason() {
        return reason;
    }

    public void setReason( String reason) {
        this.reason = reason;
    }


    public BbApiDeprecation description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Any further information, e.g. migration information
     * @return description
     */
    @ApiModelProperty(required = true, value = "Any further information, e.g. migration information")
    @NotNull 
    public  String getDescription() {
        return description;
    }

    public void setDescription( String description) {
        this.description = description;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BbApiDeprecation bbApiDeprecation = (BbApiDeprecation) o;
        return Objects.equals(this.deprecatedFromVersion, bbApiDeprecation.deprecatedFromVersion) &&
                Objects.equals(this.removedFromVersion, bbApiDeprecation.removedFromVersion) &&
                Objects.equals(this.reason, bbApiDeprecation.reason) &&
                Objects.equals(this.description, bbApiDeprecation.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            deprecatedFromVersion,
            removedFromVersion,
            reason,
            description
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BbApiDeprecation {\n");
        
        sb.append("        deprecatedFromVersion: ").append(toIndentedString(deprecatedFromVersion)).append("\n");
        sb.append("        removedFromVersion: ").append(toIndentedString(removedFromVersion)).append("\n");
        sb.append("        reason: ").append(toIndentedString(reason)).append("\n");
        sb.append("        description: ").append(toIndentedString(description)).append("\n");
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

