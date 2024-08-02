package io.suppbuddy.suppbuddy_20.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserPersonaNutriValues {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long uuid;
    private int immuneHealth;
    private int nutritionalStatus;
    private int gutHealth;
    private int mentalWellness;

    public UserPersonaNutriValues() {
    }

    public UserPersonaNutriValues(Long uuid, int immuneHealth, int nutritionalStatus) {
        this.uuid = uuid;
        this.immuneHealth = immuneHealth;
        this.nutritionalStatus = nutritionalStatus;
    }

    public UserPersonaNutriValues(Long uuid, int immuneHealth, int nutritionalStatus, int gutHealth, int mentalWellness) {
        this.uuid = uuid;
        this.immuneHealth = immuneHealth;
        this.nutritionalStatus = nutritionalStatus;
        this.gutHealth = gutHealth;
        this.mentalWellness = mentalWellness;
    }

    public UserPersonaNutriValues(Long id, Long uuid, int immuneHealth, int nutritionalStatus, int gutHealth, int mentalWellness) {
        this.id = id;
        this.uuid = uuid;
        this.immuneHealth = immuneHealth;
        this.nutritionalStatus = nutritionalStatus;
        this.gutHealth = gutHealth;
        this.mentalWellness = mentalWellness;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUuid() {
        return uuid;
    }

    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }

    public int getImmuneHealth() {
        return immuneHealth;
    }

    public void setImmuneHealth(int immuneHealth) {
        this.immuneHealth = immuneHealth;
    }

    public int getNutritionalStatus() {
        return nutritionalStatus;
    }

    public void setNutritionalStatus(int nutritionalStatus) {
        this.nutritionalStatus = nutritionalStatus;
    }

    public int getGutHealth() {
        return gutHealth;
    }

    public void setGutHealth(int gutHealth) {
        this.gutHealth = gutHealth;
    }

    public int getMentalWellness() {
        return mentalWellness;
    }

    public void setMentalWellness(int mentalWellness) {
        this.mentalWellness = mentalWellness;
    }
}
