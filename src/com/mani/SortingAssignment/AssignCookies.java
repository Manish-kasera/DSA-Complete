package com.mani.SortingAssignment;

import java.util.Arrays;

//https://leetcode.com/problems/assign-cookies/
class AssignCookies {

    public static void main(String[] args) {
       int[] g = {10,9,8,7};
       int[] s = {5,6,7,8};
        System.out.println(findContentChildren(g,s));
    }
    public static int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g);
        Arrays.sort(s);
        int i = 0, j = 0,count = 0;

        while(i<g.length && j<s.length){
            if(g[i]<= s[j]){
                i++;
                j++;
                count++;
            }else{
                j++;
            }
        }
        return count;
    }
}