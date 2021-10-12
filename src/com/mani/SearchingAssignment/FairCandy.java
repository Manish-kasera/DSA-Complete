package com.mani.SearchingAssignment;

import java.util.Arrays;

class FairCandy {
    public static void main(String[] args) {

        int[] aliceSizes = {1,2,5};
        int[] bobSizes = {2,4};
        System.out.println(Arrays.toString(fairCandySwap(aliceSizes,bobSizes)));

    }
    public static int[] fairCandySwap(int[] A, int[] B) {
        int sum_a=0,sum_b=0;
        for(int i=0;i<A.length;i++)
        {
            sum_a+=A[i];
        }
        for(int i=0;i<B.length;i++)
        {
            sum_b+=B[i];
        }
        int target=(sum_a-sum_b)/2;
        int[] res=new int[2];
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<B.length;j++)
            {
                if(A[i] ==B[j] + target)
                {
                    res[0]=A[i];
                    res[1]=B[j];
                }
            }
        }
        return res;


    }
}