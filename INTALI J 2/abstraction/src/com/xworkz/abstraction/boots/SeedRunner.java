package com.xworkz.abstraction.boots;

import com.xworkz.abstraction.Sorting.SeedcomparatorDesc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SeedRunner {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Sunflower Seeds");
        list.add("Chia Seeds");
        list.add("Pumpkin Seeds");
        list.add("Sesame Seeds");
        list.add("Flaxseeds");
        list.add("Quinoa Seeds");
        list.add("Poppy Seeds");
        list.add("Hemp Seeds");
        list.add("Mustard Seeds");
        list.add("Cumin Seeds");

        Collections.sort(list);
        System.out.println("ascending order");
        for (String ref : list) {
            System.out.println(ref);
        }
        Comparator<String> comparator = new SeedcomparatorDesc();
        Collections.sort(list, comparator);
        System.out.println("descending order");
        for (String ref : list) {
            System.out.println(ref);

        }
    }
}