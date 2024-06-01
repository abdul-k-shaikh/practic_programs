package com.test.May24Test;

public class RevWords {

	public static void main(String[] args) {
		String str = "Welcome to Google";
		String res = revWords(str);
		System.out.println(res);
	}

	private static String revWords(String s) {
		String[] ip = null;
		ip = s.split(" ");
		String rev = " ";
		for (int i = ip.length - 1; i >= 0; i--) {
			rev = rev + ip[i] + " ";
		}
		return rev;
	}

}
