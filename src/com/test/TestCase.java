package com.test;

public class TestCase {

	public static void main(String[] args) {
		String s1 = "abdul";
		char a = ' ';
		//s1 = s1.toCharArray();
		int len = s1.length();
		for(int i=0; i<len; i++) {
			//System.out.println(s1.charAt(i));
			a =(char) (s1.charAt(i)-32);
			System.out.println(a);
		}
//        System.out.println("-".repeat(5));
	}

}
