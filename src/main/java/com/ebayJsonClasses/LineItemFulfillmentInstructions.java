package com.ebayJsonClasses;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "minEstimatedDeliveryDate",
        "maxEstimatedDeliveryDate",
        "shipByDate",
        "guaranteedDelivery"
})
public class LineItemFulfillmentInstructions {

    @JsonProperty("minEstimatedDeliveryDate")
    private String minEstimatedDeliveryDate;
    @JsonProperty("maxEstimatedDeliveryDate")
    private String maxEstimatedDeliveryDate;
    @JsonProperty("shipByDate")
    private String shipByDate;
    @JsonProperty("guaranteedDelivery")
    private Boolean guaranteedDelivery;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

    @JsonProperty("shipByDate")
    public String getShipByDate() {
        return shipByDate;
    }

    @JsonProperty("shipByDate")
    public void setShipByDate(String shipByDate) {
        this.shipByDate = shipByDate;
    }

    @JsonProperty("guaranteedDelivery")
    public Boolean getGuaranteedDelivery() {
        return guaranteedDelivery;
    }

    @JsonProperty("guaranteedDelivery")
    public void setGuaranteedDelivery(Boolean guaranteedDelivery) {
        this.guaranteedDelivery = guaranteedDelivery;
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
