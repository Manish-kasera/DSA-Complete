package com.mani.Recursion;

public class Reverse {

    static int sum = 0;

    public  static void rev1(int num){
        if(num == 0){
            return;
        }
        int rem = num % 10;
        sum = sum * 10 + rem;
        rev1(num/10);
    }

    public  static void rev2(int num){

        int sum = 0;
        helper(num,sum);

    }

    public static void helper(int num, int sum) {
        if(num == 0){
            return;
        }

       int last = num % 10;
       sum = sum * 10 + last;
       helper(num/10,sum);
    }

    public static void main(String[] args) {
/*
        int ans = rev(123);
        System.out.println(ans);
        rev1(1348);
        System.out.println(sum);
*/

        rev2(735);

    }

    public static int rev(int num) {

        int rev = 0;
        while(num != 0){
            int last = num % 10;
            rev = rev * 10 + last;
            num /= 10;
        }
        return rev;
    }




}
