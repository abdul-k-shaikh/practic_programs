package com.test;

public class Swap2Numbers {
//   Swapping numbers without using a third variable
	public static void main(String[] args) {
		int a=3;
		int b=4;
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("after swapping numbers are a : "+a+ " and b : "+b);

	}

}
