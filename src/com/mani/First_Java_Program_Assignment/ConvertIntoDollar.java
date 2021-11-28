package com.mani.First_Java_Program_Assignment;

import java.util.Scanner;

public class ConvertIntoDollar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int rupee = input.nextInt();
        float dollar = rupee/70.0f;

        System.out.println(dollar);

    }
}
