package com.mani.Maths;

import java.util.ArrayList;

public class FactorsOpti2 {
    public static void main(String[] args) {
      factors(36);

      factors2(36);
    }

    // O (sqrt(n)
    public static  void factors(int n){

        for (int i = 1; i * i <= n ; i++) {
            if(n % i == 0){

                if(n / i == i){
                    System.out.print(i+" ");
                }else{
                    System.out.print(i + " " + n/i+ " ");

                }
            }
        }
        System.out.println();
    }

    // both Time space are going to be O(sqrt(n))

    public static  void factors2(int n){

        ArrayList <Integer> list = new ArrayList<>();

        for (int i = 1; i * i <= n ; i++) {
            if(n % i == 0){

                if(n / i == i){
                    System.out.print(i+" ");
                }else{
                    System.out.print(i + " ");
                   list.add(n/i);
                }
            }
        }
        for (int i = list.size()-1 ; i >=0 ; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
