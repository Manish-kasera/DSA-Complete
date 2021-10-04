package com.mani.Recursion;

public class DigitPro {
    public static void main(String[] args) {
        int ans = digPro(523);
        System.out.println(ans);
    }

    public static int digPro(int num) {
        if(num % 10 == num){
            return num;
        }

        return (num % 10) * digPro(num/10);
    }
}
