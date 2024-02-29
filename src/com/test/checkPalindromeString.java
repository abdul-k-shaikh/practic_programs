package com.test;

public class checkPalindromeString {

	public static void main(String[] args) {
		String input = "naman";
		boolean res = checkPalindromeString(input);
		System.out.println("is it pallindrome: " + res);

	}

	static boolean checkPalindromeString(String input) {
		boolean res1 = true;
		int len = input.length();
		for (int i = 0; i < len; i++) {
			if (input.charAt(i) != input.charAt(len - i - 1)) {
				res1 = false;
				break;
			}
		}
		return res1;

	}

}
