package com.xworkz.rules.boots;

import com.xworkz.rules.reshma.CourtRuleImpl;

public class CourtRunner {
    public static void main(String[] args) {
        System.out.println("starting main in CourtRunner");

        CourtRuleImpl courtRule=new CourtRuleImpl();
        courtRule.RespectForCourt();
        courtRule.DressCode();
        courtRule.Honesty();
        courtRule.Timeliness();

        System.out.println("ending main in CourtRunner");
    }
}
