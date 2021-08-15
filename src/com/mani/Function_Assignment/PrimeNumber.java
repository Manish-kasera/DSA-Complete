package com.mani.Function_Assignment;

public class PrimeNumber {
    public static void main(String[] args) {
        int  num = 22;
        boolean ans = isPrime(num);
        System.out.println(ans);
    }

   static boolean isPrime(int num) {
        for(int i = 2;i * i <= num ; i++)
            if(num  % i == 0)
                return false;
        return true;
    }
}
