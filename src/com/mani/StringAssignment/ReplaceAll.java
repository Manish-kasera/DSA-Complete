package com.mani.StringAssignment;

// https://leetcode.com/problems/replace-all-digits-with-characters/
class ReplaceAll {

    public static void main(String[] args) {

        System.out.println(replaceDigits("a1b2c3d4e"));
        System.out.println(replaceDigits2("a1b2c3d4e"));
    }

    public static String replaceDigits(String s) {
        // a1b2c3d4e

      // Best Approach
        char[] charArray = s.toCharArray();
        for(int i = 1; i<charArray.length; i = i + 2) {
            charArray[i] = (char) (charArray[i - 1] + charArray[i] - '0');
        }
        return String.valueOf(charArray);
    }

    public static String replaceDigits2(String s) {
        // a1b2c3d4e

        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < s.length() ; i++) {
          if(i % 2 == 0){
              builder.append(s.charAt(i));
          }else{
              char c =(char) (s.charAt(i-1) + s.charAt(i) - '0');
              builder.append(c);
          }
        }

        return String.valueOf(builder);
    }
}