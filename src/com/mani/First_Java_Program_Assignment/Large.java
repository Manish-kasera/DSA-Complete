package com.mani.First_Java_Program_Assignment;

import java.util.Scanner;

public class Large {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int large = -1;
        int num=-22;

        while(num!=0){
            num = input.nextInt();
            if(num>large){
                large=num;
            }
            System.out.println(large);
        }
    }
}
