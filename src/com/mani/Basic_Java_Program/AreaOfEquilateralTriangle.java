package com.mani.Basic_Java_Program;

import java.util.Scanner;

public class AreaOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float side=input.nextFloat();

        float area = (float) ((1.732 * side*side)/4.0f);
        System.out.println(area);
    }
}
