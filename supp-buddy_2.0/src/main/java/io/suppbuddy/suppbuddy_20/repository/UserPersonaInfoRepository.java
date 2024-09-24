package io.suppbuddy.suppbuddy_20.repository;

import io.suppbuddy.suppbuddy_20.model.UserPersonaNutriValues;
import io.suppbuddy.suppbuddy_20.model.user_persona.UserPersonaInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPersonaInfoRepository extends JpaRepository<UserPersonaInfo, Long > {
    UserPersonaNutriValues findByUserUuid(String uuid);
}
