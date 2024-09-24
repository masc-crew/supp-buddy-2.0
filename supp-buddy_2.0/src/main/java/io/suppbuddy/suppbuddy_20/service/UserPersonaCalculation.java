package io.suppbuddy.suppbuddy_20.service;

import io.suppbuddy.suppbuddy_20.logic.ProductRecommenderService;
import io.suppbuddy.suppbuddy_20.model.UserPersonaNutriValues;
import io.suppbuddy.suppbuddy_20.model.user_persona.UserPersonaInfo;
import io.suppbuddy.suppbuddy_20.repository.UserPersonaInfoRepository;
import io.suppbuddy.suppbuddy_20.repository.UserPersonaNutriValuesRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserPersonaCalculation {

    // i need to simply put the values from the answers
    // TODO change into String
    Long userUuid;

    Map<String, Integer> scores = new HashMap<>();
    private final UserAnswerService userAnswerService;
    private final UserPersonaInfoRepository userPersonaInfoRepository;
    private UserPersonaInfo userPersonaInfo;


    public UserPersonaCalculation(UserAnswerService userAnswerService, UserPersonaInfoRepository userPersonaInfoRepository, UserPersonaInfo userPersonaInfo) {
        this.userAnswerService = userAnswerService;
        this.userPersonaInfoRepository = userPersonaInfoRepository;
        this.userPersonaInfo = userPersonaInfo;
    }

    public void addUserBalanceToUserPersona(Long userUuid){
        // Fetch the UserPersona by its ID
        UserPersonaInfo userPersonaInfo = userPersonaInfoRepository.findById(userUuid)
                .orElseThrow(() -> new RuntimeException("UserPersonaInfo not found"));

        // Update the isBalanced field
        userPersonaInfo.setBalanced(calculateBalance());

        // Save the updated entity back to the database
        userPersonaInfoRepository.save(userPersonaInfo);
    }

    public boolean calculateBalance(){

        double variance = getVariance();
        double standardDeviation = calculateStandardDeviation(variance);

        // for now, we will calculate balance based on variance, although std is easier to read as it is in same units as data set
        // but variance is easier to define regardless of the values in the data set
        // larger variance == greater variability in data set
        if (variance <= 1.5){
            return true;
        } else return false;
    }

    private double getVariance() {
        scores = userAnswerService.calculateUserScore(userUuid);
        int[] userValues = scores
                .values()
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();

        double meanAverage = calculateMeanAverage(userValues);
        return calculateVariance(userValues, meanAverage);
    }

    private static double calculateMeanAverage(int[] userValues){
        double average = 0.0;
        for (int i = 0; i < userValues.length; i++) {
            average += userValues[i];
        }
        average /= userValues.length;
        return average;
    }
    private static double calculateVariance(int[] userValues, double mean){
        double variance = 0;
        for (int i = 0; i < userValues.length; i++) {
            variance += Math.pow(userValues[i] - mean, 2);
        }
        variance /= userValues.length;
        return variance;
    }
    private static double calculateStandardDeviation(double variance){
        return Math.sqrt(variance);
    }
}
