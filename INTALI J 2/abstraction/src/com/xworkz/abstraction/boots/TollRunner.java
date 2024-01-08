package com.xworkz.abstraction.boots;

import com.xworkz.abstraction.Sorting.TollComparatorDesc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TollRunner {
    public static void main(String[] args) {

        List<double> list=new ArrayList<>();
        list.add(100d);
        list.add(200d);
        list.add(500d);
        list.add(1000d);
        list.add(1500d);
        list.add(800d);
        list.add(2500d);
        list.add(1200d);
        list.add(15200d);
        list.add(150d);
        list.add(1860d);
        list.add(280d);

        Collections.sort(list);
        System.out.println("ascending order");
        for(double ref:list){
            System.out.println(ref);
        }
        Comparator<double> comparator=new TollComparatorDesc();
        Collections.sort(list,comparator);
        System.out.println("descending order");
        for(double ref:list){
            System.out.println(ref);


    }
}
