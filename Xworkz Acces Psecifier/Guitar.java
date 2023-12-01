package com.xworkz.objects.classes;

public class Guitar {
    public String id;
    public int price;
    String material;

    public Guitar(String id, int price, String material) {
        this.id = id;
        this.price = price;
        this.material = material;
        System.out.println("running int,int,String arg");
    }
    @Override
    public boolean equals(Object o) {

        Guitar leftSide=this;
        if(o!=null){

            if(o instanceof Guitar) {
                Guitar guitarRightSide=(Guitar) o;

                System.out.println("same on both side");

                if (leftSide.id == guitarRightSide.id && leftSide.price == guitarRightSide.price) {

                    System.out.println("leftside and guitarrightside is same");
                    return true;
                } else {
                    System.err.println("leftside and guitarrightside is not same");
                }
            }
        }
        else{
            System.err.println("null is passed");
        }

        return false;
    }



}

