package com.mani.First_Java_Program_Assignment;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        long fact=1L;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        System.out.println("The factorial of "+num+" is "+fact);

    }
}
