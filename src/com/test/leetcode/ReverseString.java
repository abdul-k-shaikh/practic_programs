package com.test.leetcode;

public class ReverseString {

	public static void main(String[] args) {
	   char[]  s = {'a','b','c'};
	   
	   revString(s);

	}
  // leetcode 344
	private static void revString(char[] s) {
		int start = 0, end=s.length;
		while(start<end) {
			char temp = s[start];
			s[start]=s[end];
			s[end]=temp;
			start++;
			end--;
			
		}
		
	}

}
