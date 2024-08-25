package com.test.aug24;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountWordsFromString {

	public static void main(String[] args) {
		String str = "Abdul is working on java and java is awesome";
		Map<String, Long> collect = Arrays.stream(str.split(" "))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("word count" + collect);

	}

}
