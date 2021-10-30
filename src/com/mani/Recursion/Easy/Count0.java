package com.mani.Recursion.Easy;

public class Count0 {
    public static void main(String[] args) {
        int num  = 3000204;
        System.out.println(count0(num));
     }

    public static int count0(int num) {

        int count = 0;
        return helper(num,count);

    }

    private static int helper(int num, int count) {
        if(num <= 9){
            return count;
        }

        int rem = num % 10;
        if(rem == 0){
           return helper(num/=10,count+1);
        }
        return helper(num /= 10,count);
    }
}
