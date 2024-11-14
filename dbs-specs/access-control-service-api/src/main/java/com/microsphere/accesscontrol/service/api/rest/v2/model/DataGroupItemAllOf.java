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
 * DataGroupItemAllOf
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class DataGroupItemAllOf 
 {
    @JsonProperty("id")
    private @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String id;

    @JsonProperty("name")
    private  String name;

    @JsonProperty("description")
    private  String description;

    @JsonProperty("serviceAgreementId")
    private @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String serviceAgreementId;

    @JsonProperty("type")
    private @Pattern(regexp="^\\S+$") @Size(min=1, max=36)  String type;

    @JsonProperty("approvalId")
    private  String approvalId;

    @JsonProperty("items")
    private List<String> items = null;

    @JsonProperty("metadata")
    private Map<String, @Size(min=1, max=80) String> metadata = null;


    public DataGroupItemAllOf id(String id) {
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


    public DataGroupItemAllOf name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of data group
     * @return name
     */
    @ApiModelProperty(value = "Name of data group")
    
    public  String getName() {
        return name;
    }

    public void setName( String name) {
        this.name = name;
    }


    public DataGroupItemAllOf description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Description of data group
     * @return description
     */
    @ApiModelProperty(value = "Description of data group")
    
    public  String getDescription() {
        return description;
    }

    public void setDescription( String description) {
        this.description = description;
    }


    public DataGroupItemAllOf serviceAgreementId(String serviceAgreementId) {
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


    public DataGroupItemAllOf type(String type) {
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


    public DataGroupItemAllOf approvalId(String approvalId) {
        this.approvalId = approvalId;
        return this;
    }

    /**
     * Id of approval request.
     * @return approvalId
     */
    @ApiModelProperty(value = "Id of approval request.")
    
    public  String getApprovalId() {
        return approvalId;
    }

    public void setApprovalId( String approvalId) {
        this.approvalId = approvalId;
    }


    public DataGroupItemAllOf items(List<String> items) {
        this.items = items;
        return this;
    }

    public DataGroupItemAllOf addItemsItem(String itemsItem) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    /**
     * Items that belong to the data group
     * @return items
     */
    @ApiModelProperty(value = "Items that belong to the data group")
    
    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }


    public DataGroupItemAllOf metadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    public DataGroupItemAllOf putMetadataItem(String key, String metadataItem) {
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
        DataGroupItemAllOf dataGroupItemAllOf = (DataGroupItemAllOf) o;
        return Objects.equals(this.id, dataGroupItemAllOf.id) &&
                Objects.equals(this.name, dataGroupItemAllOf.name) &&
                Objects.equals(this.description, dataGroupItemAllOf.description) &&
                Objects.equals(this.serviceAgreementId, dataGroupItemAllOf.serviceAgreementId) &&
                Objects.equals(this.type, dataGroupItemAllOf.type) &&
                Objects.equals(this.approvalId, dataGroupItemAllOf.approvalId) &&
                Objects.equals(this.items, dataGroupItemAllOf.items) &&
                Objects.equals(this.metadata, dataGroupItemAllOf.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            name,
            description,
            serviceAgreementId,
            type,
            approvalId,
            items,
            metadata
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataGroupItemAllOf {\n");
        
        sb.append("        id: ").append(toIndentedString(id)).append("\n");
        sb.append("        name: ").append(toIndentedString(name)).append("\n");
        sb.append("        description: ").append(toIndentedString(description)).append("\n");
        sb.append("        serviceAgreementId: ").append(toIndentedString(serviceAgreementId)).append("\n");
        sb.append("        type: ").append(toIndentedString(type)).append("\n");
        sb.append("        approvalId: ").append(toIndentedString(approvalId)).append("\n");
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

