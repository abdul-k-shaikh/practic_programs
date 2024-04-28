package com.test.leetcode;

public class ValidPalindrome125 {

	public static void main(String[] args) {
		
		String s = "race a car";
		System.out.println(isPalindrome(s));
	}

	private static boolean isPalindrome(String s) {
		int start =0, end=s.length()-1;
		s=s.toLowerCase().replaceAll("[^A-Za-z0-9]", s);
		while(start<=end) {
			if(s.charAt(start)!=s.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

}
