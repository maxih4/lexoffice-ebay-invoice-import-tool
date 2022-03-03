
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
    "type",
    "name",
    "quantity",
    "unitName",
    "unitPrice",
    "discountPercentage",
    "description"
})
public class LineItem {

    @JsonProperty("type")
    private String type = "custom";
    @JsonProperty("name")
    private String name;
    @JsonProperty("quantity")
    private Integer quantity;
    @JsonProperty("unitName")
    private String unitName ="Stück";
    @JsonProperty("unitPrice")
    private UnitPrice unitPrice;
    @JsonProperty("discountPercentage")
    private Integer discountPercentage = 0;
    @JsonProperty("description")
    private String description;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("quantity")
    public Integer getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("unitName")
    public String getUnitName() {
        return unitName;
    }

    @JsonProperty("unitName")
    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    @JsonProperty("unitPrice")
    public UnitPrice getUnitPrice() {
        return unitPrice;
    }

    @JsonProperty("unitPrice")
    public void setUnitPrice(UnitPrice unitPrice) {
        this.unitPrice = unitPrice;
    }

    @JsonProperty("discountPercentage")
    public Integer getDiscountPercentage() {
        return discountPercentage;
    }

    @JsonProperty("discountPercentage")
    public void setDiscountPercentage(Integer discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
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
