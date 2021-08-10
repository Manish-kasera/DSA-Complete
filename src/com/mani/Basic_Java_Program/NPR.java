package com.mani;

import java.util.Scanner;

public class NPR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int R = input.nextInt();

        int ans;
        ans = fact(N) / fact(N - R);
        System.out.println(ans);

    }

    public static int fact(int n) {
        int fac=1;
        for(int i=1;i<=n;i++){
            fac*=i;
        }
        return fac;
    }
}


