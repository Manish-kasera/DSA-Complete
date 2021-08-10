package com.mani.Basic_Java_Program;

import java.util.Scanner;

public class AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float base = input.nextFloat();
        float height = input.nextFloat();

        float area = base*height;
        System.out.println(area);
    }

    public static class AreaOfCircle {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            float radius = input.nextFloat();
            final float pi = 3.14f;

            double area = pi*radius*radius;
            System.out.println(area);
        }
    }
}
