
package com.lexofficeJsonClasses;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "archived",
    "voucherDate",
    "address",
    "lineItems",
    "totalPrice",
    "taxConditions",
    "paymentConditions",
    "shippingConditions",
    "title",
    "introduction",
    "remark"
})
public class Invoice {
    String pattern ="yyyy-MM-dd'T'HH:mm:ss.SSSXXX";
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

    @JsonProperty("archived")
    private Boolean archived=false;
    @JsonProperty("voucherDate")
    private String voucherDate = simpleDateFormat.format(new Date());
    @JsonProperty("address")
    private Address address;
    @JsonProperty("lineItems")
    private List<LineItem> lineItems = null;
    @JsonProperty("totalPrice")
    private TotalPrice totalPrice;
    @JsonProperty("taxConditions")
    private TaxConditions taxConditions;
    @JsonProperty("paymentConditions")
    private PaymentConditions paymentConditions;
    @JsonProperty("shippingConditions")
    private ShippingConditions shippingConditions;
    @JsonProperty("title")
    private String title = "Rechnung";
    @JsonProperty("introduction")
    private String introduction = "Unsere Lieferungen/Leistungen stellen wir Ihnen wie folgt in Rechnung.";
    @JsonProperty("remark")
    private String remark = "Vielen Dank für die gute Zusammenarbeit.";
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("archived")
    public Boolean getArchived() {
        return archived;
    }

    @JsonProperty("archived")
    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    @JsonProperty("voucherDate")
    public String getVoucherDate() {
        return voucherDate;
    }

    @JsonProperty("voucherDate")
    public void setVoucherDate(String voucherDate) {
        this.voucherDate = voucherDate;
    }

    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    @JsonProperty("lineItems")
    public List<LineItem> getLineItems() {
        return lineItems;
    }

    @JsonProperty("lineItems")
    public void setLineItems(List<LineItem> lineItems) {
        this.lineItems = lineItems;
    }

    @JsonProperty("totalPrice")
    public TotalPrice getTotalPrice() {
        return totalPrice;
    }

    @JsonProperty("totalPrice")
    public void setTotalPrice(TotalPrice totalPrice) {
        this.totalPrice = totalPrice;
    }

    @JsonProperty("taxConditions")
    public TaxConditions getTaxConditions() {
        return taxConditions;
    }

    @JsonProperty("taxConditions")
    public void setTaxConditions(TaxConditions taxConditions) {
        this.taxConditions = taxConditions;
    }

    @JsonProperty("paymentConditions")
    public PaymentConditions getPaymentConditions() {
        return paymentConditions;
    }

    @JsonProperty("paymentConditions")
    public void setPaymentConditions(PaymentConditions paymentConditions) {
        this.paymentConditions = paymentConditions;
    }

    @JsonProperty("shippingConditions")
    public ShippingConditions getShippingConditions() {
        return shippingConditions;
    }

    @JsonProperty("shippingConditions")
    public void setShippingConditions(ShippingConditions shippingConditions) {
        this.shippingConditions = shippingConditions;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("introduction")
    public String getIntroduction() {
        return introduction;
    }

    @JsonProperty("introduction")
    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    @JsonProperty("remark")
    public String getRemark() {
        return remark;
    }

    @JsonProperty("remark")
    public void setRemark(String remark) {
        this.remark = remark;
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
