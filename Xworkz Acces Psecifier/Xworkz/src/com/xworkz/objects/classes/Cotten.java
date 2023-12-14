package com.xworkz.objects.classes;

public class Cotten {
    String brand;
    double cost;
    int quantity;
    public Cotten(){

        System.out.println("created no arg const in Cotton");
    }

    public void show(String brand, double cost,int quantity){
        this.brand=brand;
        this.cost=cost;
        this.quantity=quantity;
        System.out.println("displaying show in Cotton");
    }


    @Override
    public String toString() {
        return "Cotton info is :"+this.brand+", cost is :"+this.cost+", quantity is "+this.quantity;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

