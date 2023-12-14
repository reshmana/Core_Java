package com.Xworkz2.view.boot;
import com.Xworkz2.view.reshma.MysurePalace;
import com.Xworkz2.view.reshma.Palace;

public class PalaceRunner {

    public static void main(String[] args) {
        System.out.println("starting main method in PalaceRunner");

        Palace palace =new MysurePalace("bengalorepalace","Bengalore",560067);
        System.out.println(palace);

        Palace palace1=new MysurePalace("Mysure");
        System.out.println(palace1);
        palace1.drinage();

        System.out.println("ending main method in PalaceRunner");
    }
}
