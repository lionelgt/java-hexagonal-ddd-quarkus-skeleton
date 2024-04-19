package com.me.skeleton.domain.driven_port;

import com.me.skeleton.domain.model.GitRepo;

import io.smallrye.mutiny.Uni;

public interface GitRepoPort {
    Uni<GitRepo> info();
}
