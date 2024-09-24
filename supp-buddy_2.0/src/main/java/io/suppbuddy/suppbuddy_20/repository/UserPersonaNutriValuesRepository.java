package io.suppbuddy.suppbuddy_20.repository;

import io.suppbuddy.suppbuddy_20.model.UserPersonaNutriValues;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPersonaNutriValuesRepository extends JpaRepository<UserPersonaNutriValues, Long> {
    UserPersonaNutriValues findByUuid(String uuid);
}
