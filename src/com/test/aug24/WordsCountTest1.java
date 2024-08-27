package com.test.aug24;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordsCountTest1 {

	public static void main(String[] args) {
		String str = "abdul is working on java and java is java";
		Map<String, Long> wordsCount = Arrays.stream(str.split(" "))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("words count" + wordsCount);

		String strInput = "abdul is working on java";
		strInput = strInput.replaceAll(" ", "");
		Map<Character, Integer> mp = new HashMap<>();
		char c;
		for (int i = 0; i < strInput.length(); i++) {
			c = strInput.charAt(i);
			mp.put(c, mp.containsKey(c) ? mp.get(c) + 1 : 1);
		}
		for (Map.Entry<Character, Integer> e : mp.entrySet()) {
			System.out.println(e.getKey() + ":" + e.getValue());

		}
	}

}
