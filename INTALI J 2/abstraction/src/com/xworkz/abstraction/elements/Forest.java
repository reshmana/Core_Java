package com.xworkz.abstraction.elements;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Forest {
    public static void main(String[] args) {
        Collection<String> forest=new ArrayList<>();
        forest.add("Amezon");
        forest.add("aravali");
        forest.add("sundarbans");

       Iterator<String> itr=forest.iterator();
       while(itr.hasNext()){
           String ref= itr.next();
            System.out.println("forest  names : "+ref);
            if(ref.startsWith("s")){
                System.out.println("forest name start with s: "+ref);
            }
            if(ref.toLowerCase().endsWith("n")){
                System.out.println(""+ref);
            }
            if(ref.length()<5){
                System.out.println("having less then 5 charctern "+ref);
            }
            else if (ref.length()>=5){
                System.out.println("cuuting charector to 5 "+ref.substring(0,5));

                }
            }
        }
    }

