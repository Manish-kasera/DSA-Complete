package com.mani.BinarySearch;


// https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class SmallestLetter {
    public static void main(String[] args) {
        char[] arr ={'c','f','j'};
        char target = 'c' ;
        smallestLetter(arr,target);
    }

    public static char smallestLetter(char[] letters, char target) {

        int start = 0, end = letters.length - 1;
        int mid;
        while (start <= end) {
            mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
            return letters[start % letters.length];

    }

}
