package com.test.june;

import java.util.LinkedHashMap;
import java.util.Map;

public class CharTest {

	public static void main(String[] args) {
		String str = "Abdul is working";
		str = str.replaceAll(" ", "");
		System.out.println(str);
		Map<Character,Integer>map = new LinkedHashMap<>();
		char ch;
	    for(int i=0; i<str.length(); i++) {
	    	ch = str.charAt(i);
	    	map.put(ch, map.containsKey(ch)?map.get(ch)+1:1);
	    }
	    
		
			
	}

}
