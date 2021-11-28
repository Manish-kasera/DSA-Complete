package com.mani.InterviewLeetcode;

import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.Set;

// https://leetcode.com/problems/happy-number/
public class HappyNumber {

    public static void main(String[] args) {
       int n = 19;
        System.out.println(isHappy(n));
    }

    static boolean  isHappy(int n) {

        Set<Integer> s = new HashSet<>();

        while(n !=  1){
            if(s.contains(n)){
              return false;
            }
            int sum = 0;
            s.add(n);

            while(n > 0){
                int rem = n % 10;
                sum += (rem * rem);
                n /= 10;
            }
            n = sum;
        }


        return true;
    }
}
