package com.test.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class PrintMaximumOccurringChar {

	public static void main(String[] args) {
		String str = "god_bless_spiders";
		char a[] = str.toCharArray();
		int len = a.length;
		Map<Character, Integer>mp = new LinkedHashMap<>();
		for(int i=0; i<len; i++) {
			if(mp.containsKey(a[i])==false) {
				mp.put(a[i], 1);
				
			}
			else {
				int oldVal = mp.get(a[i]);
				int newVal = oldVal+1;
				mp.put(a[i], newVal);
			}
				
		}
		
		int maxVal=0;
		char maxKey=' ';
		Set<Map.Entry<Character, Integer>> ele = mp.entrySet();
		for(Map.Entry<Character, Integer>d:ele) {
			if(d.getValue()>maxVal) {
				maxVal=d.getValue();
				maxKey=d.getKey();
			}
		}
		System.out.println(maxKey+" "+ maxVal);
		
		

	}

}
