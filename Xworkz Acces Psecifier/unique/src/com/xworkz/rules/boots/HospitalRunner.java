package com.xworkz.rules.boots;

import com.xworkz.rules.reshma.HospitalRule;
import com.xworkz.rules.reshma.HospitalRuleImpl;

public class HospitalRunner {
    public static void main(String[] args) {
        System.out.println("starting main in HospitalRunner");

        HospitalRule hospitalRule=new HospitalRuleImpl();
        hospitalRule.NoSmokingPolicy();
        hospitalRule.CellPhoneUse();
        hospitalRule.NoiseControl();
        hospitalRule.VisitorPolicies();

        System.out.println("ending main in HospitalRunner");
    }
}
