package io.suppbuddy.suppbuddy_20.repository;

import io.suppbuddy.suppbuddy_20.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}

