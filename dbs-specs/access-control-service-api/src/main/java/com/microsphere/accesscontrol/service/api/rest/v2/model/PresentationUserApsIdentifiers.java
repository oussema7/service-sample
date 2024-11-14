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
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.*;
import com.fasterxml.jackson.annotation.*;


/**
 * PresentationUserApsIdentifiers
 */
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class PresentationUserApsIdentifiers 
 {
    @JsonProperty("nameIdentifiers")
    private List<String> nameIdentifiers = null;

    @JsonProperty("idIdentifiers")
    private List<BigDecimal> idIdentifiers = null;


    public PresentationUserApsIdentifiers nameIdentifiers(List<String> nameIdentifiers) {
        this.nameIdentifiers = nameIdentifiers;
        return this;
    }

    public PresentationUserApsIdentifiers addNameIdentifiersItem(String nameIdentifiersItem) {
        if (this.nameIdentifiers == null) {
            this.nameIdentifiers = new ArrayList<>();
        }
        this.nameIdentifiers.add(nameIdentifiersItem);
        return this;
    }

    /**
     * Get nameIdentifiers
     * @return nameIdentifiers
     */
    @ApiModelProperty(value = "")
    
    public List<String> getNameIdentifiers() {
        return nameIdentifiers;
    }

    public void setNameIdentifiers(List<String> nameIdentifiers) {
        this.nameIdentifiers = nameIdentifiers;
    }


    public PresentationUserApsIdentifiers idIdentifiers(List<BigDecimal> idIdentifiers) {
        this.idIdentifiers = idIdentifiers;
        return this;
    }

    public PresentationUserApsIdentifiers addIdIdentifiersItem(BigDecimal idIdentifiersItem) {
        if (this.idIdentifiers == null) {
            this.idIdentifiers = new ArrayList<>();
        }
        this.idIdentifiers.add(idIdentifiersItem);
        return this;
    }

    /**
     * Get idIdentifiers
     * @return idIdentifiers
     */
    @ApiModelProperty(value = "")
    @Valid 
    public List<BigDecimal> getIdIdentifiers() {
        return idIdentifiers;
    }

    public void setIdIdentifiers(List<BigDecimal> idIdentifiers) {
        this.idIdentifiers = idIdentifiers;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PresentationUserApsIdentifiers presentationUserApsIdentifiers = (PresentationUserApsIdentifiers) o;
        return Objects.equals(this.nameIdentifiers, presentationUserApsIdentifiers.nameIdentifiers) &&
                Objects.equals(this.idIdentifiers, presentationUserApsIdentifiers.idIdentifiers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            nameIdentifiers,
            idIdentifiers
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PresentationUserApsIdentifiers {\n");
        
        sb.append("        nameIdentifiers: ").append(toIndentedString(nameIdentifiers)).append("\n");
        sb.append("        idIdentifiers: ").append(toIndentedString(idIdentifiers)).append("\n");
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

