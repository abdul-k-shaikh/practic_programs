package com.test.leetcode;

public class ValidPalindromeTest {

	public static void main(String[] args) {
		String s = "A man, a plan, a canal: Panama";
		System.out.println(isValidPalindrome(s));
	}
	private static boolean isValidPalindrome(String s) {
		int start=0, end=s.length()-1;
		s=s.toLowerCase();
		s=s.replaceAll("[^A-Za-z0-9]", s);
		System.out.println("s is :"+s);
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
