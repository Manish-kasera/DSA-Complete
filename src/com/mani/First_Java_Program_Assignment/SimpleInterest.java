package com.mani.First_Java_Program_Assignment;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        float principal = input.nextFloat();
        float rate=input.nextFloat();
        int time = input.nextInt();

        float si= (principal*rate*time)/100;
        System.out.println("The Simple Interest is : "+si);

    }
}
