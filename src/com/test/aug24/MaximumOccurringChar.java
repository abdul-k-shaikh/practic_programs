package com.test.aug24;

import java.util.HashMap;
import java.util.Map;

public class MaximumOccurringChar {

	public static void main(String[] args) {
		String str = "GOD_BLESS_SPIDERMAN";
		Map<Character, Integer> mp = new HashMap<>();

		char c;
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			mp.put(c, mp.containsKey(c) ? mp.get(c) + 1 : 1);
		}

		char maxKey = ' ';
		int maxVal = 0;

		for (Map.Entry<Character, Integer> data : mp.entrySet()) {
			if (data.getValue() > maxVal) {
				maxVal = data.getValue();
				maxKey = data.getKey();
			}
		}
		System.out.print(maxKey+" ");
		System.out.println(maxVal);
	}

}
