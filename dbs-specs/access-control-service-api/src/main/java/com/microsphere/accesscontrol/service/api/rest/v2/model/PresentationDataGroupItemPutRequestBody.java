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
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationAction;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationDataGroupIdentifier;
import com.microsphere.accesscontrol.service.api.rest.v2.model.PresentationItemIdentifier;
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
 * Data group items by identifier update put
 */
@ApiModel(description = "Data group items by identifier update put")
@javax.annotation.Generated(value = "com.backbase.oss.codegen.java.BoatSpringCodeGen", date = "2024-11-14T00:08:24.845997700+01:00[Africa/Tunis]")

public class PresentationDataGroupItemPutRequestBody 
 {
    @JsonProperty("dataGroupIdentifier")
    private  PresentationDataGroupIdentifier dataGroupIdentifier;

    @JsonProperty("action")
    private  PresentationAction action;

    @JsonProperty("type")
    private @Pattern(regexp="^\\S+$") @Size(min=1, max=36)  String type;

    @JsonProperty("dataItems")
    private List<PresentationItemIdentifier> dataItems = null;


    public PresentationDataGroupItemPutRequestBody dataGroupIdentifier(PresentationDataGroupIdentifier dataGroupIdentifier) {
        this.dataGroupIdentifier = dataGroupIdentifier;
        return this;
    }

    /**
     * Get dataGroupIdentifier
     * @return dataGroupIdentifier
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull @Valid 
    public  PresentationDataGroupIdentifier getDataGroupIdentifier() {
        return dataGroupIdentifier;
    }

    public void setDataGroupIdentifier( PresentationDataGroupIdentifier dataGroupIdentifier) {
        this.dataGroupIdentifier = dataGroupIdentifier;
    }


    public PresentationDataGroupItemPutRequestBody action(PresentationAction action) {
        this.action = action;
        return this;
    }

    /**
     * Get action
     * @return action
     */
    @ApiModelProperty(required = true, value = "")
    @NotNull @Valid 
    public  PresentationAction getAction() {
        return action;
    }

    public void setAction( PresentationAction action) {
        this.action = action;
    }


    public PresentationDataGroupItemPutRequestBody type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Data group type
     * @return type
     */
    @ApiModelProperty(required = true, value = "Data group type")
    @NotNull @Pattern(regexp="^\\S+$") @Size(min=1, max=36) 
    public @Pattern(regexp="^\\S+$") @Size(min=1, max=36)  String getType() {
        return type;
    }

    public void setType(@Pattern(regexp="^\\S+$") @Size(min=1, max=36)  String type) {
        this.type = type;
    }


    public PresentationDataGroupItemPutRequestBody dataItems(List<PresentationItemIdentifier> dataItems) {
        this.dataItems = dataItems;
        return this;
    }

    public PresentationDataGroupItemPutRequestBody addDataItemsItem(PresentationItemIdentifier dataItemsItem) {
        if (this.dataItems == null) {
            this.dataItems = new ArrayList<>();
        }
        this.dataItems.add(dataItemsItem);
        return this;
    }

    /**
     * Get dataItems
     * @return dataItems
     */
    @ApiModelProperty(value = "")
    @Valid 
    public List<PresentationItemIdentifier> getDataItems() {
        return dataItems;
    }

    public void setDataItems(List<PresentationItemIdentifier> dataItems) {
        this.dataItems = dataItems;
    }




    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PresentationDataGroupItemPutRequestBody presentationDataGroupItemPutRequestBody = (PresentationDataGroupItemPutRequestBody) o;
        return Objects.equals(this.dataGroupIdentifier, presentationDataGroupItemPutRequestBody.dataGroupIdentifier) &&
                Objects.equals(this.action, presentationDataGroupItemPutRequestBody.action) &&
                Objects.equals(this.type, presentationDataGroupItemPutRequestBody.type) &&
                Objects.equals(this.dataItems, presentationDataGroupItemPutRequestBody.dataItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            dataGroupIdentifier,
            action,
            type,
            dataItems
        );
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PresentationDataGroupItemPutRequestBody {\n");
        
        sb.append("        dataGroupIdentifier: ").append(toIndentedString(dataGroupIdentifier)).append("\n");
        sb.append("        action: ").append(toIndentedString(action)).append("\n");
        sb.append("        type: ").append(toIndentedString(type)).append("\n");
        sb.append("        dataItems: ").append(toIndentedString(dataItems)).append("\n");
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

