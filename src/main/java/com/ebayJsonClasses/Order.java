package com.ebayJsonClasses;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "orderId",
        "legacyOrderId",
        "creationDate",
        "lastModifiedDate",
        "orderFulfillmentStatus",
        "orderPaymentStatus",
        "sellerId",
        "buyer",
        "pricingSummary",
        "cancelStatus",
        "paymentSummary",
        "fulfillmentStartInstructions",
        "fulfillmentHrefs",
        "lineItems",
        "salesRecordReference",
        "totalFeeBasisAmount"
})
public class Order {

    @JsonProperty("orderId")
    private String orderId;
    @JsonProperty("legacyOrderId")
    private String legacyOrderId;
    @JsonProperty("creationDate")
    private String creationDate;
    @JsonProperty("lastModifiedDate")
    private String lastModifiedDate;
    @JsonProperty("orderFulfillmentStatus")
    private String orderFulfillmentStatus;
    @JsonProperty("orderPaymentStatus")
    private String orderPaymentStatus;
    @JsonProperty("sellerId")
    private String sellerId;
    @JsonProperty("buyer")
    private Buyer buyer;
    @JsonProperty("pricingSummary")
    private PricingSummary pricingSummary;
    @JsonProperty("cancelStatus")
    private CancelStatus cancelStatus;
    @JsonProperty("paymentSummary")
    private PaymentSummary paymentSummary;
    @JsonProperty("fulfillmentStartInstructions")
    private List<FulfillmentStartInstruction> fulfillmentStartInstructions = null;
    @JsonProperty("fulfillmentHrefs")
    private List<Object> fulfillmentHrefs = null;
    @JsonProperty("lineItems")
    private List<LineItem> lineItems = null;
    @JsonProperty("salesRecordReference")
    private String salesRecordReference;
    @JsonProperty("totalFeeBasisAmount")
    private TotalFeeBasisAmount totalFeeBasisAmount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("orderId")
    public String getOrderId() {
        return orderId;
    }

    @JsonProperty("orderId")
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @JsonProperty("legacyOrderId")
    public String getLegacyOrderId() {
        return legacyOrderId;
    }

    @JsonProperty("legacyOrderId")
    public void setLegacyOrderId(String legacyOrderId) {
        this.legacyOrderId = legacyOrderId;
    }

    @JsonProperty("creationDate")
    public String getCreationDate() {
        return creationDate;
    }

    @JsonProperty("creationDate")
    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    @JsonProperty("lastModifiedDate")
    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    @JsonProperty("lastModifiedDate")
    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    @JsonProperty("orderFulfillmentStatus")
    public String getOrderFulfillmentStatus() {
        return orderFulfillmentStatus;
    }

    @JsonProperty("orderFulfillmentStatus")
    public void setOrderFulfillmentStatus(String orderFulfillmentStatus) {
        this.orderFulfillmentStatus = orderFulfillmentStatus;
    }

    @JsonProperty("orderPaymentStatus")
    public String getOrderPaymentStatus() {
        return orderPaymentStatus;
    }

    @JsonProperty("orderPaymentStatus")
    public void setOrderPaymentStatus(String orderPaymentStatus) {
        this.orderPaymentStatus = orderPaymentStatus;
    }

    @JsonProperty("sellerId")
    public String getSellerId() {
        return sellerId;
    }

    @JsonProperty("sellerId")
    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    @JsonProperty("buyer")
    public Buyer getBuyer() {
        return buyer;
    }

    @JsonProperty("buyer")
    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    @JsonProperty("pricingSummary")
    public PricingSummary getPricingSummary() {
        return pricingSummary;
    }

    @JsonProperty("pricingSummary")
    public void setPricingSummary(PricingSummary pricingSummary) {
        this.pricingSummary = pricingSummary;
    }

    @JsonProperty("cancelStatus")
    public CancelStatus getCancelStatus() {
        return cancelStatus;
    }

    @JsonProperty("cancelStatus")
    public void setCancelStatus(CancelStatus cancelStatus) {
        this.cancelStatus = cancelStatus;
    }

    @JsonProperty("paymentSummary")
    public PaymentSummary getPaymentSummary() {
        return paymentSummary;
    }

    @JsonProperty("paymentSummary")
    public void setPaymentSummary(PaymentSummary paymentSummary) {
        this.paymentSummary = paymentSummary;
    }

    @JsonProperty("fulfillmentStartInstructions")
    public List<FulfillmentStartInstruction> getFulfillmentStartInstructions() {
        return fulfillmentStartInstructions;
    }

    @JsonProperty("fulfillmentStartInstructions")
    public void setFulfillmentStartInstructions(List<FulfillmentStartInstruction> fulfillmentStartInstructions) {
        this.fulfillmentStartInstructions = fulfillmentStartInstructions;
    }

    @JsonProperty("fulfillmentHrefs")
    public List<Object> getFulfillmentHrefs() {
        return fulfillmentHrefs;
    }

    @JsonProperty("fulfillmentHrefs")
    public void setFulfillmentHrefs(List<Object> fulfillmentHrefs) {
        this.fulfillmentHrefs = fulfillmentHrefs;
    }

    @JsonProperty("lineItems")
    public List<LineItem> getLineItems() {
        return lineItems;
    }

    @JsonProperty("lineItems")
    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    @JsonProperty("salesRecordReference")
    public String getSalesRecordReference() {
        return salesRecordReference;
    }

    @JsonProperty("salesRecordReference")
    public void setSalesRecordReference(String salesRecordReference) {
        this.salesRecordReference = salesRecordReference;
    }

    @JsonProperty("totalFeeBasisAmount")
    public TotalFeeBasisAmount getTotalFeeBasisAmount() {
        return totalFeeBasisAmount;
    }

    @JsonProperty("totalFeeBasisAmount")
    public void setTotalFeeBasisAmount(TotalFeeBasisAmount totalFeeBasisAmount) {
        this.totalFeeBasisAmount = totalFeeBasisAmount;
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
