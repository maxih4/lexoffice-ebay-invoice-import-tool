package com.ebayJsonClasses;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "shipTo",
        "shippingCarrierCode",
        "shippingServiceCode"
})
public class ShippingStep {

    @JsonProperty("shipTo")
    private ShipTo shipTo;
    @JsonProperty("shippingCarrierCode")
    private String shippingCarrierCode;
    @JsonProperty("shippingServiceCode")
    private String shippingServiceCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("shipTo")
    public ShipTo getShipTo() {
        return shipTo;
    }

    @JsonProperty("shipTo")
    public void setShipTo(ShipTo shipTo) {
        this.shipTo = shipTo;
    }

    @JsonProperty("shippingCarrierCode")
    public String getShippingCarrierCode() {
        return shippingCarrierCode;
    }

    @JsonProperty("shippingCarrierCode")
    public void setShippingCarrierCode(String shippingCarrierCode) {
        this.shippingCarrierCode = shippingCarrierCode;
    }

    @JsonProperty("shippingServiceCode")
    public String getShippingServiceCode() {
        return shippingServiceCode;
    }

    @JsonProperty("shippingServiceCode")
    public void setShippingServiceCode(String shippingServiceCode) {
        this.shippingServiceCode = shippingServiceCode;
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
