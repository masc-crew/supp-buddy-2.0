package io.suppbuddy.suppbuddy_20.repository;

import io.suppbuddy.suppbuddy_20.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
