package com.mani.ArrayAssignment;

import java.util.Arrays;

class HighestAltitude {

    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};

        System.out.println(largestAltitude(gain));
    }
    public static int largestAltitude(int[] gain) {

        int[] height = new int[gain.length + 1];

        height[0] = 0;

        for (int i = 0; i < gain.length; i++) {
            height[i+1] = height[i] + gain[i];
        }
        int max = 0;
        for (int i = 0; i < height.length ; i++) {
            max = Math.max(max,height[i]);
        }

        return max;
    }
}