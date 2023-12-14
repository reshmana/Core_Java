package com.xworkz.objects.Runner;

import com.xworkz.objects.classes.*;

public class GuitarRunner {
    public static void main(String[] args) {
        System.out.println("starting main in GuitarRunner");

       Guitar guitar=new Guitar("concert",2000,"wood");
        Guitar guitar1=new Guitar("concert",2000,"wood");

         boolean same=guitar.equals(guitar1);
        System.out.println("guitar.equals(guitar1):"+same);

        WifiDongle wifiDongle=new WifiDongle("Airtel",950,5000);
        WifiDongle wifiDongle1=new WifiDongle("Airtel",950,5000);

        boolean same1=wifiDongle.equals(wifiDongle1);
        System.out.println("wifiDongle.equals(wifiDongle1):"+same1);

       UsbHub usbHub=new UsbHub(3,850,0);
        UsbHub usbHub1=new UsbHub(3,850,0);

        boolean same2=usbHub.equals(usbHub1);
        System.out.println("usbHub.equals(usbHub1):"+same2);


        System.out.println("ending main in GuitarRunner");
    }
}
