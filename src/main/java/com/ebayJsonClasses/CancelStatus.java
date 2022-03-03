package com.ebayJsonClasses;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "cancelState",
        "cancelRequests"
})
public class CancelStatus {

    @JsonProperty("cancelState")
    private String cancelState;
    @JsonProperty("cancelRequests")
    private List<Object> cancelRequests = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("cancelState")
    public String getCancelState() {
        return cancelState;
    }

    @JsonProperty("cancelState")
    public void setCancelState(String cancelState) {
        this.cancelState = cancelState;
    }

    @JsonProperty("cancelRequests")
    public List<Object> getCancelRequests() {
        return cancelRequests;
    }

    @JsonProperty("cancelRequests")
    public void setCancelRequests(List<Object> cancelRequests) {
        this.cancelRequests = cancelRequests;
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
