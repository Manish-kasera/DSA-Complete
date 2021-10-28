package com.mani.Recursion.string;

public class RemoveA {
    public static void main(String[] args) {
       String up = "baccad";
        String p = "";
//
        remove(p,up);
//        System.out.println(remove2(up));

        //System.out.println(skipApple("bacanbappleddf"));

//        System.out.println(skipAppNotApple("bacanbappleddf"));
//        System.out.println(skipAppNotApple("bacanbappddf"));
    }

    static  void remove(String p,String up){

        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
       // p --> ""   un--->"baccad"

        char ch = up.charAt(0);
        if (ch == 'a') {
            remove(p,up.substring(1));
        }else{
            remove(p+ch,up.substring(1));
        }
    }

    static  String remove2(String up){

        if(up.isEmpty()){
            return " ";
        }
        // p --> ""   un--->"baccad"

        char ch = up.charAt(0);
        if (ch == 'a') {
            return remove2(up.substring(1));
        }else{
            return ch + remove2(up.substring(1));
        }
    }


    static  String skipApple(String up){

        if(up.isEmpty()){
            return " ";
        }
        // p --> ""   un--->"baccad"

        if (up.startsWith("apple")) {
            return skipApple(up.substring(5));
        }else{
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

    static  String skipAppNotApple(String up){

        if(up.isEmpty()){
            return " ";
        }
        // p --> ""   un--->"baccad"

        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipAppNotApple(up.substring(3));
        }else{
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }
}
