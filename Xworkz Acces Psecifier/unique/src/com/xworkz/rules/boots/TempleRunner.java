package com.xworkz.rules.boots;

import com.xworkz.rules.reshma.TempleRuleImpl;

public class TempleRunner {
    public static void main(String[] args) {
        System.out.println("Starting main in TempleRunner");
        TempleRuleImpl templeRule = new TempleRuleImpl();
        templeRule.pujaRules();
        templeRule.neatness();
        templeRule.prasada();
        templeRule.restrictions();

        System.out.println("Ending main in TempleRunner");
    }
}
