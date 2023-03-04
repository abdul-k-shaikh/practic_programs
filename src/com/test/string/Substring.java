package com.test.string;

public class Substring {

	public static void main(String[] args) {
		String str = "abc";
		int len = str.length();
		createSubstring(str, len);

	}

	private static void createSubstring(String str, int len) {
		
		for(int i=0; i<len; i++) {
			for(int j=i; j<len; j++) {
				System.out.println(str.substring(i,j+1));
			}
		}
	}

}
