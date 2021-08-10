package com.mani.Methods;

import static com.mani.Methods.ArmstrongNumber.IsArmstrong;
// Importing IsArmstrong method from ArmstrongNumber file

public class Armstrong3Digits {
    public static void main(String[] args) {

        // Print all 3-digits Armstrong NUmber

        for (int i = 100; i <= 999 ; i++) {
            if(IsArmstrong(i)) // Providing this Functanlity from IsArmstrong(my program)
                System.out.println(i);
        }

    }
}
