package com.test.string;

public class CountVowelsCons {

	public static void main(String[] args) {
		CountVowelsCons cvc = new CountVowelsCons();
		String str = "abdul";
		int len = str.length();
		// char a[] = str.toCharArray();

		cvc.countVowelConsMtd(str, len);

	}

	private void countVowelConsMtd(String str, int len) {
		int countVowels = 0, countCons = 0;
		StringBuilder vowels = new StringBuilder();
		StringBuilder consonants = new StringBuilder();
		for (int i = 0; i < len; i++) {
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {
				countVowels++;
				vowels.append(str.charAt(i));

			} else {
				countCons++;
				consonants.append(str.charAt(i));
			}
		}
		System.out.println("Vowels counts is: " + countVowels + " and they are: " + vowels + "  "
				+ " countCons count is: " + countCons + " and they are: " + consonants);

	}

}
