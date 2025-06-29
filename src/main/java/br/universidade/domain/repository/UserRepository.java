package br.universidade.domain.repository;

import br.universidade.domain.model.user.User;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface UserRepository {
    void save(User user);
    Optional<User> findById(UUID id);
    List<User> findAll();
}
