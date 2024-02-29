package com.xworkz.tecnicalquastons.practice;

public class Triangle {
    public static void main(String[] args) {
        //Increment  order
        int n=5;
        for (int i=1;i<=n; i++){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("=====================");
        //decrement order
        int m=6;
        for (int i=1; i<=m; i++){
            for (int j=i; j<=m; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("======================");

        int row=6;
        for (int i=1; i<=row; i++){
            for (int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for (int e=1; e<=i; e++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
