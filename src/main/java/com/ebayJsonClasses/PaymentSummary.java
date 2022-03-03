package com.ebayJsonClasses;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "totalDueSeller",
        "refunds",
        "payments"
})
public class PaymentSummary {

    @JsonProperty("totalDueSeller")
    private TotalDueSeller totalDueSeller;
    @JsonProperty("refunds")
    private List<Object> refunds = null;
    @JsonProperty("payments")
    private List<Payment> payments = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("totalDueSeller")
    public TotalDueSeller getTotalDueSeller() {
        return totalDueSeller;
    }

    @JsonProperty("totalDueSeller")
    public void setTotalDueSeller(TotalDueSeller totalDueSeller) {
        this.totalDueSeller = totalDueSeller;
    }

    @JsonProperty("refunds")
    public List<Object> getRefunds() {
        return refunds;
    }

    @JsonProperty("refunds")
    public void setRefunds(List<Object> refunds) {
        this.refunds = refunds;
    }

    @JsonProperty("payments")
    public List<Payment> getPayments() {
        return payments;
    }

    @JsonProperty("payments")
    public void setPayments(List<Payment> payments) {
        this.payments = payments;
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
