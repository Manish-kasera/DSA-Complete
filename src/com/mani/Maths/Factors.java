package com.mani.Maths;

public class Factors {
    public static void main(String[] args) {
        factors(36);
    }

    // O (n)
    public  static  void factors(int n){

        for (int i = 1; i <= n/2 ; i++) {
            if(n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.print(n);
    }
}
