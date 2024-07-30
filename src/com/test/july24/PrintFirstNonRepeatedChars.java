package com.test.july24;

import java.util.LinkedHashMap;
import java.util.Map;

public class PrintFirstNonRepeatedChars {

	// Printing 1st non repeated chars
	public static void main(String[] args) {
		String str = "sillyspiders"; // here 1st non repeated char is "y"
		// we need to maintain the insertion order so using LinkedHash
		Map<Character, Integer> mp = new LinkedHashMap<>();
		char c;
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			mp.put(c, mp.containsKey(c) ? mp.get(c) + 1 : 1);
		}

		for (Map.Entry<Character, Integer> m1 : mp.entrySet()) {
			if (m1.getValue() == 1)
				System.out.println(m1.getKey());
			   break;
		}

	}

}
