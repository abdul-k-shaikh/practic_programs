package com.test.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ReturnDuplicate {
//this is the program to eleminate duplicates character from string
//Here we are using LinkedHashMap cos it preserves the order of insertion and we
//have to print "silypder" as o/p so 	
	public static void main(String[] args) {
		String str = "sillyspiders";
		char a[] = str.toCharArray();
		int len = a.length;
//		System.out.println(len);
		Map<Character,Integer> mp = new LinkedHashMap<>();
		for(int i=0; i<len; i++) {
			if(mp.containsKey(a[i])==false) {
				mp.put(a[i], 1);
			}
			else
			{
				int oldVal = mp.get(a[i]);
				int newVal = oldVal+1;
				mp.put(a[i], newVal);
			}
		}
		
		Set<Map.Entry<Character, Integer>>m1 = mp.entrySet();
		String res ="";
		for(Map.Entry<Character, Integer> ele :m1) {
			res = res+ele.getKey();
		}
		System.out.println(res);

	}

}
