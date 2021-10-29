package com.mani.RecursionAssignment;
// https://practice.geeksforgeeks.org/problems/geek-onacci-number/0/
import java.util.Scanner;

class geekOnacci {
	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t != 0)
		{
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int n = sc.nextInt();

			System.out.println(geekSeries(a,b,c,n));
			t--;

		}
	}

	public static int geekSeries(int a, int b, int c, int n) {
	  if(n == 1){
		  return a;
	  }
	  if(n == 2){
			return b;
	  }
	  if(n == 3){
			return c;
	  }

	  return geekSeries(a,b,c,n-1) + geekSeries(a,b,c,n-2) + geekSeries(a,b,c,n-3);
	}

}