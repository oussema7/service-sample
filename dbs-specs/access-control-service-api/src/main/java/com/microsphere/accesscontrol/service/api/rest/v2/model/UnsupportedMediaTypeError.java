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
import com.microsphere.accesscontrol.service.api.rest.v2.model.ErrorItem;
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
 * UnsupportedMediaTypeError
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class UnsupportedMediaTypeError 
 {
    @JsonProperty("message")
    private  String message;

    @JsonProperty("errors")
    private List<ErrorItem> errors = null;


    public UnsupportedMediaTypeError message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Any further information
     * @return message
     */
    @ApiModelProperty(value = "Any further information")
    
    public  String getMessage() {
        return message;
    }

    public void setMessage( String message) {
        this.message = message;
    }


    public UnsupportedMediaTypeError errors(List<ErrorItem> errors) {
        this.errors = errors;
        return this;
    }

    public UnsupportedMediaTypeError addErrorsItem(ErrorItem errorsItem) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.add(errorsItem);
        return this;
    }

    /**
     * Detailed error information
     * @return errors
     */
    @ApiModelProperty(value = "Detailed error information")
    @Valid 
    public List<ErrorItem> getErrors() {
        return errors;
    }

    public void setErrors(List<ErrorItem> errors) {
        this.errors = errors;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UnsupportedMediaTypeError unsupportedMediaTypeError = (UnsupportedMediaTypeError) o;
        return Objects.equals(this.message, unsupportedMediaTypeError.message) &&
                Objects.equals(this.errors, unsupportedMediaTypeError.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            message,
            errors
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnsupportedMediaTypeError {\n");
        
        sb.append("        message: ").append(toIndentedString(message)).append("\n");
        sb.append("        errors: ").append(toIndentedString(errors)).append("\n");
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

