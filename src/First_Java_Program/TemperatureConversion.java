package First_Java_Program;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter temp in C : ");

        float tempC = input.nextFloat();
        float tempF = (tempC * 9/5)+32;
        System.out.println(tempF);

    }
}
