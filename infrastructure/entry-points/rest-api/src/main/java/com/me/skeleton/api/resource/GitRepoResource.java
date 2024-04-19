package com.me.skeleton.api.resource;

import com.me.skeleton.api.dto.GitRepoResponse;
import com.me.skeleton.api.mapper.GitRepoMapper;
import com.me.skeleton.domain.use_case.GitRepoUseCase;

import io.smallrye.mutiny.Uni;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import lombok.RequiredArgsConstructor;

@Path("api/git-repository")
@RequiredArgsConstructor
public class GitRepoResource {
    private final GitRepoUseCase gitRepoUseCase;
    private final GitRepoMapper gitRepoMapper;

    @GET
    public Uni<GitRepoResponse> info() {
        return gitRepoUseCase.info()
                             .map(gitRepoMapper::map);
    }
}
