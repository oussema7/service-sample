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
import com.microsphere.accesscontrol.service.api.rest.v2.model.AdditionalPropertiesAware;
import com.microsphere.accesscontrol.service.api.rest.v2.model.LegalEntityItemAllOf;
import com.microsphere.accesscontrol.service.api.rest.v2.model.LegalEntityType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * Legal entity item
 */
@ApiModel(description = "Legal entity item")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class LegalEntityItem 
 {
    @JsonProperty("additions")
    private Map<String, String> additions = null;

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


    public LegalEntityItem additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public LegalEntityItem putAdditionsItem(String key, String additionsItem) {
        if (this.additions == null) {
            this.additions = new HashMap<>();
        }
        this.additions.put(key, additionsItem);
        return this;
    }

    /**
     * Get additions
     * @return additions
     */
    @ApiModelProperty(value = "")
    
    public Map<String, String> getAdditions() {
        return additions;
    }

    public void setAdditions(Map<String, String> additions) {
        this.additions = additions;
    }


    public LegalEntityItem parentId(String parentId) {
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


    public LegalEntityItem isParent(Boolean isParent) {
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


    public LegalEntityItem id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Universally Unique Identifier.
     * @return id
     */
    @ApiModelProperty(required = true, value = "Universally Unique Identifier.")
    @NotNull @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") 
    public @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String getId() {
        return id;
    }

    public void setId(@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String id) {
        this.id = id;
    }


    public LegalEntityItem externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * External Unique Identifier.
     * @return externalId
     */
    @ApiModelProperty(required = true, value = "External Unique Identifier.")
    @NotNull @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64) 
    public @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String getExternalId() {
        return externalId;
    }

    public void setExternalId(@Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String externalId) {
        this.externalId = externalId;
    }


    public LegalEntityItem name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the legal entity
     * @return name
     */
    @ApiModelProperty(required = true, value = "Name of the legal entity")
    @NotNull @Size(min=1) 
    public @Size(min=1)  String getName() {
        return name;
    }

    public void setName(@Size(min=1)  String name) {
        this.name = name;
    }


    public LegalEntityItem type(LegalEntityType type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull @Valid 
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
        LegalEntityItem legalEntityItem = (LegalEntityItem) o;
        return Objects.equals(this.additions, legalEntityItem.additions) &&
                Objects.equals(this.parentId, legalEntityItem.parentId) &&
                Objects.equals(this.isParent, legalEntityItem.isParent) &&
                Objects.equals(this.id, legalEntityItem.id) &&
                Objects.equals(this.externalId, legalEntityItem.externalId) &&
                Objects.equals(this.name, legalEntityItem.name) &&
                Objects.equals(this.type, legalEntityItem.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            additions,
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
        sb.append("class LegalEntityItem {\n");
        
        sb.append("        additions: ").append(toIndentedString(additions)).append("\n");
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

