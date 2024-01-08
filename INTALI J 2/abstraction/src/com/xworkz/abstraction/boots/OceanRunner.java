package com.xworkz.abstraction.boots;

import com.xworkz.abstraction.Sorting.VegetablesComparatorDsc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OceanRunner {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("South Indian Ocean");
        list.add("Atlantic Ocean");
        list.add("Pacific Ocean");
        list.add("Indian Ocean");
        list.add("Southern Ocean");
        list.add("Arctic Ocean");
        list.add("North Atlantic Ocean");
        list.add("South Atlantic Ocean");
        list.add("North Pacific Ocean");
        list.add("South Pacific Ocean");

        Collections.sort(list);
        System.out.println("ascending order");
        for (String ref : list) {
            System.out.println(ref);
        }

        Comparator<String> comparator = new VegetablesComparatorDsc();
        Collections.sort(list, comparator);
        System.out.println("ascending order");
        for (String ref : list) {
            System.out.println(ref);

        }
    }
}