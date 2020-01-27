package com.redhat.developer.responses;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class AvailableKeysResponse {
    @JsonProperty("availableKeys")
    public List<String> availableKeys;

    public AvailableKeysResponse(List<String> keys){
        this.availableKeys = keys;
    }
}
