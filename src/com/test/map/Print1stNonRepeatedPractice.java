package com.test.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Print1stNonRepeatedPractice {

	public static void main(String[] args) {
		String str = "sillyspiders";
		char a [] = str.toCharArray();
		Map<Character, Integer>mp = new LinkedHashMap<>();
		int len = a.length;
		for(int i=0; i<len; i++) {
			if(mp.containsKey(a[i])==false) {
				mp.put(a[i],1);
			}
			else {
				int oldVal = mp.get(a[i]);
				int newVal = oldVal+1;
				mp.put(a[i], newVal);
			}
		}
		for(Map.Entry<Character, Integer> entry : mp.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println("1st non repeating caracter :"+entry.getKey());
				System.exit(0);
			} 
		}

	}

}
