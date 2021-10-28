package com.mani.Condtionals_Loops;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner  in = new Scanner(System.in);
        int year = in.nextInt();

        if (year % 4 == 0){
            if(year % 100 == 0){
                if(year % 400 == 0){
                    System.out.println("Leap");
                }else{
                    System.out.println("Not leap");
                }
            }else{
                System.out.println("leap");
            }
        }else{
            System.out.println("Not Leap");
        }

    }
}
