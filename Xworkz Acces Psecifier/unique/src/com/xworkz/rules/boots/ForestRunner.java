package com.xworkz.rules.boots;

import com.xworkz.rules.reshma.ForestRuleImpl;

public class ForestRunner {
    public static void main(String[] args) {
        System.out.println("Starting main in ForestRunner");
        ForestRuleImpl forestRule = new ForestRuleImpl();
        forestRule.cuttingTrees();
        forestRule.protectingAnimals();
        forestRule.planting();
        forestRule.tourism();
    }
}
