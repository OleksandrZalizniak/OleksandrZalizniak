package com.company;

public class TestLaptop{
public static void main(String[] args) {
	 Laptop laptop = new Laptop("Acer", "Nitro 5", 20, 799.99, 128, 512, 499.99);
	 System.out.println("Brand: " + laptop.getBrand());
     System.out.println("Model: " + laptop.getModel());
     System.out.println("Screen Size: " + laptop.getScreenSize());
     System.out.println("Price: $" + laptop.getPrice());
     System.out.println("RAM Size: " + laptop.getRamSize());
     System.out.println("Storage Size: " + laptop.getStorageSize());
     System.out.println("Updated price: $" + laptop.getUpdatedPrice());
}
}

