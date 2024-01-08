package com.practice.xworkz;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Patterns {
    public static void main(String[] args) {

        pattern1(5);
        pattern2(4);
        pattern3(4);
        pattern4(4);
        pattern5(6);

    }
    static void pattern1(int n) {

        for (int i = 1; i <= n; i++) {
            //for every i, run  the column
            for (int j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            //when one row is printed ,we need to add a new line
            System.out.println();
        }
        System.out.println("============================");

    }

    static void pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            //for every i, run  the column
            for (int j = 1; j <= n; j++) {
                System.out.print(" * ");
            }
            //when one row is printed ,we need to add a new line
            System.out.println();
        }
        System.out.println("==================================");
    }

    static void pattern3(int n) {

        for (int i = 1; i <= n; i++) {
            //for every i, run  the column
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print("* ");
            }
            //when one row is printed ,we need to add a new line
            System.out.println();
        };
        System.out.println("================================");
    }

    static void pattern4(int n) {

        for (int i = 1; i <= n; i++) {
            //for every i, run  the column
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");// u can print i or j
            }
            //when one row is printed ,we need to add a new line
            System.out.println();
        }
        System.out.println("================================");
    }static void pattern5(int n){
        for (int i=0;i<2*n; i++){
            int Totalcol=i>n ? 2*n-i:i;
            for (int j=0; j<Totalcol; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("============================");
    }
    

}


