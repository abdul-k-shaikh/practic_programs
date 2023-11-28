package com.test.multithreading;

import java.util.Scanner;

public class JoinDemo {
	
	static int n, sum=0;

	public static void main(String[] args) {
		System.out.println("Sum of first 'N' numbers");
		System.out.println("Enter a value");
		Scanner sc = new Scanner(System.in);
		JoinDemo.n = sc.nextInt();
	}

}
