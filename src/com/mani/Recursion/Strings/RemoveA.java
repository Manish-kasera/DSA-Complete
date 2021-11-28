package com.mani.Recursion.Strings;

public class RemoveA {
    public static void main(String[] args) {
        String up = "baccad";
        String p = "";
        System.out.println(removeA(up,p));

        System.out.println(removeA2(up));

        System.out.println(countA(up,0));

    }


    public static int countA(String up, int count) {

        if(up.isEmpty()){
            return count;
        }

        char c = up.charAt(0);

        if(c == 'a'){
            return countA(up.substring(1,up.length()),count+1);
        }else{
            return countA(up.substring(1,up.length()),count);

        }
    }

    public static String removeA(String up,String p) {

        if(up.isEmpty()){
            return p;
        }

        char c = up.charAt(0);

        if(c == 'a'){
            return removeA(up.substring(1,up.length()),p);
        }else{
            return removeA(up.substring(1,up.length()),p+c);
        }
    }


    public static String removeA2(String up) {

        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            return removeA2(up.substring(1));
        }else{
            return ch + removeA2(up.substring(1));
        }
    }
}
