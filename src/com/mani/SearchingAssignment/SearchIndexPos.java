package com.mani.SearchingAssignment;

// https://leetcode.com/problems/search-insert-position/
class SearchIndexPos {

    public static void main(String[] args) {
        int[] nums = {1};
        int target = 0;
        System.out.println(searchInsert(nums,target));
    }

    public static int searchInsert(int[] nums, int target) {
        if(target  < nums[0])
            return 0;
        if (target > nums[nums.length - 1])
            return nums.length ;

        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if(nums[mid] == target){
                return mid;
            }else if(target > nums[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }
        return start;
    }
}