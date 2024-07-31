package io.suppbuddy.suppbuddy_20.model;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private double price;
    private String quantity;
    private int dailyIntake;
    private String description;
    private int immuneHealthScore;
    private int nutritionScore;
    private int gutHealthScore;
    private int mentalWellnessScore;

    public Product() {
    }

    public Product(Long id, String name, int immuneHealthScore, int nutritionScore, int gutHealthScore, int mentalWellnessScore) {
        this.id = id;
        this.name = name;
        this.immuneHealthScore = immuneHealthScore;
        this.nutritionScore = nutritionScore;
        this.gutHealthScore = gutHealthScore;
        this.mentalWellnessScore = mentalWellnessScore;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public int getDailyIntake() {
        return dailyIntake;
    }

    public void setDailyIntake(int dailyIntake) {
        this.dailyIntake = dailyIntake;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImmuneHealthScore() {
        return immuneHealthScore;
    }

    public void setImmuneHealthScore(int immuneHealthScore) {
        this.immuneHealthScore = immuneHealthScore;
    }

    public int getNutritionScore() {
        return nutritionScore;
    }

    public void setNutritionScore(int nutritionScore) {
        this.nutritionScore = nutritionScore;
    }

    public int getGutHealthScore() {
        return gutHealthScore;
    }

    public void setGutHealthScore(int gutHealthScore) {
        this.gutHealthScore = gutHealthScore;
    }

    public int getMentalWellnessScore() {
        return mentalWellnessScore;
    }

    public void setMentalWellnessScore(int mentalWellnessScore) {
        this.mentalWellnessScore = mentalWellnessScore;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(price, product.price) == 0 && dailyIntake == product.dailyIntake && immuneHealthScore == product.immuneHealthScore && nutritionScore == product.nutritionScore && gutHealthScore == product.gutHealthScore && mentalWellnessScore == product.mentalWellnessScore && Objects.equals(id, product.id) && Objects.equals(name, product.name) && Objects.equals(quantity, product.quantity) && Objects.equals(description, product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price, quantity, dailyIntake, description, immuneHealthScore, nutritionScore, gutHealthScore, mentalWellnessScore);
    }
}
