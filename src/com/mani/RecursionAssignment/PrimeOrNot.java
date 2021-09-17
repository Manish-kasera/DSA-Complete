package com.mani.RecursionAssignment;

// https://www.geeksforgeeks.org/recursive-program-prime-number/
public class PrimeOrNot {

    public static void main(String[] args) {
        System.out.println(isPrime(5,2));
    }

    public static boolean isPrime(int n,int i) {

        if(n <= 2){
            return n == 2;
        }

        if(n % i == 0){
            return false;
        }
        if( i*i > n){
            return true;
        }


        return isPrime(n,i+1);

    }

}
