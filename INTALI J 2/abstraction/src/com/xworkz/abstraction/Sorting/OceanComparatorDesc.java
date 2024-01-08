package com.xworkz.abstraction.Sorting;

import java.util.Comparator;

public class OceanComparatorDesc implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int no=o2.compareTo(o1);
        return no;
    }
}
