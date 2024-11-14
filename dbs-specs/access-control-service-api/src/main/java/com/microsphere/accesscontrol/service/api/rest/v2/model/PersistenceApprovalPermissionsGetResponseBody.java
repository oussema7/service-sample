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
import com.microsphere.accesscontrol.service.api.rest.v2.model.PersistenceApprovalPermissionsGetResponseBodyAllOf;
import com.microsphere.accesscontrol.service.api.rest.v2.model.SelfApprovalPolicy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
 * PersistenceApprovalPermissionsGetResponseBody
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class PersistenceApprovalPermissionsGetResponseBody 
 {
    @JsonProperty("additions")
    private Map<String, String> additions = null;

    @JsonProperty("functionGroupId")
    private @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String functionGroupId;

    @JsonProperty("dataGroupIds")
    private List<@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") String> dataGroupIds = null;

    @JsonProperty("selfApprovalPolicies")
    private List<SelfApprovalPolicy> selfApprovalPolicies = null;


    public PersistenceApprovalPermissionsGetResponseBody additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public PersistenceApprovalPermissionsGetResponseBody putAdditionsItem(String key, String additionsItem) {
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


    public PersistenceApprovalPermissionsGetResponseBody functionGroupId(String functionGroupId) {
        this.functionGroupId = functionGroupId;
        return this;
    }

    /**
     * Universally Unique Identifier.
     * @return functionGroupId
     */
    @ApiModelProperty(required = true, value = "Universally Unique Identifier.")
    @NotNull @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") 
    public @Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String getFunctionGroupId() {
        return functionGroupId;
    }

    public void setFunctionGroupId(@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$")  String functionGroupId) {
        this.functionGroupId = functionGroupId;
    }


    public PersistenceApprovalPermissionsGetResponseBody dataGroupIds(List<String> dataGroupIds) {
        this.dataGroupIds = dataGroupIds;
        return this;
    }

    public PersistenceApprovalPermissionsGetResponseBody addDataGroupIdsItem(String dataGroupIdsItem) {
        if (this.dataGroupIds == null) {
            this.dataGroupIds = new ArrayList<>();
        }
        this.dataGroupIds.add(dataGroupIdsItem);
        return this;
    }

    /**
     * Get dataGroupIds
     * @return dataGroupIds
     */
    @ApiModelProperty(value = "")
    @Size(min=0) 
    public List<@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") String> getDataGroupIds() {
        return dataGroupIds;
    }

    public void setDataGroupIds(List<@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") String> dataGroupIds) {
        this.dataGroupIds = dataGroupIds;
    }


    public PersistenceApprovalPermissionsGetResponseBody selfApprovalPolicies(List<SelfApprovalPolicy> selfApprovalPolicies) {
        this.selfApprovalPolicies = selfApprovalPolicies;
        return this;
    }

    public PersistenceApprovalPermissionsGetResponseBody addSelfApprovalPoliciesItem(SelfApprovalPolicy selfApprovalPoliciesItem) {
        if (this.selfApprovalPolicies == null) {
            this.selfApprovalPolicies = new ArrayList<>();
        }
        this.selfApprovalPolicies.add(selfApprovalPoliciesItem);
        return this;
    }

    /**
     * Get selfApprovalPolicies
     * @return selfApprovalPolicies
     */
    @ApiModelProperty(value = "")
    @Valid 
    public List<SelfApprovalPolicy> getSelfApprovalPolicies() {
        return selfApprovalPolicies;
    }

    public void setSelfApprovalPolicies(List<SelfApprovalPolicy> selfApprovalPolicies) {
        this.selfApprovalPolicies = selfApprovalPolicies;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PersistenceApprovalPermissionsGetResponseBody persistenceApprovalPermissionsGetResponseBody = (PersistenceApprovalPermissionsGetResponseBody) o;
        return Objects.equals(this.additions, persistenceApprovalPermissionsGetResponseBody.additions) &&
                Objects.equals(this.functionGroupId, persistenceApprovalPermissionsGetResponseBody.functionGroupId) &&
                Objects.equals(this.dataGroupIds, persistenceApprovalPermissionsGetResponseBody.dataGroupIds) &&
                Objects.equals(this.selfApprovalPolicies, persistenceApprovalPermissionsGetResponseBody.selfApprovalPolicies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            additions,
            functionGroupId,
            dataGroupIds,
            selfApprovalPolicies
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PersistenceApprovalPermissionsGetResponseBody {\n");
        
        sb.append("        additions: ").append(toIndentedString(additions)).append("\n");
        sb.append("        functionGroupId: ").append(toIndentedString(functionGroupId)).append("\n");
        sb.append("        dataGroupIds: ").append(toIndentedString(dataGroupIds)).append("\n");
        sb.append("        selfApprovalPolicies: ").append(toIndentedString(selfApprovalPolicies)).append("\n");
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

