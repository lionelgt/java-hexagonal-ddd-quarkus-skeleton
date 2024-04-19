package com.me.skeleton.domain.use_case;

import com.me.skeleton.domain.model.GitRepo;

import io.smallrye.mutiny.Uni;

public interface GitRepoUseCase {
    Uni<GitRepo> info();
}
