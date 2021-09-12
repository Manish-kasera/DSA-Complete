package com.mani.SortingAssignment;

import java.util.HashMap;
import java.util.Map;

class IncreasingFrequency {
    public static void main(String[] args) {
       int[] nums = {10, 34, 5, 10, 3, 5, 10};
       frequencySort(nums);
    }

    public static void frequencySort(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums)
        {
            if(map.containsKey(i))
            {
                int temp = map.get(i);
                map.put(i, temp+1);
            }
            else
            {
                map.put(i, 1);
            }
        }

        System.out.println(map);
    }
}