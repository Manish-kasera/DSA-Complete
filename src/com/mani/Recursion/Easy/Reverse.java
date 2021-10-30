package com.mani.Recursion.Easy;

public class Reverse {

    static int sum = 0;

    public static void rev1(int num){
       if(num == 0){
           return;
       }
        int rem = num % 10;
        sum = sum * 10 + rem;
        rev1(num /= 10);
    }

    public static int rev2(int num){
      // sometimes you might need some additional variable in the argument
        // in that case make helper function

        int digits =(int) (Math.log10(num)) + 1;
        return helper(num,digits);

    }

    public static int helper(int num, int digits) {
       if(num < 10){
           return num;
       }
       int rem = num % 10;
       return (int) (rem * Math.pow(10,digits-1)+helper(num/=10,digits-1));
    }


    public static void main(String[] args) {
        int num = 2431;
//        rev1(num);
//        System.out.println(sum);

        System.out.println(rev2(num));
    }


}
