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
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationIngestFunctionGroupAllOf;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationPermission;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
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
 * PresentationIngestFunctionGroup
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class PresentationIngestFunctionGroup 
 {
    @JsonProperty("additions")
    private Map<String, String> additions = null;

    @JsonProperty("name")
    private @Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=128)  String name;

    @JsonProperty("description")
    private @Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=255)  String description;

    @JsonProperty("externalServiceAgreementId")
    private @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String externalServiceAgreementId;

    @JsonProperty("permissions")
    private List<PresentationPermission> permissions = null;

    @JsonProperty("validFromDate")
    private  String validFromDate;

    @JsonProperty("validFromTime")
    private  String validFromTime;

    @JsonProperty("validUntilDate")
    private  String validUntilDate;

    @JsonProperty("validUntilTime")
    private  String validUntilTime;

    @JsonProperty("apsId")
    private  BigDecimal apsId;

    @JsonProperty("apsName")
    private @Size(max=128)  String apsName;

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
    private  TypeEnum type = TypeEnum.REGULAR;

    @JsonProperty("metadata")
    private Map<String, @Size(min=1, max=80) String> metadata = null;


    public PresentationIngestFunctionGroup additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public PresentationIngestFunctionGroup putAdditionsItem(String key, String additionsItem) {
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


    public PresentationIngestFunctionGroup name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Function group name
     * @return name
     */
    @ApiModelProperty(required = true, value = "Function group name")
    @NotNull @Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=128) 
    public @Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=128)  String getName() {
        return name;
    }

    public void setName(@Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=128)  String name) {
        this.name = name;
    }


    public PresentationIngestFunctionGroup description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Function group description
     * @return description
     */
    @ApiModelProperty(required = true, value = "Function group description")
    @NotNull @Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=255) 
    public @Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=255)  String getDescription() {
        return description;
    }

    public void setDescription(@Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=255)  String description) {
        this.description = description;
    }


    public PresentationIngestFunctionGroup externalServiceAgreementId(String externalServiceAgreementId) {
        this.externalServiceAgreementId = externalServiceAgreementId;
        return this;
    }

    /**
     * External Unique Identifier.
     * @return externalServiceAgreementId
     */
    @ApiModelProperty(required = true, value = "External Unique Identifier.")
    @NotNull @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64) 
    public @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String getExternalServiceAgreementId() {
        return externalServiceAgreementId;
    }

    public void setExternalServiceAgreementId(@Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String externalServiceAgreementId) {
        this.externalServiceAgreementId = externalServiceAgreementId;
    }


    public PresentationIngestFunctionGroup permissions(List<PresentationPermission> permissions) {
        this.permissions = permissions;
        return this;
    }

    public PresentationIngestFunctionGroup addPermissionsItem(PresentationPermission permissionsItem) {
        if (this.permissions == null) {
            this.permissions = new ArrayList<>();
        }
        this.permissions.add(permissionsItem);
        return this;
    }

    /**
     * Get permissions
     * @return permissions
     */
    @ApiModelProperty(value = "")
    @Valid 
    public List<PresentationPermission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<PresentationPermission> permissions) {
        this.permissions = permissions;
    }


    public PresentationIngestFunctionGroup validFromDate(String validFromDate) {
        this.validFromDate = validFromDate;
        return this;
    }

    /**
     * Start date of the function group.
     * @return validFromDate
     */
    @ApiModelProperty(value = "Start date of the function group.")
    
    public  String getValidFromDate() {
        return validFromDate;
    }

    public void setValidFromDate( String validFromDate) {
        this.validFromDate = validFromDate;
    }


    public PresentationIngestFunctionGroup validFromTime(String validFromTime) {
        this.validFromTime = validFromTime;
        return this;
    }

    /**
     * Start time of the function group.
     * @return validFromTime
     */
    @ApiModelProperty(value = "Start time of the function group.")
    
    public  String getValidFromTime() {
        return validFromTime;
    }

    public void setValidFromTime( String validFromTime) {
        this.validFromTime = validFromTime;
    }


    public PresentationIngestFunctionGroup validUntilDate(String validUntilDate) {
        this.validUntilDate = validUntilDate;
        return this;
    }

    /**
     * End date of the function group.
     * @return validUntilDate
     */
    @ApiModelProperty(value = "End date of the function group.")
    
    public  String getValidUntilDate() {
        return validUntilDate;
    }

    public void setValidUntilDate( String validUntilDate) {
        this.validUntilDate = validUntilDate;
    }


    public PresentationIngestFunctionGroup validUntilTime(String validUntilTime) {
        this.validUntilTime = validUntilTime;
        return this;
    }

    /**
     * End time of the function group.
     * @return validUntilTime
     */
    @ApiModelProperty(value = "End time of the function group.")
    
    public  String getValidUntilTime() {
        return validUntilTime;
    }

    public void setValidUntilTime( String validUntilTime) {
        this.validUntilTime = validUntilTime;
    }


    public PresentationIngestFunctionGroup apsId(BigDecimal apsId) {
        this.apsId = apsId;
        return this;
    }

    /**
     * Assignable Permission Set Id
     * @return apsId
     */
    @ApiModelProperty(value = "Assignable Permission Set Id")
    @Valid 
    public  BigDecimal getApsId() {
        return apsId;
    }

    public void setApsId( BigDecimal apsId) {
        this.apsId = apsId;
    }


    public PresentationIngestFunctionGroup apsName(String apsName) {
        this.apsName = apsName;
        return this;
    }

    /**
     * Assignable Permission Set name
     * @return apsName
     */
    @ApiModelProperty(value = "Assignable Permission Set name")
    @Size(max=128) 
    public @Size(max=128)  String getApsName() {
        return apsName;
    }

    public void setApsName(@Size(max=128)  String apsName) {
        this.apsName = apsName;
    }


    public PresentationIngestFunctionGroup type(TypeEnum type) {
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


    public PresentationIngestFunctionGroup metadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    public PresentationIngestFunctionGroup putMetadataItem(String key, String metadataItem) {
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
        PresentationIngestFunctionGroup presentationIngestFunctionGroup = (PresentationIngestFunctionGroup) o;
        return Objects.equals(this.additions, presentationIngestFunctionGroup.additions) &&
                Objects.equals(this.name, presentationIngestFunctionGroup.name) &&
                Objects.equals(this.description, presentationIngestFunctionGroup.description) &&
                Objects.equals(this.externalServiceAgreementId, presentationIngestFunctionGroup.externalServiceAgreementId) &&
                Objects.equals(this.permissions, presentationIngestFunctionGroup.permissions) &&
                Objects.equals(this.validFromDate, presentationIngestFunctionGroup.validFromDate) &&
                Objects.equals(this.validFromTime, presentationIngestFunctionGroup.validFromTime) &&
                Objects.equals(this.validUntilDate, presentationIngestFunctionGroup.validUntilDate) &&
                Objects.equals(this.validUntilTime, presentationIngestFunctionGroup.validUntilTime) &&
                Objects.equals(this.apsId, presentationIngestFunctionGroup.apsId) &&
                Objects.equals(this.apsName, presentationIngestFunctionGroup.apsName) &&
                Objects.equals(this.type, presentationIngestFunctionGroup.type) &&
                Objects.equals(this.metadata, presentationIngestFunctionGroup.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            additions,
            name,
            description,
            externalServiceAgreementId,
            permissions,
            validFromDate,
            validFromTime,
            validUntilDate,
            validUntilTime,
            apsId,
            apsName,
            type,
            metadata
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PresentationIngestFunctionGroup {\n");
        
        sb.append("        additions: ").append(toIndentedString(additions)).append("\n");
        sb.append("        name: ").append(toIndentedString(name)).append("\n");
        sb.append("        description: ").append(toIndentedString(description)).append("\n");
        sb.append("        externalServiceAgreementId: ").append(toIndentedString(externalServiceAgreementId)).append("\n");
        sb.append("        permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("        validFromDate: ").append(toIndentedString(validFromDate)).append("\n");
        sb.append("        validFromTime: ").append(toIndentedString(validFromTime)).append("\n");
        sb.append("        validUntilDate: ").append(toIndentedString(validUntilDate)).append("\n");
        sb.append("        validUntilTime: ").append(toIndentedString(validUntilTime)).append("\n");
        sb.append("        apsId: ").append(toIndentedString(apsId)).append("\n");
        sb.append("        apsName: ").append(toIndentedString(apsName)).append("\n");
        sb.append("        type: ").append(toIndentedString(type)).append("\n");
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

