package com.mani.First_Java_Program_Assignment;

public class Armstrong {

    public static void main(String[] args) {
       int num = 371435;
        System.out.println(isArmstrong(num));
    }

    public static boolean isArmstrong(int num) {
     int digit = (int) (Math.log(123)/Math.log(10)) + 1;
     int orgNum = num;
     int sum = 0;
     while (num != 0){
         int temp = num % 10;
         sum += Math.pow(temp,digit);
         num /= 10;
     }
     return sum == orgNum;
    }
}
