package com.test.array;

import java.util.Arrays;

public class SortAnArray {

	public static void main(String[] args) {
		int a[] = {1, 2, 3, -1, -2, 4};
		Arrays.sort(a);
		System.out.println("after sorting:"+ Arrays.toString(a));
		System.out.println("Second Higest number: "+ a[a.length-2]);
	}
}
