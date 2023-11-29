package com.Xwokz.Laptop;

public class LaptopRunner {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.display();
        laptop.on();
        laptop.off();
        laptop.show();

        DellLaptop dellLaptop=new DellLaptop();
        dellLaptop.display();
        dellLaptop.on();
        dellLaptop.off();
        dellLaptop.show();
    }
}
