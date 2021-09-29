package com.mani.Maths;

public class NetwonSquareRoot {
    public static void main(String[] args) {
        System.out.println(sqrt(40));
    }

    public static  double sqrt(double n){
        double x = n;
        double root;
        while (true){

            root = 0.5 *(x + (n/x));

            // error in calculation
           if(Math.abs(root - x) < 1){
               break;
           }
           x = root;
        }
        return root;
    }
}
