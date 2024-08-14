package com.test.aug24;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurrence {

	public static void main(String[] args) {
		String input = "Abdul is working on java";
		String expectedInput = input.toUpperCase();
		Map<String, Long> collect = Arrays.stream(expectedInput.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect);
	}

}
