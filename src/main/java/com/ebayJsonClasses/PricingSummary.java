package com.ebayJsonClasses;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

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
        "priceSubtotal",
        "priceDiscount",
        "deliveryCost",
        "deliveryDiscount",
        "total"
})
public class PricingSummary {

    @JsonProperty("priceSubtotal")
    private PriceSubtotal priceSubtotal;
    @JsonProperty("priceDiscount")
    private PriceDiscount priceDiscount;
    @JsonProperty("deliveryCost")
    private DeliveryCost deliveryCost;
    @JsonProperty("deliveryDiscount")
    private DeliveryDiscount deliveryDiscount;
    @JsonProperty("total")
    private Total total;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("priceSubtotal")
    public PriceSubtotal getPriceSubtotal() {
        return priceSubtotal;
    }

    @JsonProperty("priceSubtotal")
    public void setPriceSubtotal(PriceSubtotal priceSubtotal) {
        this.priceSubtotal = priceSubtotal;
    }

    @JsonProperty("priceDiscount")
    public PriceDiscount getPriceDiscount() {
        return priceDiscount;
    }

    @JsonProperty("priceDiscount")
    public void setPriceDiscount(PriceDiscount priceDiscount) {
        this.priceDiscount = priceDiscount;
    }

    @JsonProperty("deliveryCost")
    public DeliveryCost getDeliveryCost() {
        return deliveryCost;
    }

    @JsonProperty("deliveryCost")
    public void setDeliveryCost(DeliveryCost deliveryCost) {
        this.deliveryCost = deliveryCost;
    }

    @JsonProperty("deliveryDiscount")
    public DeliveryDiscount getDeliveryDiscount() {
        return deliveryDiscount;
    }

    @JsonProperty("deliveryDiscount")
    public void setDeliveryDiscount(DeliveryDiscount deliveryDiscount) {
        this.deliveryDiscount = deliveryDiscount;
    }

    @JsonProperty("total")
    public Total getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Total total) {
        this.total = total;
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