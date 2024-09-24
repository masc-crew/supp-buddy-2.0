package io.suppbuddy.suppbuddy_20.repository;

import io.suppbuddy.suppbuddy_20.model.Role;
import org.springframework.data.repository.CrudRepository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}

