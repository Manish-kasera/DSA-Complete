package com.mani.ArrayAssignment;

import java.util.Arrays;
import java.util.HashMap;

class TwoSum {

    public static void main(String[] args) {
        int[] arr = {1,3,8,2};
        int target = 10;

        int[] ans = twoSum(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] twoSum(int[] nums, int target) {

        HashMap <Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if(map.containsKey(target - nums[i])){
                return new int[] {i,map.get(target - nums[i])};

            }else{
                map.put(nums[i],i);
            }

        }
        return new int[] {-1,-1};
    }


    public static int[] twoSum1(int[] nums, int target) {
        
       
        for(int i=0;i<nums.length;i++){
            
            for(int j=0;j<nums.length;j++){
                
                if(i != j){
                    
                    if(nums[i]+ nums[j] == target){
                        return new int[] {i,j};
                    }
                }
            }
        }
        
      return new int[]{-1,-1};
    }
    
}