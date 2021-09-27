package com.mani.MathsAssignment;
// https://leetcode.com/problems/divide-two-integers/
class Divide {
    public static void main(String[] args) {
        System.out.println(divide(-1,1));
    }
    public static int divide(int dividend, int divisor) {

        if(dividend == 0 || divisor == 0){
            return 0;
        }

        int negC = 0;
        if(dividend < 0){
            dividend *= -1;
            negC++;
        }
        boolean neg = false;
        if(divisor < 0){
            neg = true;
            divisor *= -1;
            negC++;
        }

        int count = 0 ;
        int i = 1;
        while(dividend >= divisor * i){
            count++;
            i++;
        }

        if(count > Integer.MAX_VALUE || count < Integer.MIN_VALUE) return (int) (Math.pow(2, -31) - 1);

        if(negC % 2 != 0){
            return count*(-1);
        }
        return count;

    }
}