package com.mani.Intermediate_Java_Program;

import java.util.Scanner;
import java.lang.Math;

public class Compounding {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double P = 1000;
        double r = 10;
        double t= 10;

//        P (1 + r/n)^(nt)

       double c =P * Math.pow((1+r),t);
        System.out.println(c);

    }
}
