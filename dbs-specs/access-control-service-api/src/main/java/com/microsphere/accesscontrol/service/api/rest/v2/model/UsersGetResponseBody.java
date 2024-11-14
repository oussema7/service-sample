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
import com.microsphere.accesscontrol.service.api.rest.v2.model.Dataaccessgroupsforfunctionaccessgroupitem;
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
 * UsersGetResponseBody
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class UsersGetResponseBody 
 {
    @JsonProperty("id")
    private @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String id;

    @JsonProperty("userId")
    private @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String userId;

    @JsonProperty("serviceAgreementId")
    private @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String serviceAgreementId;

    @JsonProperty("dataAccessGroupsByFunctionAccessGroup")
    private List<Dataaccessgroupsforfunctionaccessgroupitem> dataAccessGroupsByFunctionAccessGroup = null;


    public UsersGetResponseBody id(String id) {
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


    public UsersGetResponseBody userId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * Universally Unique Identifier.
     * @return userId
     */
    @ApiModelProperty(required = true, value = "Universally Unique Identifier.")
    @NotNull @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") 
    public @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String getUserId() {
        return userId;
    }

    public void setUserId(@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String userId) {
        this.userId = userId;
    }


    public UsersGetResponseBody serviceAgreementId(String serviceAgreementId) {
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


    public UsersGetResponseBody dataAccessGroupsByFunctionAccessGroup(List<Dataaccessgroupsforfunctionaccessgroupitem> dataAccessGroupsByFunctionAccessGroup) {
        this.dataAccessGroupsByFunctionAccessGroup = dataAccessGroupsByFunctionAccessGroup;
        return this;
    }

    public UsersGetResponseBody addDataAccessGroupsByFunctionAccessGroupItem(Dataaccessgroupsforfunctionaccessgroupitem dataAccessGroupsByFunctionAccessGroupItem) {
        if (this.dataAccessGroupsByFunctionAccessGroup == null) {
            this.dataAccessGroupsByFunctionAccessGroup = new ArrayList<>();
        }
        this.dataAccessGroupsByFunctionAccessGroup.add(dataAccessGroupsByFunctionAccessGroupItem);
        return this;
    }

    /**
     * Get dataAccessGroupsByFunctionAccessGroup
     * @return dataAccessGroupsByFunctionAccessGroup
     */
    @ApiModelProperty(value = "")
    @Valid 
    public List<Dataaccessgroupsforfunctionaccessgroupitem> getDataAccessGroupsByFunctionAccessGroup() {
        return dataAccessGroupsByFunctionAccessGroup;
    }

    public void setDataAccessGroupsByFunctionAccessGroup(List<Dataaccessgroupsforfunctionaccessgroupitem> dataAccessGroupsByFunctionAccessGroup) {
        this.dataAccessGroupsByFunctionAccessGroup = dataAccessGroupsByFunctionAccessGroup;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UsersGetResponseBody usersGetResponseBody = (UsersGetResponseBody) o;
        return Objects.equals(this.id, usersGetResponseBody.id) &&
                Objects.equals(this.userId, usersGetResponseBody.userId) &&
                Objects.equals(this.serviceAgreementId, usersGetResponseBody.serviceAgreementId) &&
                Objects.equals(this.dataAccessGroupsByFunctionAccessGroup, usersGetResponseBody.dataAccessGroupsByFunctionAccessGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            id,
            userId,
            serviceAgreementId,
            dataAccessGroupsByFunctionAccessGroup
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UsersGetResponseBody {\n");
        
        sb.append("        id: ").append(toIndentedString(id)).append("\n");
        sb.append("        userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("        serviceAgreementId: ").append(toIndentedString(serviceAgreementId)).append("\n");
        sb.append("        dataAccessGroupsByFunctionAccessGroup: ").append(toIndentedString(dataAccessGroupsByFunctionAccessGroup)).append("\n");
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

