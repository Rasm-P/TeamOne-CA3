/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import io.swagger.v3.oas.annotations.media.Schema;

/**
 *
 * @author Lukas Bjornvad
 */
public class Starship {
    @Schema(required = true,example = "X-wing")
    private String name;
    @Schema(required = true,example = "T-65 X-wing")
    private String model;
    @Schema(required = true,example = "Incom Corporation")
    private String manufacturer;
    @Schema(required = true,example = "149999")
    private String cost_in_credits;
    @Schema(required = true,example = "12.5")
    private String length;
    @Schema(required = true,example = "1050")
    private String max_atmosphering_speed;
    @Schema(required = true,example = "1")
    private String crew;
    @Schema(required = true,example = "0")
    private String passengers;
    @Schema(required = true,example = "110")
    private String cargo_capacity;
    @Schema(required = true,example = "1 week")
    private String consumables;
    @Schema(required = true,example = "1.0")
    private String hyperdrive_rating;
    @Schema(required = true,example = "100")
    private String MGLT;
    @Schema(required = true,example = "Starfighter")
    private String starship_class;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCost_in_credits() {
        return cost_in_credits;
    }

    public void setCost_in_credits(String cost_in_credits) {
        this.cost_in_credits = cost_in_credits;
    }

    public String getLength() {
        return length;
    }

    public void setLength(String length) {
        this.length = length;
    }

    public String getMax_atmosphering_speed() {
        return max_atmosphering_speed;
    }

    public void setMax_atmosphering_speed(String max_atmosphering_speed) {
        this.max_atmosphering_speed = max_atmosphering_speed;
    }

    public String getCrew() {
        return crew;
    }

    public void setCrew(String crew) {
        this.crew = crew;
    }

    public String getPassengers() {
        return passengers;
    }

    public void setPassengers(String passengers) {
        this.passengers = passengers;
    }

    public String getCargo_capacity() {
        return cargo_capacity;
    }

    public void setCargo_capacity(String cargo_capacity) {
        this.cargo_capacity = cargo_capacity;
    }

    public String getConsumables() {
        return consumables;
    }

    public void setConsumables(String consumables) {
        this.consumables = consumables;
    }

    public String getHyperdrive_rating() {
        return hyperdrive_rating;
    }

    public void setHyperdrive_rating(String hyperdrive_rating) {
        this.hyperdrive_rating = hyperdrive_rating;
    }

    public String getMGLT() {
        return MGLT;
    }

    public void setMGLT(String MGLT) {
        this.MGLT = MGLT;
    }

    public String getStarship_class() {
        return starship_class;
    }

    public void setStarship_class(String starship_class) {
        this.starship_class = starship_class;
    }
    
    
}
