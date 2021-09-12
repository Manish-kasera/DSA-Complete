package com.mani.SortingAssignment;
// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
import java.util.Arrays;

class AverageSalary {

    public static void main(String[] args) {
        int[] salary = {6000,5000,4000,3000,2000,1000};
        System.out.println(average(salary));
    }

    public static double average1(int[] salary) {
        Arrays.sort(salary);

        double total = 0.0;
        int n = 0;

        for (int i = 1; i < salary.length - 1 ; i++) {
            total += salary[i];
            n++;
        }

        return total/n;
    }

    public static double average(int[] salary) {
      int min = Integer.MAX_VALUE,max = Integer.MIN_VALUE;

      int sum = 0;

        for (int i = 0; i < salary.length ; i++) {
            sum += salary[i];

            if(salary[i] > max)
                max = salary[i];
            if(salary[i] < min)
                min = salary[i];
        }

        int res = sum -(min + max);
        return (double) res/(salary.length-2);
    }
}