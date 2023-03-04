package com.test.recursion;

public class SumOfNaturalNos {

	public static void main(String[] args) {
		int n=4;
		System.out.println(sum(n));

	}

	private static int sum(int n) {
		if(n==1)
		return 1;
		
		return (n-1)+n;
	}

}
