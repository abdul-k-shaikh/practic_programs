package com.test.iwM24;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharCount {

	public static void main(String[] args) {
		String str = "My name is abdul shaikh and i am a java developer";
		Map<Character, Integer>mp = new LinkedHashMap<Character, Integer>();
		
		int len=str.length();
		char ch;
		for(int i=0; i<len;i++) {
			ch = str.charAt(i);
			mp.put(ch, mp.containsKey(ch)?mp.get(ch)+1:1);
		}
		
		for(Map.Entry<Character, Integer>m1: mp.entrySet()) {
			System.out.println(m1.getKey()+" "+m1.getValue());
		}
		
		
	}
}
