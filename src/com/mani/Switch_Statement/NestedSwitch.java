package com.mani;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int empId = in.nextInt();
        String dep = in.next();

        switch (empId){
            case 1:
                System.out.println("Kunal");
                break;
            case 2:
                System.out.println("Manish");
                break;
            case 3:
                System.out.println("Emp number 3");
                switch (dep){

                    case "IT":
                        System.out.println("IT department");
                        break;
                    case "Management":
                        System.out.println("Management department");
                        break;
                    default:
                        System.out.println("Dep sahi se dal");
                }
                break;
            default:
                System.out.println("Enter correct empId");
        }

    }
}
