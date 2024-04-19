package com.me.skeleton.web.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class GitHubRepoResponse {
    private String name;
    @JsonProperty("full_name")
    private String fullName;
    private GitHubRepoOwnerResponse owner;
}
