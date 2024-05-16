package com.test.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class UniqueCharacters {

	public static void main(String[] args) {
//		String str = "Spiderman";
		String str = "spidermannnn";
		int len = str.length();
		char a[] = str.toCharArray();
		Map<Character, Integer>mp = new HashMap<>();
		for(int i=0; i<len; i++) {
			if(mp.containsKey(a[i])==false) {
				mp.put(a[i], 1);
			}
			else {
				int oldVal = mp.get(a[i]);
				int newVal=oldVal+1;
				mp.put(a[i], newVal);
			}
		}
		Set<Map.Entry<Character, Integer>>data = mp.entrySet();
		String st="";
		for(Map.Entry<Character,Integer> ele : data) {
			if(ele.getValue()==1) {
//				System.out.println("Doesnt contain all uniques characters");
				st=st+ele.getKey();
//				System.exit(0);
				
			}
		}
		System.out.println("st is ");

		System.out.println("Contains all unique characters");
		

	}

}
