package com.test.july24;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		String input = "Java articles are Awesome";
		
		input = input.replaceAll(" ", "");
		Map<Character, Integer>mp = new HashMap<>();
		
		char c;
		for(int i=0; i<input.length(); i++) {
			c= input.charAt(i);
			mp.put(c, mp.containsKey(c)?mp.get(c)+1:1);
		}
		
		for(Map.Entry<Character, Integer>e1:mp.entrySet()) {
			System.out.println(e1.getKey()+":"+e1.getValue());
		}
	}

}
