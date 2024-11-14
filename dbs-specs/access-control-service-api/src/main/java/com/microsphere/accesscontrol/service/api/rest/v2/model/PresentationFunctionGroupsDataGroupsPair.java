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
import com.fasterxml.jackson.annotation.JsonValue;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationDataGroupApprovalItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * Function Groups and Data Groups Pairs.
 */
@ApiModel(description = "Function Groups and Data Groups Pairs.")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class PresentationFunctionGroupsDataGroupsPair 
 {
    @JsonProperty("id")
    private @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String id;

    @JsonProperty("name")
    private  String name;

    @JsonProperty("description")
    private  String description;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    REGULAR("REGULAR"),
    
    TEMPLATE("TEMPLATE");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

    @JsonProperty("type")
    private  TypeEnum type;

    @JsonProperty("dataGroups")
    private List<PresentationDataGroupApprovalItem> dataGroups = null;


    public PresentationFunctionGroupsDataGroupsPair id(String id) {
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


    public PresentationFunctionGroupsDataGroupsPair name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of function group
     * @return name
     */
    @ApiModelProperty(value = "Name of function group")
    
    public  String getName() {
        return name;
    }

    public void setName( String name) {
        this.name = name;
    }


    public PresentationFunctionGroupsDataGroupsPair description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Description of function group
     * @return description
     */
    @ApiModelProperty(value = "Description of function group")
    
    public  String getDescription() {
        return description;
    }

    public void setDescription( String description) {
        this.description = description;
    }


    public PresentationFunctionGroupsDataGroupsPair type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @ApiModelProperty(value = "")
    
    public  TypeEnum getType() {
        return type;
    }

    public void setType( TypeEnum type) {
        this.type = type;
    }


    public PresentationFunctionGroupsDataGroupsPair dataGroups(List<PresentationDataGroupApprovalItem> dataGroups) {
        this.dataGroups = dataGroups;
        return this;
    }

    public PresentationFunctionGroupsDataGroupsPair addDataGroupsItem(PresentationDataGroupApprovalItem dataGroupsItem) {
        if (this.dataGroups == null) {
            this.dataGroups = new ArrayList<>();
        }
        this.dataGroups.add(dataGroupsItem);
        return this;
    }

    /**
     * Get dataGroups
     * @return dataGroups
     */
    @ApiModelProperty(value = "")
    @Valid 
    public List<PresentationDataGroupApprovalItem> getDataGroups() {
        return dataGroups;
    }

    public void setDataGroups(List<PresentationDataGroupApprovalItem> dataGroups) {
        this.dataGroups = dataGroups;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PresentationFunctionGroupsDataGroupsPair presentationFunctionGroupsDataGroupsPair = (PresentationFunctionGroupsDataGroupsPair) o;
        return Objects.equals(this.id, presentationFunctionGroupsDataGroupsPair.id) &&
                Objects.equals(this.name, presentationFunctionGroupsDataGroupsPair.name) &&
                Objects.equals(this.description, presentationFunctionGroupsDataGroupsPair.description) &&
                Objects.equals(this.type, presentationFunctionGroupsDataGroupsPair.type) &&
                Objects.equals(this.dataGroups, presentationFunctionGroupsDataGroupsPair.dataGroups);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            name,
            description,
            type,
            dataGroups
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PresentationFunctionGroupsDataGroupsPair {\n");
        
        sb.append("        id: ").append(toIndentedString(id)).append("\n");
        sb.append("        name: ").append(toIndentedString(name)).append("\n");
        sb.append("        description: ").append(toIndentedString(description)).append("\n");
        sb.append("        type: ").append(toIndentedString(type)).append("\n");
        sb.append("        dataGroups: ").append(toIndentedString(dataGroups)).append("\n");
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

