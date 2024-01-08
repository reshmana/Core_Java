package com.xworkz.abstraction.elements;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class Ornaments {
    public Collection<String> getOrnaments() {

        Collection<String> ornaments = new ArrayList<>();
        ornaments.add("chain");
        ornaments.add("stud");
        ornaments.add("necklec");
        ornaments.add("ring");
        ornaments.add("chokar");
        ornaments.add("braslec");
        ornaments.add("earring");
        ornaments.add("ancklet");
        ornaments.add("mangtika");
        ornaments.add("bangles");

        Iterator<String> itr = ornaments.iterator();
        while (itr.hasNext()) {
            String ref = itr.next();
            System.out.println("ref :" + ref);
          if(ref.equalsIgnoreCase("stud"));
        }
        ornaments.remove("stud");
        System.out.println("after removing: "+ornaments.size());
        boolean stud= Collections.addAll(ornaments,"stud");
        System.out.println("stud");
        System.out.println(ornaments);
        System.out.println("after using add all:"+ornaments.size());
        System.out.println(ornaments.contains(ornaments));
        return ornaments;


    }
}

