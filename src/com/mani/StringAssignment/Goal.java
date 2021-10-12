package com.mani.StringAssignment;

import java.util.Stack;

// https://leetcode.com/problems/goal-parser-interpretation/
public class Goal {

    public static void main(String[] args) {
        String ans = interpret("G()(al)");
        System.out.println(ans);
    }

    public static String interpret(String command) {
      // G()
        String a = command.replace("()","o");
        String b = a.replace("(al)","al");

        return b;


    }
}
