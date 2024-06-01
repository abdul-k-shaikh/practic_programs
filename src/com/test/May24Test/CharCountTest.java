package com.test.May24Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharCountTest {

	public static void main(String[] args) {
		String str = "welcome to tcs";
		str = str.replaceAll(" ", "");

		Map<Character, Integer> map = new LinkedHashMap<>();
		char ch;
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			map.put(ch, map.containsKey(ch) ? map.get(ch) + 1 : 1);
		}
		for (Map.Entry<Character, Integer> m : map.entrySet()) {
			System.out.println(m.getKey() + ":" + m.getValue());
		}

	}

}
