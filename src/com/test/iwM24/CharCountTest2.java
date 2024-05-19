package com.test.iwM24;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharCountTest2 {

	public static void main(String[] args) {
		Map<Character, Integer>mp = new LinkedHashMap<>();
		String str = "My name is abdul";
		
		for(int i=0; i<str.length(); i++) {
			char ch=str.charAt(i);
			mp.put(ch, mp.containsKey(ch)?:mp.get(ch)+1)
		}

	}

}
