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
public class Planet {
    @Schema(required = true,example = "Tatooine")
    private String name;
    @Schema(required = true,example = "23")
    private String rotation_period;
    @Schema(required = true,example = "304")
    private String orbital_period;
    @Schema(required = true,example = "10465")
    private String diameter;
    @Schema(required = true,example = "arid")
    private String climate;
    @Schema(required = true,example = "1 standard")
    private String gravity;
    @Schema(required = true,example = "desert")
    private String terrain;
    @Schema(required = true,example = "1")
    private String surface_water;
    @Schema(required = true,example = "200000")
    private String population;
//    private LinkedList<Person> residents;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRotation_period() {
        return rotation_period;
    }

    public void setRotation_period(String rotation_period) {
        this.rotation_period = rotation_period;
    }

    public String getOrbital_period() {
        return orbital_period;
    }

    public void setOrbital_period(String orbital_period) {
        this.orbital_period = orbital_period;
    }

    public String getDiameter() {
        return diameter;
    }

    public void setDiameter(String diameter) {
        this.diameter = diameter;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    public String getGravity() {
        return gravity;
    }

    public void setGravity(String gravity) {
        this.gravity = gravity;
    }

    public String getTerrain() {
        return terrain;
    }

    public void setTerrain(String terrain) {
        this.terrain = terrain;
    }

    public String getSurface_water() {
        return surface_water;
    }

    public void setSurface_water(String surface_water) {
        this.surface_water = surface_water;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }
/*
    public LinkedList<Person> getResidents() {
        return residents;
    }
    public void addResidents(Person resident) {
        this.residents.add(resident);
    }
    
    public void setResidents(LinkedList<Person> residents) {
        this.residents = residents;
    }*/
    
}
