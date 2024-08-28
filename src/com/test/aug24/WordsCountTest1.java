package com.test.aug24;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordsCountTest1 {

	public static void main(String[] args) {
		// p1: count the words
		String str = "abdul is working on java and java is java";
		Map<String, Long> wordsCount = Arrays.stream(str.split(" "))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("words count" + wordsCount);

		// p2 count the characters
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
		// p3 remove the tripplet
		int a[] = { 1, 2, 3, 4, 4, 4, 5, 6 };

		Map<Integer, Long> collect = Arrays.stream(a).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		int res[] = new int[a.length-1];
		int j = 0;
		for (Map.Entry<Integer, Long> num : collect.entrySet()) {
			System.out.println(num.getKey() + ":" + num.getValue());
			if (num.getValue() >= 2) {
				res[j++] = num.getKey();
				res[j++] = num.getKey();
			} else {
				res[j++] = num.getKey();
			}
		}
		System.out.println("removing the triplet" + Arrays.toString(res));

	}

}
