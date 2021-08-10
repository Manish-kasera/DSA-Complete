package com.mani.First_Java_Program_Assignment;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if(num1>num2){
            System.out.println(num1);
        }else{
            System.out.println(num2);
        }

    }
}
