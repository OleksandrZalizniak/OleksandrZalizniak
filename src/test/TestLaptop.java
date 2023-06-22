package com.company;

import com.company.accessories.Mouse;

public class TestLaptop {
    public static void main(String[] args) {

        Processor processor = new Processor("Intel i7");

        Mouse mouse = new Mouse("Wireless");

        Laptop laptop = new Laptop("HP", processor, mouse);

        System.out.println("Laptop Details");
        
        laptop.displayDetails();
    }
}

