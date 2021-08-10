package com.mani.First_Java_Program_Assignment;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name = input.nextLine();
        System.out.println("Good Morning "+name);

    }
}
