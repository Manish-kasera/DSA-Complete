package com.mani.Maths;

public class GoodArray {
    public static void main(String[] args) {
        int[] arr ={3,6};
        System.out.println(isGoodArray(arr));
    }


    public static boolean isGoodArray(int[] nums) {

        int x = nums[0];

        for (int i = 1; i < nums.length ; i++) {
             x = gcd(x,nums[i]);
        }
        return x == 1;
    }


    public static int gcd(int a, int b) {
       if(a == 0){
           return b;
       }
       return gcd(b % a,a);
    }

}
