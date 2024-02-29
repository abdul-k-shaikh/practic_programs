package com.test.array;

/**
 * Java program to move all Zeros to the end of the array Input:
 * {1,0,2,3,0,0,0,2} Output:{1,2,3,2,0,0,0,0}
 * 
 * Time n space complexity o(n)
 */

public class MoveAllZerosToEnd {

	public static void main(String[] args) {
		int a[] = { 1, 0, 2, 3, 0, 0, 0, 2 };
		int len = a.length;
		int count = 0;

		for (int i = 0; i < len; i++) {
			if (a[i] != 0) {
				a[count++] = a[i];
			}
		}
		while (count < len) {
			a[count] = 0;
			count++;
		}
		for (int j = 0; j < len; j++) {
			System.out.print(a[j]);
		}
	}

}
