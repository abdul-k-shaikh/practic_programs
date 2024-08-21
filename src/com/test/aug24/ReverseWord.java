package com.test.aug24;

public class ReverseWord {

	public static void main(String[] args) {
		String input = "I am abdul and my name is abdul";
		String reversed = resversedWords(input);
		System.out.println("reversed : " + reversed);

	}

	private static String resversedWords(String input) {
		String[] words = input.split(" ");
		StringBuilder reversedString = new StringBuilder();

		for (int i = words.length - 1; i >= 0; i--) {
			reversedString.append(words[i]).append(" ");
		}
		return reversedString.toString();
	}

}
