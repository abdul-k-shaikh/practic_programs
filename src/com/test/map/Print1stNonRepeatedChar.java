package com.test.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Print1stNonRepeatedChar {

	public static void main(String[] args) {
		String str = "sillyspiders";
		int n = 6;
		// int z[] = new int[n];
		char a[] = str.toCharArray();
		int len = a.length;
		Map<Character, Integer> mp = new LinkedHashMap<>();
		for (int i = 0; i < len; i++) {
			if (mp.containsKey(a[i]) == false) {
				mp.put(a[i], 1);
			} else {
				int oldval = mp.get(a[i]);
				int newVal = oldval + 1;
				mp.put(a[i], newVal);
			}
		}
		Set<Map.Entry<Character, Integer>> m1 = mp.entrySet();
		for (Map.Entry<Character, Integer> ele : m1) {
			if (ele.getValue() == 1) {
				System.out.println(ele.getKey());
				System.exit(0);
			}
		}
	}

}
