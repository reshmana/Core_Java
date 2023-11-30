package com.xworkz.objects;

public class Bucket {
    int waterInLtrs;
    String type;
    double hieght;


    public Bucket(){

        System.out.println("no arg cons in bucket");
    }

    public void show(int waterInLtrs,String type,double hieght){
        this.waterInLtrs=waterInLtrs;
        this.type=type;
        this.hieght=hieght;
        System.out.println("Displaying show in Bucket");

    }

    @Override
    public String toString() {
        return "Bucket info is "+this.waterInLtrs+", bucket type is "+this.type+", bucket height is "+this.hieght;
    }
}
