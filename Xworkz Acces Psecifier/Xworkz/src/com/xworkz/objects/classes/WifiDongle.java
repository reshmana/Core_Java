package com.xworkz.objects.classes;

import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;

public class WifiDongle {
    String brand;
    double TransferRate;
    double batteryRequired;
    int itemWeight;

   public  WifiDongle(String brand,double TransferRate,double batteryRequired) {
       this.brand = brand;
       this.TransferRate = TransferRate;
       this.batteryRequired = batteryRequired;
       this.itemWeight = itemWeight;
       System.out.println("running Strring doubel double arg");
   }


    @Override
    public boolean equals(Object obj) {
        WifiDongle leftside=this;
        if(obj!=null){

            if(obj instanceof WifiDongle){
                WifiDongle rightside=(WifiDongle) obj;
                if(leftside.TransferRate==rightside.TransferRate && leftside.itemWeight==rightside.itemWeight){
                    System.out.println("both are same");
                    return true;
                }
                else {
                    System.err.println("both are not same");
                }
            }
        }
        else{
            System.err.println("null not to be passed");
        }




        return false;
    }
}
