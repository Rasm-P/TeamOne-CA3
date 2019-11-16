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
public class Species {
    @Schema(required = true,example = "Human")
    private String name;
    @Schema(required = true,example = "mammal")
    private String classification;
    @Schema(required = true,example = "sentient")
    private String designation;
    @Schema(required = true,example = "180")
    private String average_height;
    @Schema(required = true,example = "caucasian, black, asian, hispanic")
    private String skin_colors;
    @Schema(required = true,example = "blonde, brown, black, red")
    private String hair_colors;
    @Schema(required = true,example = "brown, blue, green, hazel, grey, amber")
    private String eye_colors;
    @Schema(required = true,example = "120")
    private String average_lifespan;
    @Schema(required = true,example = "Galactic Basic")
    private String language;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getAverage_height() {
        return average_height;
    }

    public void setAverage_height(String average_height) {
        this.average_height = average_height;
    }

    public String getSkin_colors() {
        return skin_colors;
    }

    public void setSkin_colors(String skin_colors) {
        this.skin_colors = skin_colors;
    }

    public String getHair_colors() {
        return hair_colors;
    }

    public void setHair_colors(String hair_colors) {
        this.hair_colors = hair_colors;
    }

    public String getEye_colors() {
        return eye_colors;
    }

    public void setEye_colors(String eye_colors) {
        this.eye_colors = eye_colors;
    }

    public String getAverage_lifespan() {
        return average_lifespan;
    }

    public void setAverage_lifespan(String average_lifespan) {
        this.average_lifespan = average_lifespan;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    
    
    
}
