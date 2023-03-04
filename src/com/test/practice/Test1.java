package com.test.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test1 {

	public static void main(String[] args) {
		String str = "abcabc";
		char[] s1=str.toCharArray();
		int len =str.length();
		
		Map<Character, Integer> mp = new HashMap<>();
		for(int i=0; i<len; i++) {
			if(mp.containsKey(s1[i])==false) {
				mp.put(s1[i], 1);
			}
			else {
				int oldVal = mp.get(s1[i]);
				int newVal = oldVal+1;
				mp.put(s1[i], newVal);
			}
		}
		
		Set<Map.Entry<Character, Integer>> data = mp.entrySet();
		for(Map.Entry<Character, Integer>ele:data) {
			System.out.println(ele.getKey()+" "+ele.getValue());
		}
	}

}
