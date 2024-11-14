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
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * LegalEntityIdentifier
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class LegalEntityIdentifier 
 {
    @JsonProperty("externalIdIdentifier")
    private @Size(min=1)  String externalIdIdentifier;

  /**
   * Optionally specifies for the legal entity what it is sharing in the service agreements to be returned. If not specified, then service agreements and data groups are returned where this legal entity is sharing accounts.
   */
  public enum SharesEnum {
    ACCOUNTS("accounts"),
    
    USERS("users"),
    
    USERSANDACCOUNTS("usersAndAccounts");

    private String value;

    SharesEnum(String value) {
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
    public static SharesEnum fromValue(String value) {
      for (SharesEnum b : SharesEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

    @JsonProperty("shares")
    private  SharesEnum shares = SharesEnum.ACCOUNTS;


    public LegalEntityIdentifier externalIdIdentifier(String externalIdIdentifier) {
        this.externalIdIdentifier = externalIdIdentifier;
        return this;
    }

    /**
     * Legal Entity External Identifier
     * @return externalIdIdentifier
     */
    @ApiModelProperty(value = "Legal Entity External Identifier")
    @Size(min=1) 
    public @Size(min=1)  String getExternalIdIdentifier() {
        return externalIdIdentifier;
    }

    public void setExternalIdIdentifier(@Size(min=1)  String externalIdIdentifier) {
        this.externalIdIdentifier = externalIdIdentifier;
    }


    public LegalEntityIdentifier shares(SharesEnum shares) {
        this.shares = shares;
        return this;
    }

    /**
     * Optionally specifies for the legal entity what it is sharing in the service agreements to be returned. If not specified, then service agreements and data groups are returned where this legal entity is sharing accounts.
     * @return shares
     */
    @ApiModelProperty(value = "Optionally specifies for the legal entity what it is sharing in the service agreements to be returned. If not specified, then service agreements and data groups are returned where this legal entity is sharing accounts.")
    
    public  SharesEnum getShares() {
        return shares;
    }

    public void setShares( SharesEnum shares) {
        this.shares = shares;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LegalEntityIdentifier legalEntityIdentifier = (LegalEntityIdentifier) o;
        return Objects.equals(this.externalIdIdentifier, legalEntityIdentifier.externalIdIdentifier) &&
                Objects.equals(this.shares, legalEntityIdentifier.shares);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            externalIdIdentifier,
            shares
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LegalEntityIdentifier {\n");
        
        sb.append("        externalIdIdentifier: ").append(toIndentedString(externalIdIdentifier)).append("\n");
        sb.append("        shares: ").append(toIndentedString(shares)).append("\n");
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

