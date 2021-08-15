package com.mani.Function_Assignment;

public class MaxMIn {
    public static void main(String[] args) {
        int a = 3510;
        int b = 1210;
        int c = 830;

        int max = maxi(a,b,c);
        int min = mini(a,b,c);
        System.out.println(max);
        System.out.println(min);
    }

    static int maxi(int a, int b, int c) {
/*
        int max = 0;
        if(a>b){
            max = a;
        }else{
            max = b;
        }

        if(max > c){
            max = max;
        }else{
            max = c;
        }
        return max;

*/
        int max = Math.max(Math.max(a,b),c);
        return max;

    }

     static int mini(int a, int b, int c) {
/*
          int min = 0;

          if(a > b){
              min = b;
          }else{
              min = a;
          }

          if(min < c){
              min = min;
          }else{
              min = c;
          }
          return min;
*/

         int min =  Math.min(Math.min(a,b),c);
         return  min;
     }
}
