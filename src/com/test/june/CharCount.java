package com.test.june;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharCount {

	public static void main(String[] args) {
		String str = "Abdul is working on java";
		str = str.replaceAll(" ", "");
		Map<Character, Integer>map = new LinkedHashMap<>();
		
		char ch;
		for(int i=0; i<str.length(); i++) {
			ch=str.charAt(i);
			map.put(ch, map.containsKey(ch)?map.get(ch)+1:1);
			
		}

		for(Map.Entry<Character, Integer>m1:map.entrySet()) {
			System.out.println(m1.getKey()+":"+m1.getValue());
		}
	}

}
