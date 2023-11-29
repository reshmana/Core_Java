package com.Xwokz.Laptop;

public class DellLaptop extends Laptop {
    public DellLaptop(){

        System.out.println("Created no arg const in Parrot");
    }

      public void displayInfo(){
        display();
        on();
        off();
        show();
        System.out.println("Accessing only public,protected, package-deafault as in Parrot with in the same package dif class");
    }
}