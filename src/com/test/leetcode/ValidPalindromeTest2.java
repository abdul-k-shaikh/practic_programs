package com.test.leetcode;

public class ValidPalindromeTest2 {

	public static void main(String[] args) {
		String str = "malam";
		System.out.println(isPalindrome(str));

	}

	private static boolean isPalindrome(String str) {
		str = str.toLowerCase().replaceAll("[^A-Za-z0-9]", str);
		int start =0, end=str.length()-1;
		
		while(start<end) {
			if(str.charAt(start)!=str.charAt(end)) {
				return false;
			}
			start++;
			end--;
		}
		return true;
	}

}
