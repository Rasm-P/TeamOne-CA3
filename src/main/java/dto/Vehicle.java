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
public class Vehicle {
    @Schema(required = true,example = "Snowspeeder")
    private String name;
    @Schema(required = true,example = "t-47 airspeeder")
    private String model;
    @Schema(required = true,example = "Incom corporation")
    private String manufacturer;
    @Schema(required = true,example = "unknown")
    private String cost_in_credits;
    @Schema(required = true,example = "4.5")
    private String length;
    @Schema(required = true,example = "650")
    private String max_atmosphering_speed;
    @Schema(required = true,example = "2")
    private String crew;
    @Schema(required = true,example = "0")
    private String passengers;
    @Schema(required = true,example = "10")
    private String cargo_capacity;
    @Schema(required = true,example = "none")
    private String consumables;
    @Schema(required = true,example = "airspeeder")
    private String vehicle_class;

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

    public String getVehicle_class() {
        return vehicle_class;
    }

    public void setVehicle_class(String vehicle_class) {
        this.vehicle_class = vehicle_class;
    }
    
}
