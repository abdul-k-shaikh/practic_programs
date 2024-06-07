package com.test.july24;

import java.util.HashMap;
import java.util.Map;

public class CharCountTest2 {

	public static void main(String[] args) {
		String str = "Abdul is working on java";
		str = str.replaceAll(" ", "");
		System.out.println(str);
		Map<Character, Integer> mp = new HashMap<Character, Integer>();
		char c;
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			mp.put(c, mp.containsKey(c) ? mp.get(c) + 1 : 1);
		}

		for (Map.Entry<Character, Integer> m : mp.entrySet()) {
			System.out.println(m.getKey() + ":" + m.getValue());
		}
	}
}
