package com.test.recursion;

public class Sum {

	public static void main(String[] args) {
		int n=5;
		System.out.println(sumInt(n));

	}

	private static int sumInt(int n) {
		if(n==0) {
			return 0;
		}
		return n+(sumInt(n-1));
	}

}
