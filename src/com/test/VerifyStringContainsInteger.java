package com.test;

public class VerifyStringContainsInteger {

	public static void main(String[] args) {
		String s ="123";
		int size = s.length();
		
		for(int i=0; i<size; i++) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
				System.out.println("Only integrs");
				//System.exit(i);
			}
			else {
				System.out.println("Has string");
			}
		}
	}
}
