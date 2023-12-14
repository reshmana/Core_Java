package com.xworkz.rules.reshma;

public  class HospitalRuleImpl implements HospitalRule{
    @Override
   public void  VisitorPolicies(){
        System.out.println("hospitals have the specific visitors hours");
    }
    @Override
    public void NoSmokingPolicy(){
        System.out.println("smocking is prohibited in hospitals");
    }
    @Override
    public void NoiseControl(){
        System.out.println("dont make nois in hospitals");
    }
    @Override
    public boolean CellPhoneUse(){
        System.out.println("cell phone is allowed");
        return true;
    }


}
