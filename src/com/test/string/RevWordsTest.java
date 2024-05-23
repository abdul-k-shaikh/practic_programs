package com.test.string;

public class RevWordsTest {

	public static void main(String[] args) {
		String str = "Welcome to capgemini";
		revWords(str);

	}

	private static void revWords(String str) {
		String[] ip = null;
		ip = str.split(" ");
		String rev = "";
		for (int i = ip.length - 1; i >= 0; i--) {
			rev = rev + ip[i] + " ";
		}
		System.out.println(rev);

	}	

}
