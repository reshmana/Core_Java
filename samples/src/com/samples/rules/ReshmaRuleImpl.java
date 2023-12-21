package com.samples.rules;

public class ReshmaRuleImpl implements CollageRule{

    @Override
    public boolean Disciplane() {
        System.out.println("running disciplane in ReshmaRuleImpl ");
        return true;
    }

    @Override
    public String ExamConduct() {
        System.out.println("running ExamConduct in ReshmaRuleImpl ");
        return "reshma cunduct exam";
    }
}
