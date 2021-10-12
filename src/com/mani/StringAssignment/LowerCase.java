package com.mani.StringAssignment;

class LowerCase {
    public static void main(String[] args) {
        System.out.println(toLowerCase("Hello"));
    }
    public static String toLowerCase(String s) {

        StringBuilder build = new StringBuilder();

        for (int i = 0; i < s.length() ; i++) {
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                build.append((char) (s.charAt(i)+32));
            }else {
                build.append(s.charAt(i));
            }
        }
        return String.valueOf(build);
    }
}