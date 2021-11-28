package com.mani.RecursionAssignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MinAmazon {
    public static void main(String[] args) {
        int num = 3421;
        System.out.println(minSum(num));
    }

    private static int minSum(int num) {

        ArrayList <Integer> arr = new ArrayList<>();
        while (num != 0) {
           arr.add(num%10);
           num /= 10;
        }
        Collections.sort(arr);
        System.out.println(arr);

        int first = 0,second = 0;
        for (int i = 0; i < arr.size() ; i++) {
            if(i % 2 == 0){
                first = first * 10 + arr.get(i);
            }else{
                second = second * 10 + arr.get(i);
            }
        }
        return first+second;
    }
}
