package com.mani.SortingAssignment;


public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {7,8,9,10,11,12};

        int ans = firstMissing(nums);
        System.out.println(ans);
    }

    public static int firstMissing(int[] nums) {

        int i = 0;

        while (i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] > 0  && nums[i] != nums[correct]  && nums[i] <= nums.length) {
               swap(nums,i,correct);
            }else{
                i++;
            }

        }

        for (int index = 0; index < nums.length; index++) {
            if(nums[index] != index + 1){
                return (index + 1);
            }
        }

        return nums.length + 1;
    }

    static void swap(int[] nums, int i, int correct) {
        int temp = nums[i];
        nums[i] = nums[correct];
        nums[correct] = temp;
    }
}
