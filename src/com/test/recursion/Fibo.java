package com.test.recursion;

public class Fibo {

	public static void main(String[] args) {
		int n=5;
		int res = fibo(n);
		System.out.println("fibonacci value is "+ res);

	}

	private static int fibo(int n) {
		if(n==1 || n==2)
		return 0;
		else
		return fibo(n-1)+fibo(n-2);
	}

}
