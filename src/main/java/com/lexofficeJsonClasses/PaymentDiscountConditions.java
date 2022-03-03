
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
    "discountPercentage",
    "discountRange"
})
public class PaymentDiscountConditions {

    @JsonProperty("discountPercentage")
    private Integer discountPercentage;
    @JsonProperty("discountRange")
    private Integer discountRange;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("discountPercentage")
    public Integer getDiscountPercentage() {
        return discountPercentage;
    }

    @JsonProperty("discountPercentage")
    public void setDiscountPercentage(Integer discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @JsonProperty("discountRange")
    public Integer getDiscountRange() {
        return discountRange;
    }

    @JsonProperty("discountRange")
    public void setDiscountRange(Integer discountRange) {
        this.discountRange = discountRange;
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
