package com.xworkz.rules.reshma;

public interface HospitalRule {
    public String NAME="Jayadeva";
    public String LOCATION="Bengalore";

   abstract void VisitorPolicies();
   void NoSmokingPolicy();
    void NoiseControl();
    boolean CellPhoneUse();



}
