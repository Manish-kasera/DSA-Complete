package com.mani.Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayIntro {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] arr =  new int[3];
        int[] arr1 = {833,6,3,2,3};

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();

        System.out.println(Arrays.toString(arr));


    }
}
