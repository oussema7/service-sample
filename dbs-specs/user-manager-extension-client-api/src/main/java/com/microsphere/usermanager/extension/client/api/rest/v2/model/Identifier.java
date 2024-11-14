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
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * Identifier
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:58.643479400+01:00[Africa/Tunis]")

public class Identifier 
 {
    @JsonProperty("userId")
    private  String userId;


    public Identifier userId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * This flag indicates if the user id to send mail
     * @return userId
     */
    @ApiModelProperty(value = "This flag indicates if the user id to send mail")
    
    public  String getUserId() {
        return userId;
    }

    public void setUserId( String userId) {
        this.userId = userId;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Identifier identifier = (Identifier) o;
        return Objects.equals(this.userId, identifier.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            userId
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Identifier {\n");
        
        sb.append("        userId: ").append(toIndentedString(userId)).append("\n");
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

