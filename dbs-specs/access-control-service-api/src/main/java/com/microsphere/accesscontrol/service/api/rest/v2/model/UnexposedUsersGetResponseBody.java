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
 * UnexposedUsersGetResponseBody
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class UnexposedUsersGetResponseBody 
 {
    @JsonProperty("id")
    private @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String id;

    @JsonProperty("externalId")
    private @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String externalId;

    @JsonProperty("fullName")
    private @Size(min=1, max=128)  String fullName;

    @JsonProperty("legalEntityId")
    private @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String legalEntityId;

    @JsonProperty("legalEntityName")
    private @Size(min=1, max=128)  String legalEntityName;


    public UnexposedUsersGetResponseBody id(String id) {
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


    public UnexposedUsersGetResponseBody externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * External Unique Identifier.
     * @return externalId
     */
    @ApiModelProperty(required = true, value = "External Unique Identifier.")
    @NotNull @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64) 
    public @Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String getExternalId() {
        return externalId;
    }

    public void setExternalId(@Pattern(regexp="^[^\\r\\n]{1,64}$") @Size(min=1, max=64)  String externalId) {
        this.externalId = externalId;
    }


    public UnexposedUsersGetResponseBody fullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    /**
     * Get fullName
     * @return fullName
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull @Size(min=1, max=128) 
    public @Size(min=1, max=128)  String getFullName() {
        return fullName;
    }

    public void setFullName(@Size(min=1, max=128)  String fullName) {
        this.fullName = fullName;
    }


    public UnexposedUsersGetResponseBody legalEntityId(String legalEntityId) {
        this.legalEntityId = legalEntityId;
        return this;
    }

    /**
     * Universally Unique Identifier.
     * @return legalEntityId
     */
    @ApiModelProperty(required = true, value = "Universally Unique Identifier.")
    @NotNull @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") 
    public @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String getLegalEntityId() {
        return legalEntityId;
    }

    public void setLegalEntityId(@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String legalEntityId) {
        this.legalEntityId = legalEntityId;
    }


    public UnexposedUsersGetResponseBody legalEntityName(String legalEntityName) {
        this.legalEntityName = legalEntityName;
        return this;
    }

    /**
     * Get legalEntityName
     * @return legalEntityName
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull @Size(min=1, max=128) 
    public @Size(min=1, max=128)  String getLegalEntityName() {
        return legalEntityName;
    }

    public void setLegalEntityName(@Size(min=1, max=128)  String legalEntityName) {
        this.legalEntityName = legalEntityName;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UnexposedUsersGetResponseBody unexposedUsersGetResponseBody = (UnexposedUsersGetResponseBody) o;
        return Objects.equals(this.id, unexposedUsersGetResponseBody.id) &&
                Objects.equals(this.externalId, unexposedUsersGetResponseBody.externalId) &&
                Objects.equals(this.fullName, unexposedUsersGetResponseBody.fullName) &&
                Objects.equals(this.legalEntityId, unexposedUsersGetResponseBody.legalEntityId) &&
                Objects.equals(this.legalEntityName, unexposedUsersGetResponseBody.legalEntityName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            externalId,
            fullName,
            legalEntityId,
            legalEntityName
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnexposedUsersGetResponseBody {\n");
        
        sb.append("        id: ").append(toIndentedString(id)).append("\n");
        sb.append("        externalId: ").append(toIndentedString(externalId)).append("\n");
        sb.append("        fullName: ").append(toIndentedString(fullName)).append("\n");
        sb.append("        legalEntityId: ").append(toIndentedString(legalEntityId)).append("\n");
        sb.append("        legalEntityName: ").append(toIndentedString(legalEntityName)).append("\n");
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

