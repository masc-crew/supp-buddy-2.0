package io.suppbuddy.suppbuddy_20.repository;

import io.suppbuddy.suppbuddy_20.model.questionnaire.UserAnswer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserAnswerRepository extends JpaRepository<UserAnswer, Long> {
    List<UserAnswer> findByUserId(Long userId);
}
