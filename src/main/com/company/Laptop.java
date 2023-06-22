package com.company;

import com.company.accessories.Mouse;

public class Laptop {
    private String brand;
    private Processor processor;
    private Mouse mouse;

    public Laptop(String brand, Processor processor, Mouse mouse) {
        this.brand = brand;
        this.processor = processor;
        this.mouse = mouse;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void displayDetails() {
        System.out.println("Laptop Brand: " + brand);
        System.out.println("Processor: " + processor.getModel());
        System.out.println("Mouse Type: " + mouse.getType());
    }
}
