package com.mani.Maths;

public class FactorsOpti1 {

    public static void main(String[] args) {
       int n = 36;
       factors(n);
    }

    // O (sqrt(n)

    public static void factors(int n) {
        for (int i = 1; i * i <= n ; i++) {
            if(n % i == 0){
                System.out.print(i+" ");
            }
        }
        if(n % 4 == 0){
            System.out.print(n/4+" ");
        }
        if(n % 2 == 0){
            System.out.print(n/2 +" ");
        }
        System.out.print(n);
    }
}
