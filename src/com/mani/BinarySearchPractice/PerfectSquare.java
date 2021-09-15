package com.mani.BinarySearchPractice;

// https://leetcode.com/problems/valid-perfect-square/

class PerfectSquare {
    public static void main(String[] args) {

        System.out.println(isPerfectSquare(3));
    }

    public static boolean isPerfectSquare(int num) {
           if (num == 1) return true;

           int start = 0;
           int end = num;

           while(start <= end){

               int mid = start + (end - start)/2;

               if(mid == num/mid  && num % mid == 0)
                    return true;
               else if(mid > num/mid){
                   end = mid -1;
               }else{
                   start = mid + 1;
               }
           }
           return false;
    }

    public static boolean isPerfectSquare1(int num) {
        return Math.sqrt(num) % 1 == 0;
    }

}