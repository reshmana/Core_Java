package com.xworkz.objects.classes;

public class Basket {
    String material;
    int weight;
    double NoOFbasket;

    public Basket()
    {
        System.out.println("running no arg const");
    }

    public  void show(String material,int weight,double NoOFbasket){
        this.material=material;
        this.weight=weight;
        this.NoOFbasket=NoOFbasket;
        System.out.println("running string, int,double arg const");
    }

    @Override
    public String toString() {
        return "basket info is "+this.material+", basket weight is "+this.weight+", noofbasket are "+this.NoOFbasket;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
