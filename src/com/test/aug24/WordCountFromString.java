package com.test.aug24;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCountFromString {

	public static void main(String[] args) {
		String str = "Abdul is working on java and java is working day by day";
		Map<String, Long> wordCount = Arrays.stream(str.split(" "))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("wordCount :" + wordCount);
	}

}
