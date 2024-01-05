package com.xworkz.abstraction.elements;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class RadioStation {
    public static void main(String[] args) {

        Collection<String> radioStation = new ArrayList<>();
        radioStation.add("Radio city");
        radioStation.add("Vivid Bharati");
        radioStation.add("Radio mirchi");
        radioStation.add("radio one");
        radioStation.add("Big FM");

       Iterator<String> itr=radioStation.iterator();
       while(itr.hasNext()){
           String ref=itr.next();
           System.out.println("radio station names: "+ref);
           if(ref.endsWith("i")){
               System.out.println("radio station ends with i "+ref);
           }
           else {
               System.out.println("radio station  not consist i at end "+ref);
           }
       }
    }
}
