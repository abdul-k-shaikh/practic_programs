package com.test.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortingList {

	public static void main(String[] args) {
		List<Integer> unsorted = Arrays.asList(11, 2, 5, 3, 2, 55, 32, 34);
		List<Integer> sorted = unsorted.stream().sorted().collect(Collectors.toList());
		System.out.println(sorted);


	}

}
