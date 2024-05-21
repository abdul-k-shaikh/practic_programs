package com.test.iwM24;

public class StringPalindrom {

	public static void main(String[] args) {
		String str = "refer";
		String temp = str;
//		System.out.println("temp is "+ temp);
		int len = str.length();
		int start = temp.length();
		int end = temp.length()-1;
		
		for(int i=0; i<len/2; i++) {
			if(str.charAt(i)==temp.charAt(len-i-1)) {
				System.out.println("P");
			}
			else {
				System.out.println("N P");
			}
		}
		
	}

}
