package com.test.july24;

import java.util.HashMap;
import java.util.Map;

public class CharCountTest2 {

	public static void main(String[] args) {
		String str = "abdul is working on java";
		str = str.replaceAll(" ", "");
		System.out.println(str);
		Map<Character, Integer> mp = new HashMap<Character, Integer>();
		char c;
		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			mp.put(c, mp.containsKey(c) ? mp.get(c) + 1 : 1);
		}

		String res="";
		for (Map.Entry<Character, Integer> m : mp.entrySet()) {
			//1. Logic for printing characters and its occurrences
			System.out.println(m.getKey() + ":" + m.getValue());
			//1. Logic for printing unique chars in sequenece like aabbdduul so output abdul 
			//so here we have used linkedHashmap which maintains insertion order 
			res = res+m.getKey();
		}
		System.out.println("res is "+ res);
	}
}
