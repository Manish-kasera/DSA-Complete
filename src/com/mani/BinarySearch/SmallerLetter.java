package com.mani.BinarySearch;

// https://leetcode.com/problems/find-smallest-letter-greater-than-target/

public class SmallerLetter {
    public static void main(String[] args) {

        char[] letters = {'c', 'f', 'j'};
        char target = 'k';
        char ans = nextGreatestLetter(letters,target);
        System.out.println(ans);
    }

    static char nextGreatestLetter(char[] letters, char target) {

        int start = 0,end = letters.length -1;
        int mid;

        while(start <= end){

             mid = start + (end - start)/2;
            if(target > letters[mid]){
                start = mid +1;
            }else{
                end = mid - 1;
            }

        }
        //if start reaches to end than it must wrap around and return arr[0
//        if(start == letters .length ){
//            return letters[0];
//        }

     // Simply  while loop violated condition
//        return letters[start];

        return letters[start % letters.length];
    }
}