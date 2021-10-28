package com.mani.RecursionAssignment;
// https://www.hackerrank.com/challenges/the-power-sum/problem


public class PowSum {

    public static void main(String[] args) {

        int x = 100, n=3;
        System.out.println(powSum(x,n));
    }

    public static int powSum(int x,int n){

        return powd(x,n,0);
    }

    private static int powd(int x, int n, int i) {
        x = x -(int) Math.pow(i,n);
        if(x == 0){
            return 1;
        }
        if(x > 0){
            int sum = 0;
            for (int j = i + 1; Math.pow(j,n) <=x ; j++) {
                sum += powd(x,n,j);
            }
            return sum;
        }else{
            return 0;
        }
    }
}
