package com.test.map;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

	public static void main(String[] args) {
		String s = "Abdulislearningreactjs";
		char[] s1 = s.toCharArray();
		int len = s1.length;
		
		Map<Character, Integer>mp = new HashMap<>();
		for(int i=0; i<len; i++) {
			if(mp.containsKey(s1[i])==false) {
				
			}
		}
		

	}

}
