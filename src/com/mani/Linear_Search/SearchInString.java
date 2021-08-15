package com.mani.Linear_Search;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {

        String name = "Kunal Kushwaha";
        char target ='e';

//        boolean ans = search(name,target);
//        System.out.println(ans);

//        System.out.println(Arrays.toString(name.toCharArray()));
        boolean ans2 = search2(name,target);
        System.out.println(ans2);

    }

    static boolean search2(String str,char target){

        if(str.length() == 0){
            return false;
        }

//        for (int i = 0; i < str.length() ; i++) {
//            if(target == str.charAt(i)){
//                return true;
//            }
//        }

       for(char ch : str.toCharArray()){
           if(ch == target){
               return true;
           }
       }


        return false;
    }

    static boolean search(String str,char target){

        if(str.length() == 0){
            return false;
        }

        for (int i = 0; i < str.length() ; i++) {
            if(target == str.charAt(i)){
                return true;
            }
        }

      return false;
    }
}
