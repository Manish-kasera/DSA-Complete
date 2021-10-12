package com.mani.StringAssignment;

class ValidPalindrome {
    public static void main(String[] args) {
        String s = "0P";
        System.out.println(isPalindrome(s));
    }
    public static boolean isPalindrome(String s) {

        StringBuilder build = new StringBuilder();

        for (int i = 0; i < s.length() ; i++) {
            char c = s.charAt(i);
            if((c >= 'a' && c <= 'z')|| (c >= 'A' && c <= 'Z')  || (c >= '0' && c<= '9')) {
                build.append(s.charAt(i));
            }
        }
        s = String.valueOf(build);
        build = new StringBuilder(s.toLowerCase());
        return Palin(build);
    }

    public static boolean Palin(StringBuilder build) {

        int start = 0;
        int end = build.length()-1;

        while(start <= end){
            if(build.charAt(start) != build.charAt(end)){
                return false;
            }else{
                start++;
                end--;
            }
        }
        return true;
    }
}