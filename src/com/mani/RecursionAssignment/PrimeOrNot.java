package com.mani.RecursionAssignment;

// https://www.geeksforgeeks.org/recursive-program-prime-number/
public class PrimeOrNot {
    public static void main(String[] args) {
//        System.out.println(isPrime(15));
        System.out.println(isPrimeRec(3));
    }

    public static boolean isPrimeRec(int num) {

        return helper(num,2);
    }
    static boolean helper(int num,int i){
        if(i*i > num){
            return true;
        }

        if(i*i<= num && num % i == 0){
            return false;
        }else{
            return helper(num,i+1);
        }

    }

    public static boolean isPrime(int num) {
        for (int i = 2; i * i <= num ; i++) {
            if(num % i ==0){
                return false;
            }
        }
        return true;
    }
}
