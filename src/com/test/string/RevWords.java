package com.test.string;
public class RevWords {
	public static String reverseWordWise(String str) {
		String[] result = null;
		result = str.split(" ");
		String rev = "";
		for (int j = result.length - 1; j >= 0; j--) {
			rev = rev + result[j] + " ";
		}
		return rev;
	}
	public static void main(String[] args) {
		String str = "Welcome to capgemini";
		String res = reverseWordWise(str);
		System.out.println(res);
	}
}
