package com.me.skeleton.web.client;


import com.me.skeleton.web.dto.GitHubRepoResponse;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@RegisterRestClient(configKey = "git-hub")
public interface GitHubClient {

    @GET
    @Path("/repos/lionelgt/java-hexagonal-ddd-quarkus-skeleton")
    Uni<GitHubRepoResponse> info();
}
