package com.mani.ArrayAssignment;

import java.util.Arrays;

class Temp {
    public static void main(String[] args) {

        int[] arr={90};
        System.out.println(Arrays.toString(dailyTemperatures(arr)));
    }

    public static int[] dailyTemperatures(int[] temperatures) {
        // 73,74,75,71,69,72,76,73

        int[] ans = new int[temperatures.length];

        for(int i = 0;i < temperatures.length - 1;i++){
            int far = 0;
            for (int j = i+1; j < temperatures.length ; j++) {
                ans[i] = far;
                if(temperatures[i] < temperatures[j]){
                    far = j - i;
                    ans[i] = far;
                    break;
                }
            }
        }
        // for the last element
        ans[ans.length-1] = 0;
        return ans;
    }
}