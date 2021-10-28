package com.mani.Revision;

import java.util.Scanner;

// https://codingcompetitions.withgoogle.com/kickstart/round/000000000019ff49/000000000043adc7#problem
public class Retyoe {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int i=1;
        while(t > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int s = sc.nextInt();
            retype(n,k,s,i);
            i++;
            t--;
        }


    }

    public static void retype(int n,int k,int s,int i){

            // 10 5 2
            int restart = 0;
            int back = 0;

            restart = (k - 1) + n + 1;
            back = (k - 1) + (k - s) + (n - s) + 1;

            System.out.println("Case #"+i+": "+ Math.min(restart,back));

    }
}
