package com.ebayJsonClasses;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "holdReason",
        "holdAmount",
        "holdState",
        "releaseDate"
})
public class PaymentHold {

    @JsonProperty("holdReason")
    private String holdReason;
    @JsonProperty("holdAmount")
    private HoldAmount holdAmount;
    @JsonProperty("holdState")
    private String holdState;
    @JsonProperty("releaseDate")
    private String releaseDate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("holdReason")
    public String getHoldReason() {
        return holdReason;
    }

    @JsonProperty("holdReason")
    public void setHoldReason(String holdReason) {
        this.holdReason = holdReason;
    }

    @JsonProperty("holdAmount")
    public HoldAmount getHoldAmount() {
        return holdAmount;
    }

    @JsonProperty("holdAmount")
    public void setHoldAmount(HoldAmount holdAmount) {
        this.holdAmount = holdAmount;
    }

    @JsonProperty("holdState")
    public String getHoldState() {
        return holdState;
    }

    @JsonProperty("holdState")
    public void setHoldState(String holdState) {
        this.holdState = holdState;
    }

    @JsonProperty("releaseDate")
    public String getReleaseDate() {
        return releaseDate;
    }

    @JsonProperty("releaseDate")
    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
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
