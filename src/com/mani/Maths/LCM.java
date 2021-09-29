package com.mani.Maths;

public class LCM {
    public static void main(String[] args) {
        System.out.println(lcm(3,7));
    }

    public  static  int lcm(int a,int b){
        int maxi = Math.max(a,b);

        if(maxi % a == 0 &&  maxi % b == 0){
            return maxi;
        }
        return a * b;
    }
}
