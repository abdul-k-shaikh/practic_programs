package com.test.p2;

public class ConvertIntToString {

	public static void main(String[] args) {
		int a = 10;
		//1st way 
		String b = Integer.toString(a);
		System.out.println("Using Integer.toString : "+b);
		
		//2nd Way
		String c = String.valueOf(a);
		System.out.println("Using String.valueOf :"+c);
		

	}

}
