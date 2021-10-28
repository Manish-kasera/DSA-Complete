package com.mani.StringAssignment;

public class RemoveA {
    public static void main(String[] args) {

        String str = "aaaaaaaaaaaaaaaaaaaaababble";
//        System.out.println(countA(str));

        System.out.println(removeA(str));
    }

    public static String removeA(String str){
        // babbac ---> bbbc

        StringBuilder builder = new StringBuilder();
        builder.append(str);

        int start = 0;
       String  ans = String.valueOf(helper1(builder,start));
       return ans;
    }

    public static StringBuilder helper1(StringBuilder builder,int start) {

        // babbac --> babbac
        if(start >= builder.length()){
            return builder;
        }

        if(builder.charAt(start) == 'a'){
            builder.deleteCharAt(start);
            return helper1(builder,start);
        }

        return helper1(builder,start+1);
    }

    public static int countA(String str){

        // baccad  ----> 2
        int count=0;
        int start = 0;

        StringBuilder build = new StringBuilder();
        build.append(str);
        int ans = helper(build,start,count);

        return ans;
    }

    public static int helper(StringBuilder build, int start,int count) {

        if(build.length() == 0){
            return count;
        }
        if(build.charAt(start) == 'a'){
            count++;
        }
        build.deleteCharAt(0);

        return helper(build,start,count);
    }
}
