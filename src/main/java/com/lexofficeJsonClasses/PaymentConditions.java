
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
    "paymentTermLabel",
    "paymentTermDuration",
    "paymentDiscountConditions"
})
public class PaymentConditions {

    @JsonProperty("paymentTermLabel")
    private String paymentTermLabel = "Sobald der Gesamtbetrag bei uns eingegangen ist, wird die Ware von uns verschickt.";
    @JsonProperty("paymentTermDuration")
    private Integer paymentTermDuration = 0;
    @JsonProperty("paymentDiscountConditions")
    private PaymentDiscountConditions paymentDiscountConditions;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("paymentTermLabel")
    public String getPaymentTermLabel() {
        return paymentTermLabel;
    }

    @JsonProperty("paymentTermLabel")
    public void setPaymentTermLabel(String paymentTermLabel) {
        this.paymentTermLabel = paymentTermLabel;
    }

    @JsonProperty("paymentTermDuration")
    public Integer getPaymentTermDuration() {
        return paymentTermDuration;
    }

    @JsonProperty("paymentTermDuration")
    public void setPaymentTermDuration(Integer paymentTermDuration) {
        this.paymentTermDuration = paymentTermDuration;
    }

    @JsonProperty("paymentDiscountConditions")
    public PaymentDiscountConditions getPaymentDiscountConditions() {
        return paymentDiscountConditions;
    }

    @JsonProperty("paymentDiscountConditions")
    public void setPaymentDiscountConditions(PaymentDiscountConditions paymentDiscountConditions) {
        this.paymentDiscountConditions = paymentDiscountConditions;
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
