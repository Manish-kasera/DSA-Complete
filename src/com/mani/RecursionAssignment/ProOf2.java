package com.mani.RecursionAssignment;

// https://www.geeksforgeeks.org/product-2-numbers-using-recursion/
public class ProOf2 {
    public static void main(String[] args) {
        int a = 15,b = 20;
        System.out.println(pro(a,b));
    }

    public static int pro(int x, int y) {

        if(x < y){
            int t = x;
            x = y;
            y = t;
        }
        if(x == 0 || y == 0){
            return 0;
        }

       return x + pro(x,y-1);
    }
}
