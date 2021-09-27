package com.mani.Maths;

public class RootPrecise {
    public static void main(String[] args) {
        int n = 4;
        int p = 3;

     System.out.printf("%.3f", sqrt(n, p));
    }

    // Time O(log(n))
    static double sqrt(int n, int p) {

         double root = 0.0;
        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }

        return root;
    }
}
