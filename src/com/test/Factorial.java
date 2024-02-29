package com.test;

public class Factorial {

	public static void main(String[] args) {
		int n = 5;
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of a number is :" + fact);
		
		int nm = 3;
		int res = factorial(nm);
		System.out.println("fact using recursion :"+ res);

	}
//factorial using recursion
	private static int factorial(int nm) {
		if(nm==1) {
			return 1;
		}
		else {
			return (nm*factorial(nm-1));
		}

	}

}
