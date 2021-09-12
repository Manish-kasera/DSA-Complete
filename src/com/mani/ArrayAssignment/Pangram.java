package com.mani.ArrayAssignment;

import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.Set;


class Pangram {
    public static void main(String[] args) {
        String sentence = "leetcide";

        System.out.println(checkIfPangram(sentence));
    }
    public static boolean checkIfPangram(String sentence) {

        Set <Character> sen = new HashSet<>();

        for (int i = 0; i < sentence.length(); i++) {
            sen.add(sentence.charAt(i));
        }

       return  sen.size() == 26;
    }
}