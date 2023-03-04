package com.test.recursion;

public class RecursionSum {

	public static void main(String[] args) {
		int n=5;
//		sum(n);
		System.out.println(sum(n));

	}

	private static int sum(int n) {
		if(n==1)
		return 1;
		else
		return n+sum(n-1);
		
		
	}

}
