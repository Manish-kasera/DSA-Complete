package com.mani.Basic_Java_Program;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float base=input.nextFloat();
        float height=input.nextFloat();

        float area = (base*height)/2.0f;

        System.out.println(area);

    }
}
