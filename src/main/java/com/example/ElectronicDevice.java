package com.example;

public class ElectronicDevice {
    // TODO: Declare common attributes for electronic devices, such as brand and model.
    private String brand;
    private String model;
    // Constructor to initialize an ElectronicDevice object
    public ElectronicDevice(String brand, String model) {
        // TODO: Initialize the common attributes (brand, model) with the provided parameters
        this.brand=brand;
        this.model=model;
    }
    public String getBrand(){
        return this.brand;
    }
    public String getModel(){
        return this.model;
    }

    // TODO: Implement getters (and setters if necessary) for the brand and model.

    // OPTIONALLY implement the required methods to pass the BonusTest.

}
