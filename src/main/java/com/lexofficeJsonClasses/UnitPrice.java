
package com.lexofficeJsonClasses;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "currency",
    "grossAmount",
    "taxRatePercentage"
})
public class UnitPrice {

    @JsonProperty("currency")
    private String currency;
    @JsonProperty("grossAmount")
    private Float grossAmount;
    @JsonProperty("taxRatePercentage")
    private Integer taxRatePercentage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("grossAmount")
    public Float getGrossAmount() {
        return grossAmount;
    }

    @JsonProperty("grossAmount")
    public void setGrossAmount(Float grossAmount) {
        this.grossAmount = grossAmount;
    }

    @JsonProperty("taxRatePercentage")
    public Integer getTaxRatePercentage() {
        return taxRatePercentage;
    }

    @JsonProperty("taxRatePercentage")
    public void setTaxRatePercentage(Integer taxRatePercentage) {
        this.taxRatePercentage = taxRatePercentage;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public UnitPrice(String currency, Float grossAmount, Integer taxRatePercentage) {
        this.currency = currency;
        this.grossAmount = grossAmount;
        this.taxRatePercentage = taxRatePercentage;
    }
}
