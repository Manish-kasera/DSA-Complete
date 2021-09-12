package com.mani.SortingAssignment;

import java.util.Arrays;
// https://leetcode.com/problems/largest-perimeter-triangle/
public class LargestPerimeter {
    public static void main(String[] args) {
        int[] arr = {3,6,3,2};
        System.out.println(largestPerimeter(arr));
    }

    static int largestPerimeter(int[] nums) {

        int ans = 0;

        // Suppose our three side are : a,b,c
        // a + b > c, b + c > a, a + c > b
        // then must a + b > c
        // We have to check only one condition a + b > c
        // Because a,b , c are in sorted order
        Arrays.sort(nums);

        for (int i = nums.length - 1; i >= 2 ; i--) {
            if(nums[i] < nums[i-1] + nums[i-2]) {
                ans = nums[i] + nums[i - 1] + nums[i - 2];
                break;
            }
        }

        return ans;
    }
}
