package com.mani.Maths;

public class SquareRoot {
    public static void main(String[] args) {

        System.out.println(squareRoot(40));
    }

    public static int squareRoot(int num){

        int start = 0,end = num,root=0;
        while(start<= end){

            int mid = start + (end-start)/2;
            if(mid * mid == num){
                root = mid;
                return mid;
            }
            if(num > mid * mid){
                start = mid +1;
            }else{
                end = mid - 1;
            }
        }
       return root;
    }
}
