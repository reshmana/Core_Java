package com.xworkz.abstraction.elements;

import javafx.print.Collation;

import java.util.*;

public class Rivers {
   public Collection<String> getrivers(){

        Collection<String> rivers=new ArrayList<>();
       rivers.add("amezon");
       rivers.add("nile");
       rivers.add("ganga");
       rivers.add("kaveri");
       rivers.add("krishna");
       rivers.add("tungabadra");
       rivers.add("yamuna");
       rivers.add("Narmada");
       rivers.add("Godavari");
       rivers.add("Tapti ");
       System.out.println(rivers.size());
        Iterator<String> itr= rivers.iterator();
        while (itr.hasNext()){
            String ref=itr.next();
            System.out.println("rivers name are  "+ref);


        }
       rivers.remove("Godavari");
        System.out.println("After removing "+rivers.size());
        boolean violet = Collections.addAll(rivers, "Godavari");
        System.out.println("Godavari");
        System.out.println(rivers);
        System.out.println("After using addall "+rivers.size());
        System.out.println(rivers.containsAll(rivers));

        Object[] rivers1=rivers.toArray();
        System.out.println(Arrays.toString(rivers1));

        System.out.println(rivers.removeAll(rivers));
        System.out.println("after removing all "+rivers);
        System.out.println("retain all "+rivers.retainAll(rivers));
       rivers.clear();
        System.out.println(rivers.equals("tapti"));
        System.out.println(rivers.isEmpty());
        System.out.println(rivers.contains("godavari"));

        return rivers;
    }
}
