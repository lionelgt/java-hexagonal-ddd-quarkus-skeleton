package com.me.skeleton.web.adapter;

import com.me.skeleton.domain.driven_port.GitRepoPort;
import com.me.skeleton.domain.model.GitRepo;
import com.me.skeleton.web.client.GitHubClient;
import com.me.skeleton.web.mapper.GitHubRepoMapper;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import lombok.RequiredArgsConstructor;

@ApplicationScoped
@RequiredArgsConstructor
public class GitRepoAdapter implements GitRepoPort {

    private final GitHubRepoMapper gitHubRepoMapper;
    @RestClient
    private GitHubClient gitHubClient;

    @Override
    public Uni<GitRepo> info() {
        return gitHubClient.info()
                           .map(gitHubRepoMapper::map);
    }
}
