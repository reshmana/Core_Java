package com.xworkz.objects.classes;

public class Geyser {
    String brand;
    double cost;
    double capacity;


    public Geyser() {

        System.out.println("no arg cons in Geyser");
    }

    public void show(String brand, double cost, int capacity) {
        this.brand = brand;
        this.cost = cost;
        this.capacity = capacity;
        System.out.println("Displaying show in Geyser");

    }

    @Override
    public String toString() {
        return "Geyser info is " + this.brand + ", Geyser cost is " + this.cost + ", Geyser capacity is " + this.capacity;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

}
