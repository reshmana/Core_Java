package com.xworkz.abstraction.boots;

import com.xworkz.abstraction.Sorting.TreeComparatorAscImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TreeAgeRunner {
    public static void main(String[] args) {
        List<Integer> age = new ArrayList<>();
        age.add(20);
        age.add(10);
        age.add(1);
        age.add(8);
        age.add(50);
        age.add(28);
        age.add(45);
        age.add(35);
        age.add(15);
        age.add(4);
        age.add(6);

        // Sort in ascending order using natural ordering
        Collections.sort(age);
        System.out.println("Ascending order:");
        for (Integer ref : age) {
            System.out.println(ref);
        }

        // Sort in descending order using a custom comparator
        Comparator comparator = new TreeComparatorAscImpl();
        Collections.sort(age,comparator);
        System.out.println("Descending order:");
        for (Integer ref : age) {
            System.out.println(ref);
        }
    }
}
