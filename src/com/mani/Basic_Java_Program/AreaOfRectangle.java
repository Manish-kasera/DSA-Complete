package com.mani.Basic_Java_Program;
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float width = input.nextFloat();
        float length = input.nextFloat();

        float area = length*width;
        System.out.println(area);
    }
}
