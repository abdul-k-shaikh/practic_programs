package com.test.sep24;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharCount {

	public static void main(String[] args) {
		String str = "abdulll";

		Map<Character, Integer> mp = new LinkedHashMap<>();

		char c;
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			mp.put(c, mp.containsKey(c) ? mp.get(c) + 1 : 1);
		}

		for (Map.Entry<Character, Integer> elements : mp.entrySet()) {
			System.out.println(elements.getKey() + ":" + elements.getValue());
		}
	}
}
