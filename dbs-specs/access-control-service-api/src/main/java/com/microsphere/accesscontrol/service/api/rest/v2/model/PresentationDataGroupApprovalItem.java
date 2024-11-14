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
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * Data Groups Id and Name.
 */
@ApiModel(description = "Data Groups Id and Name.")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class PresentationDataGroupApprovalItem 
 {
    @JsonProperty("id")
    private @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String id;

    @JsonProperty("name")
    private  String name;

    @JsonProperty("description")
    private  String description;


    public PresentationDataGroupApprovalItem id(String id) {
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


    public PresentationDataGroupApprovalItem name(String name) {
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


    public PresentationDataGroupApprovalItem description(String description) {
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




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PresentationDataGroupApprovalItem presentationDataGroupApprovalItem = (PresentationDataGroupApprovalItem) o;
        return Objects.equals(this.id, presentationDataGroupApprovalItem.id) &&
                Objects.equals(this.name, presentationDataGroupApprovalItem.name) &&
                Objects.equals(this.description, presentationDataGroupApprovalItem.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            name,
            description
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PresentationDataGroupApprovalItem {\n");
        
        sb.append("        id: ").append(toIndentedString(id)).append("\n");
        sb.append("        name: ").append(toIndentedString(name)).append("\n");
        sb.append("        description: ").append(toIndentedString(description)).append("\n");
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

