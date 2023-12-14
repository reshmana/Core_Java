package com.xworkz.objects.classes;

public class Seed {
    String brand;
    int weight;
    String name;

    public Seed(){
        System.out.println("running no arg cons in Seed");
    }

    public void show(String name,String brand,int weight){
        this.name=name;
        this.brand=brand;
        this.weight=weight;
        System.out.println("Displaying show in Seed");

    }

    @Override
    public String toString() {
        return "Seed info  "+this.name+", seed brand is  "+this.brand+", in weight  "+this.weight;
    }
}
