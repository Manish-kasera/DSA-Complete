package com.mani.RecursionAssignment;
// https://www.geeksforgeeks.org/sum-digit-number-using-recursion/
public class DigSum {

    public static void main(String[] args) {
       int num = 45632;
        System.out.println(sumDig(num));
    }

    public static  int sumDig(int num){
        if(num > 0 &&  num < 9){
            return num;
        }

        return num % 10 + sumDig(num /= 10);
    }

}
