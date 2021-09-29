package com.mani.MathsAssignment;

class PowN {

    public static void main(String[] args) {
        System.out.println(myPow(2.00000,10));
    }

    public static double myPow(double x, int n) {
          double ans = Math.pow(x,n);
          return ans;
    }
}