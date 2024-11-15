/*
 * Access Control service API
 * Manage user permissions, data groups, function groups and service agreements from service to service side
 *
 * The version of the OpenAPI document: 2.11.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://github.com/Backbase/backbase-openapi-tools).
 * https://github.com/Backbase/backbase-openapi-tools
 * Do not edit the class manually.
 */


package com.microsphere.accesscontrol.service.api.listener.v2.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;
import org.hibernate.validator.constraints.*;

/**
 * LegalEntityIdentifier
 */
@JsonPropertyOrder({
  LegalEntityIdentifier.JSON_PROPERTY_EXTERNAL_ID_IDENTIFIER,
  LegalEntityIdentifier.JSON_PROPERTY_SHARES
})
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatJavaCodeGen", date = "2024-11-14T00:08:27.444046600+01:00[Africa/Tunis]")
public  class LegalEntityIdentifier {
  public static final String JSON_PROPERTY_EXTERNAL_ID_IDENTIFIER = "externalIdIdentifier";
  private String externalIdIdentifier;

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

  public static final String JSON_PROPERTY_SHARES = "shares";
  private SharesEnum shares = SharesEnum.ACCOUNTS;


  public LegalEntityIdentifier externalIdIdentifier(String externalIdIdentifier) {
    
    this.externalIdIdentifier = externalIdIdentifier;
    return this;
  }

   /**
   * Legal Entity External Identifier
   * @return externalIdIdentifier
  **/
  @javax.annotation.Nullable
 @Size(min=1)  @ApiModelProperty(value = "Legal Entity External Identifier")
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID_IDENTIFIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalIdIdentifier() {
    return externalIdIdentifier;
  }


  public void setExternalIdIdentifier(String externalIdIdentifier) {
    this.externalIdIdentifier = externalIdIdentifier;
  }


  public LegalEntityIdentifier shares(SharesEnum shares) {
    
    this.shares = shares;
    return this;
  }

   /**
   * Optionally specifies for the legal entity what it is sharing in the service agreements to be returned. If not specified, then service agreements and data groups are returned where this legal entity is sharing accounts.
   * @return shares
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optionally specifies for the legal entity what it is sharing in the service agreements to be returned. If not specified, then service agreements and data groups are returned where this legal entity is sharing accounts.")
  @JsonProperty(JSON_PROPERTY_SHARES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SharesEnum getShares() {
    return shares;
  }


  public void setShares(SharesEnum shares) {
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
    return Objects.hash(externalIdIdentifier, shares);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LegalEntityIdentifier {\n");
    sb.append("    externalIdIdentifier: ").append(toIndentedString(externalIdIdentifier)).append("\n");
    sb.append("    shares: ").append(toIndentedString(shares)).append("\n");
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
    return o.toString().replace("\n", "\n    ");
  }

}

