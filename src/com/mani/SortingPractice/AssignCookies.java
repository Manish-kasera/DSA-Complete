package com.mani.SortingPractice;

import static java.lang.Math.min;

// https://leetcode.com/problems/assign-cookies/
public class AssignCookies {
    public static void main(String[] args) {

        int[] g = {1,2,3};
        int[] s = {1,1};

        int ans = findContentChildren(g,s);
        System.out.println(ans);
    }

    static int findContentChildren(int[] g, int[] s) {
       int ans = 1 ;
       int loop = min(g.length,s.length);
        for (int i = 0; i < loop; i++) {
            for (int j = 0; j <loop  ; j++) {
                if(s[j] >= g[i]){
                    ans = s[i];
                }
            }
        }

        return  ans;
    }
}
