package com.xworkz.tecnicalquastons.practice;

public class Reversetriangle {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int k = i; k<n; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


















