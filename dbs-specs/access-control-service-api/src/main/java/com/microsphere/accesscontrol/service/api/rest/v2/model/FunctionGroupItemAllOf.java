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
 * FunctionGroupItemAllOf
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class FunctionGroupItemAllOf 
 {
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


    public FunctionGroupItemAllOf id(String id) {
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


    public FunctionGroupItemAllOf serviceAgreementId(String serviceAgreementId) {
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


    public FunctionGroupItemAllOf name(String name) {
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


    public FunctionGroupItemAllOf description(String description) {
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


    public FunctionGroupItemAllOf type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Type of function group
     * @return type
     */
    @ApiModelProperty(value = "Type of function group")
    
    public  TypeEnum getType() {
        return type;
    }

    public void setType( TypeEnum type) {
        this.type = type;
    }


    public FunctionGroupItemAllOf permissions(List<Permission> permissions) {
        this.permissions = permissions;
        return this;
    }

    public FunctionGroupItemAllOf addPermissionsItem(Permission permissionsItem) {
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


    public FunctionGroupItemAllOf validFrom(OffsetDateTime validFrom) {
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


    public FunctionGroupItemAllOf validUntil(OffsetDateTime validUntil) {
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


    public FunctionGroupItemAllOf approvalId(String approvalId) {
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


    public FunctionGroupItemAllOf metadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    public FunctionGroupItemAllOf putMetadataItem(String key, String metadataItem) {
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
        FunctionGroupItemAllOf functionGroupItemAllOf = (FunctionGroupItemAllOf) o;
        return Objects.equals(this.id, functionGroupItemAllOf.id) &&
                Objects.equals(this.serviceAgreementId, functionGroupItemAllOf.serviceAgreementId) &&
                Objects.equals(this.name, functionGroupItemAllOf.name) &&
                Objects.equals(this.description, functionGroupItemAllOf.description) &&
                Objects.equals(this.type, functionGroupItemAllOf.type) &&
                Objects.equals(this.permissions, functionGroupItemAllOf.permissions) &&
                Objects.equals(this.validFrom, functionGroupItemAllOf.validFrom) &&
                Objects.equals(this.validUntil, functionGroupItemAllOf.validUntil) &&
                Objects.equals(this.approvalId, functionGroupItemAllOf.approvalId) &&
                Objects.equals(this.metadata, functionGroupItemAllOf.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
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
        sb.append("class FunctionGroupItemAllOf {\n");
        
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

