package com.test.july24;

import java.util.HashMap;
import java.util.Map;

public class CharTest1 {

	public static void main(String[] args) {
		String str = "Abdul is working on java";
		str = str.replaceAll(" ", "");
		System.out.println(str);
		Map<Character, Integer>map = new HashMap<>();
		
		char c;
		for(int i=0; i<str.length(); i++) {
			c=str.charAt(i);
			map.put(c, map.containsKey(c)?map.get(c)+1:1);
		}
		
		for(Map.Entry<Character, Integer>m1:map.entrySet()) {
			System.out.println(m1.getKey()+":"+m1.getValue());
		}
		
	}

}
