package com.mani.Intermediate_Java_Program;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        System.out.println("Enter number of Subjects");
        int num = in.nextInt();
        int sub = num;
        int total = 0;
        while(num!=0){
            int marks = in.nextInt();
            total += marks;
            num--;
        }
        float avg = total/sub;
        System.out.println(avg);
    }
}
