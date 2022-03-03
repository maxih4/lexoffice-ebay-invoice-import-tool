package com.ebayJsonClasses;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "fulfillmentInstructionsType",
        "minEstimatedDeliveryDate",
        "maxEstimatedDeliveryDate",
        "ebaySupportedFulfillment",
        "shippingStep"
})
public class FulfillmentStartInstruction {

    @JsonProperty("fulfillmentInstructionsType")
    private String fulfillmentInstructionsType;
    @JsonProperty("minEstimatedDeliveryDate")
    private String minEstimatedDeliveryDate;
    @JsonProperty("maxEstimatedDeliveryDate")
    private String maxEstimatedDeliveryDate;
    @JsonProperty("ebaySupportedFulfillment")
    private Boolean ebaySupportedFulfillment;
    @JsonProperty("shippingStep")
    private ShippingStep shippingStep;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("fulfillmentInstructionsType")
    public String getFulfillmentInstructionsType() {
        return fulfillmentInstructionsType;
    }

    @JsonProperty("fulfillmentInstructionsType")
    public void setFulfillmentInstructionsType(String fulfillmentInstructionsType) {
        this.fulfillmentInstructionsType = fulfillmentInstructionsType;
    }

    @JsonProperty("minEstimatedDeliveryDate")
    public String getMinEstimatedDeliveryDate() {
        return minEstimatedDeliveryDate;
    }

    @JsonProperty("minEstimatedDeliveryDate")
    public void setMinEstimatedDeliveryDate(String minEstimatedDeliveryDate) {
        this.minEstimatedDeliveryDate = minEstimatedDeliveryDate;
    }

    @JsonProperty("maxEstimatedDeliveryDate")
    public String getMaxEstimatedDeliveryDate() {
        return maxEstimatedDeliveryDate;
    }

    @JsonProperty("maxEstimatedDeliveryDate")
    public void setMaxEstimatedDeliveryDate(String maxEstimatedDeliveryDate) {
        this.maxEstimatedDeliveryDate = maxEstimatedDeliveryDate;
    }

    @JsonProperty("ebaySupportedFulfillment")
    public Boolean getEbaySupportedFulfillment() {
        return ebaySupportedFulfillment;
    }

    @JsonProperty("ebaySupportedFulfillment")
    public void setEbaySupportedFulfillment(Boolean ebaySupportedFulfillment) {
        this.ebaySupportedFulfillment = ebaySupportedFulfillment;
    }

    @JsonProperty("shippingStep")
    public ShippingStep getShippingStep() {
        return shippingStep;
    }

    @JsonProperty("shippingStep")
    public void setShippingStep(ShippingStep shippingStep) {
        this.shippingStep = shippingStep;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
