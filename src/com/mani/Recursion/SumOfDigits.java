package com.mani.Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        int ans = sumOfDig(10402);
        System.out.println(ans);
    }

    public static int sumOfDig(int num) {
        if(num == 0){
            return 0;
        }

        return (num % 10) + sumOfDig(num/10);
    }
}
