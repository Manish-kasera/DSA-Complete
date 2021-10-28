package com.mani.Revision;

import java.util.Scanner;

public class BoringNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i = 1;
        while(t > 0){
            int l = sc.nextInt();
            int r = sc.nextInt();
            boring(l,r,i);
             i++;
             t--;
        }
    }

    public static void boring(int l, int r,int i) {
     int count = 0;
     while(l < r){

         l++;
     }
     System.out.println("Case #"+i+": "+ count);


    }
}
