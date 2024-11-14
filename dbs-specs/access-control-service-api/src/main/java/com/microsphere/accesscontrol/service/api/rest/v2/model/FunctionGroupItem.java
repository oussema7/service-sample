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
import com.microsphere.accesscontrol.service.api.rest.v2.model.AdditionalPropertiesAware;
import com.microsphere.accesscontrol.service.api.rest.v2.model.FunctionGroupItemAllOf;
import com.microsphere.accesscontrol.service.api.rest.v2.model.Permission;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
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
 * Function group item
 */
@ApiModel(description = "Function group item")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class FunctionGroupItem 
 {
    @JsonProperty("additions")
    private Map<String, String> additions = null;

    @JsonProperty("id")
    private @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String id;

    @JsonProperty("serviceAgreementId")
    private @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String serviceAgreementId;

    @JsonProperty("name")
    private  String name;

    @JsonProperty("description")
    private  String description;

  /**
   * Type of function group
   */
  public enum TypeEnum {
    DEFAULT("DEFAULT"),
    
    SYSTEM("SYSTEM"),
    
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

    @JsonProperty("permissions")
    private List<Permission> permissions = null;

    @JsonProperty("validFrom")
    @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
    private  OffsetDateTime validFrom;

    @JsonProperty("validUntil")
    @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
    private  OffsetDateTime validUntil;

    @JsonProperty("approvalId")
    private @Size(min=1, max=36)  String approvalId;

    @JsonProperty("metadata")
    private Map<String, @Size(min=1, max=80) String> metadata = null;


    public FunctionGroupItem additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public FunctionGroupItem putAdditionsItem(String key, String additionsItem) {
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


    public FunctionGroupItem id(String id) {
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


    public FunctionGroupItem serviceAgreementId(String serviceAgreementId) {
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


    public FunctionGroupItem name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of function group
     * @return name
     */
    @ApiModelProperty(required = true, value = "Name of function group")
    @NotNull 
    public  String getName() {
        return name;
    }

    public void setName( String name) {
        this.name = name;
    }


    public FunctionGroupItem description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Description of function group
     * @return description
     */
    @ApiModelProperty(required = true, value = "Description of function group")
    @NotNull 
    public  String getDescription() {
        return description;
    }

    public void setDescription( String description) {
        this.description = description;
    }


    public FunctionGroupItem type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Type of function group
     * @return type
     */
    @ApiModelProperty(required = true, value = "Type of function group")
    @NotNull 
    public  TypeEnum getType() {
        return type;
    }

    public void setType( TypeEnum type) {
        this.type = type;
    }


    public FunctionGroupItem permissions(List<Permission> permissions) {
        this.permissions = permissions;
        return this;
    }

    public FunctionGroupItem addPermissionsItem(Permission permissionsItem) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        this.permissions.add(permissionsItem);
        return this;
    }

    /**
     * Applicable permissions for the function group
     * @return permissions
     */
    @ApiModelProperty(value = "Applicable permissions for the function group")
    @Valid 
    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }


    public FunctionGroupItem validFrom(OffsetDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     * Start date and time of the function group.
     * @return validFrom
     */
    @ApiModelProperty(value = "Start date and time of the function group.")
    @Valid 
    public  OffsetDateTime getValidFrom() {
        return validFrom;
    }

    public void setValidFrom( OffsetDateTime validFrom) {
        this.validFrom = validFrom;
    }


    public FunctionGroupItem validUntil(OffsetDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     * End date and time of the function group.
     * @return validUntil
     */
    @ApiModelProperty(value = "End date and time of the function group.")
    @Valid 
    public  OffsetDateTime getValidUntil() {
        return validUntil;
    }

    public void setValidUntil( OffsetDateTime validUntil) {
        this.validUntil = validUntil;
    }


    public FunctionGroupItem approvalId(String approvalId) {
        this.approvalId = approvalId;
        return this;
    }

    /**
     * Id of approval request.
     * @return approvalId
     */
    @ApiModelProperty(value = "Id of approval request.")
    @Size(min=1, max=36) 
    public @Size(min=1, max=36)  String getApprovalId() {
        return approvalId;
    }

    public void setApprovalId(@Size(min=1, max=36)  String approvalId) {
        this.approvalId = approvalId;
    }


    public FunctionGroupItem metadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    public FunctionGroupItem putMetadataItem(String key, String metadataItem) {
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
        FunctionGroupItem functionGroupItem = (FunctionGroupItem) o;
        return Objects.equals(this.additions, functionGroupItem.additions) &&
                Objects.equals(this.id, functionGroupItem.id) &&
                Objects.equals(this.serviceAgreementId, functionGroupItem.serviceAgreementId) &&
                Objects.equals(this.name, functionGroupItem.name) &&
                Objects.equals(this.description, functionGroupItem.description) &&
                Objects.equals(this.type, functionGroupItem.type) &&
                Objects.equals(this.permissions, functionGroupItem.permissions) &&
                Objects.equals(this.validFrom, functionGroupItem.validFrom) &&
                Objects.equals(this.validUntil, functionGroupItem.validUntil) &&
                Objects.equals(this.approvalId, functionGroupItem.approvalId) &&
                Objects.equals(this.metadata, functionGroupItem.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            additions,
            id,
            serviceAgreementId,
            name,
            description,
            type,
            permissions,
            validFrom,
            validUntil,
            approvalId,
            metadata
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FunctionGroupItem {\n");
        
        sb.append("        additions: ").append(toIndentedString(additions)).append("\n");
        sb.append("        id: ").append(toIndentedString(id)).append("\n");
        sb.append("        serviceAgreementId: ").append(toIndentedString(serviceAgreementId)).append("\n");
        sb.append("        name: ").append(toIndentedString(name)).append("\n");
        sb.append("        description: ").append(toIndentedString(description)).append("\n");
        sb.append("        type: ").append(toIndentedString(type)).append("\n");
        sb.append("        permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("        validFrom: ").append(toIndentedString(validFrom)).append("\n");
        sb.append("        validUntil: ").append(toIndentedString(validUntil)).append("\n");
        sb.append("        approvalId: ").append(toIndentedString(approvalId)).append("\n");
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

