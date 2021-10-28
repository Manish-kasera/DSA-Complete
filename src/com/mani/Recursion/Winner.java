package com.mani.Recursion;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-the-winner-of-the-circular-game/

//JOSEPH PROBLEM
class Winner {

    public static void main(String[] args) {
        System.out.println(findTheWinner(6,3));
    }

    public static int findTheWinner(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <n ; i++) {
            list.add(i+1);
        }
        return helper(list,k,0);
    }

    public static int helper(List<Integer> list, int k,int index) {

        if(list.size() == 1){
            return list.get(0);
        }

        index = index + k - 1;
        while (index >= list.size()){
            index = index - list.size();
        }


        list.remove(index);

        return helper(list,k, index);
    }
}