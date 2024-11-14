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
package com.microsphere.onboarding.client.api.rest.v2.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * ResiliationPutRequest
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:54.288185700+01:00[Africa/Tunis]")

public class ResiliationPutRequest 
 {
    @JsonProperty("subscriptionId")
    private  String subscriptionId;

  /**
   * Gets or Sets motive
   */
  public enum MotiveEnum {
    CLIENT("CLIENT"),
    
    ABONNEMENT("ABONNEMENT"),
    
    AUTOMATIQUE("AUTOMATIQUE");

    private String value;

    MotiveEnum(String value) {
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
    public static MotiveEnum fromValue(String value) {
      for (MotiveEnum b : MotiveEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

    @JsonProperty("motive")
    private  MotiveEnum motive;


    public ResiliationPutRequest subscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get subscriptionId
     * @return subscriptionId
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull 
    public  String getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId( String subscriptionId) {
        this.subscriptionId = subscriptionId;
    }


    public ResiliationPutRequest motive(MotiveEnum motive) {
        this.motive = motive;
        return this;
    }

    /**
     * Get motive
     * @return motive
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull 
    public  MotiveEnum getMotive() {
        return motive;
    }

    public void setMotive( MotiveEnum motive) {
        this.motive = motive;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResiliationPutRequest resiliationPutRequest = (ResiliationPutRequest) o;
        return Objects.equals(this.subscriptionId, resiliationPutRequest.subscriptionId) &&
                Objects.equals(this.motive, resiliationPutRequest.motive);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            subscriptionId,
            motive
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResiliationPutRequest {\n");
        
        sb.append("        subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
        sb.append("        motive: ").append(toIndentedString(motive)).append("\n");
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

