package com.mani.RecursionAssignment;

// https://www.geeksforgeeks.org/product-2-numbers-using-recursion/
public class Product {

    public static void main(String[] args) {

        System.out.println(prod(2,5));
    }

    public static int prod(int x,int y){

        if( x== 0 || y==0){
            return 0;
        }
        if(x < y){
            int temp = x;
            x = y;
            y = temp;
        }
        return ((x * 1) + prod(x,y-1));
    }
}
