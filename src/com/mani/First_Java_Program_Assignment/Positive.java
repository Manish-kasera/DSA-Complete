package com.mani.First_Java_Program_Assignment;

import java.util.Scanner;

public class Positive {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num=1;

        int sum=0;
        while(num!=0){
            num = 0;
            num = input.nextInt();
            sum+=num;
            System.out.println(sum);

        }
    }
}
