package com.mani.MathsAssignment;

// https://leetcode.com/problems/count-primes/
class CountPrime {

    public static void main(String[] args) {
        System.out.println(countPrimes(0));
    }

    public static int countPrimes(int n) {

         boolean[] ans = new boolean[n];

         if(n == 1 || n == 0)
             return 0;

        for (int i = 2; i * i <= n ; i++) {
            if(!ans[i]){
                for (int j = i * 2; j < n ; j=j+i) {
                    ans[j] = true;
                }
            }
        }

        int count=0;
        for (int i = 2; i < n ; i++) {
            if(!ans[i]){
                count++;
            }
        }
        return count;
    }
}