
package com.lexofficeJsonClasses;

import java.text.SimpleDateFormat;
import java.util.Date;
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
    "shippingDate",
    "shippingType"
})
public class ShippingConditions {
    String pattern ="yyyy-MM-dd'T'HH:mm:ss.SSSXXX";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
    @JsonProperty("shippingDate")
    private String shippingDate = simpleDateFormat.format(new Date());;
    @JsonProperty("shippingType")
    private String shippingType = "delivery";
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("shippingDate")
    public String getShippingDate() {
        return shippingDate;
    }

    @JsonProperty("shippingDate")
    public void setShippingDate(String shippingDate) {
        this.shippingDate = shippingDate;
    }

    @JsonProperty("shippingType")
    public String getShippingType() {
        return shippingType;
    }

    @JsonProperty("shippingType")
    public void setShippingType(String shippingType) {
        this.shippingType = shippingType;
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
