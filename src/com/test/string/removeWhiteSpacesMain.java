package com.test.string;

public class removeWhiteSpacesMain {

	public static void main(String[] args) {
		String input = "I am Abdul";
		String res = removeWhiteSpaces(input);
		System.out.println("after removing spaces :"+ res);
	}
	private static String removeWhiteSpaces(String input) {
		StringBuilder output = new StringBuilder();
		
		char[] charArray = input.toCharArray();
		for(char c : charArray) {
			if(!Character.isWhitespace(c)) {
				output.append(c);
			}
		}
		return output.toString();
	}
}
