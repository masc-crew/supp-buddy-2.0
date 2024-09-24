package io.suppbuddy.suppbuddy_20.service;

import io.suppbuddy.suppbuddy_20.model.questionnaire.AnswerOption;
import io.suppbuddy.suppbuddy_20.model.questionnaire.Question;
import io.suppbuddy.suppbuddy_20.model.questionnaire.UserAnswer;
import io.suppbuddy.suppbuddy_20.repository.UserAnswerRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserAnswerService {

    private final UserAnswerRepository userAnswerRepository;

    public UserAnswerService(UserAnswerRepository userAnswerRepository) {
        this.userAnswerRepository = userAnswerRepository;
    }

   // public UserAnswer saveUserAnswer(Long userId, Long questionId, Long answerId) {
        // How would the UserAnswer be received? Can it be received as UserAnswer, or
        // the way it is here right now??

        // This could be a possible implementation:

//        User user = userRepository.findById(userId)
//                .orElseThrow(() -> new EntityNotFoundException("User not found"));
//
//        Question question = questionRepository.findById(questionId)
//                .orElseThrow(() -> new EntityNotFoundException("Question not found"));
//
//        AnswerOption answerOption = answerOptionRepository.findById(answerOptionId)
//                .orElseThrow(() -> new EntityNotFoundException("Answer option not found"));
//
//        UserAnswer userAnswer = new UserAnswer();
//        userAnswer.setUser(user);
//        userAnswer.setQuestion(question);
//        userAnswer.setAnswerOption(answerOption);

       // return userAnswerRepository.save(userAnswer);
   // }

    public Map<String, Integer> calculateUserScore(Long userId) {
        List<UserAnswer> answers = userAnswerRepository.findByUserId(userId); //
        Map<String, Integer> scores = new HashMap<>();
        // Set up the HashMap with the scores put at 0.
        scores.put("ns", 0);
        scores.put("ih", 0);
        scores.put("gh", 0);
        scores.put("mw", 0);

        // Loop UserAnswers get the AnswerOption and map to the String key.
        for (UserAnswer answer : answers) {
            AnswerOption answerOption = answer.getAnswerOption();
            scores.put("ns", scores.get("ns") + answerOption.getNsScore());
            scores.put("ih", scores.get("ih") + answerOption.getIhScore());
            scores.put("gh", scores.get("gh") + answerOption.getGhScore());
            scores.put("mw", scores.get("mw") + answerOption.getMwScore());
        }

        return scores;
    }
}
