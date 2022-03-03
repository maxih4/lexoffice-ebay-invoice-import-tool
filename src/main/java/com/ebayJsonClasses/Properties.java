package com.ebayJsonClasses;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "buyerProtection"
})
public class Properties {

    @JsonProperty("buyerProtection")
    private Boolean buyerProtection;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("buyerProtection")
    public Boolean getBuyerProtection() {
        return buyerProtection;
    }

    @JsonProperty("buyerProtection")
    public void setBuyerProtection(Boolean buyerProtection) {
        this.buyerProtection = buyerProtection;
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
