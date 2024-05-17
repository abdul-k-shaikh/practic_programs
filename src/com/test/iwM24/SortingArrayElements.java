package com.test.iwM24;

import java.util.Arrays;

public class SortingArrayElements {

	public static void main(String[] args) {
		int arr[] = {5, -2, 23, 7, 87, -42, 509};
		System.out.println("Original Array :"+ Arrays.toString(arr));
		
		Arrays.sort(arr);
		
		System.out.println("Sorted Array :"+ Arrays.toString(arr));

	}

}
