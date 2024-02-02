package com.test.map;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {

	public static void main(String[] args) {
		String s = "abdulKamar";
		char[] s1 = s.toCharArray();
		int len = s1.length;
		
		Map<Character, Integer>mp = new HashMap<>();
		for(int i=0; i<len; i++) {
			if(mp.containsKey(s1[i])==false) {
				mp.put(s1[i], 1);
			}else {
				int oldVal = mp.get(s1[i]);
				int newVal = oldVal+1;
				mp.put(s1[i], newVal);
			}
		}
		
		for(Map.Entry<Character, Integer> entry : mp.entrySet()) {
			System.out.println(entry.getKey()+" : "+ entry.getValue());
		}
	}

}
