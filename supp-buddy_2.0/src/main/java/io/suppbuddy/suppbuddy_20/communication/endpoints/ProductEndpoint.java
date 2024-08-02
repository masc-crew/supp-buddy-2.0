package io.suppbuddy.suppbuddy_20.communication.endpoints;

import io.suppbuddy.suppbuddy_20.logic.ProductRecommenderService;
import io.suppbuddy.suppbuddy_20.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductEndpoint {

    private final ProductRecommenderService productRecommenderService;

    public ProductEndpoint(ProductRecommenderService productRecommenderService) {
        this.productRecommenderService = productRecommenderService;
    }

    @GetMapping("/{userUuid}")
    public List<Product> recommendProducts(@PathVariable Long userUuid) {
        return productRecommenderService.recommendProducts(userUuid);
    }
}
