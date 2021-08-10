package com.mani.Basic_Java_Program;

import java.util.Scanner;

public class AreaOfIsosceleusTrianle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float b = input.nextFloat();
//        float h = input.nextFloat();
        float a = input.nextFloat();
//        ½[√(a2 − b2 /4) × b]

        float area = ((a*a-b*b/4.0f)*b)/2.0f;
        System.out.println(area);
    }
}
