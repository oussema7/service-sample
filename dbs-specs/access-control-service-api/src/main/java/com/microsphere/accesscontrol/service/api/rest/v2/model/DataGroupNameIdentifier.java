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
import com.microsphere.accesscontrol.service.api.rest.v2.model.DataGroupNameIdentifierAllOf;
import com.microsphere.accesscontrol.service.api.rest.v2.model.NameIdentifier;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * DataGroupNameIdentifier
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class DataGroupNameIdentifier 
 {
    @JsonProperty("externalServiceAgreementId")
    private @Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=64)  String externalServiceAgreementId;

    @JsonProperty("name")
    private @Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=128)  String name;

    @JsonProperty("dataGroupType")
    private @Pattern(regexp="^\\S+$") @Size(min=1, max=36)  String dataGroupType;


    public DataGroupNameIdentifier externalServiceAgreementId(String externalServiceAgreementId) {
        this.externalServiceAgreementId = externalServiceAgreementId;
        return this;
    }

    /**
     * Id of Service Agreement on which entity belongs.
     * @return externalServiceAgreementId
     */
    @ApiModelProperty(required = true, value = "Id of Service Agreement on which entity belongs.")
    @NotNull @Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=64) 
    public @Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=64)  String getExternalServiceAgreementId() {
        return externalServiceAgreementId;
    }

    public void setExternalServiceAgreementId(@Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=64)  String externalServiceAgreementId) {
        this.externalServiceAgreementId = externalServiceAgreementId;
    }


    public DataGroupNameIdentifier name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Entity name.
     * @return name
     */
    @ApiModelProperty(required = true, value = "Entity name.")
    @NotNull @Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=128) 
    public @Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=128)  String getName() {
        return name;
    }

    public void setName(@Pattern(regexp="^\\S(.*(\\S))?$") @Size(min=1, max=128)  String name) {
        this.name = name;
    }


    public DataGroupNameIdentifier dataGroupType(String dataGroupType) {
        this.dataGroupType = dataGroupType;
        return this;
    }

    /**
     * Data group type
     * @return dataGroupType
     */
    @ApiModelProperty(value = "Data group type")
    @Pattern(regexp="^\\S+$") @Size(min=1, max=36) 
    public @Pattern(regexp="^\\S+$") @Size(min=1, max=36)  String getDataGroupType() {
        return dataGroupType;
    }

    public void setDataGroupType(@Pattern(regexp="^\\S+$") @Size(min=1, max=36)  String dataGroupType) {
        this.dataGroupType = dataGroupType;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DataGroupNameIdentifier dataGroupNameIdentifier = (DataGroupNameIdentifier) o;
        return Objects.equals(this.externalServiceAgreementId, dataGroupNameIdentifier.externalServiceAgreementId) &&
                Objects.equals(this.name, dataGroupNameIdentifier.name) &&
                Objects.equals(this.dataGroupType, dataGroupNameIdentifier.dataGroupType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            externalServiceAgreementId,
            name,
            dataGroupType
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataGroupNameIdentifier {\n");
        
        sb.append("        externalServiceAgreementId: ").append(toIndentedString(externalServiceAgreementId)).append("\n");
        sb.append("        name: ").append(toIndentedString(name)).append("\n");
        sb.append("        dataGroupType: ").append(toIndentedString(dataGroupType)).append("\n");
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

