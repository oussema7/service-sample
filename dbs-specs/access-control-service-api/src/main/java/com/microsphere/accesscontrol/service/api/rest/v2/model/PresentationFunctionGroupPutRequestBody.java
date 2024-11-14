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
import com.microsphere.accesscontrol.service.api.rest.v2.model.Functiongroupupdate;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationIdentifier;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * Function group update put
 */
@ApiModel(description = "Function group update put")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class PresentationFunctionGroupPutRequestBody 
 {
    @JsonProperty("functionGroup")
    private  Functiongroupupdate functionGroup;

    @JsonProperty("identifier")
    private  PresentationIdentifier identifier;


    public PresentationFunctionGroupPutRequestBody functionGroup(Functiongroupupdate functionGroup) {
        this.functionGroup = functionGroup;
        return this;
    }

    /**
     * Get functionGroup
     * @return functionGroup
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull @Valid 
    public  Functiongroupupdate getFunctionGroup() {
        return functionGroup;
    }

    public void setFunctionGroup( Functiongroupupdate functionGroup) {
        this.functionGroup = functionGroup;
    }


    public PresentationFunctionGroupPutRequestBody identifier(PresentationIdentifier identifier) {
        this.identifier = identifier;
        return this;
    }

    /**
     * Get identifier
     * @return identifier
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull @Valid 
    public  PresentationIdentifier getIdentifier() {
        return identifier;
    }

    public void setIdentifier( PresentationIdentifier identifier) {
        this.identifier = identifier;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PresentationFunctionGroupPutRequestBody presentationFunctionGroupPutRequestBody = (PresentationFunctionGroupPutRequestBody) o;
        return Objects.equals(this.functionGroup, presentationFunctionGroupPutRequestBody.functionGroup) &&
                Objects.equals(this.identifier, presentationFunctionGroupPutRequestBody.identifier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            functionGroup,
            identifier
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PresentationFunctionGroupPutRequestBody {\n");
        
        sb.append("        functionGroup: ").append(toIndentedString(functionGroup)).append("\n");
        sb.append("        identifier: ").append(toIndentedString(identifier)).append("\n");
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

