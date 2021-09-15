package com.mani.StringsAndStringBuilder;

public class PrettyPrinting {

    public static void main(String[] args) {
        float a = 455.4283f;

        System.out.printf("Formatted number is %.2f ", a);
        System.out.println();

        System.out.println(Math.PI);
        System.out.printf("%.2f ",Math.PI);

        String name = "Manish Kumar Kasera";
        System.out.printf("Hello My Name is %s ans I am %s",name,"Student");
    }
}
