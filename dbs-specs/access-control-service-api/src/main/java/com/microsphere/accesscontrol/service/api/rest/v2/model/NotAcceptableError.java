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
 * NotAcceptableError
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class NotAcceptableError 
 {
    @JsonProperty("message")
    private  String message;

    @JsonProperty("supportedMediaTypes")
    private List<String> supportedMediaTypes = null;


    public NotAcceptableError message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get message
     * @return message
     */
    @ApiModelProperty(value = "")
    
    public  String getMessage() {
        return message;
    }

    public void setMessage( String message) {
        this.message = message;
    }


    public NotAcceptableError supportedMediaTypes(List<String> supportedMediaTypes) {
        this.supportedMediaTypes = supportedMediaTypes;
        return this;
    }

    public NotAcceptableError addSupportedMediaTypesItem(String supportedMediaTypesItem) {
        if (this.supportedMediaTypes == null) {
            this.supportedMediaTypes = new ArrayList<>();
        }
        this.supportedMediaTypes.add(supportedMediaTypesItem);
        return this;
    }

    /**
     * List of supported media types for this endpoint
     * @return supportedMediaTypes
     */
    @ApiModelProperty(value = "List of supported media types for this endpoint")
    
    public List<String> getSupportedMediaTypes() {
        return supportedMediaTypes;
    }

    public void setSupportedMediaTypes(List<String> supportedMediaTypes) {
        this.supportedMediaTypes = supportedMediaTypes;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NotAcceptableError notAcceptableError = (NotAcceptableError) o;
        return Objects.equals(this.message, notAcceptableError.message) &&
                Objects.equals(this.supportedMediaTypes, notAcceptableError.supportedMediaTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            message,
            supportedMediaTypes
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NotAcceptableError {\n");
        
        sb.append("        message: ").append(toIndentedString(message)).append("\n");
        sb.append("        supportedMediaTypes: ").append(toIndentedString(supportedMediaTypes)).append("\n");
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

