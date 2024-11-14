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
 * DataGroupItemSystemBaseAllOf
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class DataGroupItemSystemBaseAllOf 
 {
    @JsonProperty("serviceAgreementId")
    private @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String serviceAgreementId;

    @JsonProperty("externalServiceAgreementId")
    private @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String externalServiceAgreementId;

    @JsonProperty("areItemsInternalIds")
    private  Boolean areItemsInternalIds = true;

    @JsonProperty("name")
    private @Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=128)  String name;

    @JsonProperty("description")
    private @Pattern(regexp="^(\\S|\\n)((.|\\n)*(\\S|\\n))?$") @Size(min=1, max=255)  String description;

    @JsonProperty("type")
    private @Pattern(regexp="^\\S+$") @Size(min=1, max=36)  String type;

    @JsonProperty("items")
    private List<@Size(min=1, max=64) String> items = null;

    @JsonProperty("metadata")
    private Map<String, @Size(min=1, max=80) String> metadata = null;


    public DataGroupItemSystemBaseAllOf serviceAgreementId(String serviceAgreementId) {
        this.serviceAgreementId = serviceAgreementId;
        return this;
    }

    /**
     * Universally Unique Identifier.
     * @return serviceAgreementId
     */
    @ApiModelProperty(value = "Universally Unique Identifier.")
    @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") 
    public @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String getServiceAgreementId() {
        return serviceAgreementId;
    }

    public void setServiceAgreementId(@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String serviceAgreementId) {
        this.serviceAgreementId = serviceAgreementId;
    }


    public DataGroupItemSystemBaseAllOf externalServiceAgreementId(String externalServiceAgreementId) {
        this.externalServiceAgreementId = externalServiceAgreementId;
        return this;
    }

    /**
     * External Unique Identifier.
     * @return externalServiceAgreementId
     */
    @ApiModelProperty(value = "External Unique Identifier.")
    @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64) 
    public @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String getExternalServiceAgreementId() {
        return externalServiceAgreementId;
    }

    public void setExternalServiceAgreementId(@Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String externalServiceAgreementId) {
        this.externalServiceAgreementId = externalServiceAgreementId;
    }


    public DataGroupItemSystemBaseAllOf areItemsInternalIds(Boolean areItemsInternalIds) {
        this.areItemsInternalIds = areItemsInternalIds;
        return this;
    }

    /**
     * If true all items are with internal ids, otherwise are external ids
     * @return areItemsInternalIds
     */
    @ApiModelProperty(value = "If true all items are with internal ids, otherwise are external ids")
    
    public  Boolean getAreItemsInternalIds() {
        return areItemsInternalIds;
    }

    public void setAreItemsInternalIds( Boolean areItemsInternalIds) {
        this.areItemsInternalIds = areItemsInternalIds;
    }


    public DataGroupItemSystemBaseAllOf name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Data group name
     * @return name
     */
    @ApiModelProperty(value = "Data group name")
    @Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=128) 
    public @Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=128)  String getName() {
        return name;
    }

    public void setName(@Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=128)  String name) {
        this.name = name;
    }


    public DataGroupItemSystemBaseAllOf description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Data group description
     * @return description
     */
    @ApiModelProperty(value = "Data group description")
    @Pattern(regexp="^(\\S|\\n)((.|\\n)*(\\S|\\n))?$") @Size(min=1, max=255) 
    public @Pattern(regexp="^(\\S|\\n)((.|\\n)*(\\S|\\n))?$") @Size(min=1, max=255)  String getDescription() {
        return description;
    }

    public void setDescription(@Pattern(regexp="^(\\S|\\n)((.|\\n)*(\\S|\\n))?$") @Size(min=1, max=255)  String description) {
        this.description = description;
    }


    public DataGroupItemSystemBaseAllOf type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Data group type
     * @return type
     */
    @ApiModelProperty(value = "Data group type")
    @Pattern(regexp="^\\S+$") @Size(min=1, max=36) 
    public @Pattern(regexp="^\\S+$") @Size(min=1, max=36)  String getType() {
        return type;
    }

    public void setType(@Pattern(regexp="^\\S+$") @Size(min=1, max=36)  String type) {
        this.type = type;
    }


    public DataGroupItemSystemBaseAllOf items(List<String> items) {
        this.items = items;
        return this;
    }

    public DataGroupItemSystemBaseAllOf addItemsItem(String itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    /**
     * Data group items
     * @return items
     */
    @ApiModelProperty(value = "Data group items")
    
    public List<@Size(min=1, max=64) String> getItems() {
        return items;
    }

    public void setItems(List<@Size(min=1, max=64) String> items) {
        this.items = items;
    }


    public DataGroupItemSystemBaseAllOf metadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    public DataGroupItemSystemBaseAllOf putMetadataItem(String key, String metadataItem) {
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
        DataGroupItemSystemBaseAllOf dataGroupItemSystemBaseAllOf = (DataGroupItemSystemBaseAllOf) o;
        return Objects.equals(this.serviceAgreementId, dataGroupItemSystemBaseAllOf.serviceAgreementId) &&
                Objects.equals(this.externalServiceAgreementId, dataGroupItemSystemBaseAllOf.externalServiceAgreementId) &&
                Objects.equals(this.areItemsInternalIds, dataGroupItemSystemBaseAllOf.areItemsInternalIds) &&
                Objects.equals(this.name, dataGroupItemSystemBaseAllOf.name) &&
                Objects.equals(this.description, dataGroupItemSystemBaseAllOf.description) &&
                Objects.equals(this.type, dataGroupItemSystemBaseAllOf.type) &&
                Objects.equals(this.items, dataGroupItemSystemBaseAllOf.items) &&
                Objects.equals(this.metadata, dataGroupItemSystemBaseAllOf.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            serviceAgreementId,
            externalServiceAgreementId,
            areItemsInternalIds,
            name,
            description,
            type,
            items,
            metadata
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataGroupItemSystemBaseAllOf {\n");
        
        sb.append("        serviceAgreementId: ").append(toIndentedString(serviceAgreementId)).append("\n");
        sb.append("        externalServiceAgreementId: ").append(toIndentedString(externalServiceAgreementId)).append("\n");
        sb.append("        areItemsInternalIds: ").append(toIndentedString(areItemsInternalIds)).append("\n");
        sb.append("        name: ").append(toIndentedString(name)).append("\n");
        sb.append("        description: ").append(toIndentedString(description)).append("\n");
        sb.append("        type: ").append(toIndentedString(type)).append("\n");
        sb.append("        items: ").append(toIndentedString(items)).append("\n");
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

