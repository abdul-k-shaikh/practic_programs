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
		System.out.println("wordCount1 :"+wordCount1);
		
		

	}

}
