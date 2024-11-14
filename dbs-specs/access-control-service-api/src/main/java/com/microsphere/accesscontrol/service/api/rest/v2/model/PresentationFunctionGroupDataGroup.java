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
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationDataGroupIdentifier;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationIdentifier;
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
 * Function/Data group pair
 */
@ApiModel(description = "Function/Data group pair")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class PresentationFunctionGroupDataGroup 
 {
    @JsonProperty("functionGroupIdentifier")
    private  PresentationIdentifier functionGroupIdentifier;

    @JsonProperty("dataGroupIdentifiers")
    private List<PresentationDataGroupIdentifier> dataGroupIdentifiers = null;


    public PresentationFunctionGroupDataGroup functionGroupIdentifier(PresentationIdentifier functionGroupIdentifier) {
        this.functionGroupIdentifier = functionGroupIdentifier;
        return this;
    }

    /**
     * Get functionGroupIdentifier
     * @return functionGroupIdentifier
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull @Valid 
    public  PresentationIdentifier getFunctionGroupIdentifier() {
        return functionGroupIdentifier;
    }

    public void setFunctionGroupIdentifier( PresentationIdentifier functionGroupIdentifier) {
        this.functionGroupIdentifier = functionGroupIdentifier;
    }


    public PresentationFunctionGroupDataGroup dataGroupIdentifiers(List<PresentationDataGroupIdentifier> dataGroupIdentifiers) {
        this.dataGroupIdentifiers = dataGroupIdentifiers;
        return this;
    }

    public PresentationFunctionGroupDataGroup addDataGroupIdentifiersItem(PresentationDataGroupIdentifier dataGroupIdentifiersItem) {
        if (this.dataGroupIdentifiers == null) {
            this.dataGroupIdentifiers = new ArrayList<>();
        }
        this.dataGroupIdentifiers.add(dataGroupIdentifiersItem);
        return this;
    }

    /**
     * Identifiers of the data groups that belong to the given function group
     * @return dataGroupIdentifiers
     */
    @ApiModelProperty(value = "Identifiers of the data groups that belong to the given function group")
    @Valid 
    public List<PresentationDataGroupIdentifier> getDataGroupIdentifiers() {
        return dataGroupIdentifiers;
    }

    public void setDataGroupIdentifiers(List<PresentationDataGroupIdentifier> dataGroupIdentifiers) {
        this.dataGroupIdentifiers = dataGroupIdentifiers;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PresentationFunctionGroupDataGroup presentationFunctionGroupDataGroup = (PresentationFunctionGroupDataGroup) o;
        return Objects.equals(this.functionGroupIdentifier, presentationFunctionGroupDataGroup.functionGroupIdentifier) &&
                Objects.equals(this.dataGroupIdentifiers, presentationFunctionGroupDataGroup.dataGroupIdentifiers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            functionGroupIdentifier,
            dataGroupIdentifiers
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PresentationFunctionGroupDataGroup {\n");
        
        sb.append("        functionGroupIdentifier: ").append(toIndentedString(functionGroupIdentifier)).append("\n");
        sb.append("        dataGroupIdentifiers: ").append(toIndentedString(dataGroupIdentifiers)).append("\n");
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

