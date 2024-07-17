package com.test.july24;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacter {

	public static void main(String[] args) {
		String str = "aabbccdde";
		Map<Character, Integer>mp = new HashMap<>();
		
		char c;
		for(int i=0; i<str.length(); i++) {
			c=str.charAt(i);
			mp.put(c, mp.containsKey(c)?mp.get(c)+1:1);
		}
		for(Map.Entry<Character, Integer>m1:mp.entrySet()) {
			System.out.println(m1.getKey()+":"+m1.getValue());
		}
	}
	

}
