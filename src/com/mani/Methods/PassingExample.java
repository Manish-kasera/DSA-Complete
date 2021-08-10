package com.mani.Methods;

import static com.mani.Methods.Swap.changeName;

public class PassingExample {
    public static void main(String[] args) {
        String chacha = "Iron Men";
        greet(chacha);
    }

    static void greet(String naam) {
      System.out.println(naam);
    }


}
