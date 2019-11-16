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
 * @author Lukas Bjornvad
 */
public class PersonDTO {
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
    private Planet homeworld;
    private LinkedList<Species> species = new LinkedList<>();
    private LinkedList<Starship> starships = new LinkedList<>();
    private LinkedList<Vehicle> vehicles = new LinkedList<>();

    public PersonDTO(Person person) {
        this.name = person.getName();
        this.height = person.getHeight();
        this.mass = person.getMass();
        this.hair_color = person.getHair_color();
        this.skin_color = person.getSkin_color();
        this.eye_color = person.getEye_color();
        this.birth_year = person.getBirth_year();
        this.gender = person.getGender();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getMass() {
        return mass;
    }

    public void setMass(double mass) {
        this.mass = mass;
    }

    public String getHair_color() {
        return hair_color;
    }

    public void setHair_color(String hair_color) {
        this.hair_color = hair_color;
    }

    public String getSkin_color() {
        return skin_color;
    }

    public void setSkin_color(String skin_color) {
        this.skin_color = skin_color;
    }

    public String getEye_color() {
        return eye_color;
    }

    public void setEye_color(String eye_color) {
        this.eye_color = eye_color;
    }

    public String getBirth_year() {
        return birth_year;
    }

    public void setBirth_year(String birth_year) {
        this.birth_year = birth_year;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Object getHomeworld() {
        return homeworld;
    }

    public void setHomeworld(Planet homeworld) {
        this.homeworld = homeworld;
    }

    public LinkedList<Species> getSpecies() {
        return species;
    }

    public void addSpecies(Species species) {
        this.species.add(species);
    }

    public LinkedList<Starship> getStarships() {
        return starships;
    }

    public void setStarships(LinkedList<Starship> starships) {
        this.starships = starships;
    }

    public void addStarships(Starship starship) {
        this.starships.add(starship);
    }

    public LinkedList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(LinkedList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public void addVehicles(Vehicle vehicle) {
        this.vehicles.add(vehicle);
    }

}
