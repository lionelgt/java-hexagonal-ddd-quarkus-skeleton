package com.me.skeleton.domain.use_case;

import com.me.skeleton.domain.driven_port.GitRepoPort;
import com.me.skeleton.domain.model.GitRepo;

import io.smallrye.mutiny.Uni;
import jakarta.enterprise.context.ApplicationScoped;
import lombok.RequiredArgsConstructor;

@ApplicationScoped
@RequiredArgsConstructor
public class GitRepoUseCaseImpl implements GitRepoUseCase {
    private final GitRepoPort gitRepoPort;

    public Uni<GitRepo> info() {
        return gitRepoPort.info();
    }
}


