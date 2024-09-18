package com.test.sep24;

import java.util.Arrays;
import java.util.List;

public class CheckElementPresentUsingStream {
	/*
	 * When dealing with a tremendous amount of data, you can leverage parallel
	 * streams in Java to improve performance. Parallel streams can process elements
	 * concurrently, making the operation faster on multi-core processors.
	 */

	public static void main(String[] args) {
		List<Integer> listInt = Arrays.asList(1, 2, 3, 4, 5, 5);
		int targetNumber = 5;
		boolean isPresent = listInt.stream().anyMatch(x -> x == targetNumber);

		if (isPresent) {
			System.out.println("Number " + targetNumber + " is present in the list.");

		} else {
			System.out.println("Number " + targetNumber + " is not present in the list.");

		}
	}
}
