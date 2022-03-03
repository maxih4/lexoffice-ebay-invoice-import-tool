package com.ebayJsonClasses;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "lineItemId",
        "legacyItemId",
        "legacyVariationId",
        "title",
        "lineItemCost",
        "quantity",
        "soldFormat",
        "listingMarketplaceId",
        "purchaseMarketplaceId",
        "lineItemFulfillmentStatus",
        "total",
        "deliveryCost",
        "appliedPromotions",
        "taxes",
        "properties",
        "lineItemFulfillmentInstructions",
        "discountedLineItemCost"
})
public class LineItem {

    @JsonProperty("lineItemId")
    private String lineItemId;
    @JsonProperty("legacyItemId")
    private String legacyItemId;
    @JsonProperty("legacyVariationId")
    private String legacyVariationId;
    @JsonProperty("title")
    private String title;
    @JsonProperty("lineItemCost")
    private LineItemCost lineItemCost;
    @JsonProperty("quantity")
    private Integer quantity;
    @JsonProperty("soldFormat")
    private String soldFormat;
    @JsonProperty("listingMarketplaceId")
    private String listingMarketplaceId;
    @JsonProperty("purchaseMarketplaceId")
    private String purchaseMarketplaceId;
    @JsonProperty("lineItemFulfillmentStatus")
    private String lineItemFulfillmentStatus;
    @JsonProperty("total")
    private Total_ total;
    @JsonProperty("deliveryCost")
    private DeliveryCost_ deliveryCost;
    @JsonProperty("appliedPromotions")
    private List<Object> appliedPromotions = null;
    @JsonProperty("taxes")
    private List<Object> taxes = null;
    @JsonProperty("properties")
    private Properties properties;
    @JsonProperty("lineItemFulfillmentInstructions")
    private LineItemFulfillmentInstructions lineItemFulfillmentInstructions;
    @JsonProperty("discountedLineItemCost")
    private DiscountedLineItemCost discountedLineItemCost;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("lineItemId")
    public String getLineItemId() {
        return lineItemId;
    }

    @JsonProperty("lineItemId")
    public void setLineItemId(String lineItemId) {
        this.lineItemId = lineItemId;
    }

    @JsonProperty("legacyItemId")
    public String getLegacyItemId() {
        return legacyItemId;
    }

    @JsonProperty("legacyItemId")
    public void setLegacyItemId(String legacyItemId) {
        this.legacyItemId = legacyItemId;
    }

    @JsonProperty("legacyVariationId")
    public String getLegacyVariationId() {
        return legacyVariationId;
    }

    @JsonProperty("legacyVariationId")
    public void setLegacyVariationId(String legacyVariationId) {
        this.legacyVariationId = legacyVariationId;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("lineItemCost")
    public LineItemCost getLineItemCost() {
        return lineItemCost;
    }

    @JsonProperty("lineItemCost")
    public void setLineItemCost(LineItemCost lineItemCost) {
        this.lineItemCost = lineItemCost;
    }

    @JsonProperty("quantity")
    public Integer getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("soldFormat")
    public String getSoldFormat() {
        return soldFormat;
    }

    @JsonProperty("soldFormat")
    public void setSoldFormat(String soldFormat) {
        this.soldFormat = soldFormat;
    }

    @JsonProperty("listingMarketplaceId")
    public String getListingMarketplaceId() {
        return listingMarketplaceId;
    }

    @JsonProperty("listingMarketplaceId")
    public void setListingMarketplaceId(String listingMarketplaceId) {
        this.listingMarketplaceId = listingMarketplaceId;
    }


    @JsonProperty("discountedLineItemCost")
    public DiscountedLineItemCost getDiscountedLineItemCost() {
        return discountedLineItemCost;
    }

    @JsonProperty("discountedLineItemCost")
    public void setDiscountedLineItemCost(DiscountedLineItemCost discountedLineItemCost) {
        this.discountedLineItemCost = discountedLineItemCost;
    }


    @JsonProperty("purchaseMarketplaceId")
    public String getPurchaseMarketplaceId() {
        return purchaseMarketplaceId;
    }

    @JsonProperty("purchaseMarketplaceId")
    public void setPurchaseMarketplaceId(String purchaseMarketplaceId) {
        this.purchaseMarketplaceId = purchaseMarketplaceId;
    }

    @JsonProperty("lineItemFulfillmentStatus")
    public String getLineItemFulfillmentStatus() {
        return lineItemFulfillmentStatus;
    }

    @JsonProperty("lineItemFulfillmentStatus")
    public void setLineItemFulfillmentStatus(String lineItemFulfillmentStatus) {
        this.lineItemFulfillmentStatus = lineItemFulfillmentStatus;
    }

    @JsonProperty("total")
    public Total_ getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Total_ total) {
        this.total = total;
    }

    @JsonProperty("deliveryCost")
    public DeliveryCost_ getDeliveryCost() {
        return deliveryCost;
    }

    @JsonProperty("deliveryCost")
    public void setDeliveryCost(DeliveryCost_ deliveryCost) {
        this.deliveryCost = deliveryCost;
    }

    @JsonProperty("appliedPromotions")
    public List<Object> getAppliedPromotions() {
        return appliedPromotions;
    }

    @JsonProperty("appliedPromotions")
    public void setAppliedPromotions(List<Object> appliedPromotions) {
        this.appliedPromotions = appliedPromotions;
    }

    @JsonProperty("taxes")
    public List<Object> getTaxes() {
        return taxes;
    }

    @JsonProperty("taxes")
    public void setTaxes(List<Object> taxes) {
        this.taxes = taxes;
    }

    @JsonProperty("properties")
    public Properties getProperties() {
        return properties;
    }

    @JsonProperty("properties")
    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @JsonProperty("lineItemFulfillmentInstructions")
    public LineItemFulfillmentInstructions getLineItemFulfillmentInstructions() {
        return lineItemFulfillmentInstructions;
    }

    @JsonProperty("lineItemFulfillmentInstructions")
    public void setLineItemFulfillmentInstructions(LineItemFulfillmentInstructions lineItemFulfillmentInstructions) {
        this.lineItemFulfillmentInstructions = lineItemFulfillmentInstructions;
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
