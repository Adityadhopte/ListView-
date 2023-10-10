package com.example.listviewandadapter.model;

public class PlanetModel {

    // Attributes
    // Private fields encapsulating account details
    private String PlanetName;
    private String moonCount;
    private int planetImage;


    // Constructor

    public PlanetModel(String planetName, String moonCount, int planetImage) {
        PlanetName = planetName;
        this.moonCount = moonCount;
        this.planetImage = planetImage;
    }

    // Getter Setter

    public String getPlanetName() {
        return PlanetName;
    }

    // Method to set Name (abstraction of Name functionality)
    public void setPlanetName(String planetName) {
        PlanetName = planetName;
    }

    public String getMoonCount() {
        return moonCount;
    }

    public void setMoonCount(String moonCount) {
        this.moonCount = moonCount;
    }

    public int getPlanetImage() {
        return planetImage;
    }

    public void setPlanetImage(int planetImage) {
        this.planetImage = planetImage;
    }
}
