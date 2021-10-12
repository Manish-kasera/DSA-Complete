package com.mani.SearchingAssignment;

class ArrangingCoins {

    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
    }
    public static int arrangeCoins(int n) {

        int count = -1,i=1;
        while(n >= 0 ){
            n -= i;
            count++;
            i++;
        }
        return count;
    }
}