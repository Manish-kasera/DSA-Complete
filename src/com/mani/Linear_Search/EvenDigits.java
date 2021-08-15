package com.mani.Linear_Search;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/#:~:text=Find%20Numbers%20with%20Even%20Number%20of%20Digits%20%2D%20LeetCode&text=Given%20an%20array%20nums%20of,(even%20number%20of%20digits).
public class EvenDigits {
    public static void main(String[] args) {

       int[] nums = {12,345,112,16,7896};
        int ans = findNumbers(nums);
        System.out.println(ans);
    }

     static int findNumbers(int[] nums) {
         int count = 0;

/*
        for (int i = 0; i < nums.length ; i++) {
            int c = 0;
            int temp = nums[i];

            while(temp != 0){
                temp /=10;
                c++;
            }
            if( c % 2 == 0)
                count++;
         }

*/
         for (int num : nums) {
             int c = 0;
             int temp = num;

             while(temp != 0){
                 temp /=10;
                 c++;
             }
             if( c % 2 == 0)
                 count++;
         }

         return count;
    }
}
