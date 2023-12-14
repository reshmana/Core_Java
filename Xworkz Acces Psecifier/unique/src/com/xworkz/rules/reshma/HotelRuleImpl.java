package com.xworkz.rules.reshma;

public class HotelRuleImpl implements HotelRule {

    @Override
        public boolean safety(){
        System.out.println("safety is allowed");
        return true;

    }
    @Override
    public void NoSmokingPolicy(){
        System.out.println("smoking is not alllowed");
    }
    @Override
   public void QuietHours(){
        System.out.println("running quithoures");
    }
    @Override
   public void GuestRegistration(){
        System.out.println("Registration provides for guests ");
    }
}
