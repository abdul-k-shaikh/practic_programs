package com.test.aug24;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamples {

	public static void main(String[] args) {
		List<Integer> asList = Arrays.asList(2,4,6,7,8,6);
		List<Integer> uniqueElements = asList.stream().distinct().collect(Collectors.toList());
		System.out.println("uniqueElements"+ uniqueElements);
	}
}
