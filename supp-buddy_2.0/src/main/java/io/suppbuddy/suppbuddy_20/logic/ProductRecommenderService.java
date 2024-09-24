package io.suppbuddy.suppbuddy_20.logic;

import io.suppbuddy.suppbuddy_20.model.Product;
import io.suppbuddy.suppbuddy_20.model.UserPersonaNutriValues;
import io.suppbuddy.suppbuddy_20.repository.ProductRepository;
import io.suppbuddy.suppbuddy_20.repository.UserPersonaNutriValuesRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ProductRecommenderService {

    private final UserPersonaNutriValuesRepository userPersonaNutriValuesRepository;
    private final ProductRepository productRepository;

    public ProductRecommenderService(UserPersonaNutriValuesRepository userPersonaNutriValuesRepository, ProductRepository productRepository) {
        this.userPersonaNutriValuesRepository = userPersonaNutriValuesRepository;
        this.productRepository = productRepository;
    }

    public List<Product> recommendProducts(String userUuid) {
        UserPersonaNutriValues nutriValues = userPersonaNutriValuesRepository.findByUuid(userUuid);
        if (nutriValues == null) {
            throw new RuntimeException("User nutrition values not found.");
        }

        List<Product> products = productRepository.findAll();
        if (products.isEmpty()) {
            System.out.println("No products loaded.");
            return new ArrayList<>();
        }

        List<Product> recommendedProducts = new ArrayList<>();
        Map<Product, Integer> productScores = new HashMap<>();

        int userIH = nutriValues.getImmuneHealth();
        int userNS = nutriValues.getNutritionalStatus();
        int userGH = nutriValues.getGutHealth();
        int userMW = nutriValues.getMentalWellness();

        for (Product product : products) {
            int score = (userIH * product.getImmuneHealthScore()) +
                    (userNS * product.getNutritionScore()) +
                    (userGH * product.getGutHealthScore()) +
                    (userMW * product.getMentalWellnessScore());
            productScores.put(product, score);
        }

        productScores.entrySet()
                .stream()
                .sorted(Map.Entry.<Product, Integer>comparingByValue().reversed())
                .limit(3)
                .forEach(entry -> recommendedProducts.add(entry.getKey()));

        return recommendedProducts;
    }
}

