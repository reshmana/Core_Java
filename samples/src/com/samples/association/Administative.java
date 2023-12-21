package com.samples.association;

import com.samples.rules.CollageRule;

public class Administative {

    private CollageRule collageRule;

    public Administative(CollageRule collageRule){
        this.collageRule=collageRule;
    }

    public void principal() {
        System.out.println("runninr Principal in Administative");

        String exam = collageRule.ExamConduct();
        boolean disciplane = collageRule.Disciplane();

        if (disciplane && exam != null) {
            System.out.println("writen exams "+exam);
        } else {
            System.err.println("not written");
        }
    }
  }
