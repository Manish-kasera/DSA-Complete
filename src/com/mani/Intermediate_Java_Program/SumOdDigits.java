package com.mani.Intermediate_Java_Program;

import java.util.Scanner;

public class SumOdDigits {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        int num = 183;
        int sum = 0;
        while(num!=0){
            int temp = num % 10;
            sum += temp;
            num /= 10;
        }
        System.out.println(sum);
    }
}
