package com.lastma.data.models;

import java.time.Year;

public class vehicle {
    private String brand;
    private String model;
    private Year year;
    private vehicleType Type;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }

    public vehicleType getType() {
        return Type;
    }

    public void setType(vehicleType type) {
        Type = type;
    }
}
