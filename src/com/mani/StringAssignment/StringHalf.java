package com.mani.StringAssignment;

// https://leetcode.com/problems/determine-if-string-halves-are-alike/
class StringHalf {
    public static void main(String[] args) {
        System.out.println(halvesAreAlike("MerryChristmas"));
    }

    public static boolean halvesAreAlike(String s) {
        int half = s.length()/2;
        String a = s.substring(0,half);
        String b = s.substring(half,s.length());

        int x = countVowel(a);
        int y = countVowel(b);

        return x==y;

    }

    public static int countVowel(String s) {

        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c=='a' || c == 'e' || c == 'i'|| c=='o' || c == 'u' || c=='A' || c == 'E' || c == 'I'|| c=='O' || c == 'U'  ){
                count++;
            }
        }
        return count;
    }
}