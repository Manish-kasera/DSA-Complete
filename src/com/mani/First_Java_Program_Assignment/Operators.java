package com.mani.First_Java_Program_Assignment;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println(sum(num1,num2));
        System.out.println(multiply(num1,num2));
        System.out.println(divide(num1,num2));
        System.out.println(subtract(num1,num2));
    }

    public static int sum(int num1, int num2) {
        return num1 + num2;
    }
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }
    public static int divide(int num1,int num2){
        return num1/num2;
    }

}
