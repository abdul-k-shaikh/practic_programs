package com.test.july24;

import java.util.LinkedHashMap;
import java.util.Map;

public class ReturnDuplicate {
	// this is the program to eleminate duplicates character from string
	// Here we are using LinkedHashMap cos it preserves the order of insertion and
	// we
	// have to print "silypder" as o/p so

	public static void main(String[] args) {
		String str = "sillyspiders";
		Map<Character, Integer> map = new LinkedHashMap<>();
		char c;
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			map.put(c, map.containsKey(c) ? map.get(c) + 1 : 1);
		}

		for (Map.Entry<Character, Integer> m1 : map.entrySet()) {
//	    	System.out.println(m1.getKey()+":"+m1.getValue());
			System.out.print(m1.getKey());
		}

	}

}
