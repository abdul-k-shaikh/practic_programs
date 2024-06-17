package com.test.june;

import java.util.HashMap;
import java.util.Map;

public class CharCountTest7 {

	public static void main(String[] args) {
		String str = "Abdul is working on java";
		str = str.replaceAll(" ", "");
		System.out.println(str);
		Map<Character,Integer>hm= new HashMap<Character,Integer>();
		char ch;
		for(int i=0; i<str.length(); i++) {
			ch=str.charAt(i);
			hm.put(ch, hm.containsKey(hm)?hm.get(ch)+1:1);	
		}
		
		for(Map.Entry<Character,Integer>m1:hm.entrySet())
		System.out.println(m1.getKey()+":"+m1.getValue());
	}

}
