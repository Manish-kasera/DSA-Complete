package com.mani.ArrayAssignment;

// https://leetcode.com/problems/boats-to-save-people/

import java.util.Arrays;

class BoatProblem {
    public static void main(String[] args) {
        int[] people ={2,2,2};
        int limit = 6;
        System.out.println(numRescueBoats(people,limit));
    }

    public static int numRescueBoats(int[] people, int limit) {

        int count = 0;
        Arrays.sort(people);
        // 3 3 5 4
        int start=0,end = people.length - 1;

        while(people[end] >= limit){
            count++;
            end--;
        }

        while(start <= end){
           if(limit - people[end] >= people[start]){
               start++;
               end--;
               count++;
           }else if(people[end] < limit){
               count++;
               end--;
           }
        }
       return count;
    }
}