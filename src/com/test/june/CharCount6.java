package com.test.june;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharCount6 {

	public static void main(String[] args) {
		String str = "Abdul is working on java";
		str = str.replaceAll(" ", "");
		System.out.println(str);
		Map<Character,Integer>mp = new LinkedHashMap<>();
		char ch;
		for(int i=0; i<str.length(); i++) {
			ch=str.charAt(i);
		    mp.put(ch, mp.containsKey(ch)?mp.get(ch)+1:1);
		}
		for(Map.Entry<Character, Integer>m1:mp.entrySet()) {
			System.out.println(m1.getKey()+":"+m1.getValue());
		}

	}

}
