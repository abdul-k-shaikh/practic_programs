package com.test.array;

public class SecondHigest2 {

	public static void main(String[] args) {
		int a[] = { 1, 3, 4, 5, 8 };
		int result = secondHigest(a);
		System.out.println("2nd highest ele :"+ result);

	}

	private static int secondHigest(int[] a) {
		int highest = Integer.MIN_VALUE;
		int SecondHigest = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > highest) {
				SecondHigest = highest;
				highest = a[i];
			} else if (a[i] < highest) {
				SecondHigest = a[i];
			}
		}
		return SecondHigest;
	}

}
