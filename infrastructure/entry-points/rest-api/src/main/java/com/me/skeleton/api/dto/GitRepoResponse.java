package com.me.skeleton.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class GitRepoResponse {
    private String name;
    @JsonProperty("full_name")
    private String fullName;
    private GitRepoOwnerResponse owner;
}
