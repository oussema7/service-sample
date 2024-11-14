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
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationDataGroupDetailsAllOf;
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
 * PresentationDataGroupDetails
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class PresentationDataGroupDetails 
 {
    @JsonProperty("additions")
    private Map<String, String> additions = null;

    @JsonProperty("id")
    private @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String id;

    @JsonProperty("name")
    private  String name;

    @JsonProperty("description")
    private  String description;

    @JsonProperty("metadata")
    private Map<String, @Size(min=1, max=80) String> metadata = null;


    public PresentationDataGroupDetails additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public PresentationDataGroupDetails putAdditionsItem(String key, String additionsItem) {
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


    public PresentationDataGroupDetails id(String id) {
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


    public PresentationDataGroupDetails name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @ApiModelProperty(value = "")
    
    public  String getName() {
        return name;
    }

    public void setName( String name) {
        this.name = name;
    }


    public PresentationDataGroupDetails description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @ApiModelProperty(value = "")
    
    public  String getDescription() {
        return description;
    }

    public void setDescription( String description) {
        this.description = description;
    }


    public PresentationDataGroupDetails metadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    public PresentationDataGroupDetails putMetadataItem(String key, String metadataItem) {
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
        PresentationDataGroupDetails presentationDataGroupDetails = (PresentationDataGroupDetails) o;
        return Objects.equals(this.additions, presentationDataGroupDetails.additions) &&
                Objects.equals(this.id, presentationDataGroupDetails.id) &&
                Objects.equals(this.name, presentationDataGroupDetails.name) &&
                Objects.equals(this.description, presentationDataGroupDetails.description) &&
                Objects.equals(this.metadata, presentationDataGroupDetails.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            additions,
            id,
            name,
            description,
            metadata
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PresentationDataGroupDetails {\n");
        
        sb.append("        additions: ").append(toIndentedString(additions)).append("\n");
        sb.append("        id: ").append(toIndentedString(id)).append("\n");
        sb.append("        name: ").append(toIndentedString(name)).append("\n");
        sb.append("        description: ").append(toIndentedString(description)).append("\n");
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

