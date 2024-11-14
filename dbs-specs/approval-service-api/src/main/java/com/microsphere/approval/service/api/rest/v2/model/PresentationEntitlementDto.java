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
package com.microsphere.approval.service.api.rest.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
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
 * An item must have either a resource or at least one function.
 */
@ApiModel(description = "An item must have either a resource or at least one function.")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:48.431081700+01:00[Africa/Tunis]")

public class PresentationEntitlementDto 
 {
    @JsonProperty("resource")
    private @Size(max=32)  String resource;

    @JsonProperty("functions")
    private List<@Size(max=32) String> functions = null;

    @JsonProperty("additions")
    private Map<String, String> additions = null;


    public PresentationEntitlementDto resource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * This is the name of the resource.
     * @return resource
     */
    @ApiModelProperty(value = "This is the name of the resource.")
    @Size(max=32) 
    public @Size(max=32)  String getResource() {
        return resource;
    }

    public void setResource(@Size(max=32)  String resource) {
        this.resource = resource;
    }


    public PresentationEntitlementDto functions(List<String> functions) {
        this.functions = functions;
        return this;
    }

    public PresentationEntitlementDto addFunctionsItem(String functionsItem) {
        if (this.functions == null) {
            this.functions = new ArrayList<>();
        }
        this.functions.add(functionsItem);
        return this;
    }

    /**
     * List of functions.
     * @return functions
     */
    @ApiModelProperty(value = "List of functions.")
    
    public List<@Size(max=32) String> getFunctions() {
        return functions;
    }

    public void setFunctions(List<@Size(max=32) String> functions) {
        this.functions = functions;
    }


    public PresentationEntitlementDto additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public PresentationEntitlementDto putAdditionsItem(String key, String additionsItem) {
        if (this.additions == null) {
            this.additions = new HashMap<>();
        }
        this.additions.put(key, additionsItem);
        return this;
    }

    /**
     * Additional properties
     * @return additions
     */
    @ApiModelProperty(value = "Additional properties")
    
    public Map<String, String> getAdditions() {
        return additions;
    }

    public void setAdditions(Map<String, String> additions) {
        this.additions = additions;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PresentationEntitlementDto presentationEntitlementDto = (PresentationEntitlementDto) o;
        return Objects.equals(this.resource, presentationEntitlementDto.resource) &&
                Objects.equals(this.functions, presentationEntitlementDto.functions) &&
                Objects.equals(this.additions, presentationEntitlementDto.additions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            resource,
            functions,
            additions
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PresentationEntitlementDto {\n");
        
        sb.append("        resource: ").append(toIndentedString(resource)).append("\n");
        sb.append("        functions: ").append(toIndentedString(functions)).append("\n");
        sb.append("        additions: ").append(toIndentedString(additions)).append("\n");
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

