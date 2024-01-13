package com.test.hackerrank;

public class SecondLargest {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 6 };
		int res = secondLargest(a);

		System.out.println("2nd Higest ele: " + res);
	}
	private static int secondLargest(int[] a) {
		int Higest = Integer.MIN_VALUE;
		int SecondHighest = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > Higest) {
				SecondHighest = Higest;
				Higest = a[i];
			} else if (a[i] < Higest) {
				SecondHighest = a[i];
			}
		}
		return SecondHighest;
	}
}
