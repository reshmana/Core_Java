package com.xworkz.abstraction.elements;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Hospital {
    public static void main(String[] args) {
        Collection<String> hospital = new ArrayList<>();
        hospital.add("Appolo");
        hospital.add("Manipal");
        hospital.add("Marigold");
        hospital.add("Narayana Health City");
        hospital.add("Vikram Hospital");
        hospital.add("Victoria Hospital");
        hospital.add("Sanjo");
        hospital.add("JSS Hospital");
        hospital.add("Ramaiah Memorial Hospita");
        hospital.add("Mallya Hospital");
        hospital.add("MS Ramaiah Narayana Heart Centre");
        hospital.add("Fortis Hospital");
        hospital.add("Excelso");
        hospital.add("Mallya Hospita");
        hospital.add("Bowring and Lady Curzon Hospital");
        hospital.add("Harmonio");
        hospital.add("Radiant Health Centre");
        hospital.add("Shri Sai Hospita");
        hospital.add("Renovo");
        hospital.add("Ashwini Hospital");

        Iterator<String> itr=hospital.iterator();
        while (itr.hasNext()){
            String ref=itr.next();
            // System.out.println("Hospital name is: "+ref);
            if(ref.toLowerCase().endsWith("o")){
                System.out.println(ref);
            }
            if(ref.endsWith("r")){
                System.out.println("ends with r "+ref);
            }
            if(ref.startsWith("b") || ref.endsWith("k")){
                System.out.println("Starting with b or end with k "+ref);
            }

            if(ref.length()<5) {
                System.out.println("having less than 5 characters "+ref);
            } else if (ref.length()>=5) {
                System.out.println("cutting of characters to length 5 "+ref.substring(0,5));
            }


        }


    }
}
