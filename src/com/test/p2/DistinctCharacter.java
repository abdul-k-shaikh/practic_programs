package com.test.p2;

import java.util.HashMap;
import java.util.Map;

public class DistinctCharacter {

	public static void main(String[] args) {
		String str = "abdulKamar";
		char[] s = str.toCharArray();
		int len = str.length();
		Map<Character, Integer> mp = new HashMap<>();
		for(int i=0; i<len; i++) {
			if(mp.containsKey(s[i])==false) {
				mp.put(s[i], 1);
			}
			else {
				int newVal = mp.get(s[i]);
				int oldVal = newVal+1;
				mp.put(s[i], oldVal);
			}
		}
		
		for(Map.Entry<Character, Integer> entry : mp.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue() );
		}
		

	}

}
