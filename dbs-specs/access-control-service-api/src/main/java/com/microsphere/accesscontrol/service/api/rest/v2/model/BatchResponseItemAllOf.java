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
 * BatchResponseItemAllOf
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class BatchResponseItemAllOf 
 {
    @JsonProperty("resourceId")
    private @Size(min=1)  String resourceId;

  /**
   * Http status codes available for response
   */
  public enum StatusEnum {
    HTTP_STATUS_OK("200"),
    
    HTTP_STATUS_BAD_REQUEST("400"),
    
    HTTP_STATUS_NOT_FOUND("404"),
    
    HTTP_STATUS_INTERNAL_SERVER_ERROR("500");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

    @JsonProperty("status")
    private  StatusEnum status;

    @JsonProperty("errors")
    private List<String> errors = null;


    public BatchResponseItemAllOf resourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Id of the resource
     * @return resourceId
     */
    @ApiModelProperty(value = "Id of the resource")
    @Size(min=1) 
    public @Size(min=1)  String getResourceId() {
        return resourceId;
    }

    public void setResourceId(@Size(min=1)  String resourceId) {
        this.resourceId = resourceId;
    }


    public BatchResponseItemAllOf status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Http status codes available for response
     * @return status
     */
    @ApiModelProperty(value = "Http status codes available for response")
    
    public  StatusEnum getStatus() {
        return status;
    }

    public void setStatus( StatusEnum status) {
        this.status = status;
    }


    public BatchResponseItemAllOf errors(List<String> errors) {
        this.errors = errors;
        return this;
    }

    public BatchResponseItemAllOf addErrorsItem(String errorsItem) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.add(errorsItem);
        return this;
    }

    /**
     * List of error messages
     * @return errors
     */
    @ApiModelProperty(value = "List of error messages")
    
    public List<String> getErrors() {
        return errors;
    }

    public void setErrors(List<String> errors) {
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
        BatchResponseItemAllOf batchResponseItemAllOf = (BatchResponseItemAllOf) o;
        return Objects.equals(this.resourceId, batchResponseItemAllOf.resourceId) &&
                Objects.equals(this.status, batchResponseItemAllOf.status) &&
                Objects.equals(this.errors, batchResponseItemAllOf.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            resourceId,
            status,
            errors
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchResponseItemAllOf {\n");
        
        sb.append("        resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("        status: ").append(toIndentedString(status)).append("\n");
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

