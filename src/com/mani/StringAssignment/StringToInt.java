package com.mani.StringAssignment;

public class StringToInt {
    public static void main(String[] args) {
         String s = "353";
         int ans = stringToInt(s);
        System.out.println(ans);
    }

    public static int stringToInt(String s) {

        int i = 0;
        int num = 0;
        boolean isNeg = false;

        // Check for (-)ve number
        if(s.charAt(0) == '-'){
            isNeg = true;
            i++;
        }

        while(i < s.length()){
            num *= 10;
            num += s.charAt(i++) - '0'; // Minus the ASCII code of '0' to get the value of the charAt(i++)
        }

        if(isNeg){
            num = -num;
        }
        return num;
    }
}
