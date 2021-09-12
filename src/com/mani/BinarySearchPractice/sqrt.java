package com.mani.BinarySearchPractice;

public class sqrt {
    public static void main(String[] args) {
//        System.out.println(mySqrt(18));


        System.out.println(mySqrt2(8));
    }
    static int mySqrt(int x) {

        if(x == 1){
            return 1;
        }

        int ans = 0;
        for(int i=0;i <= x/2;i++){
            if(x >= i*i){
                ans = i;
            }
        }
        return ans;
    }

     static int mySqrt2(int x) {

        if(x <= 1){
            return x;
        }

        int start = 1,end = x/2;

        int mid;
        while(start <= end){

            mid = (start + (end - start)/2 ) ;
            int div = x / mid;
            if(div == mid){
                return mid;
            }else if(div > mid){
                start = mid + 1 ;
            }else{
                end = mid -1;
            }
        }
        return start;
    }
}
