package com.xworkz.rules.reshma;

public class CourtRuleImpl implements CourtRule {
    public  void RespectForCourt (){
        System.out.println("show the respect for court");
    }

    @Override
    public  void DressCode (){
        System.out.println("dress in a manner that reflects the seriousness ");
    }

    @Override
    public  void Timeliness (){
        System.out.println("shoud fallow court timing");
    }
    @Override
    public  void  Honesty(){
        System.out.println("shoud be honest ");
    }


}
