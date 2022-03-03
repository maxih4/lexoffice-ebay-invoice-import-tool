package com.ebayJsonClasses;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "value",
        "currency",
        "convertedFromValue",
        "convertedFromCurrency"
})
public class TotalFeeBasisAmount {

    @JsonProperty("value")
    private String value;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("convertedFromValue")
    private String convertedFromValue;
    @JsonProperty("convertedFromCurrency")
    private String convertedFromCurrency;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("convertedFromValue")
    public String getConvertedFromValue() {
        return convertedFromValue;
    }

    @JsonProperty("convertedFromValue")
    public void setConvertedFromValue(String convertedFromValue) {
        this.convertedFromValue = convertedFromValue;
    }

    @JsonProperty("convertedFromCurrency")
    public String getConvertedFromCurrency() {
        return convertedFromCurrency;
    }

    @JsonProperty("convertedFromCurrency")
    public void setConvertedFromCurrency(String convertedFromCurrency) {
        this.convertedFromCurrency = convertedFromCurrency;
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
