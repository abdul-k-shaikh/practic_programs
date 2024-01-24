package com.test.map;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapOperation {

	public static void main(String[] args) {

		String s = "aradhya";
		char[] s1 = s.toCharArray();
		int len = s.length();
		Map<Character, Integer> mp = new HashMap<>();

		for (int i = 0; i < len; i++) {
			if (mp.containsKey(s1[i]) == false) {
				mp.put(s1[i], 1);
			} else {
				int oldVal = mp.get(s1[i]);
				int newVal = oldVal + 1;
				mp.put(s1[i], newVal);
			}
		}

		Set<Map.Entry<Character, Integer>> m1 = mp.entrySet();
		for (Map.Entry<Character, Integer> data : m1) {
			System.out.println(data.getKey() + " " + data.getValue());
		}

	}

}
