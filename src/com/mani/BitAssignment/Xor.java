package com.mani.BitAssignment;
// https://leetcode.com/problems/xor-operation-in-an-array/
class Xor {

    public static void main(String[] args) {
        System.out.println(xorOperation(10,5));
    }

    public static int xorOperation(int n, int start) {
        int i = 1;
        int ans = start;

        while(i < n){
            ans ^= (start + 2 * i);
            i++;
        }
        return ans;
    }
}