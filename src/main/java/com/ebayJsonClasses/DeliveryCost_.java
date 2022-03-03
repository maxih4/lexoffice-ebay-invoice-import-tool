package com.ebayJsonClasses;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "shippingCost"
})
public class DeliveryCost_ {

    @JsonProperty("shippingCost")
    private ShippingCost shippingCost;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("shippingCost")
    public ShippingCost getShippingCost() {
        return shippingCost;
    }

    @JsonProperty("shippingCost")
    public void setShippingCost(ShippingCost shippingCost) {
        this.shippingCost = shippingCost;
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
