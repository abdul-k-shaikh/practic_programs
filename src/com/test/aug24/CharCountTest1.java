package com.test.aug24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CharCountTest1 {

	public static void main(String[] args) {
		// 1.
		String str = "Abdul is working on java and Abdul is working on Boot";
		str = str.replaceAll(" ", "");
		System.out.println(str);
		Map<Character, Integer> mp = new LinkedHashMap<>();
		char c;
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			mp.put(c, mp.containsKey(c) ? mp.get(c) + 1 : 1);
		}

		for (Map.Entry<Character, Integer> m1 : mp.entrySet()) {
			System.out.println(m1.getKey() + ":" + m1.getValue());
		}
		// 2.
		System.out.println("Second approach");
//		String str1 = "Abdul is working on java and Abdul is working on Boot";
//		List<String> List1 = new ArrayList<>(Arrays.asList(str1));
		List<String> listOfString= Arrays.asList("java", "C","java","python","kotlin");
		Map<String, Long> collect = listOfString.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("Counting elements: "+collect);

		//3. Counting chars
		String str1 = "Abdul is working on java and Abdul is working on Boot";
//		Map<Character, Long> collect2 = str1.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//		System.out.println("count of each char "+collect2);
	}

}
