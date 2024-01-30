package com.test.july24;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		int a[] = { 1, 3, 4, 5, 6 };

		// Calculate the maximum value in the array
		int asInt = Arrays.stream(a).max().getAsInt();

		System.out.println("max value from given array " + asInt);
		int n = a.length;
		int ExpectedSum = (n + 1) * (n + 2) / 2;
		System.out.println("sum is " + ExpectedSum);
		for (int i = 0; i < a.length; i++) {
			ExpectedSum = ExpectedSum - a[i];
		}
		System.out.println("missingElement is :" + ExpectedSum);
	}

}
