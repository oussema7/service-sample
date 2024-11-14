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
import com.microsphere.accesscontrol.service.api.rest.v2.model.LegalEntityType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * LegalEntityItemAllOf
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class LegalEntityItemAllOf 
 {
    @JsonProperty("parentId")
    private @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String parentId;

    @JsonProperty("isParent")
    private  Boolean isParent;

    @JsonProperty("id")
    private @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String id;

    @JsonProperty("externalId")
    private @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String externalId;

    @JsonProperty("name")
    private @Size(min=1)  String name;

    @JsonProperty("type")
    private  LegalEntityType type;


    public LegalEntityItemAllOf parentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * Universally Unique Identifier.
     * @return parentId
     */
    @ApiModelProperty(value = "Universally Unique Identifier.")
    @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") 
    public @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String getParentId() {
        return parentId;
    }

    public void setParentId(@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String parentId) {
        this.parentId = parentId;
    }


    public LegalEntityItemAllOf isParent(Boolean isParent) {
        this.isParent = isParent;
        return this;
    }

    /**
     * Defines whether the legal entity is parent
     * @return isParent
     */
    @ApiModelProperty(value = "Defines whether the legal entity is parent")
    
    public  Boolean getIsParent() {
        return isParent;
    }

    public void setIsParent( Boolean isParent) {
        this.isParent = isParent;
    }


    public LegalEntityItemAllOf id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Universally Unique Identifier.
     * @return id
     */
    @ApiModelProperty(value = "Universally Unique Identifier.")
    @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") 
    public @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String getId() {
        return id;
    }

    public void setId(@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String id) {
        this.id = id;
    }


    public LegalEntityItemAllOf externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * External Unique Identifier.
     * @return externalId
     */
    @ApiModelProperty(value = "External Unique Identifier.")
    @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64) 
    public @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String getExternalId() {
        return externalId;
    }

    public void setExternalId(@Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String externalId) {
        this.externalId = externalId;
    }


    public LegalEntityItemAllOf name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the legal entity
     * @return name
     */
    @ApiModelProperty(value = "Name of the legal entity")
    @Size(min=1) 
    public @Size(min=1)  String getName() {
        return name;
    }

    public void setName(@Size(min=1)  String name) {
        this.name = name;
    }


    public LegalEntityItemAllOf type(LegalEntityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @ApiModelProperty(value = "")
    @Valid 
    public  LegalEntityType getType() {
        return type;
    }

    public void setType( LegalEntityType type) {
        this.type = type;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LegalEntityItemAllOf legalEntityItemAllOf = (LegalEntityItemAllOf) o;
        return Objects.equals(this.parentId, legalEntityItemAllOf.parentId) &&
                Objects.equals(this.isParent, legalEntityItemAllOf.isParent) &&
                Objects.equals(this.id, legalEntityItemAllOf.id) &&
                Objects.equals(this.externalId, legalEntityItemAllOf.externalId) &&
                Objects.equals(this.name, legalEntityItemAllOf.name) &&
                Objects.equals(this.type, legalEntityItemAllOf.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            parentId,
            isParent,
            id,
            externalId,
            name,
            type
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LegalEntityItemAllOf {\n");
        
        sb.append("        parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("        isParent: ").append(toIndentedString(isParent)).append("\n");
        sb.append("        id: ").append(toIndentedString(id)).append("\n");
        sb.append("        externalId: ").append(toIndentedString(externalId)).append("\n");
        sb.append("        name: ").append(toIndentedString(name)).append("\n");
        sb.append("        type: ").append(toIndentedString(type)).append("\n");
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

