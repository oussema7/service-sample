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
import com.microsphere.accesscontrol.service.api.rest.v2.model.DataGroupItemAllOf;
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
 * Data group item
 */
@ApiModel(description = "Data group item")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class DataGroupItem 
 {
    @JsonProperty("additions")
    private Map<String, String> additions = null;

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
    private List<String> items = new ArrayList<>();

    @JsonProperty("metadata")
    private Map<String, @Size(min=1, max=80) String> metadata = null;


    public DataGroupItem additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public DataGroupItem putAdditionsItem(String key, String additionsItem) {
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


    public DataGroupItem id(String id) {
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


    public DataGroupItem name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of data group
     * @return name
     */
    @ApiModelProperty(required = true, value = "Name of data group")
    @NotNull 
    public  String getName() {
        return name;
    }

    public void setName( String name) {
        this.name = name;
    }


    public DataGroupItem description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Description of data group
     * @return description
     */
    @ApiModelProperty(required = true, value = "Description of data group")
    @NotNull 
    public  String getDescription() {
        return description;
    }

    public void setDescription( String description) {
        this.description = description;
    }


    public DataGroupItem serviceAgreementId(String serviceAgreementId) {
        this.serviceAgreementId = serviceAgreementId;
        return this;
    }

    /**
     * Universally Unique Identifier.
     * @return serviceAgreementId
     */
    @ApiModelProperty(required = true, value = "Universally Unique Identifier.")
    @NotNull @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") 
    public @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String getServiceAgreementId() {
        return serviceAgreementId;
    }

    public void setServiceAgreementId(@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String serviceAgreementId) {
        this.serviceAgreementId = serviceAgreementId;
    }


    public DataGroupItem type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Data group type
     * @return type
     */
    @ApiModelProperty(required = true, value = "Data group type")
    @NotNull @Pattern(regexp="^\\S+$") @Size(min=1, max=36) 
    public @Pattern(regexp="^\\S+$") @Size(min=1, max=36)  String getType() {
        return type;
    }

    public void setType(@Pattern(regexp="^\\S+$") @Size(min=1, max=36)  String type) {
        this.type = type;
    }


    public DataGroupItem approvalId(String approvalId) {
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


    public DataGroupItem items(List<String> items) {
        this.items = items;
        return this;
    }

    public DataGroupItem addItemsItem(String itemsItem) {
        this.items.add(itemsItem);
        return this;
    }

    /**
     * Items that belong to the data group
     * @return items
     */
    @ApiModelProperty(required = true, value = "Items that belong to the data group")
    @NotNull 
    public List<String> getItems() {
        return items;
    }

    public void setItems(List<String> items) {
        this.items = items;
    }


    public DataGroupItem metadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    public DataGroupItem putMetadataItem(String key, String metadataItem) {
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
        DataGroupItem dataGroupItem = (DataGroupItem) o;
        return Objects.equals(this.additions, dataGroupItem.additions) &&
                Objects.equals(this.id, dataGroupItem.id) &&
                Objects.equals(this.name, dataGroupItem.name) &&
                Objects.equals(this.description, dataGroupItem.description) &&
                Objects.equals(this.serviceAgreementId, dataGroupItem.serviceAgreementId) &&
                Objects.equals(this.type, dataGroupItem.type) &&
                Objects.equals(this.approvalId, dataGroupItem.approvalId) &&
                Objects.equals(this.items, dataGroupItem.items) &&
                Objects.equals(this.metadata, dataGroupItem.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            additions,
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
        sb.append("class DataGroupItem {\n");
        
        sb.append("        additions: ").append(toIndentedString(additions)).append("\n");
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

