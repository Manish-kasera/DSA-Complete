package com.mani.Methods;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        boolean ans = IsPrime(num);
        System.out.println(ans);
    }

     static boolean IsPrime(int num) {
        if(num <= 1){
            return false;
        }
         for (int i = 2; i * i <= num ; i++) {
             if(num % i == 0){
                 return false;
             }
         }
         return true;
    }
}

