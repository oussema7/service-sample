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
package com.microsphere.usermanager.extension.client.api.rest.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * RevokeIdentityAccessServiceRequest
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:58.643479400+01:00[Africa/Tunis]")

public class RevokeIdentityAccessServiceRequest 
 {
    @JsonProperty("comment")
    private @Size(min=1, max=255)  String comment;

    @JsonProperty("additions")
    private Map<String, String> additions = null;


    public RevokeIdentityAccessServiceRequest comment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * A comment regarding the access revokation, commonly a reason to revoke access.
     * @return comment
     */
    @ApiModelProperty(required = true, value = "A comment regarding the access revokation, commonly a reason to revoke access.")
    @NotNull @Size(min=1, max=255) 
    public @Size(min=1, max=255)  String getComment() {
        return comment;
    }

    public void setComment(@Size(min=1, max=255)  String comment) {
        this.comment = comment;
    }


    public RevokeIdentityAccessServiceRequest additions(Map<String, String> additions) {
        this.additions = additions;
        return this;
    }

    public RevokeIdentityAccessServiceRequest putAdditionsItem(String key, String additionsItem) {
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




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RevokeIdentityAccessServiceRequest revokeIdentityAccessServiceRequest = (RevokeIdentityAccessServiceRequest) o;
        return Objects.equals(this.comment, revokeIdentityAccessServiceRequest.comment) &&
                Objects.equals(this.additions, revokeIdentityAccessServiceRequest.additions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            comment,
            additions
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RevokeIdentityAccessServiceRequest {\n");
        
        sb.append("        comment: ").append(toIndentedString(comment)).append("\n");
        sb.append("        additions: ").append(toIndentedString(additions)).append("\n");
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

