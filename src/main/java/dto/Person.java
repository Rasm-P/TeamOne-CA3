/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import io.swagger.v3.oas.annotations.media.Schema;
import java.util.LinkedList;

/**
 *
 * @author Simon Norup
 */
public class Person {
    @Schema(required = true,example = "Luke Skywalker")
    private String name;
    @Schema(required = true,example = "172")
    private double height;
    @Schema(required = true,example = "77")
    private double mass;
    @Schema(required = true,example = "blond")
    private String hair_color;
    @Schema(required = true,example = "fair")
    private String skin_color;
    @Schema(required = true,example = "blue")
    private String eye_color;
    @Schema(required = true,example = "19BBY")
    private String birth_year;
    @Schema(required = true,example = "male")
    private String gender;
    @Schema(required = true,example = "Tatooine")
    private String homeworld;
    private LinkedList<String> species;
    private LinkedList<String> starships; 
    private LinkedList<String> vehicles; 

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public double getMass() {
        return mass;
    }

    public String getHair_color() {
        return hair_color;
    }

    public String getSkin_color() {
        return skin_color;
    }

    public String getEye_color() {
        return eye_color;
    }

    public String getBirth_year() {
        return birth_year;
    }

    public String getGender() {
        return gender;
    }

    public String getHomeworld() {
        return homeworld;
    }

    public LinkedList<String> getSpecies() {
        return species;
    }

    public LinkedList<String> getStarships() {
        return starships;
    }

    public LinkedList<String> getVehicles() {
        return vehicles;
    }
    
    
}
