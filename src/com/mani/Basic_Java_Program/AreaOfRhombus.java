package com.mani.Basic_Java_Program;

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float diagonal1 = input.nextFloat();
        float diagonal2 = input.nextFloat();

        float area = diagonal1*diagonal2;

        System.out.println(area);

    }
}
