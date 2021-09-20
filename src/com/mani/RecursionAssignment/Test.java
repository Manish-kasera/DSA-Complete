package com.mani.RecursionAssignment;

import javax.security.sasl.SaslClient;
import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int n = in.nextInt();

        int count=1;
        while(n>= x){
            x *= count;
            count++;
        }
        System.out.println(count-1);
    }
}
