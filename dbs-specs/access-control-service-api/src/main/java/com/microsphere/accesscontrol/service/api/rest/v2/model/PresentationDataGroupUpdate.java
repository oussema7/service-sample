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
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationDataGroupIdentifier;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationDataGroupUpdateAllOf;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationItemIdentifier;
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
 * PresentationDataGroupUpdate
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class PresentationDataGroupUpdate 
 {
    @JsonProperty("additions")
    private Map<String, String> additions = null;

    @JsonProperty("name")
    private @Size(min=1, max=128)  String name;

    @JsonProperty("description")
    private @Pattern(regexp="^(\\S|\\n)((.|\\n)*(\\S|\\n))?$") @Size(min=1, max=255)  String description;

    @JsonProperty("type")
    private @Pattern(regexp="^\\S+$") @Size(min=1, max=36)  String type;

    @JsonProperty("dataGroupIdentifier")
    private  PresentationDataGroupIdentifier dataGroupIdentifier;

    @JsonProperty("dataItems")
    private List<PresentationItemIdentifier> dataItems = null;

    @JsonProperty("metadata")
    private Map<String, @Size(min=1, max=80) String> metadata = null;


    public PresentationDataGroupUpdate additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public PresentationDataGroupUpdate putAdditionsItem(String key, String additionsItem) {
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


    public PresentationDataGroupUpdate name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull @Size(min=1, max=128) 
    public @Size(min=1, max=128)  String getName() {
        return name;
    }

    public void setName(@Size(min=1, max=128)  String name) {
        this.name = name;
    }


    public PresentationDataGroupUpdate description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull @Pattern(regexp="^(\\S|\\n)((.|\\n)*(\\S|\\n))?$") @Size(min=1, max=255) 
    public @Pattern(regexp="^(\\S|\\n)((.|\\n)*(\\S|\\n))?$") @Size(min=1, max=255)  String getDescription() {
        return description;
    }

    public void setDescription(@Pattern(regexp="^(\\S|\\n)((.|\\n)*(\\S|\\n))?$") @Size(min=1, max=255)  String description) {
        this.description = description;
    }


    public PresentationDataGroupUpdate type(String type) {
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


    public PresentationDataGroupUpdate dataGroupIdentifier(PresentationDataGroupIdentifier dataGroupIdentifier) {
        this.dataGroupIdentifier = dataGroupIdentifier;
        return this;
    }

    /**
     * Get dataGroupIdentifier
     * @return dataGroupIdentifier
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull @Valid 
    public  PresentationDataGroupIdentifier getDataGroupIdentifier() {
        return dataGroupIdentifier;
    }

    public void setDataGroupIdentifier( PresentationDataGroupIdentifier dataGroupIdentifier) {
        this.dataGroupIdentifier = dataGroupIdentifier;
    }


    public PresentationDataGroupUpdate dataItems(List<PresentationItemIdentifier> dataItems) {
        this.dataItems = dataItems;
        return this;
    }

    public PresentationDataGroupUpdate addDataItemsItem(PresentationItemIdentifier dataItemsItem) {
        if (this.dataItems == null) {
            this.dataItems = new ArrayList<>();
        }
        this.dataItems.add(dataItemsItem);
        return this;
    }

    /**
     * Get dataItems
     * @return dataItems
     */
    @ApiModelProperty(value = "")
    @Valid 
    public List<PresentationItemIdentifier> getDataItems() {
        return dataItems;
    }

    public void setDataItems(List<PresentationItemIdentifier> dataItems) {
        this.dataItems = dataItems;
    }


    public PresentationDataGroupUpdate metadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    public PresentationDataGroupUpdate putMetadataItem(String key, String metadataItem) {
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
        PresentationDataGroupUpdate presentationDataGroupUpdate = (PresentationDataGroupUpdate) o;
        return Objects.equals(this.additions, presentationDataGroupUpdate.additions) &&
                Objects.equals(this.name, presentationDataGroupUpdate.name) &&
                Objects.equals(this.description, presentationDataGroupUpdate.description) &&
                Objects.equals(this.type, presentationDataGroupUpdate.type) &&
                Objects.equals(this.dataGroupIdentifier, presentationDataGroupUpdate.dataGroupIdentifier) &&
                Objects.equals(this.dataItems, presentationDataGroupUpdate.dataItems) &&
                Objects.equals(this.metadata, presentationDataGroupUpdate.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            additions,
            name,
            description,
            type,
            dataGroupIdentifier,
            dataItems,
            metadata
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PresentationDataGroupUpdate {\n");
        
        sb.append("        additions: ").append(toIndentedString(additions)).append("\n");
        sb.append("        name: ").append(toIndentedString(name)).append("\n");
        sb.append("        description: ").append(toIndentedString(description)).append("\n");
        sb.append("        type: ").append(toIndentedString(type)).append("\n");
        sb.append("        dataGroupIdentifier: ").append(toIndentedString(dataGroupIdentifier)).append("\n");
        sb.append("        dataItems: ").append(toIndentedString(dataItems)).append("\n");
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

