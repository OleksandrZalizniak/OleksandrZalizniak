package com.company;

public class Laptop {
	private String brand;
    private String model;
    private double screenSize;
    private double price;
    private int ramSize;
    private int storageSize;
    private double updatedPrice;

    public Laptop(String brand, String model, double screenSize, double price, int ramSize, int storageSize, double updatedPrice) {
        this.brand = brand;
        this.model = model;
        this.screenSize = screenSize;
        this.price = price;
        this.ramSize = ramSize;
        this.storageSize = storageSize;
        this.updatedPrice = updatedPrice;
    }

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

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }
    public double getPrice() {
    	return price;
    }
    public void setPrice(double price){
	    this.price = price;
    }
    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }
    public double getUpdatedPrice() {
    	return updatedPrice;
    }
    public void setUpdatedPrice(double updatedPrice){
	    this.updatedPrice = updatedPrice;
    }
}
