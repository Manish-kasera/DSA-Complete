package com.mani.MathsAssignment;

// https://leetcode.com/problems/ugly-number-iii/
class Ugly3 {

    public static void main(String[] args) {
        int n = 7, a = 2, b = 3, c = 4;
//        System.out.println("mans");

        System.out.println(nthUglyNumber(n,a,b,c));
    }

    public static int nthUglyNumber(int num, int a, int b, int c) {

        int count = 1;
        while( num != 0){
            if(isUgly(count,a,b,c)){
               num--;
               count++;
            }else{
                count++;
            }
        }
        return count-1;
    }
    public static boolean isUgly(int num,int a,int b,int c) {

        int small = Math.min(a,Math.min(b,c));

        if(num < small){
            return false;
        }
        while(num >= small){
            if(num % a == 0){

                num = num/a;
            }
            else if(num % b == 0){
                num = num/b;
            }
            else if(num % c == 0){
                num = num/c;
            }else{
                return false;
            }
        }
        return true;
    }
}