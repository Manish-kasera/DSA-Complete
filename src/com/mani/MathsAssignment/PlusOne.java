package com.mani.MathsAssignment;

import java.util.ArrayList;
import java.util.Arrays;

// https://leetcode.com/problems/plus-one/
class PlusOne {
    public static void main(String[] args) {
        int[] digits ={9,9};

        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {
        StringBuilder s = new StringBuilder();

        for (int i : digits)
        {
            s.append(i);
        }

        int num = Integer.parseInt(s.toString());
        num += 1;
//        System.out.println(num);

        int temp = num;

        ArrayList<Integer> array = new ArrayList<Integer>();
        while(temp != 0){
            array.add(temp % 10);
            temp /= 10;
        }


        int[] ans = new int[array.size()];

        for(int i = 0; i < array.size();i++){
            ans[i] = array.get(array.size() - i-1);
        }
        return ans;
     }
}