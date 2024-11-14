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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * FunctionGroupsIds
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class FunctionGroupsIds 
 {
    @JsonProperty("ids")
    private List<@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") String> ids = new ArrayList<>();


    public FunctionGroupsIds ids(List<String> ids) {
        this.ids = ids;
        return this;
    }

    public FunctionGroupsIds addIdsItem(String idsItem) {
        this.ids.add(idsItem);
        return this;
    }

    /**
     * Get ids
     * @return ids
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull 
    public List<@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") String> getIds() {
        return ids;
    }

    public void setIds(List<@Pattern(regexp="^[0-9a-f]{32}$|^[0-9a-f-]{36}$") String> ids) {
        this.ids = ids;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FunctionGroupsIds functionGroupsIds = (FunctionGroupsIds) o;
        return Objects.equals(this.ids, functionGroupsIds.ids);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            ids
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FunctionGroupsIds {\n");
        
        sb.append("        ids: ").append(toIndentedString(ids)).append("\n");
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

