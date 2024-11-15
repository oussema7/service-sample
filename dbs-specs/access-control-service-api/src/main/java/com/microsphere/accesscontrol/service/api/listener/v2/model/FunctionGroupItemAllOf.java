/*
 * Access Control service API
 * Manage user permissions, data groups, function groups and service agreements from service to service side
 *
 * The version of the OpenAPI document: 2.11.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://github.com/Backbase/backbase-openapi-tools).
 * https://github.com/Backbase/backbase-openapi-tools
 * Do not edit the class manually.
 */


package com.microsphere.accesscontrol.service.api.listener.v2.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.microsphere.accesscontrol.service.api.listener.v2.model.Permission;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * FunctionGroupItemAllOf
 */
@JsonPropertyOrder({
  FunctionGroupItemAllOf.JSON_PROPERTY_ID,
  FunctionGroupItemAllOf.JSON_PROPERTY_SERVICE_AGREEMENT_ID,
  FunctionGroupItemAllOf.JSON_PROPERTY_NAME,
  FunctionGroupItemAllOf.JSON_PROPERTY_DESCRIPTION,
  FunctionGroupItemAllOf.JSON_PROPERTY_TYPE,
  FunctionGroupItemAllOf.JSON_PROPERTY_PERMISSIONS,
  FunctionGroupItemAllOf.JSON_PROPERTY_VALID_FROM,
  FunctionGroupItemAllOf.JSON_PROPERTY_VALID_UNTIL,
  FunctionGroupItemAllOf.JSON_PROPERTY_APPROVAL_ID,
  FunctionGroupItemAllOf.JSON_PROPERTY_METADATA
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:27.444046600+01:00[Africa/Tunis]")
public  class FunctionGroupItemAllOf {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_SERVICE_AGREEMENT_ID = "serviceAgreementId";
  private String serviceAgreementId;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

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

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_PERMISSIONS = "permissions";
  private List<Permission> permissions = null;

  public static final String JSON_PROPERTY_VALID_FROM = "validFrom";
  private OffsetDateTime validFrom;

  public static final String JSON_PROPERTY_VALID_UNTIL = "validUntil";
  private OffsetDateTime validUntil;

  public static final String JSON_PROPERTY_APPROVAL_ID = "approvalId";
  private String approvalId;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, String> metadata = null;


  public FunctionGroupItemAllOf id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Universally Unique Identifier.
   * @return id
  **/
  @javax.annotation.Nullable
 @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  @ApiModelProperty(value = "Universally Unique Identifier.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public FunctionGroupItemAllOf serviceAgreementId(String serviceAgreementId) {
    
    this.serviceAgreementId = serviceAgreementId;
    return this;
  }

   /**
   * Universally Unique Identifier.
   * @return serviceAgreementId
  **/
  @javax.annotation.Nullable
 @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  @ApiModelProperty(value = "Universally Unique Identifier.")
  @JsonProperty(JSON_PROPERTY_SERVICE_AGREEMENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getServiceAgreementId() {
    return serviceAgreementId;
  }


  public void setServiceAgreementId(String serviceAgreementId) {
    this.serviceAgreementId = serviceAgreementId;
  }


  public FunctionGroupItemAllOf name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of function group
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of function group")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public FunctionGroupItemAllOf description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of function group
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of function group")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public FunctionGroupItemAllOf type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type of function group
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type of function group")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
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
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "Applicable permissions for the function group")
  @JsonProperty(JSON_PROPERTY_PERMISSIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

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
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "Start date and time of the function group.")
  @JsonProperty(JSON_PROPERTY_VALID_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getValidFrom() {
    return validFrom;
  }


  public void setValidFrom(OffsetDateTime validFrom) {
    this.validFrom = validFrom;
  }


  public FunctionGroupItemAllOf validUntil(OffsetDateTime validUntil) {
    
    this.validUntil = validUntil;
    return this;
  }

   /**
   * End date and time of the function group.
   * @return validUntil
  **/
  @javax.annotation.Nullable
  @Valid
  @ApiModelProperty(value = "End date and time of the function group.")
  @JsonProperty(JSON_PROPERTY_VALID_UNTIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getValidUntil() {
    return validUntil;
  }


  public void setValidUntil(OffsetDateTime validUntil) {
    this.validUntil = validUntil;
  }


  public FunctionGroupItemAllOf approvalId(String approvalId) {
    
    this.approvalId = approvalId;
    return this;
  }

   /**
   * Id of approval request.
   * @return approvalId
  **/
  @javax.annotation.Nullable
 @Size(min=1,max=36)  @ApiModelProperty(value = "Id of approval request.")
  @JsonProperty(JSON_PROPERTY_APPROVAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getApprovalId() {
    return approvalId;
  }


  public void setApprovalId(String approvalId) {
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
  **/
  @javax.annotation.Nullable
 @Size(min=0,max=10)  @ApiModelProperty(value = "Metadata for specific entities. Do not use it for custom extensions. Use additions instead.")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Map<String, String> getMetadata() {
    return metadata;
  }


  public void setMetadata(Map<String, String> metadata) {
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
    return Objects.hash(id, serviceAgreementId, name, description, type, permissions, validFrom, validUntil, approvalId, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FunctionGroupItemAllOf {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    serviceAgreementId: ").append(toIndentedString(serviceAgreementId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    validFrom: ").append(toIndentedString(validFrom)).append("\n");
    sb.append("    validUntil: ").append(toIndentedString(validUntil)).append("\n");
    sb.append("    approvalId: ").append(toIndentedString(approvalId)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
    return o.toString().replace("\n", "\n    ");
  }

}

