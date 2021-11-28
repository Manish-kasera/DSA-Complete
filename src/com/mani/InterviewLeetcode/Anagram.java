package com.mani.InterviewLeetcode;

// https://leetcode.com/problems/valid-anagram/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Anagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("raert","tar"));
    }
    public static boolean isAnagram(String s, String t) {

       List<Character> l1 = new ArrayList<>();
       List<Character> l2 = new ArrayList<>();

        for(int i=0; i<s.length(); i++){
            l1.add(s.charAt(i));
        }

        for(int j=0; j<t.length(); j++){
            l2.add(t.charAt(j));
        }

        Collections.sort(l1);
        Collections.sort(l2);

        return l1.equals(l2);
    }
}
