package com.xworkz.abstraction.Sorting;

import java.util.Comparator;

public class VegetablesComparatorDsc implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        int no=o1.compareTo(o2);
        return no;
    }
}