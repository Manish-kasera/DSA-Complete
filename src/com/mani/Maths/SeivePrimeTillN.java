package com.mani.Maths;

import java.util.Arrays;

public class SeivePrimeTillN {
    public static void main(String[] args) {

        int n = 37;
        sieve(n);
    }

    // false in array means number is prime
    static  void sieve(int n){

        // default all boolean variable are false
        boolean[] prime = new boolean[n+1];

        for (int i = 2; i * i <= n ; i++) {

            if(!prime[i]){
                //all multiples of the prime number are not primes
                for (int j = i * 2; j <= n ; j=j+i) {
                    prime[j] = true;
                }
            }
        }


        for (int i = 2; i <= n ; i++) {
            if(!prime[i]) {
                System.out.print(i+" ");
            }
        }
    }
}
