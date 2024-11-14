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
import com.microsphere.accesscontrol.service.api.rest.v2.model.Bound;
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
 * SelfApprovalPolicy
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class SelfApprovalPolicy 
 {
    @JsonProperty("businessFunctionName")
    private  String businessFunctionName;

    @JsonProperty("canSelfApprove")
    private  Boolean canSelfApprove;

    @JsonProperty("bounds")
    private List<Bound> bounds = null;


    public SelfApprovalPolicy businessFunctionName(String businessFunctionName) {
        this.businessFunctionName = businessFunctionName;
        return this;
    }

    /**
     * Name of business function
     * @return businessFunctionName
     */
    @ApiModelProperty(required = true, value = "Name of business function")
    @NotNull 
    public  String getBusinessFunctionName() {
        return businessFunctionName;
    }

    public void setBusinessFunctionName( String businessFunctionName) {
        this.businessFunctionName = businessFunctionName;
    }


    public SelfApprovalPolicy canSelfApprove(Boolean canSelfApprove) {
        this.canSelfApprove = canSelfApprove;
        return this;
    }

    /**
     * Self approval permission toggle
     * @return canSelfApprove
     */
    @ApiModelProperty(required = true, value = "Self approval permission toggle")
    @NotNull 
    public  Boolean getCanSelfApprove() {
        return canSelfApprove;
    }

    public void setCanSelfApprove( Boolean canSelfApprove) {
        this.canSelfApprove = canSelfApprove;
    }


    public SelfApprovalPolicy bounds(List<Bound> bounds) {
        this.bounds = bounds;
        return this;
    }

    public SelfApprovalPolicy addBoundsItem(Bound boundsItem) {
        if (this.bounds == null) {
            this.bounds = new ArrayList<>();
        }
        this.bounds.add(boundsItem);
        return this;
    }

    /**
     * Get bounds
     * @return bounds
     */
    @ApiModelProperty(value = "")
    @Valid 
    public List<Bound> getBounds() {
        return bounds;
    }

    public void setBounds(List<Bound> bounds) {
        this.bounds = bounds;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SelfApprovalPolicy selfApprovalPolicy = (SelfApprovalPolicy) o;
        return Objects.equals(this.businessFunctionName, selfApprovalPolicy.businessFunctionName) &&
                Objects.equals(this.canSelfApprove, selfApprovalPolicy.canSelfApprove) &&
                Objects.equals(this.bounds, selfApprovalPolicy.bounds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            businessFunctionName,
            canSelfApprove,
            bounds
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SelfApprovalPolicy {\n");
        
        sb.append("        businessFunctionName: ").append(toIndentedString(businessFunctionName)).append("\n");
        sb.append("        canSelfApprove: ").append(toIndentedString(canSelfApprove)).append("\n");
        sb.append("        bounds: ").append(toIndentedString(bounds)).append("\n");
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

