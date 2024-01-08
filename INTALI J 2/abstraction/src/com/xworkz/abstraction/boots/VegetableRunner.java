package com.xworkz.abstraction.boots;

import com.xworkz.abstraction.Sorting.VegetablesComparatorDsc;

import java.util.*;

public class VegetableRunner {
    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("tomato");
        list.add("onion");
        list.add("carrot");
        list.add("radish");
        list.add("cabbage");
        list.add("drumstick");
        list.add("beetroot");
        list.add("pea");
        list.add("sweet potato");
        list.add("chilli");
        list.add("capsicum");

        Collections.sort(list);
        System.out.println("ascending order");
        for(String ref:list){
            System.out.println(ref);
        }

        Comparator<String> comparator=new VegetablesComparatorDsc();
          Collections.sort(list,comparator);
        System.out.println("afetr discending");
        for(String ref:list){
            System.out.println(ref);
        }

    }
}
