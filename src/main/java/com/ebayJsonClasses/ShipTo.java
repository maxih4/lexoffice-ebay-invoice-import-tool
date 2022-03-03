package com.ebayJsonClasses;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "fullName",
        "contactAddress",
        "primaryPhone",
        "email"
})
public class ShipTo {

    @JsonProperty("fullName")
    private String fullName;
    @JsonProperty("contactAddress")
    private ContactAddress contactAddress;
    @JsonProperty("primaryPhone")
    private PrimaryPhone primaryPhone;
    @JsonProperty("email")
    private String email;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("fullName")
    public String getFullName() {
        return fullName;
    }

    @JsonProperty("fullName")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @JsonProperty("contactAddress")
    public ContactAddress getContactAddress() {
        return contactAddress;
    }

    @JsonProperty("contactAddress")
    public void setContactAddress(ContactAddress contactAddress) {
        this.contactAddress = contactAddress;
    }

    @JsonProperty("primaryPhone")
    public PrimaryPhone getPrimaryPhone() {
        return primaryPhone;
    }

    @JsonProperty("primaryPhone")
    public void setPrimaryPhone(PrimaryPhone primaryPhone) {
        this.primaryPhone = primaryPhone;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
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
