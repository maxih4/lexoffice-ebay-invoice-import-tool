package com.ebayJsonClasses;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "username",
        "taxAddress"
})
public class Buyer {

    @JsonProperty("username")
    private String username;
    @JsonProperty("taxAddress")
    private TaxAddress taxAddress;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    @JsonProperty("taxAddress")
    public TaxAddress getTaxAddress() {
        return taxAddress;
    }

    @JsonProperty("taxAddress")
    public void setTaxAddress(TaxAddress taxAddress) {
        this.taxAddress = taxAddress;
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
