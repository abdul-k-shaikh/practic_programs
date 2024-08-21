package com.test.aug24;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCountTest1 {

	public static void main(String[] args) {
		// String[] str = {"abd", "abd", "c", "java"};
		List<String> asList = Arrays.asList("abdul", "abdul", "shaikh", "abdul", "shaikh", "kamar");
		Map<String, Long> wordCount1 = asList.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("wordCount1 :" + wordCount1);

		// Word count from given String
		String str = "abdul is working on java and java is working on itself";
		String[] sList = str.split(" ");

		Map<String, Long> wordCount = Arrays.stream(sList)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println("wordCount " + wordCount);

	}

}
