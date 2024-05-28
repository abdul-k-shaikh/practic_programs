package com.test.p2;

import java.util.Arrays;
import java.util.stream.Stream;

public class MergeSortedArraysUsingJava8 {

	public static void main(String[] args) {
		int arr1[] = {1,2,3,4};
		int arr2[] = {5,6,7,9};
		
		//merge the arrays using stream.of()
		int mergedArray[] = Stream.of(arr1, arr2)
							.flatMapToInt(Arrays::stream)
							.toArray();
		
		//Print the merged array
		System.out.println(Arrays.toString(mergedArray));
	}

}
