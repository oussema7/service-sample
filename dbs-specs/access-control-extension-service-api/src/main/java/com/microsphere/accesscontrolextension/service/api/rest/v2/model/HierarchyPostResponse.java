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
package com.microsphere.accesscontrolextension.service.api.rest.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsphere.accesscontrolextension.service.api.rest.v2.model.LegalEntityIdentifier;
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
 * Get legal entity ancestors
 */
@ApiModel(description = "Get legal entity ancestors")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:46.842949400+01:00[Africa/Tunis]")

public class HierarchyPostResponse 
 {
    @JsonProperty("rootEntity")
    private  LegalEntityIdentifier rootEntity;

    @JsonProperty("subsidiaries")
    private List<LegalEntityIdentifier> subsidiaries = new ArrayList<>();


    public HierarchyPostResponse rootEntity(LegalEntityIdentifier rootEntity) {
        this.rootEntity = rootEntity;
        return this;
    }

    /**
     * Get rootEntity
     * @return rootEntity
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull @Valid 
    public  LegalEntityIdentifier getRootEntity() {
        return rootEntity;
    }

    public void setRootEntity( LegalEntityIdentifier rootEntity) {
        this.rootEntity = rootEntity;
    }


    public HierarchyPostResponse subsidiaries(List<LegalEntityIdentifier> subsidiaries) {
        this.subsidiaries = subsidiaries;
        return this;
    }

    public HierarchyPostResponse addSubsidiariesItem(LegalEntityIdentifier subsidiariesItem) {
        this.subsidiaries.add(subsidiariesItem);
        return this;
    }

    /**
     * List of subsidiaries
     * @return subsidiaries
     */
    @ApiModelProperty(required = true, value = "List of subsidiaries")
    @NotNull @Valid 
    public List<LegalEntityIdentifier> getSubsidiaries() {
        return subsidiaries;
    }

    public void setSubsidiaries(List<LegalEntityIdentifier> subsidiaries) {
        this.subsidiaries = subsidiaries;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HierarchyPostResponse hierarchyPostResponse = (HierarchyPostResponse) o;
        return Objects.equals(this.rootEntity, hierarchyPostResponse.rootEntity) &&
                Objects.equals(this.subsidiaries, hierarchyPostResponse.subsidiaries);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            rootEntity,
            subsidiaries
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HierarchyPostResponse {\n");
        
        sb.append("        rootEntity: ").append(toIndentedString(rootEntity)).append("\n");
        sb.append("        subsidiaries: ").append(toIndentedString(subsidiaries)).append("\n");
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

