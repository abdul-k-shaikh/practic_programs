package com.test.sep24;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamExamples {

	public static void main(String[] args) {
		String input1 = "java is oop language";

		// count words
		Map<String, Long> countWords = Arrays.stream(input1.split(" "))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("countChars :" + countWords);

		// Count chars
		String input2 = "java is oop language";
		Map<String, Long> countChar = Arrays.stream(input2.split(""))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("countChars :" + countChar);
	}

}
