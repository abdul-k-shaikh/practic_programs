package com.test;

public class PrimeTest {

	public static void main(String[] args) {
		int n = 9;
		int count=0;
		for(int i=1; i<=n; i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("Given number is prime no.");
		}
		else {
			System.out.println("Given number is not a prime no.");
		}
		
		double a = 4;
		double res = Math.sqrt(a);
		System.out.println(res);

	}

}
