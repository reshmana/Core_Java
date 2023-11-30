package com.xworkz.objects;

public class Rice {
    String type;
    double cost;
    double weight;

    public Rice(){

        System.out.println("running no arg cons in Rice");
    }

    public void show(String type,double cost,int weight){
        this.type=type;
        this.cost=cost;
        this.weight=weight;
        System.out.println("Displaying show in Rice");

    }

    @Override
    public String toString() {
        return "Rice Type is  "+this.type+", rice cost is  "+this.cost+", in weight  "+this.weight;
    }
}
