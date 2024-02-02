package com.test.map;

import java.util.HashMap;
import java.util.Map;

public class DisAllNonRepeatedChar {
 //Displaying all non repeated char 
	public static void main(String[] args) {
		String str = "sillyspiders";
		char a[] = str.toCharArray();
		int len = a.length;
		
		Map<Character, Integer> mp = new HashMap<Character, Integer>();
		for(int i=0; i<len; i++ ) {
			if(mp.containsKey(a[i])==false) {
				mp.put(a[i], 1);
			}
			else {
				int oldVal = mp.get(a[i]);
				int newVal = oldVal + 1;
				mp.put(a[i], newVal);
			}
		}
		
		for(Map.Entry<Character, Integer> entry : mp.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());
			}
			System.out.println(entry.getKey()+" : "+ entry.getValue());
		}
		
	}

}
