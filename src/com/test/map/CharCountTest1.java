package com.test.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharCountTest1 {

	public static void main(String[] args) {
		String str = "Abdul is working on java";
		str = str.replace(" ", "");
		
		Map<Character, Integer>mp = new LinkedHashMap<>();
		char ch;
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			mp.put(ch, mp.containsKey(ch)?mp.get(ch)+1:1);
		}
		

	}

}
