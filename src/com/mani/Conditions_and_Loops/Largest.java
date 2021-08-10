package com.mani.Conditions_and_Loops;


import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

//       int maxi = a;
//       if(b>maxi){
//           maxi = b;
//       }
//       if(c > maxi){
//           maxi = c;
//       }

//        System.out.println(maxi);

//        int max = 0;
//        if(a > b){
//            max = a;
//        }else{
//            max = b;
//        }
//
//        if(c > max){
//            max = c;
//        }
//        System.out.println(max);


        int max = Math.max(c,Math.max(a,b));
        System.out.println(max);
    }
}
