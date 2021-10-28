package com.mani.Condtionals_Loops;

import java.util.Scanner;

public class FibonacciAtPosition {
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13 21 34

        Scanner input = new Scanner(System.in);
        int position = input.nextInt();

        int a=0,b=1,update=0;
        while(position!=2){
            update = a+b;
            a=b;
            b=update;
            position--;
        }
        System.out.println(update);
    }
}
