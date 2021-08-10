package com.mani.First_Java_Program_Assignment;

import java.awt.geom.Arc2D;
import java.util.Scanner;

public class ConverIntoDollar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rupee = input.nextInt();
        float dollar = rupee/70.0f;

        System.out.println(dollar);

    }
}
