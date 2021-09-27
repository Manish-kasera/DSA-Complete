package com.mani.Maths;

public class Prime {
    public static void main(String[] args) {

        System.out.println(isPrime1(12));

        System.out.println(isPrime2(11));

        System.out.println(isPrime3(11));

    }

    public static boolean isPrime3(int num) {

        if(num <= 1){
            return false;
        }

        int c = 2;
        while(c*c<=num){
            if(num % c == 0){
                return false;
            }
            c++;
        }
        return true;
    }

    public static boolean isPrime2(int num) {

        if(num <= 1){
            return false;
        }

        for (int i = 2; i <= num/2 ; i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean isPrime1(int num) {

        if(num <= 1){
            return false;
        }

        for (int i = 2; i < num ; i++) {
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
