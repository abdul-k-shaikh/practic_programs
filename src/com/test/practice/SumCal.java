package com.test.practice;

import java.util.Scanner;

public class SumCal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		System.out.println("Enter a number");
		while(sc.hasNextInt()) {
			int num = sc.nextInt();
			sum = sum+num;
		}
		
		System.out.println("sum is "+ sum);
	}

}
