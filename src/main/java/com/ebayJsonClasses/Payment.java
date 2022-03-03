package com.ebayJsonClasses;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "paymentMethod",
        "paymentReferenceId",
        "paymentDate",
        "amount",
        "paymentStatus",
        "paymentHolds"
})
public class Payment {

    @JsonProperty("paymentMethod")
    private String paymentMethod;
    @JsonProperty("paymentReferenceId")
    private String paymentReferenceId;
    @JsonProperty("paymentDate")
    private String paymentDate;
    @JsonProperty("amount")
    private Amount amount;
    @JsonProperty("paymentStatus")
    private String paymentStatus;
    @JsonProperty("paymentHolds")
    private List<PaymentHold> paymentHolds = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("paymentMethod")
    public String getPaymentMethod() {
        return paymentMethod;
    }

    @JsonProperty("paymentMethod")
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @JsonProperty("paymentReferenceId")
    public String getPaymentReferenceId() {
        return paymentReferenceId;
    }

    @JsonProperty("paymentReferenceId")
    public void setPaymentReferenceId(String paymentReferenceId) {
        this.paymentReferenceId = paymentReferenceId;
    }

    @JsonProperty("paymentDate")
    public String getPaymentDate() {
        return paymentDate;
    }

    @JsonProperty("paymentDate")
    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    @JsonProperty("amount")
    public Amount getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    @JsonProperty("paymentStatus")
    public String getPaymentStatus() {
        return paymentStatus;
    }

    @JsonProperty("paymentStatus")
    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @JsonProperty("paymentHolds")
    public List<PaymentHold> getPaymentHolds() {
        return paymentHolds;
    }

    @JsonProperty("paymentHolds")
    public void setPaymentHolds(List<PaymentHold> paymentHolds) {
        this.paymentHolds = paymentHolds;
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
