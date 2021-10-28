package com.mani.Condtionals_Loops;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        boolean perfect = true;

        int sum = 0;
        for (int i = 1; i <num ; i++) {
            if(num % i == 0){
                sum += i;
            }
        }
        if(sum != num)
             perfect = false;

        if(perfect){
            System.out.println("Perfect");
        }else{
            System.out.println("Not perfect");
        }

    }
}
