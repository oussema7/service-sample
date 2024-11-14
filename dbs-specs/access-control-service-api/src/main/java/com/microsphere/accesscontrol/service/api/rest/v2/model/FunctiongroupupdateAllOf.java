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
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationPermissionFunctionGroupUpdate;
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
 * FunctiongroupupdateAllOf
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class FunctiongroupupdateAllOf 
 {
    @JsonProperty("name")
    private @Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=128)  String name;

    @JsonProperty("description")
    private @Pattern(regexp="^(\\S|\\n)((.|\\n)*(\\S|\\n))?$") @Size(min=1, max=255)  String description;

    @JsonProperty("permissions")
    private List<PresentationPermissionFunctionGroupUpdate> permissions = null;

    @JsonProperty("validFromDate")
    private  String validFromDate;

    @JsonProperty("validFromTime")
    private  String validFromTime;

    @JsonProperty("validUntilDate")
    private  String validUntilDate;

    @JsonProperty("validUntilTime")
    private  String validUntilTime;

    @JsonProperty("metadata")
    private Map<String, @Size(min=1, max=80) String> metadata = null;


    public FunctiongroupupdateAllOf name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Function group name
     * @return name
     */
    @ApiModelProperty(value = "Function group name")
    @Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=128) 
    public @Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=128)  String getName() {
        return name;
    }

    public void setName(@Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=128)  String name) {
        this.name = name;
    }


    public FunctiongroupupdateAllOf description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Function group description
     * @return description
     */
    @ApiModelProperty(value = "Function group description")
    @Pattern(regexp="^(\\S|\\n)((.|\\n)*(\\S|\\n))?$") @Size(min=1, max=255) 
    public @Pattern(regexp="^(\\S|\\n)((.|\\n)*(\\S|\\n))?$") @Size(min=1, max=255)  String getDescription() {
        return description;
    }

    public void setDescription(@Pattern(regexp="^(\\S|\\n)((.|\\n)*(\\S|\\n))?$") @Size(min=1, max=255)  String description) {
        this.description = description;
    }


    public FunctiongroupupdateAllOf permissions(List<PresentationPermissionFunctionGroupUpdate> permissions) {
        this.permissions = permissions;
        return this;
    }

    public FunctiongroupupdateAllOf addPermissionsItem(PresentationPermissionFunctionGroupUpdate permissionsItem) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        this.permissions.add(permissionsItem);
        return this;
    }

    /**
     * Get permissions
     * @return permissions
     */
    @ApiModelProperty(value = "")
    @Valid 
    public List<PresentationPermissionFunctionGroupUpdate> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<PresentationPermissionFunctionGroupUpdate> permissions) {
        this.permissions = permissions;
    }


    public FunctiongroupupdateAllOf validFromDate(String validFromDate) {
        this.validFromDate = validFromDate;
        return this;
    }

    /**
     * Start date of the function group.
     * @return validFromDate
     */
    @ApiModelProperty(value = "Start date of the function group.")
    
    public  String getValidFromDate() {
        return validFromDate;
    }

    public void setValidFromDate( String validFromDate) {
        this.validFromDate = validFromDate;
    }


    public FunctiongroupupdateAllOf validFromTime(String validFromTime) {
        this.validFromTime = validFromTime;
        return this;
    }

    /**
     * Start time of the function group.
     * @return validFromTime
     */
    @ApiModelProperty(value = "Start time of the function group.")
    
    public  String getValidFromTime() {
        return validFromTime;
    }

    public void setValidFromTime( String validFromTime) {
        this.validFromTime = validFromTime;
    }


    public FunctiongroupupdateAllOf validUntilDate(String validUntilDate) {
        this.validUntilDate = validUntilDate;
        return this;
    }

    /**
     * End date of the function group.
     * @return validUntilDate
     */
    @ApiModelProperty(value = "End date of the function group.")
    
    public  String getValidUntilDate() {
        return validUntilDate;
    }

    public void setValidUntilDate( String validUntilDate) {
        this.validUntilDate = validUntilDate;
    }


    public FunctiongroupupdateAllOf validUntilTime(String validUntilTime) {
        this.validUntilTime = validUntilTime;
        return this;
    }

    /**
     * End time of the function group.
     * @return validUntilTime
     */
    @ApiModelProperty(value = "End time of the function group.")
    
    public  String getValidUntilTime() {
        return validUntilTime;
    }

    public void setValidUntilTime( String validUntilTime) {
        this.validUntilTime = validUntilTime;
    }


    public FunctiongroupupdateAllOf metadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    public FunctiongroupupdateAllOf putMetadataItem(String key, String metadataItem) {
        if (this.metadata == null) {
            this.metadata = new HashMap<>();
        }
        this.metadata.put(key, metadataItem);
        return this;
    }

    /**
     * Metadata for specific entities. Do not use it for custom extensions. Use additions instead.
     * @return metadata
     */
    @ApiModelProperty(value = "Metadata for specific entities. Do not use it for custom extensions. Use additions instead.")
    @Size(min=0, max=10) 
    public Map<String, @Size(min=1, max=80) String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, @Size(min=1, max=80) String> metadata) {
        this.metadata = metadata;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FunctiongroupupdateAllOf functiongroupupdateAllOf = (FunctiongroupupdateAllOf) o;
        return Objects.equals(this.name, functiongroupupdateAllOf.name) &&
                Objects.equals(this.description, functiongroupupdateAllOf.description) &&
                Objects.equals(this.permissions, functiongroupupdateAllOf.permissions) &&
                Objects.equals(this.validFromDate, functiongroupupdateAllOf.validFromDate) &&
                Objects.equals(this.validFromTime, functiongroupupdateAllOf.validFromTime) &&
                Objects.equals(this.validUntilDate, functiongroupupdateAllOf.validUntilDate) &&
                Objects.equals(this.validUntilTime, functiongroupupdateAllOf.validUntilTime) &&
                Objects.equals(this.metadata, functiongroupupdateAllOf.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            name,
            description,
            permissions,
            validFromDate,
            validFromTime,
            validUntilDate,
            validUntilTime,
            metadata
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FunctiongroupupdateAllOf {\n");
        
        sb.append("        name: ").append(toIndentedString(name)).append("\n");
        sb.append("        description: ").append(toIndentedString(description)).append("\n");
        sb.append("        permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("        validFromDate: ").append(toIndentedString(validFromDate)).append("\n");
        sb.append("        validFromTime: ").append(toIndentedString(validFromTime)).append("\n");
        sb.append("        validUntilDate: ").append(toIndentedString(validUntilDate)).append("\n");
        sb.append("        validUntilTime: ").append(toIndentedString(validUntilTime)).append("\n");
        sb.append("        metadata: ").append(toIndentedString(metadata)).append("\n");
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

