package com.mani.Recursion;

public class SumOfDig {
    public static void main(String[] args) {
        int num = 55;
        System.out.println(sumofdig(num));
        System.out.println(proofdig(num));
    }

    static int sumofdig(int num){
        if(num > 0 && num <= 9){
            return num;
        }

        return num % 10 + sumofdig(num /= 10);
    }

    static  int proofdig(int num){
        if(num >= 0 && num <= 9){
            return num;
        }

        return (num % 10 )* proofdig(num /= 10);
    }
}
